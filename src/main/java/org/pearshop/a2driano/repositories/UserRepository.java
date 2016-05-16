package org.pearshop.a2driano.repositories;

import org.pearshop.a2driano.model.entity.User;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 16.05.2016
 */

public interface UserRepository {
    User getUserByLogin(String login);
}
