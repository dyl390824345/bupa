package com.ivm.bupazu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivm.bupazu.dao.BaseDao;
import com.ivm.bupazu.dao.loginDao;
import com.ivm.bupazu.entity.TYonghu;
import com.ivm.bupazu.model.userModel;
import com.ivm.bupazu.service.loginManager;
@Service
public class loginManagerImpl implements loginManager {

	@Autowired
    private loginDao logindao;
	@Override
	public TYonghu loginValid(String name ,String password ,Short shenfen) {
		// TODO Auto-generated method stub
		TYonghu yonghu = logindao.getYonghuByNameAndPsw(name ,password ,shenfen) ;
		return yonghu ;
	}

}
