package com.spring.delivery.service.impl;


import com.spring.delivery.dto.request.PricingSettingsRequestDTO;
import com.spring.delivery.dto.response.PricingSettingsResponseDTO;
import com.spring.delivery.entity.PricingSettings;
import com.spring.delivery.mapper.PricingSettingsMapper;
import com.spring.delivery.repository.PricingSettingsRepository;
import com.spring.delivery.service.PricingSettingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PricingSettingsServiceImpl implements PricingSettingsService {

    private final PricingSettingsRepository repository;
    private final PricingSettingsMapper mapper;

    @Override
    public PricingSettingsResponseDTO get() {
        PricingSettings settings = repository.findFirstByOrderByUpdatedAtDesc()
                .orElseThrow(() -> new RuntimeException("Pricing settings not found"));

        return mapper.toResponse(settings);
    }

    @Override
    public PricingSettingsResponseDTO create(PricingSettingsRequestDTO dto) {
        PricingSettings entity = mapper.toEntity(dto);

        PricingSettings saved = repository.save(entity);
        return mapper.toResponse(saved);
    }

    @Override
    public PricingSettingsResponseDTO update(PricingSettingsRequestDTO dto) {
        PricingSettings entity = repository.findFirstByOrderByUpdatedAtDesc()
                .orElseThrow(() -> new RuntimeException("Pricing settings not found"));

        mapper.updateEntityFromDto(dto, entity);
        PricingSettings saved = repository.save(entity);
        return mapper.toResponse(saved);
    }
}