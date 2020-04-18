package com.springbroker.demo.config.aops;

import com.springbroker.demo.config.annotion.SetParam;
import com.springbroker.demo.entity.BaseDto;
import java.lang.annotation.Annotation;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ArrayUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @author 王延伟
 * @description TODO
 * @createTime $ $
 */

@Aspect
@Component
@Slf4j
public class FillParams {


    @Pointcut("@annotation(com.springbroker.demo.config.annotion.SetParam)")
    private void setParamPointcut(){}

    @Before("setParamPointcut()")
    public void before(JoinPoint joinPoint){
        Object[] args1 = joinPoint.getArgs();
        for (Object o : args1) {
            if (o instanceof BaseDto){
                BaseDto baseDto = (BaseDto)o;
                baseDto.setCreateTime(new Date());
                baseDto.setCreateUserId("11111");
                baseDto.setCreateUsername("王延伟");
            }
        }
    }

}
