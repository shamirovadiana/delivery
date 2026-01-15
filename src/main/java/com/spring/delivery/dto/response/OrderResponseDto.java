package com.spring.delivery.dto.response;

import com.spring.delivery.constant.enums.Status;

public record OrderResponseDto(
        Long id,
        Integer tariffId,
        Double totalPrice,
        Status status
) {}
