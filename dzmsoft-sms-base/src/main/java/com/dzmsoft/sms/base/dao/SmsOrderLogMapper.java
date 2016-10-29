package com.dzmsoft.sms.base.dao;

import com.dzmsoft.sms.base.pojo.SmsOrderLog;
import com.dzmsoft.sms.base.pojo.SmsOrderLogExample;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SmsOrderLogMapper {
    public PageList<SmsOrderLog> selectByExample(SmsOrderLogExample example,PageBounds pageBounds);
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_log
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int countByExample(SmsOrderLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_log
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int deleteByExample(SmsOrderLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_log
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_log
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int insert(SmsOrderLog record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_log
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int insertSelective(SmsOrderLog record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_log
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    List<SmsOrderLog> selectByExample(SmsOrderLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_log
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    SmsOrderLog selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_log
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int updateByExampleSelective(@Param("record") SmsOrderLog record,
            @Param("example") SmsOrderLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_log
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int updateByExample(@Param("record") SmsOrderLog record,
            @Param("example") SmsOrderLogExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_log
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int updateByPrimaryKeySelective(SmsOrderLog record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_order_log
     * @mbggenerated  Wed May 04 17:07:43 CST 2016
     */
    int updateByPrimaryKey(SmsOrderLog record);
}