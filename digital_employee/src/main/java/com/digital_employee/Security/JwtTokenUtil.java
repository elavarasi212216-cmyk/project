package com.digital_employee.Security;

import java.security.Key;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.security.Keys;

@Component
public class JwtTokenUtil {

	private final Key key;
	private final long expireToken= 1000L *60 *60 *12;
	
	public JwtTokenUtil() {
		String secret= System.getenv("JWT_SECRET");
		if(secret==null || secret.isEmpty()) {
			secret="Replace with this placewith a secret code";
		}
		
		key= Keys.hmacShaKeyFor(secret.getBytes());
	}
	
	
}
