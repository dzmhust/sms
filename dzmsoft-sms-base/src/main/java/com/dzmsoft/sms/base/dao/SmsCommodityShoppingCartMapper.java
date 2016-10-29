package com.dzmsoft.sms.base.dao;

import com.dzmsoft.sms.base.pojo.SmsCommodityShoppingCart;
import com.dzmsoft.sms.base.pojo.SmsCommodityShoppingCartExample;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SmsCommodityShoppingCartMapper {
    public PageList<SmsCommodityShoppingCart> selectByExample(SmsCommodityShoppingCartExample example,PageBounds pageBounds);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_commodity_shopping_cart
     *
     * @mbggenerated Mon Jun 13 13:00:06 CST 2016
     */
    int countByExample(SmsCommodityShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_commodity_shopping_cart
     *
     * @mbggenerated Mon Jun 13 13:00:06 CST 2016
     */
    int deleteByExample(SmsCommodityShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_commodity_shopping_cart
     *
     * @mbggenerated Mon Jun 13 13:00:06 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_commodity_shopping_cart
     *
     * @mbggenerated Mon Jun 13 13:00:06 CST 2016
     */
    int insert(SmsCommodityShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_commodity_shopping_cart
     *
     * @mbggenerated Mon Jun 13 13:00:06 CST 2016
     */
    int insertSelective(SmsCommodityShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_commodity_shopping_cart
     *
     * @mbggenerated Mon Jun 13 13:00:06 CST 2016
     */
    List<SmsCommodityShoppingCart> selectByExample(SmsCommodityShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_commodity_shopping_cart
     *
     * @mbggenerated Mon Jun 13 13:00:06 CST 2016
     */
    SmsCommodityShoppingCart selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_commodity_shopping_cart
     *
     * @mbggenerated Mon Jun 13 13:00:06 CST 2016
     */
    int updateByExampleSelective(@Param("record") SmsCommodityShoppingCart record, @Param("example") SmsCommodityShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_commodity_shopping_cart
     *
     * @mbggenerated Mon Jun 13 13:00:06 CST 2016
     */
    int updateByExample(@Param("record") SmsCommodityShoppingCart record, @Param("example") SmsCommodityShoppingCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_commodity_shopping_cart
     *
     * @mbggenerated Mon Jun 13 13:00:06 CST 2016
     */
    int updateByPrimaryKeySelective(SmsCommodityShoppingCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sms_commodity_shopping_cart
     *
     * @mbggenerated Mon Jun 13 13:00:06 CST 2016
     */
    int updateByPrimaryKey(SmsCommodityShoppingCart record);
}