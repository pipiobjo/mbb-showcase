package com.prodyna.mbb.sc.config;

import com.prodyna.mbb.sc.user.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService() {

        User.UserBuilder users = User.withDefaultPasswordEncoder();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(users.username("user").password("password").roles(Role.USER_ROLE).build());
        manager.createUser(users.username("contributor").password("password").roles(Role.CONTRIBUTOR_ROLE).build());
        manager.createUser(users.username("admin").password("password").roles(Role.USER_ROLE, Role.ADMIN_ROLE, Role.CONTRIBUTOR_ROLE, "ACTUATOR").build());
        return manager;

    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .exceptionHandling()
                .and()
                .anonymous()
                .and()
                .authorizeRequests()
                .antMatchers("/actor**").permitAll()
                .antMatchers("/series**").permitAll()
                .antMatchers("/episode**").permitAll()
                .antMatchers("/contribution/**").hasRole("ADMIN")
                .and()
                .formLogin()
                .and()
                .logout();
    }
}

