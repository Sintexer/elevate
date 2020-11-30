package com.ilyabuglakov.elevate.model;

public enum  Permission {
    DEV_READ("dev:read"),
    DEV_EDIT("dev:edit");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
