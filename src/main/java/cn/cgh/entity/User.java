package cn.cgh.entity;

public class User {

	private Integer userId;
	private String username;
	private String accNum;
	private String registerTime;//注册时间
	private String platform;//平台
	private Integer isOnline;//是否在线
	private Integer allowedFollow;//是否允许跟单
	private String signals;//允许跟随的信号
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public String getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public Integer getIsOnline() {
		return isOnline;
	}
	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}
	public Integer getAllowedFollow() {
		return allowedFollow;
	}
	public void setAllowedFollow(Integer allowedFollow) {
		this.allowedFollow = allowedFollow;
	}
	public String getSignals() {
		return signals;
	}
	public void setSignals(String signals) {
		this.signals = signals;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username
				+ ", accNum=" + accNum + ", registerTime=" + registerTime
				+ ", platform=" + platform + ", isOnline=" + isOnline
				+ ", allowedFollow=" + allowedFollow + ", signals=" + signals
				+ "]";
	}
}
