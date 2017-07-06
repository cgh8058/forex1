package cn.cgh.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.cgh.entity.User;

public class UserTest {

	@Test
	public void testAddUser() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		UserDao userDao = ss.getMapper(UserDao.class);
		User user = new User();
		user.setUsername("z1111");
		user.setSignals("1,2,3");
		user.setPlatform("thinkforex live 01");
		user.setIsOnline(1);
		user.setAllowedFollow(1);
		System.out.println(userDao.addUser(user));
		ss.commit();
		ss.close();
	}
	
	@Test
	public void testDeleteUserById() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		UserDao userDao = ss.getMapper(UserDao.class);
		System.out.println(userDao.deleteUserById(8));
		ss.commit();
		ss.close();
	}
	
	
	@Test
	public void testGetUserById() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		UserDao userDao = ss.getMapper(UserDao.class);
		System.out.println(userDao.getUserById(1));
		ss.commit();
		ss.close();
	}
	
	@Test
	public void testGetUsersByPage() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		UserDao userDao = ss.getMapper(UserDao.class);
		System.out.println(userDao.getUsersByPage(2,3));
		ss.commit();
		ss.close();
	}
	
	@Test
	public void testGetCount() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		UserDao userDao = ss.getMapper(UserDao.class);
		System.out.println(userDao.getCount());
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
