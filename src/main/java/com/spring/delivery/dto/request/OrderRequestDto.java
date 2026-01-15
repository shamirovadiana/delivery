package com.spring.delivery.dto.request;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public record OrderRequestDto(
        Integer merchantId,

        @NotNull(message = "length is required")
        @Min(value = 0, message = "length should be at least 0.001 cm")
        @Max(value = 500, message = "length should not be more than 500 cm")
        Double length,

        @NotNull(message = "width is required")
        @Min(value = 0, message = "width should be at least 0.001 cm")
        @Max(value = 500, message = "width should not be more than 500 cm")
        Double width,

        @NotNull(message = "height is required")
        @Min(value = 0, message = "height should be at least 0.001 cm")
        @Max(value = 500, message = "height should not be more than 500 cm")
        Double height,

        @NotNull(message = "weight is required")
        @Min(value = 0, message = "weight should be at least 0.001 kg")
        @Max(value = 100, message = "weight should not be more than 100 kg")
        Double weight,

        @NotNull(message = "distance is required")
        @Min(value = 0, message = "distance should be at least 0.01 km")
        @Max(value = 100, message = "distance should not be more than 100 km")
        Double distanceKm,

        @NotNull
        Boolean isUrgent,
        @NotNull
        Boolean isFragile
) {}
