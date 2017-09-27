//Java program to create an input form using various swing controls and layouts

//Date - 26 September 2017

import javax.swing.*;
import java.awt.*;

//begin class
class LayoutTypes extends JFrame {
	// controls of the class
	JLabel lbl_welcome, lbl_name, lbl_address, lbl_gender, lbl_country, lbl_language;
	JButton btn_submit, btn_cancel;
	JTextField txt_name;
	JTextArea txta_address;
	ButtonGroup bg_gender;
	JRadioButton opt_male, opt_female;
	JComboBox<String> combo_country;
	JCheckBox chk_c, chk_cpp, chk_java;
	JPanel panel_main, panel_buttons, panel_language, panel_country, panel_gender, panel_address, panel_name,
			panel_welcome;
	Dimension dimension;

	// data members of the class
	static final String countries[] = { "India", "Australia", "South Africa", "USA", "Srilanka" };

	// parameterised constructor
	LayoutTypes(String title) {
		// title of the form
		super(title);

		// dimensions of client screen
		dimension = Toolkit.getDefaultToolkit().getScreenSize();

		// initialising the controls
		lbl_welcome = new JLabel("Welcome to my world!");
		lbl_name = new JLabel("Name:");
		lbl_address = new JLabel("Address:");
		lbl_gender = new JLabel("Gender:");
		lbl_country = new JLabel("Country:");
		lbl_language = new JLabel("Language:");

		btn_submit = new JButton("Submit");
		btn_cancel = new JButton("Cancel");

		opt_male = new JRadioButton("Male");
		opt_female = new JRadioButton("Female");

		chk_c = new JCheckBox("C");
		chk_cpp = new JCheckBox("C++");
		chk_java = new JCheckBox("Java");

		txt_name = new JTextField(10);

		txta_address = new JTextArea(5, 20);

		combo_country = new JComboBox<String>(countries);

		panel_main = new JPanel();
		panel_buttons = new JPanel();
		panel_language = new JPanel();
		panel_country = new JPanel();
		panel_gender = new JPanel();
		panel_address = new JPanel();
		panel_name = new JPanel();
		panel_welcome = new JPanel();

		bg_gender = new ButtonGroup();

		// button group for radio buttons
		bg_gender.add(opt_male);
		bg_gender.add(opt_female);

		// properties of the frame
		setSize(dimension.width, dimension.height); // full screen
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		// setting layouts of panels
		panel_main.setLayout(new BoxLayout(panel_main, BoxLayout.PAGE_AXIS));

		// adding controls to the panels
		// welcome label
		panel_welcome.add(lbl_welcome);
		// name
		panel_name.add(lbl_name);
		panel_name.add(txt_name);
		// Address
		panel_address.add(lbl_address);
		panel_address.add(txta_address);
		// Gender
		panel_gender.add(lbl_gender);
		panel_gender.add(opt_male);
		panel_gender.add(opt_female);
		// Country
		panel_country.add(lbl_country);
		panel_country.add(combo_country);
		// Language
		panel_language.add(lbl_language);
		panel_language.add(chk_c);
		panel_language.add(chk_cpp);
		panel_language.add(chk_java);
		// Buttons
		panel_buttons.add(btn_submit, BorderLayout.WEST);
		panel_buttons.add(btn_cancel, BorderLayout.EAST);

		// adding sub panels to the main panel
		panel_main.add(panel_welcome, BorderLayout.NORTH);
		panel_main.add(panel_name);
		panel_main.add(panel_address);
		panel_main.add(panel_gender);
		panel_main.add(panel_country);
		panel_main.add(panel_language);
		panel_main.add(panel_buttons, BorderLayout.SOUTH);

		// adding the main panel to the frame
		add(panel_main, BorderLayout.CENTER);
	}// end parameterised constructor

	// main method
	public static void main(String[] args) {
		LayoutTypes form1 = new LayoutTypes("Input form with various controls and layouts");
	}// end main
}// end class
