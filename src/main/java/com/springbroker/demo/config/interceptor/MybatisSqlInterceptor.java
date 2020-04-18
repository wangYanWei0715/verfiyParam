package com.springbroker.demo.config.interceptor;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Component;

/**
 * @author 王延伟
 * @description TODO
 * @createTime $ $
 */

@Component
@Intercepts(@Signature(type = StatementHandler.class, method = "prepare",
    args = {Connection.class, Integer.class}))
public class MybatisSqlInterceptor implements Interceptor {

    @Override
    public Object intercept(Invocation invocation) throws Throwable {

       //获取sql
        String sql = getSqlByInvocation(invocation);
        if (StringUtils.isBlank(sql)){
            return invocation.proceed();
        }

        //对sql进行操作
        String newSql = operateSql(invocation,sql);

        resetSql2Invocation(invocation, newSql);


        return invocation.proceed();
    }

    private void resetSql2Invocation(Invocation invocation, String sql)
        throws  NoSuchFieldException, IllegalAccessException {
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        BoundSql boundSql1 = statementHandler.getBoundSql();
        Field field = boundSql1.getClass().getDeclaredField("sql");
        field.setAccessible(true);
        field.set(boundSql1, sql);
    }



    private String operateSql(Invocation invocation,String sql ) {
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        MetaObject metaObject = MetaObject.forObject(statementHandler, SystemMetaObject.DEFAULT_OBJECT_FACTORY, SystemMetaObject.DEFAULT_OBJECT_WRAPPER_FACTORY, new DefaultReflectorFactory());
        //先拦截到RoutingStatementHandler，里面有个StatementHandler类型的delegate变量，其实现类是BaseStatementHandler，然后就到BaseStatementHandler的成员变量mappedStatement
        MappedStatement mappedStatement = (MappedStatement) metaObject.getValue("delegate.mappedStatement");
        //sql语句类型 select、delete、insert、update
        SqlCommandType commondType = mappedStatement.getSqlCommandType();
        if (commondType.compareTo(SqlCommandType.INSERT) == 0) {
            //TODO

            sql = sql.replaceAll("\\n", "")
                .replaceFirst(", ",", create_user_id , create_username , create_time ,")
                .replaceFirst("\\?,","?,  '646fbb78cafb4626b4151c4eca96bc2d', '王延伟' , '"+LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"' ,");

            System.out.println("----------------INSERT------------------"+sql);
            return sql;
        }
        if (commondType.compareTo(SqlCommandType.UPDATE) == 0) {
            //TODO  `create_user_id` = '646fbb78cafb4626b4151c4eca96bc2d', `create_username` = '王延伟', `create_time` = '2020-04-12 03:21:54'
            sql = sql.replace("where",", create_user_id = '646fbb78cafb4626b4151c4eca96bc2d', create_username = '王延伟', create_time  = '"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))+"' where");



            System.out.println("----------------UPDATE------------------"+sql);
            return sql;
        }

        return sql;
    }


    /**
     * 获取sql语句
     * @param invocation
     * @return
     */
    private String getSqlByInvocation(Invocation invocation) {
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        BoundSql boundSql = statementHandler.getBoundSql();
        return boundSql.getSql();
    }


    @Override
    public Object plugin(Object o) {
        if (o instanceof StatementHandler) {
            return Plugin.wrap(o, this);
        } else {
            return o;
        }

    }


    @Override
    public void setProperties(Properties properties) {
        System.out.println("aaaaaaaaa");
    }

    class BoundSqlSqlSource implements SqlSource {
        private BoundSql boundSql;
        public BoundSqlSqlSource(BoundSql boundSql) {
            this.boundSql = boundSql;
        }
        @Override
        public BoundSql getBoundSql(Object parameterObject) {
            return boundSql;
        }
    }

}
