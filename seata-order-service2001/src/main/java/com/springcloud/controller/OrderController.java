package com.springcloud.controller;


import com.springcloud.domain.CommonResult;
import com.springcloud.domain.Order;
import com.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController
{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {

        System.out.println(order);
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

    @GetMapping("/order/hello")
    public String hello(Long productId)
    {
        System.out.println(productId);
        return "hello  "+productId;
    }


}
