package whatsapp;

public class Whatsapp {
	private long phno;
	private String status;
	private String bio;

	public Whatsapp(long phno, String status, String bio) {
		this.phno = phno;
		this.status = status;
		this.bio = bio;
	}
	
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getStatus(long phno) {
		if(this.phno == phno) {
			return status;
		}
		else {
			return "Invalid Number";
		}
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
	
}

