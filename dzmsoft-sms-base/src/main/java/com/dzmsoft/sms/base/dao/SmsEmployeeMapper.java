package com.dzmsoft.sms.base.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dzmsoft.sms.base.pojo.SmsEmployee;
import com.dzmsoft.sms.base.pojo.SmsEmployeeExample;
import com.dzmsoft.sms.base.pojo.udf.ServiceCleanersUdfExample;
import com.dzmsoft.sms.base.pojo.udf.SmsEmployeeScheduleUdfExample;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

public interface SmsEmployeeMapper {
    
    PageList<SmsEmployee> selectServiceCleaners(ServiceCleanersUdfExample example, PageBounds pageBounds);
    
    PageList<SmsEmployee> selectNoSchedule(SmsEmployeeScheduleUdfExample example, PageBounds pageBounds);
    
    String selectTopIndex(SmsEmployeeExample example);
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    int countByExample(SmsEmployeeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    int deleteByExample(SmsEmployeeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    int insert(SmsEmployee record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    int insertSelective(SmsEmployee record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    List<SmsEmployee> selectByExample(SmsEmployeeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    SmsEmployee selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    int updateByExampleSelective(@Param("record") SmsEmployee record,
            @Param("example") SmsEmployeeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    int updateByExample(@Param("record") SmsEmployee record,
            @Param("example") SmsEmployeeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    int updateByPrimaryKeySelective(SmsEmployee record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table sms_employee
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    int updateByPrimaryKey(SmsEmployee record);

    public PageList<SmsEmployee> selectByExample(SmsEmployeeExample example,PageBounds pageBounds);
}