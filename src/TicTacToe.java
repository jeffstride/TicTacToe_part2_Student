import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

/**
 * STUDENT INSTRUCTIONS:<p>
 * The overall goal is to create a working, graphical game of
 * Tic Tac Toe while demonstrating good Object Oriented Design
 * and using 4 different methods to set an Event Handler.
 * <p>
 * The Student should use this class to drive the game forward.
 * All drawing should be delegated to the MenuDrawingPanel class.
 * Additional classes should be added to reduce the complexity of
 * this class as well as to reuse code from prior exercise. 
 * For example, a Board class would be appropriate. 
 * 
 * Steps:
 * <ol>
 * <li>Draw a TicTacToe board in the DrawingPane.</li>
 * <li>Modify/add custom menu options to the Frame</li>
 * <li>Hook up event handler for custom menu</li>
 * <li>Hook up click event handler to receive user moves via click</li>
 * <li>Hook up KeyPressed event handler</li>
 * <li>Hook up mouse enter and mouse leave events</li>
 * </ol>
 * Each of the above steps should be verified. First make use of
 * the JOptionPane class or Debugger just to verify that the events
 * are being called. Then, add appropriate functionality to the game
 * such as making a move from the click or key press.
 * <p>
 * 
 * 
 * The TicTacToe class is the main driver of the TicTacToe game.
 * It will create an instance of itself which will have a Drawing class
 * and a Board class. <p>
 * Responsibilities: <ul>
 * <li>Create supporting classes such as Board and MenuDrawingPanel</li>
 * <li>Enforce the rules of TicTacToe with the help of the Board</li>
 * <li>Keeps track of whose turn it is</li>
 * <li>Sets up and handles click events from the user</li>
 * <li>Pops up general game play UI dialog boxes</li>
 * </ul>
 * <p>
 * This project intends to exercise Event Handlers. There are four ways
 * to hook up event handlers:<ul>
 * <li>Lambda Expression</li>
 * <li>Object that implements the interface</li>
 * <li>Anonymous inline class/interface</li>
 * <li>Method pointer using Class::method, or this::method</li>
 * </ul>
 * The easiest and best are Lambda Expressions and Method Pointers, but
 * these require that the design uses an interface that has ONLY a single
 * method. Herein, interfaces with a single method are:<ul>
 * <li>DPMouseEventHandler - custom to DrawingPanel</li>
 * <li>ActionListener</li>
 * </ul>
 * There are interfaces with multiple methods where more code is required.<ul>
 * <li>MouseListener</li>
 * <li>KeyListener</li>
 * </ul>
 * The compiler does a bunch of tricks to allow the easier mechanisms to work.
 * It essentially creates an object that implements the interface in all cases.
 * A lambda expression is short-hand syntax to create an anonymous method that
 * is not really an object in and of itself. It is the implementation of the
 * only method in the interface. The compiler does some trickery to tie the
 * method implementation to an interface of some manufactured object.
 * 
 * @author Mr. Stride
 *
 */
public class TicTacToe {

   private MenuDrawingPanel panel = null;

   /**
    * Creates an instances and starts the game.
    * DO NOT MODIFY.
    * @param args
    */
   public static void main(String[] args) {
      
      TicTacToe ttt = new TicTacToe();
      ttt.go();
   }
   
   /**
    * Starts the game of TicTacToe.
    * We will create our MenuDrawingPanel and hook up events.
    * We will have the following events:<ul>
    * <li>Menu selected - ActionListener </li>
    * <li>Key pressed - KeyListener</li>
    * <li>Mouse entered/leave - MouseListener</li>
    * <li>On clicked - MouseEventHandler</li> 
    */
   public void go() {
   
	   // DO LOTS OF WORK HERE!!
   }

}
