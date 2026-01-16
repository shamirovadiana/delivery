package com.spring.delivery.dto;

import com.spring.delivery.constant.enums.Status;

public record OrderDto (
    int merchantId,
    int tariffId,

    int length,
    int width,
    int height,
    int weight,

    int distance_km,

    boolean isUrgent,
    boolean isFragile,

    Status status
){};
