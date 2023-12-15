package com.career.wsp.domain;

import com.career.wsp.service.RequestContextProvider;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity {

    @Column(name = "created_date", updatable = false,nullable = false)
    private LocalDateTime createdDate;
    @Column(name = "modified_date", nullable = false)
    private LocalDateTime modifiedDate;
    @Column(name = "created_by", updatable = false,nullable = false)
    private String createdBy;
    @Column(name = "modified_by", nullable = false)
    private String modifiedBy;
    @Column(name = "deleted", nullable = false)
    private boolean deleted;

    @PrePersist
    public  void onCreate(){
        this.createdDate = LocalDateTime.now();
        this.modifiedDate = LocalDateTime.now();
        this.createdBy = RequestContextProvider.getUserName();
        this.modifiedBy = RequestContextProvider.getUserName();

    }

    @PreUpdate
    public void onUpdate(){
        this.modifiedDate = LocalDateTime.now();
        this.modifiedBy = RequestContextProvider.getUserName();
    }
}
