package hipster.controller;

import hipster.model.Hipster;
import hipster.view.HipsterFrame;

public class HipsterAppController 
{
	private Hipster firstHipster;
	private HipsterFrame baseFrame;
	
	public HipsterAppController()
	{
		firstHipster = new Hipster();
		baseFrame = new HipsterFrame(this);
	}
	
	public void start()
	{
		String myName = baseFrame.getResponse("What is your name?");
		firstHipster.setName(myName);
		baseFrame.setTitle(myName + "");
	}

	public Hipster getFirstHipster() 
	{
		return firstHipster;
	}

	public void setFirstHipster(Hipster firstHipster) 
	{
		this.firstHipster = firstHipster;
	}

	public HipsterFrame getBaseFrame() 
	{
		return baseFrame;
	}

	public void setBaseFrame(HipsterFrame baseFrame)
	{
		this.baseFrame = baseFrame;
	}
	
	 
}
