package cn.cgh.entity;

public class Manager {

	private Integer managerId;//主键
	private String username;//用户名
	private String password;//密码
	private Integer authority;//权限 1最高管理者，2二级观察者
	
	
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAuthority() {
		return authority;
	}
	public void setAuthority(Integer authority) {
		this.authority = authority;
	}
	
	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", username=" + username
				+ ", password=" + password + ", authority=" + authority + "]";
	}

}
