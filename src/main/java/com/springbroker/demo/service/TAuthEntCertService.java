package com.springbroker.demo.service;

import com.springbroker.demo.entity.TAuthEntCert;
import java.util.List;

/**
 * 认证-企业-证件认证(TAuthEntCert)表服务接口
 *
 * @author makejava
 * @since 2020-04-18 00:56:11
 */
public interface TAuthEntCertService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TAuthEntCert queryById(String id);


    /**
     * 新增数据
     *
     * @param tAuthEntCert 实例对象
     * @return 实例对象
     */
    TAuthEntCert insert(TAuthEntCert tAuthEntCert);

    /**
     * 修改数据
     *
     * @param tAuthEntCert 实例对象
     * @return 实例对象
     */
    TAuthEntCert update(TAuthEntCert tAuthEntCert);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(String id);

}