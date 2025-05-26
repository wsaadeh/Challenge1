package com.saadeh.desafio.entities;

import com.saadeh.desafio.entities.exception.OrderException;

public class Order {
    private Integer code;
    private Double basic;
    private Double discount;

    public Order() {
    }

    public Order(Integer code, Double basic, Double discount) {
        if (basic < 0){
            throw new OrderException("Valor do pedido deve ser positivo!");
        }

        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
