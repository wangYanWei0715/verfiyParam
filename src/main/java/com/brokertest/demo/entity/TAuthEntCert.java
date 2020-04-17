package com.brokertest.demo.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 认证-企业-证件认证(TAuthEntCert)实体类
 *
 * @author makejava
 * @since 2020-04-17 23:55:50
 */
public class TAuthEntCert implements Serializable {
    private static final long serialVersionUID = -39909459494491000L;
    /**
    * 主键
    */
    private String id;
    /**
    * 关联客户基础信息表用户code
    */
    private String customerCode;
    /**
    * 关联协议表
    */
    private String agreement;
    /**
    * 企业名称
    */
    private String entName;
    /**
    * 证件类型：1：企业营业执照，2：社会团体法人证书，3：组织结构代码证，4：事业单位证书，5：社会团体法人等级证书，6：行政执法主体资格证，7：其他
    */
    private String certType;
    /**
    * 法定代表人证件号码
    */
    private String legalPersonIdcard;
    /**
    * 证件附件
    */
    private String certAttachment;
    /**
    * 法定代表人/被授权人身份证人像面
    */
    private String idCardFrontPhoto;
    /**
    * 法定代表/被授权人身份证国徽面
    */
    private String idCardBackPhoto;
    /**
    * 授权书
    */
    private String certAuth;
    /**
    * 申请人类型:1法定代表人，2：被授权人
    */
    private String applicantType;
    /**
    * 变更前营业执照
    */
    private String changeCertType;
    /**
    * 变更前法定代表人/被授权人身份证人像面
    */
    private String changeIdCardFrontPhoto;
    /**
    * 变更前法定代表/被授权人身份证国徽面
    */
    private String changeIdCardBackPhoto;
    /**
    * 申请变更表
    */
    private String changeForm;
    /**
    * 变更证明
    */
    private String changeCertify;
    /**
    * 变更类型
    */
    private String changeType;
    /**
    * 使用状态：0：使用；1：未使用
    */
    private Integer useStatus;
    /**
    * 乐观锁：版本
    */
    private Integer version;
    /**
    * 数据状态 0,正常 1.已删除
    */
    private String delStatus;
    /**
    * 创建者ID
    */
    private String createUserId;
    /**
    * 创建者姓名
    */
    private String createUsername;
    /**
    * 创建时间
    */
    private Date createTime;
    /**
    * 修改者ID
    */
    private String updateUserId;
    /**
    * 修改者姓名
    */
    private String updateUsername;
    /**
    * 修改时间
    */
    private Date updateTime;
    /**
    * 备注
    */
    private String remark;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getLegalPersonIdcard() {
        return legalPersonIdcard;
    }

    public void setLegalPersonIdcard(String legalPersonIdcard) {
        this.legalPersonIdcard = legalPersonIdcard;
    }

    public String getCertAttachment() {
        return certAttachment;
    }

    public void setCertAttachment(String certAttachment) {
        this.certAttachment = certAttachment;
    }

    public String getIdCardFrontPhoto() {
        return idCardFrontPhoto;
    }

    public void setIdCardFrontPhoto(String idCardFrontPhoto) {
        this.idCardFrontPhoto = idCardFrontPhoto;
    }

    public String getIdCardBackPhoto() {
        return idCardBackPhoto;
    }

    public void setIdCardBackPhoto(String idCardBackPhoto) {
        this.idCardBackPhoto = idCardBackPhoto;
    }

    public String getCertAuth() {
        return certAuth;
    }

    public void setCertAuth(String certAuth) {
        this.certAuth = certAuth;
    }

    public String getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(String applicantType) {
        this.applicantType = applicantType;
    }

    public String getChangeCertType() {
        return changeCertType;
    }

    public void setChangeCertType(String changeCertType) {
        this.changeCertType = changeCertType;
    }

    public String getChangeIdCardFrontPhoto() {
        return changeIdCardFrontPhoto;
    }

    public void setChangeIdCardFrontPhoto(String changeIdCardFrontPhoto) {
        this.changeIdCardFrontPhoto = changeIdCardFrontPhoto;
    }

    public String getChangeIdCardBackPhoto() {
        return changeIdCardBackPhoto;
    }

    public void setChangeIdCardBackPhoto(String changeIdCardBackPhoto) {
        this.changeIdCardBackPhoto = changeIdCardBackPhoto;
    }

    public String getChangeForm() {
        return changeForm;
    }

    public void setChangeForm(String changeForm) {
        this.changeForm = changeForm;
    }

    public String getChangeCertify() {
        return changeCertify;
    }

    public void setChangeCertify(String changeCertify) {
        this.changeCertify = changeCertify;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public Integer getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(Integer useStatus) {
        this.useStatus = useStatus;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDelStatus() {
        return delStatus;
    }

    public void setDelStatus(String delStatus) {
        this.delStatus = delStatus;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateUsername() {
        return updateUsername;
    }

    public void setUpdateUsername(String updateUsername) {
        this.updateUsername = updateUsername;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}