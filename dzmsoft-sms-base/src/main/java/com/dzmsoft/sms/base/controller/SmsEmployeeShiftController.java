package com.dzmsoft.sms.base.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dzmsoft.framework.base.web.mvc.controller.BaseController;
import com.dzmsoft.framework.base.web.mvc.dao.MybatisExample;
import com.dzmsoft.framework.base.web.mvc.view.BaseResponse;
import com.dzmsoft.framework.base.web.mvc.view.Condition;
import com.dzmsoft.framework.base.web.mvc.pojo.EasyUIPage;
import com.dzmsoft.sms.base.pojo.SmsEmployeeShift;
import com.dzmsoft.sms.base.pojo.SmsEmployeeShiftExample;
import com.dzmsoft.sms.base.service.SmsEmployeeShiftService;
import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;

/**
 * Copyright (C), dzmsoft Co., Ltd
 * @author 
 * @dzmsoftgenerated 
 *
 * @version 
 */
@Controller
@RequestMapping("smsEmployeeShift")
public class SmsEmployeeShiftController extends BaseController{
	@Autowired
	private SmsEmployeeShiftService smsEmployeeShiftService;

	/**
	 * 显示主列表页面
	 * @dzmsoftgenerated 
	 * @return
	 */
	@RequiresPermissions("smsEmployeeShift:find")
	@RequestMapping(value = "show", method = RequestMethod.GET)
	public String show(){
		return "modules/base/smsEmployeeShiftList";
	}
	
	/**
	 * 主列表中查询
	 * @dzmsoftgenerated 
	 * @return
	 */
	@RequiresPermissions("smsEmployeeShift:find")
	@RequestMapping(value = "find", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> find(HttpServletRequest request){
		List<Condition> conditions = Condition.buildFromHttpRequest(request);
		EasyUIPage easyUIPage = new EasyUIPage(request);
		MybatisExample mybatisExample = MybatisExample.getInstance();
		SmsEmployeeShiftExample example = (SmsEmployeeShiftExample)mybatisExample.buildExampleByCondition(conditions, easyUIPage, SmsEmployeeShiftExample.class.getName());
		PageList<SmsEmployeeShift> smsEmployeeShifts = smsEmployeeShiftService.selectByExample(example, new PageBounds(easyUIPage.getPage(),
                easyUIPage.getRows()));
		return getEasyUIGrid(smsEmployeeShifts);
	}
	
	/**
	 * 跳转到新增页面
	 * @dzmsoftgenerated 
	 * @return
	 */
	@RequiresPermissions("smsEmployeeShift:add")
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String addForm(Model model){
		SmsEmployeeShift smsEmployeeShift = new SmsEmployeeShift();
				model.addAttribute("smsEmployeeShift", smsEmployeeShift);
		model.addAttribute("action", "add");
		return "modules/base/smsEmployeeShiftForm";
	}
	
		/**
	 * 新增记录
	 * @dzmsoftgenerated 
	 * @return
	 */
	@RequiresPermissions("smsEmployeeShift:add")
	@RequestMapping(value = "add", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse add(SmsEmployeeShift smsEmployeeShift){
		int flag = smsEmployeeShiftService.insertSelective(smsEmployeeShift);
		BaseResponse baseResponse = flag>0?new BaseResponse(true,"新增成功"):new BaseResponse(false, "新增失败");
		return baseResponse;
	}
		
	/**
	 * 跳转到编辑页面
	 * @dzmsoftgenerated 
	 * @return
	 */
	@RequiresPermissions("smsEmployeeShift:edit")
	@RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
	public String editForm(@PathVariable("id") String id,Model model){
		SmsEmployeeShift smsEmployeeShift = smsEmployeeShiftService.selectByPrimaryKey(id);
		model.addAttribute("smsEmployeeShift", smsEmployeeShift);
		model.addAttribute("action", "edit");
		return "modules/base/smsEmployeeShiftForm";
	}
	
	/**
	 * 跳转到查看页面
	 * @dzmsoftgenerated 
	 * @return
	 */
	@RequiresPermissions("smsEmployeeShift:view")
	@RequestMapping(value = "view/{id}", method = RequestMethod.GET)
	public String viewForm(@PathVariable("id") String id,Model model){
		SmsEmployeeShift smsEmployeeShift = smsEmployeeShiftService.selectByPrimaryKey(id);
		model.addAttribute("smsEmployeeShift", smsEmployeeShift);
		model.addAttribute("action", "view");
		return "modules/base/smsEmployeeShiftForm";
	}
	
		/**
	 * 编辑记录
	 * @dzmsoftgenerated 
	 * @return
	 */
	@RequiresPermissions("smsEmployeeShift:edit")
	@RequestMapping(value = "edit", method = RequestMethod.POST)
	@ResponseBody
	public BaseResponse edit(SmsEmployeeShift smsEmployeeShift){
		int flag = smsEmployeeShiftService.updateByPrimaryKeySelective(smsEmployeeShift);
		BaseResponse baseResponse = flag>0?new BaseResponse(true,"编辑成功"):new BaseResponse(false, "编辑失败");
		return baseResponse;
	}
		
	/**
	 * 删除记录
	 * @dzmsoftgenerated 
	 * @return
	 */
	@RequiresPermissions("smsEmployeeShift:remove")
	@RequestMapping(value = "remove/{id}", method = RequestMethod.GET)
	@ResponseBody
	public BaseResponse remove(@PathVariable("id") String id){
		int flag = smsEmployeeShiftService.deleteByPrimaryKey(id);
		BaseResponse baseResponse = flag>=0?new BaseResponse(true,"删除成功"):new BaseResponse(false, "删除失败");
		return baseResponse;
	}
	
	}
