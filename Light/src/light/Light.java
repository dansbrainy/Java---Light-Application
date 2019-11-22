/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package light;

/**
 *
 * @author dansk
 */
public class Light {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int lightspeed;
        long days, seconds, distance;
        
        lightspeed = 186000;    //Approximately the speed of light in miles per second
        days = 1000;    //specify number of days
        seconds = days * 24 * 60 * 60; //Convert to seconds
        
        distance = lightspeed * seconds;
        
        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles.");
        
    }
    
}
