package com.career.helloworld.repo;

import com.career.helloworld.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player,Long> {
}
