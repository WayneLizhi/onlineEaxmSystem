package com.online_examination_system.action;

import java.util.ArrayList;
import java.util.List;

import com.online_examination_system.bean.DeptBean;
import com.online_examination_system.bean.MajorBean;
import com.online_examination_system.service.DeptService;
import com.online_examination_system.service.MajorService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class MajorAction extends ActionSupport {
	
	private MajorService majorService;
	private DeptService deptService;
	private DeptBean deptBean;
	private MajorBean majorBean;
	private int deptId;
	private int majorId;

	private List<DeptBean> listDept=new ArrayList<DeptBean>();
	private List<MajorBean> listMajor = new ArrayList<MajorBean>();
	
	public DeptBean getDeptBean() {
		return deptBean;
	}
	public void setDeptBean(DeptBean deptBean) {
		this.deptBean = deptBean;
	}
	public MajorBean getMajorBean() {
		return majorBean;
	}
	public void setMajorBean(MajorBean majorBean) {
		this.majorBean = majorBean;
	}
	public List<DeptBean> getListDept() {
		return listDept;
	}
	public void setListDept(List<DeptBean> listDept) {
		this.listDept = listDept;
	}
	public DeptService getDeptService() {
		return deptService;
	}
	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}
	public MajorService getMajorService() {
		return majorService;
	}
	public void setMajorService(MajorService majorService) {
		this.majorService = majorService;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getMajorId() {
		return majorId;
	}
	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}
	public List<MajorBean> getListMajor() {
		return listMajor;
	}
	public void setListMajor(List<MajorBean> listMajor) {
		this.listMajor = listMajor;
	}
	//列出所有院系
	public String listDept(){
		ActionContext ctx = ActionContext.getContext();
		this.listDept = deptService.findAllDept();
		ctx.put("listDept", this.listDept);
		return SUCCESS;
	}
	//添加院系信息
	public String addMajor(){
		try {
			this.majorService.addMajor(this.majorBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//列出指定院系专业信息
	public String listMajor(){
		try{
		ActionContext ctx = ActionContext.getContext();
		if(this.deptId == 0){
			this.listMajor = this.majorService.findAllMajor();
		} else {
			this.listMajor = this.majorService.findConditionMajor(this.deptId);
		}
		ctx.put("listMajor", this.listMajor);
		return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//更新专业信息
	public String updateMajor(){
		try{
			this.majorService.updateMajor(majorBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}
	//ID查询专业
	public String findMajorById(){
		ActionContext ctx = ActionContext.getContext();
		this.majorBean = this.majorService.findMajorById(this.majorId);
		this.deptBean = this.deptService.findDeptById(this.majorBean.getDeptId());
		this.listDept = deptService.findAllDept();
		ctx.put("majorBean", this.majorBean);
		ctx.put("listDept", this.listDept);
		return SUCCESS;
	}
	//ID删除专业
	public String deleteMajorById(){
		try{
			this.majorBean = this.majorService.findMajorById(this.majorId);
			this.majorService.deleteMajor(this.majorBean);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
