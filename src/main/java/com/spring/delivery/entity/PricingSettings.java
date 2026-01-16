package com.spring.delivery.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "pricing_settings")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PricingSettings extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "free_distance")
    Integer freeDistance;

    @Column(name = "base_fee")
    Integer baseFee;

    @Column(name = "per_kg_rate")
    Integer perKgRate;

    @Column(name = "per_km_rate")
    Integer perKmRate;

    @Column(name = "urgent_fee")
    Integer urgentFee;

    @Column(name = "fragile_fee")
    Integer fragileFee;

}

