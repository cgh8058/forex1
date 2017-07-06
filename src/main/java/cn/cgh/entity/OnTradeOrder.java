package cn.cgh.entity;

import java.sql.Date;

public class OnTradeOrder {

	private Integer userId;//外键
	private Integer orderId;//主键
	private Integer orderNum;//订单号
	private Date time;//下单时间
	private Integer type;//订单类型
	private Double size;//手数
	private String symbol;//品种
	private Double price;//入场价格
	private Double stopLoss;//止损
	private Double takeProfit;//止盈
	private String commission;//注释
	private Integer magic;//魔术号
	private Double swap;//过夜费
	private Double profit;//盈亏
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Double getSize() {
		return size;
	}
	public void setSize(Double size) {
		this.size = size;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getStopLoss() {
		return stopLoss;
	}
	public void setStopLoss(Double stopLoss) {
		this.stopLoss = stopLoss;
	}
	public Double getTakeProfit() {
		return takeProfit;
	}
	public void setTakeProfit(Double takeProfit) {
		this.takeProfit = takeProfit;
	}
	public String getCommission() {
		return commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}
	public Integer getMagic() {
		return magic;
	}
	public void setMagic(Integer magic) {
		this.magic = magic;
	}
	public Double getSwap() {
		return swap;
	}
	public void setSwap(Double swap) {
		this.swap = swap;
	}
	public Double getProfit() {
		return profit;
	}
	public void setProfit(Double profit) {
		this.profit = profit;
	}
	
	@Override
	public String toString() {
		return "OnTradeOrder [userId=" + userId + ", orderId=" + orderId
				+ ", orderNum=" + orderNum + ", time=" + time + ", type="
				+ type + ", size=" + size + ", symbol=" + symbol + ", price="
				+ price + ", stopLoss=" + stopLoss + ", takeProfit="
				+ takeProfit + ", commission=" + commission + ", magic="
				+ magic + ", swap=" + swap + ", profit=" + profit + "]";
	}
}
