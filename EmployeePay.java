
/**
 * Write a description of class EmployeePay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
/*
 * An employee's total weekly pay equals the hourly wage multiplyer by the total number of regular hours
 * plus any overtime pay. Overtime pay equals the total overtime hours multiplyed by 1.5 times the hourly
 * wage. Write a program that takes as inputs the hourly wage, total regular hours, and total overtime hours
 * and display an employee's total weekly pay.
 */
public class EmployeePay
{
    public static void main (String []args)
    {Scanner reader = new Scanner(System.in);
      
        double HourlyWage;
        double TotalHours;
        double OverTime;
        double TotalMoney;
        double OverTimePay;
        double OverTimeMultiplyer;
        double Total;

        System.out.println("How much money do you make per hour?");
        
        HourlyWage = reader.nextDouble();
        
        System.out.println("How many total hours did u work?");
        
        TotalHours = reader.nextDouble();
        
        System.out.println("How many overtime hours did u work?");
        
        OverTime = reader.nextDouble();
        
        
        TotalMoney = (HourlyWage * TotalHours);
        
        OverTimeMultiplyer= (1.5 * HourlyWage);
        
        OverTimePay = (OverTime * OverTimeMultiplyer);
        
        Total = (OverTimePay + TotalMoney);
        
        System.out.println("You make a total of $"+Total);
        
        
        
       
        
        
        
        
        
        
    
    
    
    
    
   
    }
}
