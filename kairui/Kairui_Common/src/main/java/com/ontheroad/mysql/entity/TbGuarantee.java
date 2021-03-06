package com.ontheroad.mysql.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class TbGuarantee implements Serializable{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.guarantee_id
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private Integer guaranteeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.equipment_id
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private Integer equipmentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.user_id
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.model
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private String model;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.productNumber
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private String productnumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.buyTime
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    @DateTimeFormat(pattern="YYYY-MM-DD")
    private Date buytime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.guaranteeTime
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private String guaranteetime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.phone
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.area
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private String area;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.address
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.invoice
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private String invoice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.status
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.remark
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.submit_time
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private Date submitTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_guarantee.audit_time
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    private Date auditTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.guarantee_id
     *
     * @return the value of tb_guarantee.guarantee_id
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public Integer getGuaranteeId() {
        return guaranteeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.guarantee_id
     *
     * @param guaranteeId the value for tb_guarantee.guarantee_id
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setGuaranteeId(Integer guaranteeId) {
        this.guaranteeId = guaranteeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.equipment_id
     *
     * @return the value of tb_guarantee.equipment_id
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public Integer getEquipmentId() {
        return equipmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.equipment_id
     *
     * @param equipmentId the value for tb_guarantee.equipment_id
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setEquipmentId(Integer equipmentId) {
        this.equipmentId = equipmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.user_id
     *
     * @return the value of tb_guarantee.user_id
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.user_id
     *
     * @param userId the value for tb_guarantee.user_id
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.model
     *
     * @return the value of tb_guarantee.model
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public String getModel() {
        return model;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.model
     *
     * @param model the value for tb_guarantee.model
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.productNumber
     *
     * @return the value of tb_guarantee.productNumber
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public String getProductnumber() {
        return productnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.productNumber
     *
     * @param productnumber the value for tb_guarantee.productNumber
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setProductnumber(String productnumber) {
        this.productnumber = productnumber == null ? null : productnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.buyTime
     *
     * @return the value of tb_guarantee.buyTime
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public Date getBuytime() {
        return buytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.buyTime
     *
     * @param buytime the value for tb_guarantee.buyTime
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.guaranteeTime
     *
     * @return the value of tb_guarantee.guaranteeTime
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public String getGuaranteetime() {
        return guaranteetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.guaranteeTime
     *
     * @param guaranteetime the value for tb_guarantee.guaranteeTime
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setGuaranteetime(String guaranteetime) {
        this.guaranteetime = guaranteetime == null ? null : guaranteetime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.phone
     *
     * @return the value of tb_guarantee.phone
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.phone
     *
     * @param phone the value for tb_guarantee.phone
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.area
     *
     * @return the value of tb_guarantee.area
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public String getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.area
     *
     * @param area the value for tb_guarantee.area
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.address
     *
     * @return the value of tb_guarantee.address
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.address
     *
     * @param address the value for tb_guarantee.address
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.invoice
     *
     * @return the value of tb_guarantee.invoice
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public String getInvoice() {
        return invoice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.invoice
     *
     * @param invoice the value for tb_guarantee.invoice
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setInvoice(String invoice) {
        this.invoice = invoice == null ? null : invoice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.status
     *
     * @return the value of tb_guarantee.status
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.status
     *
     * @param status the value for tb_guarantee.status
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.remark
     *
     * @return the value of tb_guarantee.remark
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.remark
     *
     * @param remark the value for tb_guarantee.remark
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.submit_time
     *
     * @return the value of tb_guarantee.submit_time
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public Date getSubmitTime() {
        return submitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.submit_time
     *
     * @param submitTime the value for tb_guarantee.submit_time
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_guarantee.audit_time
     *
     * @return the value of tb_guarantee.audit_time
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public Date getAuditTime() {
        return auditTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_guarantee.audit_time
     *
     * @param auditTime the value for tb_guarantee.audit_time
     *
     * @mbggenerated Sun Oct 29 09:24:55 CST 2017
     */
    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }
}