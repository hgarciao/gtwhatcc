package pe.com.hatcc.gtw.security;

import java.time.ZonedDateTime;
import java.util.Collection;

import javax.persistence.Column;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class ExtendedUser extends User{
	
	private ZonedDateTime clickDate;
	private int firstTime;
    private int socialNetFlag;

	public ExtendedUser(String username, String password, Collection<? extends GrantedAuthority> authorities,ZonedDateTime clickDate,int firstTime,
			int socialNetFlag) {
		super(username, password, authorities);
		this.clickDate = clickDate;
		this.firstTime = firstTime;
		this.socialNetFlag = socialNetFlag;
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

	public int getSocialNetFlag() {
		return socialNetFlag;
	}

	public void setSocialNetFlag(int socialNetFlag) {
		this.socialNetFlag = socialNetFlag;
	}
	
	
}
