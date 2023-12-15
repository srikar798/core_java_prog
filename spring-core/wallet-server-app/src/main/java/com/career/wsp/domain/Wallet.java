package com.career.wsp.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "wallet")
@Getter
@Setter
public class Wallet extends BaseEntity{
    @Id
    private UUID id;
    private double balance;
    @OneToOne
    @JoinColumn(name = "user_id")
    private AppUser appUser;


    @PrePersist
    public void prePersist(){
        super.onCreate();
        this.id = UUID.randomUUID();
    }

 }
