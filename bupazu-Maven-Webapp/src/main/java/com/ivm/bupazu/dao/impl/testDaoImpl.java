package com.ivm.bupazu.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.ivm.bupazu.dao.BaseDao;
import com.ivm.bupazu.dao.testDao;
import com.ivm.bupazu.entity.Ttest;
@Repository
public class testDaoImpl extends BaseDao<Ttest, Long> implements testDao{

	@Override
	public void saveTest(Ttest test) {
		this.save(test) ;
	}
}
