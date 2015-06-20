// Stores the content of the panels
import java.awt.Color;
import javax.swing.JPanel;

public class VerticalAccordianMenuContents {
	private String title="";
	private String iconTitle;
	private int panelNum = 0;
	private Color bgColor = Color.black;
	private Color fgColor = Color.white;
	private JPanel contents;
	private boolean isHoverable = false;
	
	public VerticalAccordianMenuContents() {} // Blank constructor
	
	public VerticalAccordianMenuContents(String t, String iT, int num, Color bg, Color fg, JPanel jp) {
		title = t;
		iconTitle = iT;
		panelNum = num;
		bgColor = bg;
		fgColor = fg;
		contents = jp;
	}
	
	public void setValues(String t, String iT, int num, Color bg, Color fg, JPanel jp) {
		title = t;
		iconTitle = iT;
		panelNum = num;
		bgColor = bg;
		fgColor = fg;
		contents = jp;
		//contents.setBackground(bgColor);
		//contents.setForeground(fgColor);
	}
	
	// ========= GETTERS ==========
	public String getTitle() {
		return title;
	}
	
	public String getIconTitle() {
		return iconTitle;
	}
	
	public int getPanelNum() {
		return panelNum;
	}
	
	public JPanel getPanel() {
		return contents;
	}
	
	public boolean getHoverable() {
		return isHoverable;
	}
	
	public Color getBackground() {
		return bgColor;
	}
	
	public Color getForeground() {
		return fgColor;
	}
	
	// =========== SETTERS ============
	public void setBackground(Color bg) {
		bgColor = bg;
	}
	
	public void setPanel(JPanel jp) {
		contents = jp;
	}
	
	public void setHoverable(boolean tf) {
		isHoverable = tf;
	}
}
