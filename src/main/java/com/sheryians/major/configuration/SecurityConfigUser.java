package com.sheryians.major.configuration;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.CachingUserDetailsService;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import com.sheryians.major.service.CustomUserDetailService;

@Configuration
@EnableWebSecurity
@Order(2)
public class SecurityConfigUser  extends WebSecurityConfigurerAdapter{

	@Autowired
	CustomUserDetailService customUserDetailService;
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
			
			
				.formLogin()
				.loginPage("/user/login")
				.usernameParameter("email")
				.passwordParameter("password")
				.loginProcessingUrl("/user/login")
				.defaultSuccessUrl("/shop")
				.failureUrl("/login?error=true")
				.defaultSuccessUrl("/shop")
				.usernameParameter("email")
				.passwordParameter("password")
				.and()
				.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/login")
				.invalidateHttpSession(true)
				.deleteCookies("JSESSIONID")
				.and()
				.exceptionHandling()
				.and()
				.csrf()
				.disable();
	}

		
		
}*/
