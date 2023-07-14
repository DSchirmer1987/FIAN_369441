package cc.comcave.VRRTicketautomat.controller.listener;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import cc.comcave.VRRTicketautomat.controller.TicketautomatController;
import cc.comcave.VRRTicketautomat.model.Ticket;

public class TicketButtonListener implements ActionListener {
	private TicketautomatController tac;
	
	public TicketButtonListener(TicketautomatController tac) {
		this.tac = tac;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Integer i = Ticket.valueOf(e.getActionCommand()).getPreis();
		((JButton)e.getSource()).setBackground(Color.PINK);
		for (JButton jButton : tac.getTicketButtons()) {
			jButton.setEnabled(false);
		}
		for(JButton jButton : tac.getGeldButtons()) {
			jButton.setEnabled(true);
		}
	}

}
