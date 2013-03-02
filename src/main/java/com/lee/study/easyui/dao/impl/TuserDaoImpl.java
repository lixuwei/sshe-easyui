package com.lee.study.easyui.dao.impl;

import org.springframework.stereotype.Repository;

import com.lee.study.easyui.baseDao.impl.BaseDaoImpl;
import com.lee.study.easyui.dao.TuserDao;
import com.lee.study.easyui.domain.Tuser;
@Repository("tuserDao")
public class TuserDaoImpl extends BaseDaoImpl<Tuser> implements TuserDao{

}
