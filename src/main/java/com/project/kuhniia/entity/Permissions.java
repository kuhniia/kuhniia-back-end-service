package com.project.kuhniia.entity;

import lombok.Getter;

@Getter
public enum Permissions {
    READ("read"),
    WRITE("write");

    private final String permission;

    Permissions(String permission) {
        this.permission = permission;
    }
}
