package com.task01.monstablab_task01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {
    @Autowired
    BCryptPasswordEncoder pe;
    @Bean
    public BCryptPasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(username -> {
//            Account user = adao.findById(username).get();
//            String password = user.getPassword();
//            session.setAttribute("img",user.getImage());
//            String[] roles = user.getAuthorities().stream()
//                    .map(er -> er.getRole().getName())
//                    .collect(Collectors.toList()).toArray(new String[0]);
//            return User.withUsername(username).password(pe.encode(password)).roles(roles).build();
//        });

    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // CSRF,CORS
        http.csrf().disable().cors().disable();

//        // Phân quyền sử dụng
//        http.authorizeRequests()
//                .antMatchers("/order/**").authenticated() //bắt đăng nhập
//                .antMatchers("/admin/**").hasAnyRole("STAF","DIRE")
//                .antMatchers("/rest/authorities").hasRole("DIRE")
//                .anyRequest().permitAll();
//        // Điều khiển lỗi truy cập không đúng vai trò
//        http.exceptionHandling().accessDeniedPage("/auth/access/denied");

        // Giao diện đăng nhập
//     	 http.httpBasic();
        http.formLogin()
                .loginPage("/login");
//                .loginProcessingUrl("/security/login")
//                .defaultSuccessUrl("/home/list", false)// đn thàng công chuyển về trang này
//                .failureUrl("/security/login/error");// đn sai về trang này


    }

}
