package com.ivm.bupazu.dao;

import com.ivm.bupazu.entity.TYonghu;
import com.ivm.bupazu.model.userModel;

public interface loginDao {
	public TYonghu getYonghuByNameAndPsw(String name ,String password ,Short shenfen) ;
}
