package pe.com.hatcc.gtw.web.rest;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object to return as body in JWT Authentication.
 */
public class JWTToken {

    private String idToken;
    private ZonedDateTime clickDate;
    private int firstTime;

    public JWTToken(String idToken) {
        this.idToken = idToken;
    }
    
    

    public JWTToken(String idToken, ZonedDateTime clickDate,int firstTime) {
		this.idToken = idToken;
		this.clickDate = clickDate;
		this.firstTime = firstTime;
	}


	@JsonProperty("id_token")
    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    @JsonProperty("clickdate")
	public ZonedDateTime getClickDate() {
		return clickDate;
	}

	public void setClickDate(ZonedDateTime clickDate) {
		this.clickDate = clickDate;
	}

	@JsonProperty("firsttime")
	public int getFirstTime() {
		return firstTime;
	}
	
	public void setFirstTime(int firstTime) {
		this.firstTime = firstTime;
	}
	
	
    
    
}
