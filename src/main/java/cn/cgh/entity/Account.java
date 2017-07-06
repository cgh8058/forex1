package cn.cgh.entity;

public class Account {

	private Integer userId;//外键
	private Integer accountId;//主键
	private Double balance;
	private Double equlty;
	private Double freeMagin;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getEqulty() {
		return equlty;
	}
	public void setEqulty(Double equlty) {
		this.equlty = equlty;
	}
	public Double getFreeMagin() {
		return freeMagin;
	}
	public void setFreeMagin(Double freeMagin) {
		this.freeMagin = freeMagin;
	}
	
	@Override
	public String toString() {
		return "Account [userId=" + userId + ", accountId=" + accountId
				+ ", balance=" + balance + ", equlty=" + equlty
				+ ", freeMagin=" + freeMagin + "]";
	}

}
