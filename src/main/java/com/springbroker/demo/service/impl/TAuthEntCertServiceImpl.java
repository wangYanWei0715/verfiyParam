package com.springbroker.demo.service.impl;

import com.springbroker.demo.entity.TAuthEntCert;
import com.springbroker.demo.dao.TAuthEntCertDao;
import com.springbroker.demo.service.TAuthEntCertService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 认证-企业-证件认证(TAuthEntCert)表服务实现类
 *
 * @author makejava
 * @since 2020-04-18 00:56:13
 */
@Service("tAuthEntCertService")
public class TAuthEntCertServiceImpl implements TAuthEntCertService {

    @Resource
    private TAuthEntCertDao tAuthEntCertDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TAuthEntCert queryById(String id) {
        return this.tAuthEntCertDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */


    /**
     * 新增数据
     *
     * @param tAuthEntCert 实例对象
     * @return 实例对象
     */
    @Override
    public TAuthEntCert insert(TAuthEntCert tAuthEntCert) {
        this.tAuthEntCertDao.insert(tAuthEntCert);
        return tAuthEntCert;
    }

    /**
     * 修改数据
     *
     * @param tAuthEntCert 实例对象
     * @return 实例对象
     */
    @Override
    public TAuthEntCert update(TAuthEntCert tAuthEntCert) {
        this.tAuthEntCertDao.update(tAuthEntCert);
        return this.queryById(tAuthEntCert.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(String id) {
        return this.tAuthEntCertDao.deleteById(id) > 0;
    }
}