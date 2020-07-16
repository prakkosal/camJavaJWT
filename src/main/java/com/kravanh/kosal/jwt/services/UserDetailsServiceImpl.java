package com.kravanh.kosal.jwt.services;

import com.kravanh.kosal.jwt.models.User;
import com.kravanh.kosal.jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        System.out.println("arrived load userdetail " + username);
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
//       // System.out.println("user in user detail "+ user.getRoles());
//
//        return UserDetailsImpl.build(user);

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("arrived load userdetail " + username);
        User user = userRepository.findByUsername(username);
        System.out.println("see user lelect from username ");
        System.out.println(user.getRoles());
        if(user == null)
            throw new UsernameNotFoundException("user not found");
        return UserDetailsImpl.build(user);
    }
}
