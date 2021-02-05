package web.service;

import web.entity.Role;

import java.util.List;

public interface RoleService {

    List<Role> getAllRoles();

    Role getRoleByName(String name);
}
