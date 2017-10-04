package pe.com.hatcc.gtw.security;

import java.time.ZonedDateTime;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class ExtendedUser extends User{
	
	private ZonedDateTime clickDate;
	private int firstTime;

	public ExtendedUser(String username, String password, Collection<? extends GrantedAuthority> authorities,ZonedDateTime clickDate,int firstTime) {
		super(username, password, authorities);
		this.clickDate = clickDate;
		this.firstTime = firstTime;
		// TODO Auto-generated constructor stub
	}
	
	public int getFirstTime() {
		return firstTime;
	}

	public void setFirstTime(int firstTime) {
		this.firstTime = firstTime;
	}

	public ZonedDateTime getClickDate() {
		return clickDate;
	}

	public void setClickDate(ZonedDateTime clickDate) {
		this.clickDate = clickDate;
	}
	
	
	
	
}
