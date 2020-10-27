/*
 * M.I.A Robotics Team
 * OOP Java Discount System Task
 * Customer Class
 */
package com.mycompany.discount_system;

/**
 *
 * @author Hossam Aladdin
 */
public class Customer {

    String name;
    private String memberShip;
    
    // Constructor with 2 arguments
    public Customer(String name, String memberShip) {            
        System.out.println("************** Welcome to Beauty Saloon **************");
        this.name = name;
        this.memberShip = memberShip;
    }       

    public String getName() {
        return name;
    }
    
    public String getMemberShip() {
        return memberShip;
    }

    public void setMemberShip(String memberShip) {
        this.memberShip = memberShip;
    }
    
    
}
