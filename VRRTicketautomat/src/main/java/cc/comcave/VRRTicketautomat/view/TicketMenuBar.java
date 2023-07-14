package cc.comcave.VRRTicketautomat.view;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TicketMenuBar extends JMenuBar {
	
	public TicketMenuBar() {
		super();
		this.createMenu();
	}
	
	private void createMenu() {
		// Erstellen der Menüs
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		JMenu editMenu = new JMenu("Edit");
		JMenu aboutMenu = new JMenu("About");
		
		// Erstellen der Menü-Items (Einträge)
		JMenuItem fileMenu_newItem = new JMenuItem("New");
		fileMenu_newItem.setActionCommand("NewFile");
		fileMenu_newItem.setMnemonic(KeyEvent.VK_N);
		JMenuItem fileMenu_openItem = new JMenuItem("Open");
		fileMenu_openItem.setActionCommand("OpenFile");
		
		// Menüitems zu dem Menü hinzufügen
		fileMenu.add(fileMenu_newItem);
		fileMenu.add(fileMenu_openItem);
		
		//Menüs zur Menübar hinzufügen
		this.add(fileMenu);
		this.add(editMenu);
		this.add(aboutMenu);
	}

}
