package facebook;

public class Facebook {
	private String user_name;
	private String user_id;
	private int pwd;
	
	public Facebook(String user_name, String user_id, int pwd) {
		this.user_name = user_name;
		this.user_id = user_id;
		this.pwd = pwd;
	}

	public String getUser_name(int pwd) {
		if(this.pwd == pwd) {
			return user_name;
		}
		else {
			return "Invalid password";
		}
	}
	

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
	
	
	
	
}
