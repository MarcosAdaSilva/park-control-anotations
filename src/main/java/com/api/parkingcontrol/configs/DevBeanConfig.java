package com.api.parkingcontrol.configs;

import com.api.parkingcontrol.MyBean;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Profile("dev")
@Configuration
public class DevBeanConfig {

    @Bean
    public MyBean myBeanDevProfile() {
        System.out.println("Profile DEV started!");
        return new MyBean();
    }
    //para definir profile a nível de methodo.
    /*@Profile("prod")
    @Bean
    public MyBean myBeanProdProfile() {
        System.out.println("Profile PROD started!");
        return new MyBean();
    }*/

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
