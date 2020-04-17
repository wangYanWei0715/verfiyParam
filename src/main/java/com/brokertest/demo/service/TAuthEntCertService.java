package com.brokertest.demo.service;

import com.brokertest.demo.entity.TAuthEntCert;
import java.util.List;

/**
 * 认证-企业-证件认证(TAuthEntCert)表服务接口
 *
 * @author makejava
 * @since 2020-04-17 23:55:53
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
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TAuthEntCert> queryAllByLimit(int offset, int limit);

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