package org.pearshop.a2driano.util;

import org.pearshop.a2driano.model.entity.User;
import org.pearshop.a2driano.model.web.UserDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @autor a2driano
 * @project: pearshop
 * @since 16.05.2016
 */
public class ApplicationUtilUser {
    public static UserDTO convertUserToUserDTO(User user){
        UserDTO userDTO=new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setLogin(user.getLogin());
        userDTO.setPassword(user.getPassword());
        userDTO.setUserRole(user.getUserRole());

        return userDTO;
    }

    public static List<UserDTO> convertUserListToUserDTOList (List<User> userList){
        List<UserDTO> userDTOList=new ArrayList<>();
        for(User user:userList){
            userDTOList.add(convertUserToUserDTO(user));
        }
        return userDTOList;
    }

    public static User convertUserDTOToUser(UserDTO userDTO){
        User user=new User();
        user.setId(userDTO.getId());
        user.setLogin(userDTO.getLogin());
        user.setPassword(userDTO.getPassword());
        user.setUserRole(userDTO.getUserRole());

        return user;
    }

    public static List<User> convertUserDTOListToUserList (List<UserDTO> userDTOList){
        List<User> userList=new ArrayList<>();
        for(UserDTO userDTO:userDTOList){
            userList.add(convertUserDTOToUser(userDTO));
        }
        return userList;
    }
}
