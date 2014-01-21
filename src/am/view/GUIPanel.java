package am.view;

import am.controller.GUIController;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * 
 * @author Isabella Thomaz
 *@version 1.2 10/22/13
 */
public class GUIPanel extends JPanel
	{
		
		private GUIController baseController;
		private SpringLayout baseLayout;
		private JButton firstButton;
		private JButton secondButton;
		
		public GUIPanel(GUIController baseController)
			{
				this.baseController = baseController;
				
				baseLayout = new SpringLayout();
				firstButton = new JButton("blarfla");
				secondButton = new JButton("hoobla");
				
				setupPanel();
				setupLayout();
			}
		
		private void setupPanel()
			{
				this.setLayout(baseLayout);
				this.add(firstButton);
				this.add(secondButton);
			}
		
		private void setupLayout()
			{

				baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 78, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, firstButton, 31, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, firstButton, 230, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.EAST, firstButton, 190, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, secondButton, -240, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.WEST, secondButton, -334, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, secondButton, -131, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.EAST, secondButton, -216, SpringLayout.EAST, this);
				
			}
	}
