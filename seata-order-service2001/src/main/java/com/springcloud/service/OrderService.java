package com.springcloud.service;

import com.springcloud.domain.Order;
import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Component;

@Component
public interface OrderService
{
    void create(Order order);
}