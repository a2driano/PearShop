package org.pearshop.a2driano.config;

import org.pearshop.a2driano.model.entity.User;
import org.pearshop.a2driano.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 16.05.2016
 */
@Component
public class AuthProvider implements AuthenticationProvider {
    @Autowired
    UserRepository userRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();
        String password = (String) authentication.getCredentials();
        try {
            User user = userRepository.getUserByLogin(login);
            return new UsernamePasswordAuthenticationToken(login, password, AuthorityUtils.createAuthorityList(user.getUserRole().toString()));
        } catch (Exception e) {
            throw new BadCredentialsException("Name or password is not correct");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }
}
