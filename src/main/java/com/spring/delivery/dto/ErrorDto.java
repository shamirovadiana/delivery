package com.spring.delivery.dto;

import com.spring.delivery.constant.enums.ErrorType;
import lombok.Builder;
import java.util.List;

@Builder
public record ErrorDto(
        int code,
        String message,
        ErrorType type,
        List<String> validationErrors) {}
