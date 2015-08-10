package com.ivm.bupazu.dao.impl;

import org.springframework.stereotype.Repository;

import com.ivm.bupazu.dao.BaseDao;
import com.ivm.bupazu.dao.loginDao;
import com.ivm.bupazu.entity.TYonghu;
import com.ivm.bupazu.entity.Ttest;
import com.ivm.bupazu.model.userModel;
@Repository
public class loginDaoImpl extends BaseDao<TYonghu, Long > implements loginDao {

	@Override
	public TYonghu getYonghuByNameAndPsw(String name ,String password ,Short shenfen) {
		// TODO Auto-generated method stub
		Object[] values = {name,password,shenfen};
		String hql="from TYonghu  where yhname=? and yhmima = ? and yhdengluShenfen=?";
		TYonghu yonghu =  this.getByHQL(hql, values) ;
		return yonghu ;
	}
	
}
