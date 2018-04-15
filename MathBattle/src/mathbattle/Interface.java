/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathbattle;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author JO Phillips
 */
public class Interface  
{

	private String name;
	private int state;

	Interface(int playerNumber, String playerName)
	{
		state = playerNumber;
		name = playerName;

	}

	public void FirstScreen() 
	{
		
		JFrame FirstFrame = new JFrame();
		JPanel screen2 = new JPanel();
		screen2.setLayout(new FlowLayout());
		screen2.add(new JLabel("placeholder text"));
		screen2.add(new JTextField(10));
		FirstFrame.setVisible(true);
		FirstFrame.setContentPane(screen2);
		FirstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FirstFrame.setTitle(name);
		FirstFrame.pack();
	}

}
