package com.spring.delivery.mapper;

import com.spring.delivery.dto.request.OrderRequestDto;
import com.spring.delivery.dto.response.OrderResponseDto;
import com.spring.delivery.entity.OrderEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface OrderMapper {
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "isActive", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "status", constant = "NEW")
    OrderEntity toEntity(OrderRequestDto orderRequestDto);

    OrderResponseDto toDto(OrderEntity orderEntity);
}
