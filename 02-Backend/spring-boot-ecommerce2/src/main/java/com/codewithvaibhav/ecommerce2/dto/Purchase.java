package com.codewithvaibhav.ecommerce2.dto;

import com.codewithvaibhav.ecommerce2.entity.Address;
import com.codewithvaibhav.ecommerce2.entity.Customer;
import com.codewithvaibhav.ecommerce2.entity.Order;
import com.codewithvaibhav.ecommerce2.entity.OrderItem;
import lombok.Data;
import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}

