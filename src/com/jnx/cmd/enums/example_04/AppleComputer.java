/**
 * Enumeration class AppleComputer - write a description of the enum class here
 *
 * @author  Michael McLaughlin
 * @version 1.0
 */
 package com.jnx.cmd.enums.example_04;

 public enum AppleComputer {
     IMAC("Entry-level Desktop", 1199),
     MACBOOKAIR("Manage-level Laptop", 999),
     MACBOOKPRO("Developer-level Laptop", 1199),
     MACMINI("Mini-Desktop", 599),
     MACPRO("Desktop", 2499);

     private double cost;
     private String description;

     // private constructor
     private AppleComputer(String description, double cost) {
         this.description = description;
         this.cost = cost;
     }

     public double getCost() {
         return cost;
     }

     public String getDescription() {
         return description;
     }

     // Returns the description field of an Apple Computer
     public String getDescription(String name) {
         return this.description;
     }

     // Returns the equality of between two AppleComputer Enum types
     public boolean equals(AppleComputer ac) {
         // First comparision on primitives and second on String instances
         if(this.cost == ac.getCost() && this.description.equals(ac.getDescription())) {
             return true;
         }else {
             return false;
         }
     }

     // Method to test class integrity 
     public static void main(String[] args) {
         if(args.length == 1) {
             System.out.printf("Apple Computer : %s is %s\n", 
                    AppleComputer.valueOf(args[0].toString()),
                    AppleComputer.IMAC.getDescription(args[0]));
         }else {
             for(AppleComputer ac: AppleComputer.values())
                    System.out.printf("Apple Computer : %s is %s\n", ac, ac.description);
         }
     }
 }