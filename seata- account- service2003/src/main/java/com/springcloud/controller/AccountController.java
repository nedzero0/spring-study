package com.springcloud.controller;


import com.springcloud.domain.CommonResult;
import com.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    /**
     * 扣减账户余额
     */
    @RequestMapping(value = "/account/decrease")
    public CommonResult decrease(Long userId,BigDecimal money){
        System.out.println("eeeeeeeeeee");
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功！");
    }
}
