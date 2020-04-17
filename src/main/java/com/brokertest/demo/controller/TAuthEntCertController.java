package com.brokertest.demo.controller;

import com.brokertest.demo.entity.TAuthEntCert;
import com.brokertest.demo.service.TAuthEntCertService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 认证-企业-证件认证(TAuthEntCert)表控制层
 *
 * @author makejava
 * @since 2020-04-17 23:55:55
 */
@RestController
@RequestMapping("tAuthEntCert")
public class TAuthEntCertController {
    /**
     * 服务对象
     */
    @Resource
    private TAuthEntCertService tAuthEntCertService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TAuthEntCert selectOne(String id) {
        return this.tAuthEntCertService.queryById(id);
    }

}