package com.saadeh.desafio.services;

import com.saadeh.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        return order.getBasic() * (1 - order.getDiscount()/100) + shippingService.shipment(order);
    }

}
