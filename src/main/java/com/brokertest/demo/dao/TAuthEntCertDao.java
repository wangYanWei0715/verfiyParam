package com.brokertest.demo.dao;

import com.brokertest.demo.entity.TAuthEntCert;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 认证-企业-证件认证(TAuthEntCert)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-17 23:55:52
 */
public interface TAuthEntCertDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TAuthEntCert queryById(String id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TAuthEntCert> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tAuthEntCert 实例对象
     * @return 对象列表
     */
    List<TAuthEntCert> queryAll(TAuthEntCert tAuthEntCert);

    /**
     * 新增数据
     *
     * @param tAuthEntCert 实例对象
     * @return 影响行数
     */
    int insert(TAuthEntCert tAuthEntCert);

    /**
     * 修改数据
     *
     * @param tAuthEntCert 实例对象
     * @return 影响行数
     */
    int update(TAuthEntCert tAuthEntCert);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(String id);

}