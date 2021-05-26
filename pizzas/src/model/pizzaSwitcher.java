package model;

import processing.core.PApplet;
import processing.core.PImage;

public class pizzaSwitcher 
{
	
	int pizzaNumb;
	PApplet app;
	PImage pizza1, pizza2, pizza3, pizza4, pizza5;

	public pizzaSwitcher(int pizzaNumb, PApplet app) 
	{
		pizzaNumb = this.pizzaNumb;
	}
	
	public void loadImages(PApplet app)
	{
		try 
		{
			pizza1 = app.loadImage("2.png");
			pizza2 = app.loadImage("3.png");
			pizza3 = app.loadImage("4.png");
			pizza4 = app.loadImage("5.png");
			pizza5 = app.loadImage("6.png");
		}
		
		catch(NullPointerException nullPointerError)
		{
			System.out.println("failed to load images");
		}
	}
	
	public void switchPizzaUp()
	{
		pizzaNumb++;
		
		if(pizzaNumb == 5)
		{
			pizzaNumb = 0;
		}
		
		System.out.println(pizzaNumb);
	}
	
	public void switchPizzaDown()
	{
		pizzaNumb--;
		
		if (pizzaNumb == -1)
		{
			pizzaNumb = 4;
		}
		
		System.out.println(pizzaNumb);
	}
	
	public void display(PApplet app)
	{
		switch (pizzaNumb)
		{
		case 0:
			app.image(pizza1, 155, 155);
			System.out.println("displaying pizza 1");
			break;
		case 1:
			app.image(pizza2, 155, 155);
			System.out.println("displaying pizza 2");
			break;
		case 2:
			app.image(pizza3, 155, 155);
			System.out.println("displaying pizza 3");
			break;
		case 3:
			app.image(pizza4, 155, 155);
			System.out.println("displaying pizza 4");
			break;
		case 4:
			app.image(pizza5, 155, 155);
			System.out.println("displaying pizza 5");
			break;
		default:
			break;
		}
	}

}
