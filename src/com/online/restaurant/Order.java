package com.online.restaurant;

import java.util.Date;
import java.util.List;

public class Order {
    private long OrderId; //orderNumber
    private double TotalAmount;
    private Vendor vendor; // Vendor detail
    private Customer customer; // Customer Detail
    private String deliveryAddress;
    private List<OrderMenuItem> menuItmes;


    private Date orderDate;
    private String orderStatus;

    public long getOrderId() {
        return OrderId;
    }

    public void setOrderId(long orderId) {
        OrderId = orderId;
    }

    public double getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        TotalAmount = totalAmount;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public List<OrderMenuItem> getMenuItmes() {
        return menuItmes;
    }

    public void setMenuItmes(List<OrderMenuItem> menuItmes) {
        this.menuItmes = menuItmes;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}
