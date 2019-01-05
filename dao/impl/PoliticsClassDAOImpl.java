package com.online_examination_system.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.online_examination_system.bean.PoliticsClassBean;
import com.online_examination_system.dao.PoliticsClassDAO;

public class PoliticsClassDAOImpl extends HibernateDaoSupport implements
		PoliticsClassDAO {
	public void addPoliticsClassBean(PoliticsClassBean politicsClassBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(politicsClassBean);
	}
	@SuppressWarnings("unchecked")
	public List<PoliticsClassBean> searchPoliticsClass(
			PoliticsClassBean politicsClassBean) {
		// TODO Auto-generated method stub
		List<PoliticsClassBean> listPoliticsClassBean = new ArrayList<PoliticsClassBean>();
		String hql = "from PoliticsClassBean politicsClassBean where 1=1";
		if(!politicsClassBean.getName().equals("")){
			hql = hql + " and politicsClassBean.name='" + politicsClassBean.getName() + "'";
		}
		if(0 != politicsClassBean.getMajorId()){
			hql = hql + " and politicsClassBean.majorId=" + politicsClassBean.getMajorId();
		}
		if (0 != politicsClassBean.getTeacherId()){
			hql = hql + " and politicsClassBean.teacherId=" + politicsClassBean.getTeacherId();
		}
		if (!politicsClassBean.getDes().equals("")){
			hql = hql + " and politicsClassBean.des='" + politicsClassBean.getDes() + "'";
		}
		
		listPoliticsClassBean = this.getHibernateTemplate().find(hql);
		
		return listPoliticsClassBean;
	}
	public PoliticsClassBean findPoliticsClassById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(PoliticsClassBean.class, id);
	}
	public void updatePoliticsClass(PoliticsClassBean politicsClassBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(politicsClassBean);
	}
	public void deletePoliticsClass(PoliticsClassBean politicsClassBean) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(politicsClassBean);
	}
	@SuppressWarnings("unchecked")
	public List<PoliticsClassBean> findAllPoliticsClass() {
		// TODO Auto-generated method stub
		String hql = "from PoliticsClassBean politicsClassBean order by politicsClassBean.id asc";
		return this.getHibernateTemplate().find(hql);
	}
}
