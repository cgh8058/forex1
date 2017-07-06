package cn.cgh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.cgh.entity.User;

public interface UserDao {
	
	//增加一个用户
	public int addUser(User user);
	
	//删除一个用户
	public int deleteUserById(@Param("id") Integer id);
	
	//更新一个用户
	public int updateUser(User user);

	//查询一个用户
	public User getUserById(@Param("id") Integer id);
	
	//分页查询
	public List<User> getUsersByPage(@Param("index") int index,@Param("pageSize")int pageSize);
	
	//获取用户数量
	public int getCount();
}
