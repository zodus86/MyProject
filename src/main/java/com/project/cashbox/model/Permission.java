package com.project.cashbox.model;

public enum Permission {

    CASHBOX_READ("cashbox:read"),
    CASHBOX_WRITE("cashbox:write");

    private final String permission;


    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
