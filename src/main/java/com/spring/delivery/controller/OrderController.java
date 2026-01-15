package com.spring.delivery.controller;

import com.spring.delivery.dto.request.OrderRequestDto;
import com.spring.delivery.dto.response.OrderResponseDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public interface OrderController {

}
