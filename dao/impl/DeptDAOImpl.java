package com.online_examination_system.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.DeptBean;
import com.online_examination_system.dao.DeptDAO;

public class DeptDAOImpl extends HibernateDaoSupport implements DeptDAO {
	public void addDept(DeptBean deptBean) {
		// TODO Auto-generated method stub
		try {
			this.getHibernateTemplate().save(deptBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<DeptBean> findAllDept() {
		// TODO Auto-generated method stub
		String hql = "from DeptBean deptBean order by deptBean.id asc";
		List<DeptBean> list = (List<DeptBean>)this.getHibernateTemplate().find(hql);
		return list;
	}
	
	public void deleteDept(DeptBean deptBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(deptBean);
	}
	public DeptBean findDeptById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(DeptBean.class, id);
	}
	public void updateDept(DeptBean deptBean) {
		// TODO Auto-generated method stub
		try{
		this.getHibernateTemplate().update(deptBean);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
