/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noappnovember;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Nagy.Laszlo
 */
public class NoAppNovember {

    /**
     * @param args the command line arguments
     * @throws java.awt.AWTException
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws AWTException, InterruptedException {
     
               Thread.sleep(2000);
        while(true){
            hideApp();
            Thread.sleep(10000);
        }
 
    }
    
    public static void hideApp() throws AWTException{
        
        Robot bot = new Robot();
       int x = (int) MouseInfo.getPointerInfo().getLocation().getX();
       int  y = (int) MouseInfo.getPointerInfo().getLocation().getY();
        bot.mouseMove(1800, 0);
        bot.delay(120);
        bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        bot.mouseMove(x, y);

   
    }

   
    
}
