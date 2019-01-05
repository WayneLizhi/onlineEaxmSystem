package com.online_examination_system.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.online_examination_system.bean.DeptBean;
import com.online_examination_system.service.DeptService;
import com.online_examination_system.util.DateUtils;
import com.opensymphony.xwork2.ActionSupport;

public class DeptAction extends ActionSupport {
	private static final long serialVersionUID = -2262540955352335307L;
	private DeptBean deptBean;
	private DeptService deptService;
	private String setDate;
	
	private List<DeptBean> listDept=new ArrayList<DeptBean>();

	public List<DeptBean> getListDept() {
		return listDept;
	}

	public void setListDept(List<DeptBean> listDept) {
		this.listDept = listDept;
	}

	public String getSetDate() {
		return setDate;
	}

	public void setSetDate(String setDate) {
		this.setDate = setDate;
	}

	public DeptService getDeptService() {
		return deptService;
	}

	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}

	public DeptBean getDeptBean() {
		return deptBean;
	}

	public void setDeptBean(DeptBean deptBean) {
		this.deptBean = deptBean;
	}
	
	//增加院系信息
	public String addDept() {
		try{
			this.deptBean.setSetdate(DateUtils.strToDate(setDate));
			this.deptService.addDept(this.deptBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
	//获取院系信息
	public String listDept() {
		try{
			HttpServletRequest req = ServletActionContext.getRequest();
			this.listDept = deptService.findAllDept();
			req.setAttribute("listDept", this.listDept);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	
	//删除院系信息
	public String deleteDept(){
		try{
			HttpServletRequest req = ServletActionContext.getRequest();
			int id = Integer.parseInt(req.getParameter("id"));
			this.deptBean = deptService.findDeptById(id);
			deptService.deleteDept(this.deptBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//id查找院系信息
	public String findDeptById(){
		HttpServletRequest req = ServletActionContext.getRequest();
		int id = Integer.parseInt(req.getParameter("id"));
		this.deptBean = deptService.findDeptById(id);
		
		setDate = DateUtils.dateToStr(this.deptBean.getSetdate());
		
		req.setAttribute("deptBean",this.deptBean);
		req.setAttribute("setDate",this.setDate);
		return SUCCESS;
	}
	public String updateDept() {
		try{
			this.deptBean.setSetdate(DateUtils.strToDate(setDate));
			this.deptService.updateDept(this.deptBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
}
