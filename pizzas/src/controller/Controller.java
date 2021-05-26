package controller;

import model.screenSwitcher;
import processing.core.PApplet;

public class Controller 
{
	screenSwitcher screenSw;
	PApplet app;
	
	public Controller() 
	{
		
	}
	
	public void screenControl(PApplet app)
	{
		screenSw.screenControl(app);
	}
	
	public void switchScreen(PApplet app)
	{
		screenSw.switchScreen(app);
	}
}
