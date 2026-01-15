package com.spring.delivery.mapper;

import com.spring.delivery.dto.request.TariffRequestDto;
import com.spring.delivery.dto.response.TariffResponseDto;
import com.spring.delivery.entity.TariffEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TariffMapper {
    @Mapping(target = "id", ignore = true)
    TariffEntity toEntity(TariffRequestDto tariffRequestDto);

    TariffResponseDto toDto(TariffEntity tariffEntity);
}
