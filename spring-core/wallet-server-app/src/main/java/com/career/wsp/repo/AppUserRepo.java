package com.career.wsp.repo;

import com.career.wsp.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface AppUserRepo extends JpaRepository<AppUser, UUID> {

    @Query("select count(c) > 0 from AppUser c where c.mobile = :mobile and c.deleted=false")
    boolean existsByMobile(String mobile);
}
