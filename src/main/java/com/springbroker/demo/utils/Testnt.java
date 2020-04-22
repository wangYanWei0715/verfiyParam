package com.springbroker.demo.utils;

import com.springbroker.demo.utils.pojo.Appaysavx;

/**
 * @author 王延伟
 * @description TODO
 * @createTime $ $
 */
public class Testnt {

    public static void main(String[] args) {

        Appaysavx appaysavx = new Appaysavx();
        appaysavx.setBnktyp("CMB");
        appaysavx.setBustyp("0");
        appaysavx.setCcynbr("10");
        appaysavx.setCltacc("000110100002");
        appaysavx.setCltnbr("0003");
        appaysavx.setEptdat("2019-07-04");
        appaysavx.setEpttim("11:01:00");
        appaysavx.setExttxl("摘要信息03");
        appaysavx.setOprmod("3");
        appaysavx.setOprtyp("202");
        appaysavx.setPayson("N");
        appaysavx.setPaytyp("2");
        appaysavx.setRecnum("1");
        appaysavx.setRefnbr("TEST20190704");
        appaysavx.setRevacc("8512384214654654");
        appaysavx.setRevbnk("招商银行科技园支行");
        appaysavx.setRevcit("深圳市");
        appaysavx.setRevnam("招商银行");
        appaysavx.setRevprv("广东省");
        appaysavx.setTrsamt("200.00");
        appaysavx.setTrsuse("摘要信息01");

        String s = XMLUtils.obj2XML(appaysavx);

        System.out.println(s);


    }

}
