package com.dzmsoft.sms.base.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import java.math.BigDecimal;

public class SmsOrder {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.id
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    private String id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.order_time
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    private Date orderTime;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.director
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    private String director;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.status
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    private String status;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.member
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    private String member;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.member_name
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    private String memberName;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.address
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    private String address;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.individual_needs
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    private String individualNeeds;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.order_type
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    private String orderType;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.member_phone
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    private String memberPhone;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.amount
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    private BigDecimal amount;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.city
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    private String city;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.employees
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    private String employees;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.id
     * @return  the value of sms_order.id
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order.id
     * @param id  the value for sms_order.id
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.order_time
     * @return  the value of sms_order.order_time
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order.order_time
     * @param orderTime  the value for sms_order.order_time
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.director
     * @return  the value of sms_order.director
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public String getDirector() {
        return director;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order.director
     * @param director  the value for sms_order.director
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.status
     * @return  the value of sms_order.status
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order.status
     * @param status  the value for sms_order.status
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.member
     * @return  the value of sms_order.member
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public String getMember() {
        return member;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order.member
     * @param member  the value for sms_order.member
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public void setMember(String member) {
        this.member = member == null ? null : member.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.member_name
     * @return  the value of sms_order.member_name
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order.member_name
     * @param memberName  the value for sms_order.member_name
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.address
     * @return  the value of sms_order.address
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order.address
     * @param address  the value for sms_order.address
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.individual_needs
     * @return  the value of sms_order.individual_needs
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public String getIndividualNeeds() {
        return individualNeeds;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order.individual_needs
     * @param individualNeeds  the value for sms_order.individual_needs
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public void setIndividualNeeds(String individualNeeds) {
        this.individualNeeds = individualNeeds == null ? null : individualNeeds.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.order_type
     * @return  the value of sms_order.order_type
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order.order_type
     * @param orderType  the value for sms_order.order_type
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.member_phone
     * @return  the value of sms_order.member_phone
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public String getMemberPhone() {
        return memberPhone;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order.member_phone
     * @param memberPhone  the value for sms_order.member_phone
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone == null ? null : memberPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.amount
     * @return  the value of sms_order.amount
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order.amount
     * @param amount  the value for sms_order.amount
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.city
     * @return  the value of sms_order.city
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order.city
     * @param city  the value for sms_order.city
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.employees
     * @return  the value of sms_order.employees
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public String getEmployees() {
        return employees;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order.employees
     * @param employees  the value for sms_order.employees
     * @mbggenerated  Sat Aug 13 18:57:25 CST 2016
     */
    public void setEmployees(String employees) {
        this.employees = employees == null ? null : employees.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order.appointment_time
     * @return  the value of sms_order.appointment_time
     */
    public Date getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order.appointment_time
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date appointmentTime;
}