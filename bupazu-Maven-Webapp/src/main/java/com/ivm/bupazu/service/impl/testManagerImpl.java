package com.ivm.bupazu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivm.bupazu.dao.BaseDao;
import com.ivm.bupazu.dao.testDao;
import com.ivm.bupazu.entity.Ttest;
import com.ivm.bupazu.service.testManager;
@Service
public class testManagerImpl implements testManager {
	
	@Autowired
    private testDao testdao;
	@Override
	public void saveTest(Ttest test) {
		// TODO Auto-generated method stub
		testdao.saveTest(test) ;
	}

}
