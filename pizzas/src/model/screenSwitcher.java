package model;

import processing.core.PApplet;
import processing.core.PImage;
import view.Main;

public class screenSwitcher 
{
	PImage firstScreen, loginScreen, registerScreen, homeScreen, pizzaSelectScreen, 
	deliveryScreen, cartScreen, paymentScreen, selectPaymentScreen, exitScreen;
	
	PApplet app;
	
	public screenSwitcher(PApplet app) 
	{

	}
	
	public void loadImages(PApplet app)
	{
		firstScreen = app.loadImage("screen1.png");
		loginScreen = app.loadImage("loginScreen.png");
	}
	
	public void screenControl(PApplet app)
	{
		if(app.dist(app.mouseX, app.mouseY, 331, 313) < 20)
		{
			Main.screen = 2;
		}
	}
	
	public void switchScreen(PApplet app)
	{
		if(Main.screen == 1)
		{
			app.image(firstScreen, 0, 0);
		}
		
		if(Main.screen == 2)
		{
			app.image(loginScreen, 0, 0);
		}
	}

}
