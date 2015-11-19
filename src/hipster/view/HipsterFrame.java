package hipster.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import hipster.controller.HipsterAppController;

public class HipsterFrame extends JFrame
{
	private HipsterAppController baseController;
	private HipsterPanel basePanel;
	
	public HipsterFrame(HipsterAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterPanel(baseController);
		setupFrame();
	}
	
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 350);
		this.setResizable(false);
		this.setVisible(true);
	}

	public HipsterAppController getBaseController() {
		return baseController;
	}

	public void setBaseController(HipsterAppController baseController) {
		this.baseController = baseController;
	}

	public HipsterPanel getBasePanel() {
		return basePanel;
	}

	public void setBasePanel(HipsterPanel basePanel) {
		this.basePanel = basePanel;
	}
	
}
