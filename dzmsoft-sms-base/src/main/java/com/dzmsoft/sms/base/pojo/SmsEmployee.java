package com.dzmsoft.sms.base.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SmsEmployee {

    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.id
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String id;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.name
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String name;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.sex
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String sex;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.birthday
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.description
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String description;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.id_card
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String idCard;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.mobile
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String mobile;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.city
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String city;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.division
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String division;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.province
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String province;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.user_type
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String userType;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.head_portrait_pic
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String headPortraitPic;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.supplier
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String supplier;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.experience_value
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private Integer experienceValue;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.good_ratio
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private Double goodRatio;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.good_count
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private Double goodCount;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.bad_count
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private Double badCount;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.health_certificate_pic
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String healthCertificatePic;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.health_end_date
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private Date healthEndDate;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.ucs_id
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String ucsId;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database column sms_employee.status
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.id
     * @return  the value of sms_employee.id
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.id
     * @param id  the value for sms_employee.id
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.name
     * @return  the value of sms_employee.name
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.name
     * @param name  the value for sms_employee.name
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.sex
     * @return  the value of sms_employee.sex
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.sex
     * @param sex  the value for sms_employee.sex
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.birthday
     * @return  the value of sms_employee.birthday
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.birthday
     * @param birthday  the value for sms_employee.birthday
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.description
     * @return  the value of sms_employee.description
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.description
     * @param description  the value for sms_employee.description
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.id_card
     * @return  the value of sms_employee.id_card
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.id_card
     * @param idCard  the value for sms_employee.id_card
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.mobile
     * @return  the value of sms_employee.mobile
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.mobile
     * @param mobile  the value for sms_employee.mobile
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.city
     * @return  the value of sms_employee.city
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.city
     * @param city  the value for sms_employee.city
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.division
     * @return  the value of sms_employee.division
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getDivision() {
        return division;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.division
     * @param division  the value for sms_employee.division
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setDivision(String division) {
        this.division = division == null ? null : division.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.province
     * @return  the value of sms_employee.province
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.province
     * @param province  the value for sms_employee.province
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.user_type
     * @return  the value of sms_employee.user_type
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.user_type
     * @param userType  the value for sms_employee.user_type
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.head_portrait_pic
     * @return  the value of sms_employee.head_portrait_pic
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getHeadPortraitPic() {
        return headPortraitPic;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.head_portrait_pic
     * @param headPortraitPic  the value for sms_employee.head_portrait_pic
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setHeadPortraitPic(String headPortraitPic) {
        this.headPortraitPic = headPortraitPic == null ? null : headPortraitPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.supplier
     * @return  the value of sms_employee.supplier
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.supplier
     * @param supplier  the value for sms_employee.supplier
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.experience_value
     * @return  the value of sms_employee.experience_value
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public Integer getExperienceValue() {
        return experienceValue;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.experience_value
     * @param experienceValue  the value for sms_employee.experience_value
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setExperienceValue(Integer experienceValue) {
        this.experienceValue = experienceValue;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.good_ratio
     * @return  the value of sms_employee.good_ratio
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public Double getGoodRatio() {
        return goodRatio;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.good_ratio
     * @param goodRatio  the value for sms_employee.good_ratio
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setGoodRatio(Double goodRatio) {
        this.goodRatio = goodRatio;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.good_count
     * @return  the value of sms_employee.good_count
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public Double getGoodCount() {
        return goodCount;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.good_count
     * @param goodCount  the value for sms_employee.good_count
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setGoodCount(Double goodCount) {
        this.goodCount = goodCount;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.bad_count
     * @return  the value of sms_employee.bad_count
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public Double getBadCount() {
        return badCount;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.bad_count
     * @param badCount  the value for sms_employee.bad_count
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setBadCount(Double badCount) {
        this.badCount = badCount;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.health_certificate_pic
     * @return  the value of sms_employee.health_certificate_pic
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getHealthCertificatePic() {
        return healthCertificatePic;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.health_certificate_pic
     * @param healthCertificatePic  the value for sms_employee.health_certificate_pic
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setHealthCertificatePic(String healthCertificatePic) {
        this.healthCertificatePic = healthCertificatePic == null ? null : healthCertificatePic
                .trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.health_end_date
     * @return  the value of sms_employee.health_end_date
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public Date getHealthEndDate() {
        return healthEndDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.health_end_date
     * @param healthEndDate  the value for sms_employee.health_end_date
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setHealthEndDate(Date healthEndDate) {
        this.healthEndDate = healthEndDate;
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.ucs_id
     * @return  the value of sms_employee.ucs_id
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getUcsId() {
        return ucsId;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.ucs_id
     * @param ucsId  the value for sms_employee.ucs_id
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setUcsId(String ucsId) {
        this.ucsId = ucsId == null ? null : ucsId.trim();
    }

    /**
     * This method was generated by MyBatis Generator. This method returns the value of the database column sms_employee.status
     * @return  the value of sms_employee.status
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator. This method sets the value of the database column sms_employee.status
     * @param status  the value for sms_employee.status
     * @mbggenerated  Sat May 14 08:49:32 CST 2016
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}