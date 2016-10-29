package com.dzmsoft.sms.base.pojo;

import java.math.BigDecimal;

import com.dzmsoft.sms.base.dto.Order;

public class SmsNewhomeOrder implements Order{

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_newhome_order.id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private String id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_newhome_order.order_id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private String orderId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_newhome_order.area
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private BigDecimal area;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_newhome_order.amount
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private BigDecimal amount;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_newhome_order.diacount
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private BigDecimal diacount;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_newhome_order.cleaners
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private String cleaners;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_newhome_order.id
     * @return  the value of sms_newhome_order.id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_newhome_order.id
     * @param id  the value for sms_newhome_order.id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_newhome_order.order_id
     * @return  the value of sms_newhome_order.order_id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_newhome_order.order_id
     * @param orderId  the value for sms_newhome_order.order_id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_newhome_order.area
     * @return  the value of sms_newhome_order.area
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public BigDecimal getArea() {
        return area;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_newhome_order.area
     * @param area  the value for sms_newhome_order.area
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setArea(BigDecimal area) {
        this.area = area;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_newhome_order.amount
     * @return  the value of sms_newhome_order.amount
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_newhome_order.amount
     * @param amount  the value for sms_newhome_order.amount
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_newhome_order.diacount
     * @return  the value of sms_newhome_order.diacount
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public BigDecimal getDiacount() {
        return diacount;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_newhome_order.diacount
     * @param diacount  the value for sms_newhome_order.diacount
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setDiacount(BigDecimal diacount) {
        this.diacount = diacount;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_newhome_order.cleaners
     * @return  the value of sms_newhome_order.cleaners
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public String getCleaners() {
        return cleaners;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_newhome_order.cleaners
     * @param cleaners  the value for sms_newhome_order.cleaners
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setCleaners(String cleaners) {
        this.cleaners = cleaners == null ? null : cleaners.trim();
    }
}