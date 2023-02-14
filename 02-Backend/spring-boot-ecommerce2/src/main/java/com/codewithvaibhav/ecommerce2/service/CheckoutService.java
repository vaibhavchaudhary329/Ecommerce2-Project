package com.codewithvaibhav.ecommerce2.service;

import com.codewithvaibhav.ecommerce2.dto.Purchase;
import com.codewithvaibhav.ecommerce2.dto.PurchaseResponse;


public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
