package com.spring.delivery.dto;

public record TariffDto(
        Integer length,
        Integer width,
        Integer height,
        Integer weight
) {
}
