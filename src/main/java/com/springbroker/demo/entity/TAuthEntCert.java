package com.springbroker.demo.entity;

import com.springbroker.demo.config.interfaces.VerifyAdd;
import com.springbroker.demo.config.interfaces.VerifyUpdate;
import java.util.Date;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * 认证-企业-证件认证(TAuthEntCert)实体类
 *
 * @author makejava
 * @since 2020-04-18 00:56:06
 */
@Data
public class TAuthEntCert extends BaseDto implements Serializable {
    private static final long serialVersionUID = 254644964785400041L;
    /**
    * 主键
    */
    @NotNull(message = "主键不能为空",groups = {VerifyUpdate.class})
    private String id;
    /**
    * 关联客户基础信息表用户code
    */
    @NotNull(message = "关联客户基础信息表用户code不能为空",groups = {VerifyAdd.class, VerifyUpdate.class})
    private String customerCode;
    /**
    * 关联协议表
    */
    @NotNull(message = "关联协议表不能为空",groups = VerifyAdd.class)
    private String agreement;
    /**
    * 企业名称
    */
    @Length(max = 100,message = "最长输入100字" ,groups = VerifyAdd.class)
    @NotNull(message = "企业名称不能为空",groups = VerifyAdd.class)
    private String entName;
    /**
    * 证件类型：1：企业营业执照，2：社会团体法人证书，3：组织结构代码证，4：事业单位证书，5：社会团体法人等级证书，6：行政执法主体资格证，7：其他
    */
    @NotNull(message = "证件类型不能为空",groups = VerifyAdd.class)
    private String certType;
    /**
    * 法定代表人证件号码
    */
    @NotNull(message = "法定代表人证件号码不能为空",groups = VerifyAdd.class)
    private String legalPersonIdcard;
    /**
    * 证件附件
    */
    @NotNull(message = "证件附件不能为空",groups = VerifyAdd.class)
    private String certAttachment;

    /**
    * 法定代表人/被授权人身份证人像面
    */
    @NotNull(message = "法定代表人/被授权人身份证人像面不能为空",groups = VerifyAdd.class)
    private String idCardFrontPhoto;
    /**
    * 法定代表/被授权人身份证国徽面
    */
    @NotNull(message = "法定代表/被授权人身份证国徽面不能为空",groups = VerifyAdd.class)
    private String idCardBackPhoto;
    /**
    * 授权书
    */
    private String certAuth;
    /**
    * 申请人类型:1法定代表人，2：被授权人
    */
    @NotNull(message = "申请人类型不能为空",groups = VerifyAdd.class)
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


    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}