package cc.comcave.VRRTicketautomat.view;

import javax.swing.JPanel;

import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;

public class TicketPanel extends JPanel {
	private JButton btnNewButton;
	private JButton btnNewButton_4;
	private JButton btnNewButton_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;
	private ArrayList<JButton> buttons;

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public JButton getBtnNewButton_4() {
		return btnNewButton_4;
	}

	public JButton getBtnNewButton_3() {
		return btnNewButton_3;
	}

	public JButton getBtnNewButton_2() {
		return btnNewButton_2;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

	public ArrayList<JButton> getButtons() {
		return buttons;
	}

	/**
	 * Create the panel.
	 */
	public TicketPanel() {
		this.buttons = new ArrayList<JButton>();
		setLayout(new GridLayout(0, 1, 0, 0));

		btnNewButton = new JButton("New button");
		add(btnNewButton);

		btnNewButton_1 = new JButton("New button");
		add(btnNewButton_1);

		btnNewButton_2 = new JButton("New button");
		add(btnNewButton_2);

		btnNewButton_3 = new JButton("New button");
		add(btnNewButton_3);

		btnNewButton_4 = new JButton("New button");
		add(btnNewButton_4);

		for (Component component : this.getComponents()) {
			if (component.getClass().equals(JButton.class)) {
				this.buttons.add((JButton) component);
			}
		}

	}

}
