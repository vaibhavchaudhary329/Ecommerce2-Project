package com.codewithvaibhav.ecommerce2.controller;

import com.codewithvaibhav.ecommerce2.dto.Purchase;
import com.codewithvaibhav.ecommerce2.dto.PurchaseResponse;
import com.codewithvaibhav.ecommerce2.service.CheckoutService;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("https://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}
