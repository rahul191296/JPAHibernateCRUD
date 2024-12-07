package config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableAutoConfiguration // by this we will provide our security flow to spring security
public class SecurityConfig {
	
		
	@Bean // by this we will provide our custom security servlet 
	       //filters instead of default servlet filters by spring security
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {   
		
		http.csrf(customizer -> customizer.disable()); // to disable csrf
		http.formLogin(Customizer.withDefaults()); // to enable login form 
		http.authorizeHttpRequests(request -> request.anyRequest().authenticated()); // authenticate every request
		return http.build();
	}
	
	@Bean
	UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager userDetailsService = new InMemoryUserDetailsManager();
		UserDetails user = User.withUsername("Rahul").password("Kumar").authorities("read").build();
		userDetailsService.createUser(user);
		return userDetailsService;
	}
	
	
}
