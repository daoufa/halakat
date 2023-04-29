package com.darquraan.halakat.dao;

import com.darquraan.halakat.entity.HalakaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HalakaRepository extends JpaRepository<HalakaEntity, Long> {
}
