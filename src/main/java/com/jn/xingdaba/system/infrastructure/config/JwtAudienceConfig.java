package com.jn.xingdaba.system.infrastructure.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "audience")
public class JwtAudienceConfig {

    //代表这个JWT的接收对象,存入audience
    private String aud;
    private String base64Secret;
    //JWT的签发主体，存入issuer
    private String iss;
    private int expiresSecond;
}
