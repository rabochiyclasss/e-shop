package com.eshop.order.dto;
import java.math.BigDecimal; 


public record OrderItemRequest (
    String productId,
    Integer quantity,
    BigDecimal price
) {}
