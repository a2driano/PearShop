package org.pearshop.a2driano.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 17.05.2016
 */
public interface UserDetailsService {
    UserDetails loadUserByUsername(String login) throws UsernameNotFoundException;
}
