package com.spring.delivery.service.impl;

import com.spring.delivery.repository.TariffRepository;
import com.spring.delivery.service.TariffService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class TariffServiceImpl implements TariffService {
    TariffRepository tariffRepository;
}
