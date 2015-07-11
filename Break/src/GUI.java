import javax.swing.*;

public class GUI {

	public static void main(String[] agrs) {

		JButton jbtOK = new JButton("OK");

		JButton jbtCancel = new JButton("Cancel");

		JLabel jlblName = new JLabel("Enter your name : ");

		JTextField jtfName = new JTextField("Type name here...");

		JCheckBox jchkBlod = new JCheckBox("Bold");

		JCheckBox jchkItalic = new JCheckBox("Italic");

		JRadioButton jrbRed = new JRadioButton("Red");

		JRadioButton jrdYellow = new JRadioButton("Yellow");

		JComboBox jcboColor = new JComboBox(new String[] { "Freshmen",
				"Sophomore", "Junior", "Senior" });

		JPanel panel = new JPanel();
		panel.add(jbtOK);
		panel.add(jbtCancel);
		panel.add(jlblName);
		panel.add(jtfName);
		panel.add(jchkBlod);
		panel.add(jchkItalic);
		panel.add(jrbRed);
		panel.add(jrdYellow);
		panel.add(jcboColor);

		JFrame frame = new JFrame();
		frame.add(panel);
		frame.setTitle("GUI");
		frame.setSize(450, 100);
		frame.setLocation(200, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}