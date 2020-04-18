package com.springbroker.demo.controller;

import com.springbroker.demo.config.annotion.SetParam;
import com.springbroker.demo.config.interfaces.VerifyAdd;
import com.springbroker.demo.config.interfaces.VerifyUpdate;
import com.springbroker.demo.config.result.JsonResult;
import com.springbroker.demo.entity.TAuthEntCert;
import com.springbroker.demo.service.TAuthEntCertService;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 认证-企业-证件认证(TAuthEntCert)表控制层
 *
 * @author makejava
 * @since 2020-04-18 00:56:14
 */
@RestController
@RequestMapping("/tAuthEntCert")
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
    @GetMapping("/selectOne")
    public TAuthEntCert selectOne(String id) {
        return this.tAuthEntCertService.queryById(id);
    }

    @PostMapping("/insert")
    public JsonResult insert(@RequestBody @Validated(VerifyAdd.class) TAuthEntCert tAuthEntCert){
        String replace = UUID.randomUUID().toString().replace("-", "");
        tAuthEntCert.setId(replace);
        TAuthEntCert insert = tAuthEntCertService.insert(tAuthEntCert);
        return  JsonResult.success(insert);
    }


    /*@PostMapping("/insert")
    @SetParam
    public JsonResult insert(@RequestBody @Validated(VerifyAdd.class) @SetParam TAuthEntCert tAuthEntCert){
        String replace = UUID.randomUUID().toString().replace("-", "");
        tAuthEntCert.setId(replace);
        TAuthEntCert insert = tAuthEntCertService.insert(tAuthEntCert);
        return  JsonResult.success(insert);
    }*/

   /*@PostMapping("/update")
    @SetParam
    public JsonResult update(@RequestBody @Validated(VerifyUpdate.class) @SetParam TAuthEntCert tAuthEntCert){
        TAuthEntCert update = tAuthEntCertService.update(tAuthEntCert);
        return JsonResult.success(update);
    }*/

    @PostMapping("/update")
    public JsonResult update(@RequestBody @Validated(VerifyUpdate.class)  TAuthEntCert tAuthEntCert){
        TAuthEntCert update = tAuthEntCertService.update(tAuthEntCert);
        return JsonResult.success(update);
    }


    @GetMapping("/delete")
    public JsonResult delete(@RequestParam String id){
        boolean b = tAuthEntCertService.deleteById(id);
        System.out.println(b);
        return JsonResult.success("删除成功！");

    }



}