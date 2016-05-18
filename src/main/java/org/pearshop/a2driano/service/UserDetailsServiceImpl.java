package org.pearshop.a2driano.service;

import org.pearshop.a2driano.model.entity.User;
import org.pearshop.a2driano.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 17.05.2016
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        UserDetails userDetails;
        try {
            User user = userRepository.getUserByLogin(login);
            Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>();
            roles.add(new SimpleGrantedAuthority(user.getUserRole().name()));
            userDetails = new org.springframework.security.core.userdetails.User(user.getLogin(), user.getPassword(), roles);
            return userDetails;
        } catch (EmptyResultDataAccessException e) {
            return userDetails = null;
        }
    }
}
