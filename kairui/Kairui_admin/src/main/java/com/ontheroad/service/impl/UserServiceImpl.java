package com.ontheroad.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ontheroad.core.util.Md5Util;
import com.ontheroad.dao.TsMenuMapper;
import com.ontheroad.dao.TsRoleUserMapper;
import com.ontheroad.dao.TsUserMapper;
import com.ontheroad.entity.TsMenu;
import com.ontheroad.entity.TsRoleUser;
import com.ontheroad.entity.TsRoleUserExample;
import com.ontheroad.entity.TsUser;
import com.ontheroad.entity.TsUserExample;
import com.ontheroad.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private TsUserMapper tsUserMapper;
	@Autowired
	private TsMenuMapper tsMenuMapper;
	@Autowired
	private TsRoleUserMapper tsRoleUserMapper;

	@Override
	public TsUser login(TsUser user) {
		String password = Md5Util.makeMd5Sum(user.getUserPwd().getBytes()).toUpperCase();
		TsUserExample example=new TsUserExample();
		example.createCriteria().andUserNameEqualTo(user.getUserName()).andUserPwdEqualTo(password)
		.andUserStatusEqualTo(1);
		List<TsUser> ls=tsUserMapper.selectByExample(example);
		if(ls.size()>0){
			return ls.get(0);
		}
		return null;
	}

	@Override
	public List<TsMenu> getMenu(TsUser user) {
		return tsMenuMapper.getMenusUser(user.getUserId());
	}

	@Override
	public List<TsMenu> getMenusUserByParentId(Integer user_id, Integer menu_id) {
		return tsMenuMapper.getMenusUserByParentId(user_id, menu_id);
	}

	@Override
	public void updateUserRole(TsRoleUser tr) {
		TsRoleUserExample example=new TsRoleUserExample();
		example.createCriteria().andUserIdEqualTo(tr.getUserId());
		tsRoleUserMapper.deleteByExample(example);
		tsRoleUserMapper.insert(tr);
	}

	@Override
	public TsUser updateUser(TsUser user) {
		tsUserMapper.updateByPrimaryKeySelective(user);
		return user;
	}

	@Override
	public Integer getAccess(String menuName, Integer userId) {
		return tsUserMapper.getAccess(menuName, userId);
	}
	
	
}
