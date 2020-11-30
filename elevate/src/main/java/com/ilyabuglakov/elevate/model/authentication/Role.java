package com.ilyabuglakov.elevate.model.authentication;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

public enum Role {
    ADMIN(Set.of(Permission.DEV_EDIT, Permission.DEV_READ, Permission.AUTH)),
    USER(Set.of(Permission.DEV_READ, Permission.AUTH));

    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getAuthorities(){
        return getPermissions().stream()
                .map(Permission::getPermission)
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toSet());
    }
}
