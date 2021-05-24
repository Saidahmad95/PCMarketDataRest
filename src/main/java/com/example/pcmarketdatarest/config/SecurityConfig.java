package com.example.pcmarketdatarest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("super-admin").password(passwordEncoder().encode("1111")).roles("SUPER_ADMIN").authorities("GET_ALL", "GET_ONE", "ADD", "EDIT", "DELETE")
                .and()
                .withUser("moderator").password(passwordEncoder().encode("2222")).roles("MODERATOR").authorities("GET_ALL", "GET_ONE", "ADD", "EDIT")
                .and()
                .withUser("operator").password(passwordEncoder().encode("3333")).roles("OPERATOR").authorities("GET_ALL", "GET_ONE", "ADD");


    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/api/product").hasAuthority("GET_ALL")
                .antMatchers(HttpMethod.POST, "/api/product").hasAuthority("ADD")
                .antMatchers(HttpMethod.PUT, "/api/product/*").hasAuthority("EDIT")
                .antMatchers(HttpMethod.DELETE, "/api/product/*").hasAuthority("DELETE")
                .antMatchers(HttpMethod.GET, "/api/product/*").hasAuthority("GET_ONE")
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();

    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
