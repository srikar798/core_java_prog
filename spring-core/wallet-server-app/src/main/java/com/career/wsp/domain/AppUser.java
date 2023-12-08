package com.career.wsp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Entity
@Table(name = "app_user")
@Getter
@Setter
public class AppUser extends BaseEntity{

    private UUID id;
    private String username;
    private String password;
    private String email;
    private String mobile;

    @PrePersist
    public void prePersist(){
        super.onCreate();
        this.id = UUID.randomUUID();
    }
}
