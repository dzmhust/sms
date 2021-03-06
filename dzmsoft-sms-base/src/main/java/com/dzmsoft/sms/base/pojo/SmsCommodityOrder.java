package com.dzmsoft.sms.base.pojo;

import java.math.BigDecimal;

public class SmsCommodityOrder {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_commodity_order.id
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_commodity_order.order_id
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    private String orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_commodity_order.commodity_id
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    private String commodityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_commodity_order.commodity_name
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    private String commodityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_commodity_order.price
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_commodity_order.quantity
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    private Long quantity;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_commodity_order.amount
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_commodity_order.status
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_commodity_order.spec
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    private String spec;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sms_commodity_order.model
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    private String model;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_commodity_order.id
     *
     * @return the value of sms_commodity_order.id
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_commodity_order.id
     *
     * @param id the value for sms_commodity_order.id
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_commodity_order.order_id
     *
     * @return the value of sms_commodity_order.order_id
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_commodity_order.order_id
     *
     * @param orderId the value for sms_commodity_order.order_id
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_commodity_order.commodity_id
     *
     * @return the value of sms_commodity_order.commodity_id
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public String getCommodityId() {
        return commodityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_commodity_order.commodity_id
     *
     * @param commodityId the value for sms_commodity_order.commodity_id
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId == null ? null : commodityId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_commodity_order.commodity_name
     *
     * @return the value of sms_commodity_order.commodity_name
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public String getCommodityName() {
        return commodityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_commodity_order.commodity_name
     *
     * @param commodityName the value for sms_commodity_order.commodity_name
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName == null ? null : commodityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_commodity_order.price
     *
     * @return the value of sms_commodity_order.price
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_commodity_order.price
     *
     * @param price the value for sms_commodity_order.price
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_commodity_order.quantity
     *
     * @return the value of sms_commodity_order.quantity
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_commodity_order.quantity
     *
     * @param quantity the value for sms_commodity_order.quantity
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_commodity_order.amount
     *
     * @return the value of sms_commodity_order.amount
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_commodity_order.amount
     *
     * @param amount the value for sms_commodity_order.amount
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_commodity_order.status
     *
     * @return the value of sms_commodity_order.status
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_commodity_order.status
     *
     * @param status the value for sms_commodity_order.status
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_commodity_order.spec
     *
     * @return the value of sms_commodity_order.spec
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public String getSpec() {
        return spec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_commodity_order.spec
     *
     * @param spec the value for sms_commodity_order.spec
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sms_commodity_order.model
     *
     * @return the value of sms_commodity_order.model
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public String getModel() {
        return model;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sms_commodity_order.model
     *
     * @param model the value for sms_commodity_order.model
     *
     * @mbggenerated Sun May 29 08:54:46 CST 2016
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }
}