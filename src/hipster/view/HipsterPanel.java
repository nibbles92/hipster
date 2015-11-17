package hipster.view;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import hipster.controller.HipsterAppController;

public class HipsterPanel extends JPanel
{
	private SpringLayout baseLayout;
	private HipsterPanel basePanel;
	private HipsterAppController baseController;
	private JComboBox<String> phraseComboBox;
	
	public HipsterPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		phraseComboBox = new JComboBox<String>();
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupComboBox()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.ORANGE);
		this.add(phraseComboBox);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int cyan = (int) (Math.random() * 256);
				int brown = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				setBackground(new Color(cyan, brown, green));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
			}		
		});
	}
	
}
