import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 * This class draws the graphics for TicTacToe.
 * <p>
 * 
 * The STUDENT should add and implement methods to fulfill the Responsibilities
 * of this class. The methods will likely be called by the TicTacToe class which
 * drives the game forward and communicates between all the classes. The Student
 * should feel free to modify this class freely to attain the desired behavior.
 * 
 * Responsibilities:
 * <ul>
 * <li>Draw TicTacToe lines</li>
 * <li>Draw the X's and O's</li>
 * <li>Add menu items to the Frame</li>
 * <li>Delegate menu selection to provided ActionListener</li>
 * </ul>
 * <p>
 * Mr. Stride broke the rules and modified DrawingPanel by eliminating "final"
 * from the class declaration which prevented inheritance. By eliminating
 * "final" this MenuDrawingPanel can extend DrawingPanel. Added functionality
 * includes:
 * <ul>
 * <li>ability to insert custom menu items into the Frame</li>
 * </ul>
 * 
 * @author Mr. Stride
 *
 */
public class MenuDrawingPanel extends DrawingPanel {

	/**
	 * The Graphics object is cached for convenience.
	 */
	private Graphics graphics = null;

	/**
	 * STUDENT can use this Font to draw if desired.
	 */
	private Font font = new Font("Monospaced", Font.BOLD, 160);

	/**
	 * The value is set in the constructor. This is used
	 * to call the event handler for any added custom menu items.
	 */
	private ActionListener listener;

	/**
	 * Creates a MenuDrawingPanel class of the given size. It will create all
	 * necessary dependencies, set the font, and set color to Black.
	 * 
	 * @param width
	 *            The width of the DrawingPanel
	 * @param height
	 *            The height of the DrawingPanel
	 * @param listener
	 *            The event handler to call back for custom menu options.
	 */
	public MenuDrawingPanel(int width, int height, ActionListener listener) {
		super(width, height);

		this.listener = listener;

		// initialize graphics and other instance fields
		graphics = getGraphics();
		graphics.setFont(font);
		graphics.setColor(Color.BLACK);
		
		// STUDENT
		// You may want to add more here, but only if needed.
	}

	/**
	 * Allow one to create a MenuDrawingPanel without any ActionListener.
	 * 
	 * @param width
	 *            The width of the DrawingPanel
	 * @param height
	 *            The height of the DrawingPanel
	 */
	public MenuDrawingPanel(int width, int height) {
		this(width, height, null);
	}

	/**
	 * The default size of the MenuDrawingPanel is 600x600.
	 */
	public MenuDrawingPanel() {
		this(600, 600);
	}

	/**
	 * Sets the custom menu into the Frame right after 'File'. This gets called
	 * in the super constructor as DrawingPanel creates its standard menu.
	 * All menu items will call the onItem() method which will, in turn,
	 * call any event handler provided in the constructor.
	 * <p>
	 * The STUDENT should modify and add additional menu items here.
	 * Keep event handlers to be: e -> onItem(e).
	 * Provide an ActionListener when this object is constructed.
	 */
	@Override
	public JMenu getCustomMenu() {
		JMenuItem item = new JMenuItem("CUSTOM", 'c');
		item.addActionListener(e -> onItem(e));

		JMenu custom = new JMenu("Example");
		custom.setMnemonic('E');
		custom.add(item);

		return custom;
	}

	/**
	 * This gets called when the user selects any menu item in the custom menu.
	 * If the Student set an ActionListener in the constructor, then that
	 * listener is called. No need to change this method to get things to work.
	 * 
	 * @param e
	 *            Has the ActionEvent detailing what menu item was clicked.
	 */
	private void onItem(ActionEvent e) {
		if (this.listener != null) {
			this.listener.actionPerformed(e);
		}
	}

	// STUDENT
	// You will add methods to draw the TicTacToe lines and X's and O's.
	// You will want to be able to reset the board.
	
}