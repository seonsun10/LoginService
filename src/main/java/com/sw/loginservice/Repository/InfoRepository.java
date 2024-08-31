package com.sw.loginservice.Repository;

import com.sw.loginservice.Entity.NaverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<NaverEntity, String> {
}
