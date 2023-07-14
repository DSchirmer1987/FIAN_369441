package cc.comcave.VRRTicketautomat.controller;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import cc.comcave.VRRTicketautomat.controller.listener.GeldButtonListener;
import cc.comcave.VRRTicketautomat.controller.listener.TicketButtonListener;
import cc.comcave.VRRTicketautomat.model.Geld;
import cc.comcave.VRRTicketautomat.model.Ticket;
import cc.comcave.VRRTicketautomat.view.TicketautomatWindow;

public class TicketautomatController {
	private TicketautomatWindow ticketFrame;
	private ArrayList<JButton> geldButtons;
	private ArrayList<JButton> ticketButtons;
	private TicketButtonListener tbListener;
	private GeldButtonListener gbListener;

	public TicketautomatWindow getTicketFrame() {
		return ticketFrame;
	}

	public ArrayList<JButton> getGeldButtons() {
		return geldButtons;
	}

	public ArrayList<JButton> getTicketButtons() {
		return ticketButtons;
	}

	public TicketButtonListener getTbListener() {
		return tbListener;
	}

	public TicketautomatController() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					init();
					ticketFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private void init() {
		ticketFrame = new TicketautomatWindow();
		this.geldButtons = ticketFrame.getGeldPanel().getButtons();
		this.ticketButtons = ticketFrame.getTicketPanel().getButtons();
		int counter = 0;
		
		this.gbListener = new GeldButtonListener(this);
		for (JButton jbutton : this.geldButtons) {
			if (Geld.values()[counter].getWert() < 100) {
				jbutton.setText(String.valueOf(Geld.values()[counter].getWert() % 100) + " Cent");
			} else {
				jbutton.setText(String.valueOf(Geld.values()[counter].getWert() / 100) + " Euro");
			}
			jbutton.setActionCommand(String.valueOf(Geld.values()[counter].getWert()));
			counter++;
			jbutton.setEnabled(false);
			jbutton.addActionListener(gbListener);
		}
		counter = 0;

		this.tbListener = new TicketButtonListener(this);
		for (JButton jbutton : this.ticketButtons) {
			jbutton.setText(Ticket.values()[counter].getPreisstufe() + " - " + Ticket.values()[counter].getPreis() / 100
					+ "," + Ticket.values()[counter].getPreis() % 100 + " €");
			jbutton.setActionCommand(Ticket.values()[counter].getPreisstufe());
			jbutton.addActionListener(tbListener);
			counter++;
		}
	}
}
