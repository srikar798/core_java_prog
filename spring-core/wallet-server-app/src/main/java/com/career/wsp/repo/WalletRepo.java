package com.career.wsp.repo;

import com.career.wsp.domain.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;
import java.util.UUID;

public interface WalletRepo extends JpaRepository<Wallet, UUID> {

    @Query("select count(w) > 0 from Wallet w where w.appUser.id = :userId and deleted = false")
    boolean existsByUserId(UUID userId);

    @Query("select w from Wallet w where w.appUser.id = :fromUserId and deleted = false")
    Optional<Wallet> findByUserId(UUID fromUserId);
}
