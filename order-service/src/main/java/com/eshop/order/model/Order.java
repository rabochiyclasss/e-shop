package com.eshop.order.model;

import jakarta.persistence.*;

import java.util.UUID;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String customerID;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    @Enumerated(EnumType.STRING)
    private SagaMode sagaMode;

    private BigDecimal totalAmount;

    private String failureReason;

    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items = new ArrayList<>();

    //empty constructor for JPA
    public Order() {

    }

    //setters
    public void setId(UUID id){
        this.id = id;
    }

    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }

    public void setStatus(OrderStatus status){
        this.status = status;
    }

    public void setSagaMode(SagaMode sagaMode){
        this.sagaMode = sagaMode;
    }

    public void setTotalAmount(BigDecimal totalAmount){
        this.totalAmount = totalAmount;
    }

    public void setFailureReason(String failureReason){
        this.failureReason = failureReason;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }

    public void setItems(List<OrderItem> items){
        this.items = items;
    }

    //getters
    public UUID getId(){
        return id;
    }

    public String getCustomerId(){
        return customerID;
    }

    public OrderStatus getStatus(){
        return status;
    }

    public SagaMode getSagaMode(){
        return sagaMode;
    }

    public BigDecimal getTotalAmount(){
        return totalAmount;
    }

    public String getFailureReason(){
        return failureReason;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public List<OrderItem> getItems(){
        return items;
    }
}
