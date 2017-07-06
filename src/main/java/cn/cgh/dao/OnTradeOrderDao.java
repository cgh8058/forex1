package cn.cgh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.cgh.entity.OnTradeOrder;

public interface OnTradeOrderDao {

	//增加一张订单
	public int addOrder(OnTradeOrder order);
	
	//删除一张订单
	public int deleteOrderByOrderNums(Integer[] orderNum);
	
	//更新一张订单
	public int updateOrders(List <OnTradeOrderDao> orders);

	//查询所有订单通过用户Id
	public List<OnTradeOrder> getAllOrderByUserIdPaged(Integer index,Integer pageSize);
	
	//获得订单数量
	public int getCountByUserId(@Param("id") Integer id);
}


