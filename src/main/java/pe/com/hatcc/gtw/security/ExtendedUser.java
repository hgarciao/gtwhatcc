package pe.com.hatcc.gtw.security;

import java.time.ZonedDateTime;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class ExtendedUser extends User{
	
	private ZonedDateTime clickDate;

	public ExtendedUser(String username, String password, Collection<? extends GrantedAuthority> authorities,ZonedDateTime clickDate) {
		super(username, password, authorities);
		this.clickDate = clickDate;
		// TODO Auto-generated constructor stub
	}
	
	

	public ZonedDateTime getClickDate() {
		return clickDate;
	}

	public void setClickDate(ZonedDateTime clickDate) {
		this.clickDate = clickDate;
	}
	
	
	
	
}
