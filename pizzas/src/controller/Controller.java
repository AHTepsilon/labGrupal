package controller;

import model.ToppingSelector;
import model.pizzaSwitcher;
import model.screenSwitcher;
import processing.core.PApplet;

public class Controller 
{
	screenSwitcher screenSw;
	pizzaSwitcher pizzaSw;
	ToppingSelector toppingSel;
	PApplet app;
	
	public Controller() 
	{
		pizzaSw = new pizzaSwitcher(0, app);
		screenSw = new screenSwitcher(app);
		toppingSel = new ToppingSelector();
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
	
	public void pizzaHasBeenSelected(PApplet app)
	{
		pizzaSw.pizzaHasBeenSelected(app);
	}
	
	public void loadEm(PApplet app)
	{
		pizzaSw.loadImages(app);
	}
	
	public void display(PApplet app)
	{
		pizzaSw.display(app);
	}
	
	public void toppingSelection(PApplet app)
	{
		toppingSel.addToppings(app);
	}
	
	public void confirmToppings(PApplet app)
	{
		toppingSel.confirmToppings(app);
	}
	
	public void paymentCart()
	{
		pizzaSw.paymentCart();
	}
	
	public void printPrice(PApplet app)
	{
		pizzaSw.printPrice(app);
	}
}
