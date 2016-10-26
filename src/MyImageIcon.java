import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MyImageIcon {
	static ImageIcon getIcon() {
		return new ImageIcon("Image/#puglife.jpeg");
	}

	public static void main(String[] args) {
		String Mymessage = JOptionPane.showInputDialog("Message?");
		JOptionPane.showMessageDialog(null, Mymessage, null, 0, getIcon());
	}
}
