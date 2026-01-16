package com.spring.delivery.service.impl;

import com.spring.delivery.repository.OrderRepository;
import com.spring.delivery.repository.TariffRepository;
import com.spring.delivery.service.OrderService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class OrderServiceImpl implements OrderService {
    OrderRepository orderRepository;
    TariffRepository tariffRepository;
}
