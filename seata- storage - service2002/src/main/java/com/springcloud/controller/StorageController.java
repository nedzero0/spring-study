package com.springcloud.controller;

import com.springcloud.domain.CommonResult;
import com.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class StorageController {

    @Autowired
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        System.out.println("sssssssssssssss");
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}

