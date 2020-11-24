package com.project.cashbox.model;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

public enum Role {

    USER(Set.of(Permission.CASHBOX_READ)),
    ADMIN(Set.of(Permission.CASHBOX_WRITE, Permission.CASHBOX_READ));

    private Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<Permission> getPermissions (){
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getAuthorities () {
        return getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
    }
}
