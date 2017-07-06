package cn.cgh.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.cgh.entity.Manager;

public class ManagerTest {

	@Test
	public void testAddManager() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		ManagerDao managerDao = ss.getMapper(ManagerDao.class);
		Manager manager = new Manager();
		manager.setUsername("laoban1");
		manager.setPassword("123");
		manager.setAuthority(2);
		System.out.println(managerDao.addManager(manager));
		ss.commit();
		ss.close();
	}
	
	@Test
	public void testDeleteManagerById() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		ManagerDao managerDao = ss.getMapper(ManagerDao.class);
		System.out.println(managerDao.deleteManagerById(3));
		ss.commit();
		ss.close();
	}


	@Test
	public void testUpdateManager() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		ManagerDao managerDao = ss.getMapper(ManagerDao.class);
		Manager manager = new Manager();
		manager.setManagerId(1);
		manager.setAuthority(1);
		System.out.println(managerDao.updateManager(manager));
		ss.commit();
		ss.close();
	}
	
	@Test
	public void testGetManagerById() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		ManagerDao managerDao = ss.getMapper(ManagerDao.class);
		System.out.println(managerDao.getManagerById(1));
		ss.commit();
		ss.close();
	}
	
	@Test
	public void testGetManagersByPage() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		ManagerDao managerDao = ss.getMapper(ManagerDao.class);
		System.out.println(managerDao.getManagersByPage(1, 2));
		ss.commit();
		ss.close();
	}
	
	@Test
	public void testGetCount() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		ManagerDao managerDao = ss.getMapper(ManagerDao.class);
		System.out.println(managerDao.getCount());
		ss.commit();
		ss.close();
	}
	
	
/*	public static void main(String[] args) throws IOException {
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		System.out.println(sf);
		System.out.println(sf.getClass());
		SqlSession ss = sf.openSession();
		System.out.println(ss);
		UserDao userDao = ss.getMapper(UserDao.class);
		User user = new User();
		user.setUsername("z1");
		user.setSignal("1,2,3");
		user.setPlatform("thinkforex live 01");
		user.setIsOnline(1);
		user.setAllowedFollow(1);
		userDao.addUser(user);
		ss.commit();
		ss.close();
	}*/
	
}
