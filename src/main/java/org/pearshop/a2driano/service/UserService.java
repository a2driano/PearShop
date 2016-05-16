package org.pearshop.a2driano.service;

import org.pearshop.a2driano.model.web.UserDTO;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 16.05.2016
 */
public interface UserService {
    /**
     * Return User by login
     * @return
     */
    UserDTO getUserByLogin();
}
