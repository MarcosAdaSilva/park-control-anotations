package com.api.parkingcontrol;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Getter
@Setter
@ConfigurationProperties(prefix = "app")
@Component
public class AppProperties {

    private String name;
    private String host;
}
