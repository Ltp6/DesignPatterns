package com.ltp.responsibility;

/**
 * @Description:
 * @Author: Ltp
 * @Date: 2021/8/23 21:51
 */
public class PurchaseRequest {

    private Long id;
    private Integer type;
    private Double price;

    public PurchaseRequest(Long id, Integer type, Double price) {
        this.id = id;
        this.type = type;
        this.price = price;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
