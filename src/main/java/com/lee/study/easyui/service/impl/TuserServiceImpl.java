package com.lee.study.easyui.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lee.study.easyui.dao.TuserDao;
import com.lee.study.easyui.domain.Tuser;
import com.lee.study.easyui.exception.TuserException;
import com.lee.study.easyui.service.TuserService;
@Service("tuserService")
@Transactional
public class TuserServiceImpl implements TuserService{

	@Resource
	private TuserDao tuserDao;
	
	public void setTuserDao(TuserDao tuserDao) {
		this.tuserDao = tuserDao;
	}

	@Override
	public void save(Tuser user) throws TuserException  {
		
		try {
			tuserDao.save(user);
		} catch (Exception e) {
			throw new TuserException("用户保存失败",e);
		}
	}

	

}
