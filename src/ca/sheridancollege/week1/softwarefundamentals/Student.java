/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author sidhu376
 */
public class Student
{

   private String name;
   private int ID;
   private String address;
   private String email;

   public int getID ()
   {
      return ID;
   }

   public void setID (int ID)
   {
      this.ID = ID;
   }

   public String getAddress ()
   {
      return address;
   }

   public void setAddress (String address)
   {
      this.address = address;
   }

   public String getEmail ()
   {
      return email;
   }

   public void setEmail (String email)
   {
      this.email = email;
   }

   /**
    * Get the value of name
    * VVVVVVVVVVVVVVVVVVVVV testing
    * @return the value of name
    */
   public String getName ()
   {
      return name;
   }

   /**
    * Set the value of name
    *
    * @param name new value of name
    */
   public void setName (String name)
   {
      this.name = name;
   }

}
