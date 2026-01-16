package com.spring.delivery.mapper;


import com.spring.delivery.dto.request.PricingSettingsRequestDTO;
import com.spring.delivery.dto.response.PricingSettingsResponseDTO;
import com.spring.delivery.entity.PricingSettings;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PricingSettingsMapper {

    PricingSettings toEntity(PricingSettingsRequestDTO dto);

    PricingSettingsResponseDTO toResponse(PricingSettings entity);

    void updateEntityFromDto(PricingSettingsRequestDTO dto, @MappingTarget PricingSettings entity);
}
