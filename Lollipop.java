/* Based on the ecs 100 template
 * Code for ??
 * Name:
 * Date:
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;


/** Class demonstration of creating a lollipop in my first GUI
 * Snigdha Mundra
 * 1/04/2021
 */

public class Lollipop{
    /*Fields*/ 
    private final double X = 300.0;  //horizontal center of the lollipop
    private final double Y = 200.0;  //vertical center of the lollipop
    private final double SIZE = 80.0;  //diameter of the lollipop
    private final double STICK = 200.0;  //length of the stick
    
    /**
     * Constructer for objects of class Lollipop 
     */
    public Lollipop(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);
    }
    
    /**
     * Draw a lollipop and ask the user for its size
     */
    public void doDrawLollipop(){
        double diam = UI.askDouble("Diameter: ");
        this.drawLollipop(300, 180, diam, 200);
        this.drawLollipop(50, 60, diam/2.0, 90);
        this.drawLollipop(400, 100, diam, 70);
    }

    /**
     * Draw a red lollipop on a stick
     */
    private void drawLollipop(double x, double y, double size, double stick){
        double left = x-size/2.0;    // left of the lollipop
        double top = y-size/2.0;     // top of the lollipop
        double bottom = y+stick;     // bottom of the stick
        
        /*Drawing our stick*/
        UI.setLineWidth(size/8); 
        UI.setColor(Color.black);   // set line width to 10
        UI.drawLine(x, y, x, y+stick);  
            
        /*Draw our lolly*/
        UI.setLineWidth(2);    //set line width to 1
        Color col = new Color((float)Math.random(), (float)Math.random(), (float)Math.random());    
        UI.setColor(col);    // set color to red
        UI.fillOval(x-size/2.0, y-size/2.0, size, size); //fill oval at @(260, 160), 80,80
        
    }
    
    /**
     * 
     */

    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.doDrawLollipop();
    }

}

