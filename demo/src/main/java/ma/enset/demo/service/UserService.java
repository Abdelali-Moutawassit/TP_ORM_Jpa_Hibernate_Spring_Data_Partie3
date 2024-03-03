package ma.enset.demo.service;

import ma.enset.demo.entities.Role;
import ma.enset.demo.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByRoleName(String roleName);
    void addRoleToUser(String userName,String roleName);
    User authenticate(String userName, String password);
}
