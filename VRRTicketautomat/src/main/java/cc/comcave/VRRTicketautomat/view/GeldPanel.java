package cc.comcave.VRRTicketautomat.view;

import javax.swing.JPanel;

import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;

public class GeldPanel extends JPanel {
	private JButton btnNewButton_10;
	private JButton btnNewButton_9;
	private JButton btnNewButton_8;
	private JButton btnNewButton_7;
	private JButton btnNewButton_6;
	private JButton btnNewButton_5;
	private JButton btnNewButton_4;
	private JButton btnNewButton_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private ArrayList<JButton> buttons;

	public JButton getBtnNewButton_10() {
		return btnNewButton_10;
	}

	public JButton getBtnNewButton_9() {
		return btnNewButton_9;
	}

	public JButton getBtnNewButton_8() {
		return btnNewButton_8;
	}

	public JButton getBtnNewButton_7() {
		return btnNewButton_7;
	}

	public JButton getBtnNewButton_6() {
		return btnNewButton_6;
	}

	public JButton getBtnNewButton_5() {
		return btnNewButton_5;
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

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public ArrayList<JButton> getButtons() {
		return buttons;
	}

	/**
	 * Create the panel.
	 */
	public GeldPanel() {
		this.buttons = new ArrayList<JButton>();
		setLayout(new GridLayout(0, 1, 0, 0));

		btnNewButton = new JButton("New button");
		add(btnNewButton);

		btnNewButton_1 = new JButton("New button1");
		add(btnNewButton_1);

		btnNewButton_2 = new JButton("New button2");
		add(btnNewButton_2);

		btnNewButton_3 = new JButton("New button3");
		add(btnNewButton_3);

		btnNewButton_4 = new JButton("New button4");
		add(btnNewButton_4);

		btnNewButton_5 = new JButton("New button5");
		add(btnNewButton_5);

		btnNewButton_6 = new JButton("New button6");
		add(btnNewButton_6);

		btnNewButton_7 = new JButton("New button7");
		add(btnNewButton_7);

		btnNewButton_8 = new JButton("New button8");
		add(btnNewButton_8);

		btnNewButton_9 = new JButton("New button9");
		add(btnNewButton_9);

		btnNewButton_10 = new JButton("New button10");
		add(btnNewButton_10);

		for (Component component : this.getComponents()) {
			if (component.getClass().equals(JButton.class)) {
				this.buttons.add((JButton) component);
			}
		}
	}
}