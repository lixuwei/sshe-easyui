package com.lee.study.easyui.service;

import com.lee.study.easyui.domain.Tuser;
import com.lee.study.easyui.exception.TuserException;

public interface TuserService {
	void save(Tuser user) throws TuserException ;
}
