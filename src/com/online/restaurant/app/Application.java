package com.online.restaurant.app;

import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vendor;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Customer Shantanu = new Customer();

        Shantanu.setName("Shantanu");
        Shantanu.setCity("Nagpur");
        Shantanu.setAddress("Nandanwan, Nagpur");
        Shantanu.setState("Maharashtra");
        Shantanu.setEmailId("shantanujibhakate14@gmail.com");
        Shantanu.setPhonenumeber(1234567890);


        System.out.println(" Customer Details:");
        System.out.println("Name : " + Shantanu.getName());
        System.out.println("City : " + Shantanu.getCity());
        System.out.println("Address : " + Shantanu.getAddress());
        System.out.println("State : " + Shantanu.getState());
        System.out.println("EmailId : " + Shantanu.getEmailId());
        System.out.println("PhoneNumber : " + Shantanu.getPhonenumeber());

        Vendor haldiram = new Vendor();
        haldiram.setName("Haldiram Veg Restaurant");
        haldiram.setAddress("Ajni Square, Nagpur");
        haldiram.setCategory("VEG");
        haldiram.setPhoneNumber(0712223344);
        haldiram.setRating(5.0);
        haldiram.setState("Maharashtra");
        haldiram.setCity("Nagpur");

        System.out.println("Vendor Details:");
        System.out.println("Name: " + haldiram.getName());
        System.out.println("Address: " + haldiram.getAddress());
        System.out.println("Category:" + haldiram.getCategory());
        System.out.println("PhoneNumber:" + haldiram.getPhoneNumber());
        System.out.println("Rating:" + haldiram.getRating());
        System.out.println("State:" + haldiram.getState());
        System.out.println("City:" + haldiram.getCity());



        Order order = new Order();
        order.setCustomer(Shantanu);
        order.setVendor(haldiram);
        order.setTotalAmount(999.00);
        order.setOrderDate(new Date());
        order.setDeliveryAddress("348, Civil Lines, Nagpur");

        System.out.println("Order Details:" );
        System.out.println("Total Amount:" + order.getTotalAmount());
        System.out.println("Order Date:" + order.getOrderDate());
        System.out.println("Delivery Address: " + order.getDeliveryAddress());
    }
}
