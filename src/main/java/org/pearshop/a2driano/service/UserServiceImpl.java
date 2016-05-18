package org.pearshop.a2driano.service;

import org.pearshop.a2driano.model.web.UserDTO;
import org.pearshop.a2driano.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.pearshop.a2driano.util.ApplicationUtilUser.convertUserToUserDTO;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 16.05.2016
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO getUserByLogin(String login) {
        return convertUserToUserDTO(userRepository.getUserByLogin(login));
    }
}
