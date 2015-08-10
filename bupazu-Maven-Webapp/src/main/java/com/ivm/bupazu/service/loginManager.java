package com.ivm.bupazu.service;

import com.ivm.bupazu.entity.TYonghu;
import com.ivm.bupazu.model.userModel;

public interface loginManager {
	public TYonghu loginValid(String name ,String password ,Short shenfen);
}
