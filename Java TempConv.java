// A stand-alone GUI Java program displaying a temperature conversion chart.
// Also added code to close the application when the user clicks
// the mouse in the close box.

// Written by DJ Young, Tampa, FL USA, 2016

import java.awt.*;
import java.awt.event.*;

public class TempConv extends Frame
{
   static int celsius , int fahrenheit; 
   celsius = (5 / 9) * (fahrenheit - 32);  // Temperature conversion formula.

   System.out.println(" Temperature Conversion Chart: ");
   
   public static void main ( String [] args )
          {
   	setTitle( "Temperature Chart" );
      	setSize( 400, 600 );
      	setVisible( true );
	
	//  Display chart column names
	private String message = "Farhenheit " + "\u2109  " + " Celcius " + "\u2103";
	private String message2 = "-----------------------------------------------------------------";

	for ( int fahrenheit = 0; i <= 250; fahrenheit + 10 )
	            {
      		TempConv me = new TempConv();  
		//  Compute and display the converted temperature in celcius.
		System.out.println( fahrenheit + "\t" + celcius);
   	             }
	System.out.println( "\u00A9  " + "2016  " + "DJ " + "Young");
             }
      addWindowListener(
         new WindowAdapter()
         {  public void windowClosing( WindowEvent e )
            {  System.exit( 0 );
            }
          }
      );
   }

   public void paint ( Graphics g )
   {
      if ( fahrenheit < 40 || celcius < 4) {
     	g.setColor( Color.BLUE );
      }
      
      if  ( fahrenheit > 210 || celcius > 99) {
      	g.setColor( Color.RED );
      }

      g.setFont( new Font( "Century", Font.BOLD, 12 ) );
      g.drawString( message, 70, 90 );  
      g.drawString( message2, 70, 90 );
     // Position determined by trial and error!
   }                                     
}
