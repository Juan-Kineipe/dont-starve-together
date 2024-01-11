package com.example.dontstarvetogetherapi.repository;

import com.example.dontstarvetogetherapi.domain.Survivor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurvivorRepository extends JpaRepository<Survivor, Long> {

    Survivor findByName(String name);

}
