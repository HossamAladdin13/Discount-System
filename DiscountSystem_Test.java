/*
 * M.I.A Robotics Team
 * OOP Java Discount System Task
 * Test Class
 */
package com.mycompany.discount_system;

/**
 *
 * @author Hossam Aladdin
 */
public class DiscountSystem_Test {
    public static void main(String[] args) {
        
        // obj for customer 1
        Visit customer1 = new Visit("Emma", "Premium", 30.75, 40);      // passing arguments to constructor
        customer1.setServiceExpense(32);           // Add service expense
        customer1.setProductExpense(40);           // Add product expense
        customer1.showExpense();
        
        // obj for customer 2
        Visit customer2 = new Visit("Alexa", "Gold", 30.75, 40);
        customer2.showExpense();
        
        // obj for customer 3
        Visit customer3 = new Visit("Anna", "Silver", 30.75, 40);
        customer3.showExpense();
        
         // obj for customer 4
        Visit customer4 = new Visit("Leli", "No Membership", 30.75, 40);
        customer4.showExpense();
    }    
}
