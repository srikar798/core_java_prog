package com.career.wsp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Entity
@Table(name = "app_user")
@Getter
@Setter
public class AppUser extends BaseEntity{

    @Id
    private UUID id;
    private String username;
    private String password;
    private String email;
    private String mobile;

    @OneToOne(mappedBy = "appUser")
    private Wallet wallet;
    @PrePersist
    public void prePersist(){
        super.onCreate();
        this.id = UUID.randomUUID();
    }
}
