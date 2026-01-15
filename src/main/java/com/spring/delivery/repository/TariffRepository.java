package com.spring.delivery.repository;

import com.spring.delivery.entity.TariffEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TariffRepository extends JpaRepository<TariffEntity, Integer> {
}
