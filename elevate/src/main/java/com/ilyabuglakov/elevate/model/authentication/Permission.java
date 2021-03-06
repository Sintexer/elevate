package com.ilyabuglakov.elevate.model.authentication;

public enum  Permission {
    DEV_READ("dev:read"),
    DEV_EDIT("dev:edit"),
    AUTH("auth");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
