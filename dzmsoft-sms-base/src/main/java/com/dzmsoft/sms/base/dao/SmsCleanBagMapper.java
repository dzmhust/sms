package com.dzmsoft.sms.base.dao;

import com.dzmsoft.sms.base.pojo.SmsCleanBag;
import com.dzmsoft.sms.base.pojo.SmsCleanBagExample;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SmsCleanBagMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_clean_bag
     * @mbggenerated  Tue Jun 21 16:44:20 CST 2016
     */
    int countByExample(SmsCleanBagExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_clean_bag
     * @mbggenerated  Tue Jun 21 16:44:20 CST 2016
     */
    int deleteByExample(SmsCleanBagExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_clean_bag
     * @mbggenerated  Tue Jun 21 16:44:20 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_clean_bag
     * @mbggenerated  Tue Jun 21 16:44:20 CST 2016
     */
    int insert(SmsCleanBag record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_clean_bag
     * @mbggenerated  Tue Jun 21 16:44:20 CST 2016
     */
    int insertSelective(SmsCleanBag record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_clean_bag
     * @mbggenerated  Tue Jun 21 16:44:20 CST 2016
     */
    List<SmsCleanBag> selectByExample(SmsCleanBagExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_clean_bag
     * @mbggenerated  Tue Jun 21 16:44:20 CST 2016
     */
    SmsCleanBag selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_clean_bag
     * @mbggenerated  Tue Jun 21 16:44:20 CST 2016
     */
    int updateByExampleSelective(@Param("record") SmsCleanBag record,
            @Param("example") SmsCleanBagExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_clean_bag
     * @mbggenerated  Tue Jun 21 16:44:20 CST 2016
     */
    int updateByExample(@Param("record") SmsCleanBag record,
            @Param("example") SmsCleanBagExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_clean_bag
     * @mbggenerated  Tue Jun 21 16:44:20 CST 2016
     */
    int updateByPrimaryKeySelective(SmsCleanBag record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_clean_bag
     * @mbggenerated  Tue Jun 21 16:44:20 CST 2016
     */
    int updateByPrimaryKey(SmsCleanBag record);

    public PageList<SmsCleanBag> selectByExample(SmsCleanBagExample example,PageBounds pageBounds);
}