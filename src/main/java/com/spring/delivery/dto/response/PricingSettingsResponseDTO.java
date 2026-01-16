package com.spring.delivery.dto.response;

import java.time.LocalDateTime;

public record PricingSettingsResponseDTO(
        Long id,
        Integer freeDistance,
        Integer baseFee,
        Integer perKgRate,
        Integer perKmRate,
        Integer urgentFee,
        Integer fragileFee
) {
}
