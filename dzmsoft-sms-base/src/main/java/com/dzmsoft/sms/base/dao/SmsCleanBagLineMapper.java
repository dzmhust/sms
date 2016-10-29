package com.dzmsoft.sms.base.dao;

import com.dzmsoft.sms.base.pojo.SmsCleanBagLine;
import com.dzmsoft.sms.base.pojo.SmsCleanBagLineExample;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SmsCleanBagLineMapper {
    public PageList<SmsCleanBagLine> selectByExample(SmsCleanBagLineExample example,PageBounds pageBounds);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_clean_bag_line
     *
     * @mbggenerated Mon Jun 13 13:04:36 CST 2016
     */
    int countByExample(SmsCleanBagLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_clean_bag_line
     *
     * @mbggenerated Mon Jun 13 13:04:36 CST 2016
     */
    int deleteByExample(SmsCleanBagLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_clean_bag_line
     *
     * @mbggenerated Mon Jun 13 13:04:36 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_clean_bag_line
     *
     * @mbggenerated Mon Jun 13 13:04:36 CST 2016
     */
    int insert(SmsCleanBagLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_clean_bag_line
     *
     * @mbggenerated Mon Jun 13 13:04:36 CST 2016
     */
    int insertSelective(SmsCleanBagLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_clean_bag_line
     *
     * @mbggenerated Mon Jun 13 13:04:36 CST 2016
     */
    List<SmsCleanBagLine> selectByExample(SmsCleanBagLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_clean_bag_line
     *
     * @mbggenerated Mon Jun 13 13:04:36 CST 2016
     */
    SmsCleanBagLine selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_clean_bag_line
     *
     * @mbggenerated Mon Jun 13 13:04:36 CST 2016
     */
    int updateByExampleSelective(@Param("record") SmsCleanBagLine record, @Param("example") SmsCleanBagLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_clean_bag_line
     *
     * @mbggenerated Mon Jun 13 13:04:36 CST 2016
     */
    int updateByExample(@Param("record") SmsCleanBagLine record, @Param("example") SmsCleanBagLineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_clean_bag_line
     *
     * @mbggenerated Mon Jun 13 13:04:36 CST 2016
     */
    int updateByPrimaryKeySelective(SmsCleanBagLine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_clean_bag_line
     *
     * @mbggenerated Mon Jun 13 13:04:36 CST 2016
     */
    int updateByPrimaryKey(SmsCleanBagLine record);
}