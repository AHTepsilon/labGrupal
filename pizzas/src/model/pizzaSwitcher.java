package model;

import processing.core.PApplet;
import processing.core.PImage;
import view.Main;

public class pizzaSwitcher 
{
	
	int pizzaNumb;
	PApplet app;
	PImage pizza1, pizza2, pizza3, pizza4, pizza5;
	int pizzaSizeSelect;
	
	static public double price;
	
	int pizzaX, pizzaY;

	public pizzaSwitcher(int pizzaNumb, PApplet app) 
	{
		pizzaNumb = this.pizzaNumb;
		
		pizzaSizeSelect = 9;
		pizzaX = 130;
		pizzaY = 130;
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
	
	@SuppressWarnings("static-access")
	public void switchSize(PApplet app)
	{
		if(app.dist(app.mouseX, app.mouseY, 122, 533) < 20 && Main.screen == 4)
		{
			pizzaSizeSelect = 0;
			System.out.println("personal");
		}
		if(app.dist(app.mouseX, app.mouseY, 187, 533) < 20 && Main.screen == 4)
		{
			pizzaSizeSelect = 1;
			System.out.println("small");
		}
		if(app.dist(app.mouseX, app.mouseY, 255, 533) < 20 && Main.screen == 4)
		{
			pizzaSizeSelect = 2;
			System.out.println("medium");
		}
		if(app.dist(app.mouseX, app.mouseY, 321, 533) < 20 && Main.screen == 4)
		{
			pizzaSizeSelect = 3;
			System.out.println("large");
		}
	}
	
	public void printToCart(PApplet app)
	{
			if(Main.screen == 5)
			{
				
			app.textSize(21);
			app.fill(255, 168, 0);
			
			switch(pizzaNumb)
			{
			case 0:
				app.text("Mushrooms \n & Plums", 67, 180);
				break;
			case 1:
				app.text("Sausage", 67, 180);
				break;
			case 2:
				app.text("Cheese and \n basil", 67, 180);
				break;
			case 3:
				app.text("Bell pepper \n and carrot", 67, 180);
				break;
			case 4:
				app.text("Olives", 67, 180);
				break;
			}
			
			switch(pizzaSizeSelect)
			{
			case 0:
				app.fill(255);
				app.text("P", 260, 200);
				break;
			case 1:
				app.fill(255);
				app.text("S", 260, 200);
				break;
			case 2:
				app.fill(255);
				app.text("M", 260, 200);
				break;
			case 3:
				app.fill(255);
				app.text("L", 260, 200);
				break;
			}
		}
	}
	
	public void addPizzaToHistory(PApplet app)
	{
		app.textSize(30);
		app.fill(255, 168, 0);
		
		switch(pizzaNumb)
		{
		case 0:
			app.text("Mushrooms \n & Plums", 106, 264 - 115);
			break;
		case 1:
			app.text("Sausage", 106, 264 - 115);
			break;
		case 2:
			app.text("Cheese and \n basil", 106, 264 - 115);
			break;
		case 3:
			app.text("Bell pepper \n and carrot", 106, 264 - 115);
			break;
		case 4:
			app.text("Olives", 106, 264 - 115);
			break;
		}
		
		app.textSize(14);
		app.text("Today", 278, 332 - 115);
		
		app.fill(255);
		app.noStroke();
		app.textSize(18);
		
		switch(pizzaSizeSelect)
		{
		case 0:
			app.fill(255);
			app.text("P", 317, 265 - 115);
			break;
		case 1:
			app.fill(255);
			app.text("S", 317, 265 - 115);
			break;
		case 2:
			app.fill(255);
			app.text("M", 317, 265 - 115);
			break;
		case 3:
			app.fill(255);
			app.text("L", 317, 265 - 115);
			break;
		}
	}
	
	public void pizzaHasBeenSelected(PApplet app)
	{
		if(Main.screen == 7)
		{
			switch(pizzaNumb)
			{
			case 0:
				app.fill(247,99,0);
				app.textSize(30);
				app.text("Mushrooms \n & Plums", 25, 218);
				
				app.textSize(15);
				app.text("A delicious combination, classic mushrooms \n and plums on sourdough", 25, 297);
				break;
			case 1:
				app.fill(247,99,0);
				app.textSize(30);
				app.text("Sausage", 25, 218);
				
				app.textSize(15);
				app.text("Spicy italian sausage delight", 25, 297);
				break;
			case 2: 
				app.fill(247,99,0);
				app.textSize(30);
				app.text("Cheese and \n basil", 25, 218);
				
				app.textSize(15);
				app.text("Simple cheese pizza on sourdough aromatized \n with basil", 25, 297);
				break;
			case 3:
				app.fill(247,99,0);
				app.textSize(30);
				app.text("Bell pepper \n and carrot", 25, 218);
				
				app.textSize(15);
				app.text("Vegetarian option with bell pepper and \n roasted carrots", 25, 297);
				break;
			case 4:
				app.fill(247,99,0);
				app.textSize(30);
				app.text("Olives", 25, 218);
				
				app.textSize(15);
				app.text("Simple yet elegant, delicious \n lombardan olives on sourdough", 25, 297);
				break;
			}
			
			switch(pizzaSizeSelect)
			{
			case 0:
				app.textSize(30);
				app.text("P", 277, 220);
				break;
			case 1:
				app.textSize(30);
				app.text("S", 277, 220);
				break;
			case 2:
				app.textSize(30);
				app.text("M", 271, 220);
				break;
			case 3:
				app.textSize(30);
				app.text("L", 277, 220);
				break;
			}
		}
	}
	
	public void display(PApplet app)
	{
		switch (pizzaNumb)
		{
		case 0:
			app.image(pizza1, pizzaX, pizzaY);
			//System.out.println("displaying pizza 1");
			app.textSize(30);
			//app.fill(247,99,0);
			//app.text("Mushrooms and plum", 100, 365);
			String s = "Mushrooms and plum";
			app.fill(247,99,0);
			app.text(s, 100, 350, 300, 500);  // Text wraps within text box
			break;
		case 1:
			app.image(pizza2, pizzaX, pizzaY);
			//System.out.println("displaying pizza 2");
			app.textSize(30);
			app.fill(247,99,0);
			app.text("Sausage ", 100, 375);
			break;
		case 2:
			app.image(pizza3, pizzaX, pizzaY);
			//System.out.println("displaying pizza 3");
			app.textSize(30);
			app.fill(247,99,0);
			app.text("Cheese and basil",100, 375);
			break;
		case 3:
			app.image(pizza4, pizzaX, pizzaY);
			//System.out.println("displaying pizza 4");
			app.textSize(30);
			app.fill(247,99,0);
			app.text("Bell pepper and \n carrot", 100, 375);
			break;
		case 4:
			app.image(pizza5, 120, 120);
			//System.out.println("displaying pizza 5");
			app.textSize(30);
			app.fill(247,99,0);
			app.text("Olives", 100, 375);
			break;
		default:
			break;
		}
	}
	
	public void paymentCart()
	{
		try
		{
			switch(pizzaSizeSelect)
			{
			case 0:
				price = 4.99;
				break;
			case 1:
				price = 8.99;
				break;
			case 2:
				price = 12.99;
				break;
			case 3:
				price = 15.99;
				break;
			default:
				throw new Exception("Price different than established");
			}
		}
		catch(Exception priceNonRelated)
		{
			price = 0.00;
		}
	}
	
	public void printPrice(PApplet app)
	{
		app.fill(255);
		app.textSize(21);
		app.text(Double.toString(price), 246, 485);
	}
	
	public int getPizzaNumb() {
		return pizzaNumb;
	}
	
	public void setPizzaNumb(int pizzaNumb) {
		this.pizzaNumb = pizzaNumb;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
