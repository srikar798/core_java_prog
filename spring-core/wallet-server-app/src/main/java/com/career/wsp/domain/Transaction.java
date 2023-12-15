package com.career.wsp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "transaction")
@Getter
@Setter
public class Transaction extends BaseEntity {
    @Id
    private UUID id;
    private UUID fromWalletId;
    private UUID toWalletId;
    private double amount;

    @PrePersist
    public void onPersist() {
        super.onCreate();
        this.id = UUID.randomUUID();
    }
}