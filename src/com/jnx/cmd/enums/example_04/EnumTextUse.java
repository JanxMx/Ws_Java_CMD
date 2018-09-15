/**
 * The EnumTextUse class demostrates how to identify and use an Enum
 * class that contains a text value.
 *
 * @author  Michael McLaughlin
 * @version 1.0  
 */
 package com.jnx.cmd.enums.example_04;
 
 import java.text.DecimalFormat;
 import java.text.NumberFormat;

 public class EnumTextUse {

     private AppleComputer ac;
     private String desc;

     public EnumTextUse() {}

     // An example of a method that takes a text string to find the ENUM element value.
     public int setState(String name) {

         int returnValue = 0;

         try{
             // Verify that it's a valid instance of AppleComputer.
             if(AppleComputer.valueOf(name) instanceof AppleComputer) {
                 if(AppleComputer.IMAC == AppleComputer.valueOf(name)) {
                     this.ac = AppleComputer.IMAC;
                 }else if(AppleComputer.MACBOOKAIR == AppleComputer.valueOf(name)) {
                     this.ac = AppleComputer.MACBOOKAIR;
                 }else if(AppleComputer.MACBOOKPRO == AppleComputer.valueOf(name)) {
                     this.ac = AppleComputer.MACBOOKPRO;
                 }else if(AppleComputer.MACPRO == AppleComputer.valueOf(name)) {
                     this.ac = AppleComputer.MACPRO;
                 }else if(AppleComputer.MACMINI == AppleComputer.valueOf(name)) {
                     this.ac = AppleComputer.MACMINI;
                 }
             }

             // Return -1 as the truth indicator state was setor unnecessary.
             returnValue = -1;
         }catch(Exception e) {
             System.out.println(name + " is no longer sold.");
         }

         // Return the int value for true or false
         return returnValue;
     }

     // An example of a method that takes a text string to find the ENUM element value.
     public int setState(AppleComputer ac) {

         // Assign the AppleComputer fields to a local variable
         double costSavings;
         double localCost = this.ac.getCost();
         String localDesc = this.ac.toString() + " : " + this.ac.getDescription();

         // Define format mask for output.
         NumberFormat f = new DecimalFormat("##,###,##0.00");

         // Declare local variable for false.
         int returnValue = 0;

         try {

             // Check for an instance of the Enum.
             if(this.ac instanceof AppleComputer) {
                
                // Find different (unequal) instances and update with the new one.
                if(this.ac.equals(ac)) {

                    // Print message on match between prior and set value of AppleComputer.
                    this.desc = this.ac + " is the authorized platform and no cost difference.";
                }else {

                    // Assign the new Enum value, calculate and display cost savings message.
                    this.ac = ac;
                    costSavings = this.ac.getCost() - localCost;

                    // Determine the message based on a reduced or increased cost of replacement.
                    if(costSavings > 0) {
                        this.desc = this.ac + " is substituted for " + localDesc + " at $" + f.format(costSavings) + " more than planned.";
                    }else {
                        this.desc = this.ac + " is substituted for " + localDesc + " at $" + f.format(Math.abs(costSavings)) + " less than planned.";
                    }
                }
             }

            // Return -1 as the truth indicador state was set or unnecessary
            returnValue = -1;
         }catch(Exception e) {
             System.out.println(e.getMessage());
         }

         // Return the int value for true or false
         return returnValue;
     }

     public String getState() {
         return this.desc;
     }

     public static void main(String[] args) {
         String[] list = {"IMAC", "MACBOOK", "MACBOOKAIR", "MACBOOKPRO", "MACMINI", "MACPRO"};

         EnumTextUse etu = new EnumTextUse();

         for(int i=0; i<list.length; i++) {
             if(etu.setState(list[i]) != 0) {

                 if(etu.setState(AppleComputer.IMAC)!=0) {
                     System.out.println(etu.getState());
                 }
             }
         }
     }
 }
