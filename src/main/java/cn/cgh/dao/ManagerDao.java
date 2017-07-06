package cn.cgh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.cgh.entity.Manager;

public interface ManagerDao {
	
	//增加一个管理者
	public int addManager(Manager manager);
	
	//删除一个管理者
	public int deleteManagerById(@Param("id") Integer Id);
	
	//更新一个管理者
	public int updateManager(Manager manager);

	//查询一个管理者
	public Manager getManagerById(@Param("id") Integer Id);
	
	//查询一个管理者通过名字
	public Manager getManagerByName(@Param("username") String username);
	
	//分页查询
	public List<Manager> getManagersByPage(@Param("index") int index,@Param("pageSize")int pageSize);
	
	//获取用户数量
	public int getCount();
}
