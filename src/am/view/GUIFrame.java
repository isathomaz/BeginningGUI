package am.view;

import am.controller.GUIController;
import javax.swing.JFrame;
/**
 * Framework for a GUI Frame class.
 * @author Isabella Thomaz
 * @version 1.3 10/22/13
 */
public class GUIFrame extends JFrame
	{
		private GUIController baseController;
		private GUIPanel basePanel;
		
		/**
		 * the controller object that will be shared with the frame.
		 * @param baseController
		 */
		public GUIFrame(GUIController baseController)
			{
				this.baseController = baseController;
				basePanel = new GUIPanel(baseController);
				
				setupFrame();
			}
		/**
		 * Helper method to setup the default size and panel for the frame.
		 */
		private void setupFrame()
			{
				
				this.setContentPane(basePanel);
				this.setSize(1200,800);
				this.setVisible(true);
			}
		
	}
