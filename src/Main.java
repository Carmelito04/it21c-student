/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
public class Main {   
  public static void main (String[]args){
      student student = new student();
      
      student.name =  "Carmelito D. Clarido jr";
      student.section = student.setSection ();
      student.motto = student.getMotto ();
      
      System.out.println("Carmelito D. Clarido jr");
      System.out.println("IT21C");
      System.out.println("Time is gold");
 
      }
 }

