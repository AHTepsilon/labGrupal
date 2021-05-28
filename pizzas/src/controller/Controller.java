package controller;

import model.pizzaSwitcher;
import model.screenSwitcher;
import processing.core.PApplet;

public class Controller 
{
	screenSwitcher screenSw;
	pizzaSwitcher pizzaSw;
	PApplet app;
	
	public Controller() 
	{
		pizzaSw = new pizzaSwitcher(0, app);
		screenSw = new screenSwitcher(app);
	}
	
	public void screenControl(PApplet app)
	{
		screenSw.screenControl(app);
	}
	
	public void switchScreen(PApplet app)
	{
		screenSw.switchScreen(app);
	}
	
	public void loadScreenSw(PApplet app)
	{
		screenSw.loadImages(app);
	}
	
	public void pizzaSwitchUp()
	{
		pizzaSw.switchPizzaUp();
	}
	
	public void pizzaSwitchDown()
	{
		pizzaSw.switchPizzaDown();
	}
	
	public void pizzaSwitchSize(PApplet app)
	{
		pizzaSw.switchSize(app);
	}
	
	public void loadEm(PApplet app)
	{
		pizzaSw.loadImages(app);
	}
	
	public void display(PApplet app)
	{
		pizzaSw.display(app);
	}
}
