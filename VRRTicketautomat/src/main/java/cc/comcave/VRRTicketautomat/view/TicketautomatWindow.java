package cc.comcave.VRRTicketautomat.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

public class TicketautomatWindow extends JFrame {

	private JPanel contentPane;
	private GeldPanel geldPanel;
	private TicketPanel ticketPanel;

	public JPanel getContentPane() {
		return contentPane;
	}

	public GeldPanel getGeldPanel() {
		return geldPanel;
	}

	public TicketPanel getTicketPanel() {
		return ticketPanel;
	}

	/**
	 * Create the frame.
	 */
	public TicketautomatWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		geldPanel = new GeldPanel();
		contentPane.add(geldPanel, BorderLayout.EAST);

		ticketPanel = new TicketPanel();
		contentPane.add(ticketPanel, BorderLayout.WEST);
		this.setJMenuBar(new TicketMenuBar());
	}
}
