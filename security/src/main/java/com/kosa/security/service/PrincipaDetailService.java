package com.kosa.security.service;

import com.kosa.security.config.auth.PrincipalDetail;
import com.kosa.security.domain.User;
import com.kosa.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//.loginProcessingUrl("/login")
//로그인 요청이 오면 loadUserByUsername() 자동으로 호출
@Service
public class PrincipaDetailService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user =  userRepository.findByUsername(username);
        if (user != null) {
            return new PrincipalDetail(user);
        }
        return null;
    }
}
