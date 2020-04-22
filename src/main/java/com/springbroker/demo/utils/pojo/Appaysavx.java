package com.springbroker.demo.utils.pojo;

import javax.xml.bind.annotation.XmlAccessOrder;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.Data;

/**
 * @author 王延伟
 * @description TODO
 * @createTime $ $
 */
@Data
@XmlAccessorOrder(XmlAccessOrder.ALPHABETICAL)
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "shop", propOrder = {"bnktyp","bustyp","ccynbr","cltacc","cltnbr","eptdat","epttim","exttxl","oprmod","oprtyp"
    ,"payson","paytyp","innacc","intdat","itmnbr","plnnbr","recnum","refnbr","revacc","revbnk","revcit","reveml","revmob",
    "revnam","revprv","trsamt","trsuse","revcat","paycat"})
@XmlRootElement(name = "APPAYSAVX")
public class Appaysavx {


    @XmlElement(name="BNKTYP")
    private String bnktyp;
    @XmlElement(name="BUSTYP")
    private String bustyp;
    @XmlElement(name="CCYNBR")
    private String ccynbr;
    @XmlElement(name="CLTACC")
    private String cltacc;
    @XmlElement(name="CLTNBR")
    private String cltnbr;
    @XmlElement(name="EPTDAT")
    private String eptdat;
    @XmlElement(name="EPTTIM")
    private String epttim;
    @XmlElement(name="EXTTX1")
    private String exttxl;
    @XmlElement(name="OPRMOD")
    private String oprmod;
    @XmlElement(name="OPRTYP")
    private String oprtyp;
    @XmlElement(name="PAYSON")
    private String payson;
    @XmlElement(name="PAYTYP")
    private String paytyp;
    @XmlElement(name="INNACC")
    private String innacc;
    @XmlElement(name="INTDAT")
    private String intdat;
    @XmlElement(name="ITMNBR")
    private String itmnbr;
    @XmlElement(name="PLNNBR")
    private String plnnbr;
    @XmlElement(name="RECNUM")
    private String recnum;
    @XmlElement(name="REFNBR")
    private String refnbr;
    @XmlElement(name="REVACC")
    private String revacc;
    @XmlElement(name="REVBNK")
    private String revbnk;
    @XmlElement(name="REVCIT")
    private String revcit;
    @XmlElement(name="REVEML")
    private String reveml;
    @XmlElement(name="REVMOB")
    private String revmob;
    @XmlElement(name="REVNAM")
    private String revnam;
    @XmlElement(name="REVPRV")
    private String revprv;
    @XmlElement(name="TRSAMT")
    private String trsamt;
    @XmlElement(name="TRSUSE")
    private String trsuse;
    @XmlElement(name="REVCAT")
    private String revcat;
    @XmlElement(name="PAYCAT")
    private String paycat;



}
