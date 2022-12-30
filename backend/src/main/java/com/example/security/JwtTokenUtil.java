package com.example.security;

import com.example.security.model.User;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTokenUtil {
    private static final long EXPIRE_DURATION = 24*60*60*1000;

    private static final Logger LOGGER = LoggerFactory.getLogger(JwtTokenUtil.class);


    private static final String KEY ="KRCGENK KAMPION";

    public String generateAccessToken(Authentication authentication){
        return Jwts.builder()
                .setAudience("loginToken")
                .setSubject(authentication.getPrincipal().toString())
                .setIssuer("AquaponicsTeam1")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_DURATION))
                .signWith(SignatureAlgorithm.HS256, KEY)
                .compact();
    }

    public boolean validateAccessToken(String token) {
        try {
            Jwts.parser().setSigningKey(KEY).parseClaimsJws(token);
            return true;
        } catch (ExpiredJwtException ex) {
            LOGGER.error("JWT expired", ex.getMessage());
        } catch (IllegalArgumentException ex) {
            LOGGER.error("Token is null, empty or only whitespace", ex.getMessage());
        } catch (MalformedJwtException ex) {
            LOGGER.error("JWT is invalid", ex);
        } catch (UnsupportedJwtException ex) {
            LOGGER.error("JWT is not supported", ex);
        } catch (SignatureException ex) {
            LOGGER.error("Signature validation failed");
        }

        return false;
    }

    public String getSubject(String token) {
        return parseClaims(token).getSubject();
    }

    private Claims parseClaims(String token) {
        return Jwts.parser()
                .setSigningKey(KEY)
                .parseClaimsJws(token)
                .getBody();
    }

    public String generateRegisterToken(String email){
        return Jwts.builder()
                .setIssuer("AquaponicsTeam1")
                .setSubject(email)
                .setAudience("RegisterToken")
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRE_DURATION))
                .signWith(SignatureAlgorithm.HS256, KEY)
                .compact();
    }

    public Claims decodeToken(String token){
        var generatedToken = Jwts.parser()
                .setSigningKey(KEY)
                .parseClaimsJws(token)
                .getBody();

        return generatedToken;
    }
}
