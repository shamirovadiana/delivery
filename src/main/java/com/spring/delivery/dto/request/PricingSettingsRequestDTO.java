package com.spring.delivery.dto.request;

public record PricingSettingsRequestDTO(
        Integer freeDistance,
        Integer baseFee,
        Integer perKgRate,
        Integer perKmRate,
        Integer urgentFee,
        Integer fragileFee
) {
}
