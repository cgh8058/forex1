package cn.cgh.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.cgh.dao.UserDao;
import cn.cgh.entity.User;

@Service
public class UserService {

	@Autowired
	@Qualifier("userDao")
	UserDao userDao;
	
	public int addUser(User user){
		
		return userDao.addUser(user);
	}
	
	
	public int deleteUserById(Integer id){
		
		return userDao.deleteUserById(id);
	}
	
	
	public int updateUser(User user){
		
		return userDao.updateUser(user);
	}

	
	public User getUserById(Integer id){
		
		return userDao.getUserById(id);
	}
	
	
	public List<User> getUsersByPage(int currPage,int pageSize){
		
		int index = (currPage-1)*pageSize;
		return userDao.getUsersByPage(index, pageSize);
	}
	
	
	public Integer getCount(){
		
		return userDao.getCount();
	}
}
