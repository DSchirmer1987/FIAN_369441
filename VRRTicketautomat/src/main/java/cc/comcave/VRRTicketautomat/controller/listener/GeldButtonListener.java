package cc.comcave.VRRTicketautomat.controller.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cc.comcave.VRRTicketautomat.controller.TicketautomatController;

public class GeldButtonListener implements ActionListener {
	private TicketautomatController tac;

	public GeldButtonListener(TicketautomatController tac) {
		this.tac = tac;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Integer i = Integer.valueOf(e.getActionCommand());

	}

}
