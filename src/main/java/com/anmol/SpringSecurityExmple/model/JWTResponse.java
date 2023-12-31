package com.anmol.SpringSecurityExmple.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class JWTResponse {

	String jwtToken;
	
	String username;
}
