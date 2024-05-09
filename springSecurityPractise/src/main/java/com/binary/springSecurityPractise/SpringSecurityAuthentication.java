package com.binary.springSecurityPractise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SpringSecurityAuthentication {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        UserDetails userOne = users.username("abrish")
                .password("2248")
                .roles("User")
                .build();
        UserDetails userTwo = users.username("abrish1")
                .password("12248")
                .roles("USER")
                .build();
        UserDetails userThree = users.username("abrish2")
                .password("22248")
                .roles("user")
                .build();
        return new InMemoryUserDetailsManager(userOne, userTwo, userThree);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests((req) -> {
                    req
                           // .antMatchers("/hi/one", "/hi/two").permitAll()
                            .requestMatchers("/hi/one", "/hi/two").permitAll()
                    .anyRequest().authenticated();
        });
        return http.build();
    }
}
