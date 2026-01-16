package com.spring.delivery.controller;


import com.spring.delivery.dto.request.PricingSettingsRequestDTO;
import com.spring.delivery.dto.response.PricingSettingsResponseDTO;
import com.spring.delivery.service.PricingSettingsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/pricing-settings")
@Validated
@Tag(name = "Pricing Settings")
public class PricingSettingsController {

    private final PricingSettingsService pricingSettingsService;

    @Operation(summary = "Get current pricing settings")
    @GetMapping
    public ResponseEntity<PricingSettingsResponseDTO> get() {
        log.debug("Request to get pricing settings");
        return ResponseEntity.ok(pricingSettingsService.get());
    }

    @Operation(summary = "Create pricing settings")
    @PostMapping
    public ResponseEntity<PricingSettingsResponseDTO> create(
            @Valid @RequestBody PricingSettingsRequestDTO dto
    ) {
        log.info("Request to create pricing settings");
        return ResponseEntity.ok(pricingSettingsService.create(dto));
    }

    @Operation(summary = "Update pricing settings")
    @PutMapping
    public ResponseEntity<PricingSettingsResponseDTO> update(
            @Valid @RequestBody PricingSettingsRequestDTO dto
    ) {
        log.info("Request to update pricing settings");
        return ResponseEntity.ok(pricingSettingsService.update(dto));
    }
}
