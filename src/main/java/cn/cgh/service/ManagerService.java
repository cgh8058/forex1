package cn.cgh.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import cn.cgh.dao.ManagerDao;
import cn.cgh.entity.Manager;

@Service
public class ManagerService {

	@Autowired
	@Qualifier("managerDao")
	ManagerDao managerDao;
	

	public int addManager(Manager manager){
		return managerDao.addManager(manager);
	}
	
	public int deleteManagerById(Integer id){
		
		return managerDao.deleteManagerById(id);
	}
	
	public int updateManager(Manager manager){
		
		return managerDao.updateManager(manager);
	}
	
	public List<Manager> getManagersByPage(int currPage,int pageSize){
		
		int index = (currPage-1)*pageSize;
		return managerDao.getManagersByPage(index, pageSize);
	}
	public Manager getManagerByName(String username){
		
		return managerDao.getManagerByName(username);
	}
	
	public Integer getCount(){
		
		return managerDao.getCount();
	}
}
