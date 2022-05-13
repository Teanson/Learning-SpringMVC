package com.example.pojo;

import java.util.HashMap;

public class OrderDetail {
    private String orderId;
    private HashMap<String,Product> productInfo;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public HashMap<String, Product> getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(HashMap<String, Product> productInfo) {
        this.productInfo = productInfo;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId='" + orderId + '\'' +
                ", productInfo=" + productInfo +
                '}';
    }
}
