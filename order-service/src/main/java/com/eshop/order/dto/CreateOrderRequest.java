package com.eshop.order.dto;

import com.eshop.order.model.SagaMode;
import java.util.List;


public record CreateOrderRequest(
    String customerId,
    SagaMode sagaMode,
    List<OrderItemRequest> items
) {}
