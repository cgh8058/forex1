package cn.cgh.dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.cgh.entity.Manager;
import cn.cgh.entity.OnTradeOrder;

public class OnTradeOrderTest {

	@Test
	public void testAddOrder() throws IOException{
		
		Reader reader = Resources.getResourceAsReader("mybatis_conf.xml");
		SqlSessionFactory sf = new  SqlSessionFactoryBuilder().build(reader);
		SqlSession ss = sf.openSession();
		OnTradeOrderDao onTraderOrderDao = ss.getMapper(OnTradeOrderDao.class);
		OnTradeOrder order = new OnTradeOrder();
		order.setCommission("ea order");
		order.setMagic(10001);
		order.setOrderNum(11001111);
		order.setPrice(101.111);
		order.setProfit(120.123D);
		order.setSize(0.001D);
		order.setStopLoss(101.00D);
		order.setSymbol("GBPUSE");
		order.setSwap(1.2D);
		order.setTakeProfit(120.565D);
		order.setTime(new Date(0));
		order.setType(1);
		order.setUserId(1);
		System.out.println(onTraderOrderDao.addOrder(order));
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
