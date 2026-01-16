package com.spring.delivery.repository;

import com.spring.delivery.entity.PricingSettings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PricingSettingsRepository extends JpaRepository<PricingSettings, Long> {

    Optional<PricingSettings> findFirstByOrderByUpdatedAtDesc();
}
