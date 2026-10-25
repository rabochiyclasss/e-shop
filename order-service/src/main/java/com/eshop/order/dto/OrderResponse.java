package com.eshop.order.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.eshop.order.model.OrderStatus;
import com.eshop.order.model.SagaMode;

public record OrderResponse(
    UUID id,
    String customerId,
    OrderStatus status,
    SagaMode sagaMode,
    BigDecimal totalAmount,
    LocalDateTime createdAt
){}
