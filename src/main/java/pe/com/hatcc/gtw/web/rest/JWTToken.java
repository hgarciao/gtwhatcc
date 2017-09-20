package pe.com.hatcc.gtw.web.rest;

import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object to return as body in JWT Authentication.
 */
public class JWTToken {

    private String idToken;
    private ZonedDateTime clickDate;

    public JWTToken(String idToken) {
        this.idToken = idToken;
    }
    
    

    public JWTToken(String idToken, ZonedDateTime clickDate) {
		this.idToken = idToken;
		this.clickDate = clickDate;
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
    
    
}
