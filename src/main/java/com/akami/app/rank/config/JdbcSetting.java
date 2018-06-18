package com.akami.app.rank.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
//@Named
@ConfigurationProperties(prefix = "my.jdbc")
public class JdbcSetting {

    private String url;
    private String driverClassName;

    private String username;
    private String password;

}
