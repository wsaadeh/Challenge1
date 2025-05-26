package com.saadeh.desafio.services;

import com.saadeh.desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order){
        if (order.getBasic() < 100.0){
            return 20.00;
        } else if (order.getBasic() < 200.00) {
            return 12.00;
        }else {
            return 0.0;
        }
    }
}
