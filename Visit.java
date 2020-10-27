/*
 * M.I.A Robotics Team
 * OOP Java Discount System Task
 * Visit Class
 */
package com.mycompany.discount_system;

/**
 *
 * @author Hossam Aladdin
 */
public class Visit extends Customer{
    
    // Class properties
    private double serviceExpense;
    private double productExpense;
    
    // Constructor takes 4 arguments
    public Visit(String name, String memberShip, double se, double pe) {
        super(name,memberShip);         // Call the constructor of the superclass "customer"
        serviceExpense = se;
        productExpense = pe;
    }
    
    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense += serviceExpense;      // To add multiple expenses
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense += productExpense;       // To add multiple expenses
    }
    
    // Method to get the total expense after discount
    // Expense after discount = expense - discount amount
    public double getTotalExpense() {
        return  (serviceExpense - (serviceExpense * Discount.getServDiscountRate(getMemberShip()))) +
                (productExpense - (productExpense * Discount.getProductDiscountRate()));
    }
    
    // Method to show total expense and customer data
    public void showExpense(){
        System.out.println("Customer name is " + name + "\t\t" + 
                           "Membership is " + getMemberShip() + "\n" + 
                           "Service Expense = " + getServiceExpense() + "\t" + 
                           "Product Expense = " + getProductExpense() + "\n" + 
                           "Total Expense = " + getTotalExpense());
    }
}
