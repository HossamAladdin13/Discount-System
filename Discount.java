/*
 * M.I.A Robotics Team
 * OOP Java Discount System Task
 * Discount Class
 */
package com.mycompany.discount_system;

/**
 *
 * @author Hossam Aladdin
 */
public class Discount{
    
    // Class Properties to set discount values
    private static double servDiscount_premium = 0.2;
    private static double servDiscount_gold = 0.15;
    private static double servDiscount_silver = 0.1;
    private static double productDiscount = 0.1;
    
    // Method to get service discount depends on membership type of the customer
    public static double getServDiscountRate(String memberShip){
        switch(memberShip){
            case "Premium":
                return servDiscount_premium;
            case "Gold":
                return servDiscount_gold;
            case "Silver":
                return servDiscount_silver;
             default:
                return 0;     
        }              
    }

    // All customers get the same product discount
    public static double getProductDiscountRate() {
        return productDiscount;
    }
    
}
