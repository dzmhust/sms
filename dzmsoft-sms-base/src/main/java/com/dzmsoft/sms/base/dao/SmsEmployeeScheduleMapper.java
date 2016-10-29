package com.dzmsoft.sms.base.dao;

import com.dzmsoft.sms.base.pojo.SmsEmployeeSchedule;
import com.dzmsoft.sms.base.pojo.SmsEmployeeScheduleExample;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SmsEmployeeScheduleMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee_schedule
     * @mbggenerated  Thu Jul 21 22:04:00 CST 2016
     */
    int countByExample(SmsEmployeeScheduleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee_schedule
     * @mbggenerated  Thu Jul 21 22:04:00 CST 2016
     */
    int deleteByExample(SmsEmployeeScheduleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee_schedule
     * @mbggenerated  Thu Jul 21 22:04:00 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee_schedule
     * @mbggenerated  Thu Jul 21 22:04:00 CST 2016
     */
    int insert(SmsEmployeeSchedule record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee_schedule
     * @mbggenerated  Thu Jul 21 22:04:00 CST 2016
     */
    int insertSelective(SmsEmployeeSchedule record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee_schedule
     * @mbggenerated  Thu Jul 21 22:04:00 CST 2016
     */
    List<SmsEmployeeSchedule> selectByExample(SmsEmployeeScheduleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee_schedule
     * @mbggenerated  Thu Jul 21 22:04:00 CST 2016
     */
    SmsEmployeeSchedule selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee_schedule
     * @mbggenerated  Thu Jul 21 22:04:00 CST 2016
     */
    int updateByExampleSelective(@Param("record") SmsEmployeeSchedule record,
            @Param("example") SmsEmployeeScheduleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee_schedule
     * @mbggenerated  Thu Jul 21 22:04:00 CST 2016
     */
    int updateByExample(@Param("record") SmsEmployeeSchedule record,
            @Param("example") SmsEmployeeScheduleExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee_schedule
     * @mbggenerated  Thu Jul 21 22:04:00 CST 2016
     */
    int updateByPrimaryKeySelective(SmsEmployeeSchedule record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee_schedule
     * @mbggenerated  Thu Jul 21 22:04:00 CST 2016
     */
    int updateByPrimaryKey(SmsEmployeeSchedule record);

    public PageList<SmsEmployeeSchedule> selectByExample(SmsEmployeeScheduleExample example,PageBounds pageBounds);
}