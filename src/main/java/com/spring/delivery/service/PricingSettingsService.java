package com.spring.delivery.service;

import com.spring.delivery.dto.request.PricingSettingsRequestDTO;
import com.spring.delivery.dto.response.PricingSettingsResponseDTO;

public interface PricingSettingsService {

    PricingSettingsResponseDTO get();

    PricingSettingsResponseDTO create(PricingSettingsRequestDTO dto);

    PricingSettingsResponseDTO update( PricingSettingsRequestDTO dto);
}