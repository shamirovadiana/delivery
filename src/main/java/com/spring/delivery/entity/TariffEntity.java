package com.spring.delivery.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Builder
@RequiredArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TariffEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "length", nullable = false)
    Integer length;

    @Column(name = "width", nullable = false)
    Integer width;

    @Column(name = "height", nullable = false)
    Integer height;

    @Column(name = "weight", nullable = false)
    Integer weight;
}
