package com.dzmsoft.sms.base.pojo;

public class SmsOrderEvaluation {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order_evaluation.id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private String id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order_evaluation.order_id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private String orderId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order_evaluation.score
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private Integer score;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_order_evaluation.comment
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    private String comment;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order_evaluation.id
     * @return  the value of sms_order_evaluation.id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order_evaluation.id
     * @param id  the value for sms_order_evaluation.id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order_evaluation.order_id
     * @return  the value of sms_order_evaluation.order_id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order_evaluation.order_id
     * @param orderId  the value for sms_order_evaluation.order_id
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order_evaluation.score
     * @return  the value of sms_order_evaluation.score
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public Integer getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order_evaluation.score
     * @param score  the value for sms_order_evaluation.score
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_order_evaluation.comment
     * @return  the value of sms_order_evaluation.comment
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_order_evaluation.comment
     * @param comment  the value for sms_order_evaluation.comment
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}