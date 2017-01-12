

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.File;
import java.io.PrintWriter;
import java.nio.IntBuffer;
import java.util.Random;
import java.util.Scanner;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.swing.JFrame;

import com.jogamp.common.nio.Buffers;

public class Random_Pixel implements GLEventListener{
	
	static GLProfile profile = GLProfile.get(GLProfile.GL2);
    static GLCapabilities capabilities = new GLCapabilities(profile);
    // The canvas 
    static GLCanvas glcanvas = new GLCanvas(capabilities);
    
   public static void main(String[] args) {
	      //getting the capabilities object of GL2 profile
	   
	      
	      Random_Pixel l = new Random_Pixel();
	      //creating frame
	      glcanvas.addGLEventListener(l);
	      glcanvas.setSize(600, 400);
	      
	      final JFrame frame = new JFrame ("straight CSE423LAB01HOMEWORK");
	      //adding canvas to frame
	      frame.getContentPane().add(glcanvas);
	      frame.setSize(frame.getContentPane().getPreferredSize());
	      frame.setVisible(true);
	      
	   }
   public void display(GLAutoDrawable drawable) {
      final GL2 gl = drawable.getGL().getGL2();
       	  gl.glBegin (GL2.GL_POINTS);//static field
       
       	Random rand = new Random();
   		double minX = -1.0f;
       	double maxX = 1.0f;
       	for(int c=0;c<=100;c++){
       		double finalX = rand.nextDouble() * (maxX - minX) + minX;
       		double finaly = rand.nextDouble() * (maxX - minX) + minX;
  			System.out.println("===="+finalX +"and"+finaly);
  			//gl.glBegin (GL2.GL_POINTS);
  			gl.glVertex2d(finalX,finaly);
  			//gl.glVertex2d(0.5f,0.5f);

  			//gl.glEnd();
       	}
       	gl.glVertex2d(0.5f,0.5f);
       	gl.glVertex2d(0.6f,0.6f);
       	gl.glEnd();
       	
      
   }
   
   public void dispose(GLAutoDrawable arg0) {
      //method body
   }

   
   public void init(GLAutoDrawable drawable) {
      // method body
	   //4. drive the display() in a loop
	    }
   
   public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
      // method body
   }
   //end of main
}//end of classimport javax.media.opengl.GL2;
