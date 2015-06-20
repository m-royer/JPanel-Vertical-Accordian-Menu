import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class VerticalAccordianDriver {
	final static int _menuWidth = 300;
	final static int _menuHeight = 600;
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}
	
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Vertical Accordian");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setResizable(false);
		
		JComponent newContentPane = new VerticalAccordianMenu(new Dimension(_menuWidth,_menuHeight));
        newContentPane.setOpaque(false);
        frame.setContentPane(newContentPane);
		
		frame.pack();
		frame.setVisible(true);
    }
}
