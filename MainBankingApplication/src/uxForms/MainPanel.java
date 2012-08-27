package uxForms;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class MainPanel extends JPanel {
	public JTextField textField;
	public JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public MainPanel() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(49, 52, 46, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(116, 49, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("hello world");
			}
		});
		btnNewButton.setBounds(24, 93, 89, 23);
		add(btnNewButton);

	}
}
