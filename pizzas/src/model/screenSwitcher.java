package model;

import processing.core.PApplet;
import processing.core.PImage;
import view.Main;

public class screenSwitcher 
{
	PImage firstScreen, loginScreen, registerScreen, homeScreen, pizzaSelectScreen, 
	deliveryScreen, cartScreen, paymentScreen, selectPaymentScreen, exitScreen, historyScreen;
	
	PApplet app;
	
	public screenSwitcher(PApplet app) 
	{

	}
	
	public void loadImages(PApplet app)
	{
		firstScreen = app.loadImage("screen1.png");
		loginScreen = app.loadImage("loginScreen.png");
		registerScreen = app.loadImage("signUpScreen.png");
		homeScreen = app.loadImage("pizzaTypeSelect.png");
		historyScreen = app.loadImage("deliveryHistory.png");
		cartScreen = app.loadImage("shoppingCart.png");
		pizzaSelectScreen = app.loadImage("toppingSelect.png");
		paymentScreen = app.loadImage("paymentScreen.png");
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
		
		if(Main.screen == 3)
		{
			app.image(registerScreen, 0, 0);
		}
		
		if(Main.screen == 4)
		{
			app.image(homeScreen, 0, 0);
		}
		
		if(Main.screen == 5)
		{
			app.image(cartScreen, 0, 0);
		}
		
		if(Main.screen == 6)
		{
			app.image(historyScreen, 0, 0);
		}
		
		if(Main.screen == 7)
		{
			app.image(pizzaSelectScreen, 0, 0);
		}
		
		if(Main.screen == 8)
		{
			app.image(paymentScreen, 0, 0);
		}
	}

}
