package model;

import processing.core.PApplet;
import view.Main;

public class ToppingSelector 
{
	boolean selectedExtraCheese,
			selectedSoda,
			selectedGarlicDip,
			selectedNachos,
			selectedCheeseCrust,
			selectedGarlicBread;

	PApplet app;
	
	public ToppingSelector() 
	{
		selectedExtraCheese = false;
		selectedSoda = false;
		selectedGarlicDip = false;
		selectedNachos = false;
		selectedCheeseCrust = false;
		selectedGarlicBread = false;
	}
	
	@SuppressWarnings("static-access")
	public void addToppings(PApplet app)
	{
		if(app.dist(app.mouseX, app.mouseY, 80, 454) < 20 && Main.screen == 7)
		{
			if(!selectedExtraCheese)
			{
				selectedExtraCheese = true;
				System.out.println("SELECTED");
				app.fill(0, 0, 0, 40);
				app.circle(80, 454, 60);
				
				pizzaSwitcher.price += 1.99;
				
			}
			
			else if(selectedExtraCheese)
			{
				selectedExtraCheese = false;
				pizzaSwitcher.price -= 1.99;
			}
		}
		
		if(app.dist(app.mouseX, app.mouseY, 187, 454) < 20 && Main.screen == 7)
		{
			if(!selectedSoda)
			{
				selectedSoda = true;
				System.out.println("SELECTED");
				app.fill(0, 0, 0, 40);
				app.circle(187, 454, 60);
			}
			
			else if(selectedSoda)
			{
				selectedSoda = false;
			}
		}
		
		if(app.dist(app.mouseX, app.mouseY, 292, 454) < 20 && Main.screen == 7)
		{
			if(!selectedGarlicDip)
			{
				selectedGarlicDip = true;
				System.out.println("SELECTED");
				app.fill(0, 0, 0, 40);
				app.circle(292, 454, 60);
			}
			
			else if(selectedGarlicDip)
			{
				selectedGarlicDip = false;
			}
		}
		
		if(app.dist(app.mouseX, app.mouseY, 80, 535) < 20 && Main.screen == 7)
		{
			if(!selectedNachos)
			{
				selectedNachos = true;
				System.out.println("SELECTED");
				app.fill(0, 0, 0, 40);
				app.circle(80, 535, 60);
			}
			
			else if(selectedNachos)
			{
				selectedNachos = false;
			}
		}
		
		if(app.dist(app.mouseX, app.mouseY, 187, 535) < 20 && Main.screen == 7)
		{
			if(!selectedCheeseCrust)
			{
				selectedCheeseCrust = true;
				System.out.println("SELECTED");
				app.fill(0, 0, 0, 40);
				app.circle(187, 535, 60);
			}
			
			else if(selectedCheeseCrust)
			{
				selectedCheeseCrust = false;
			}
		}
		
		if(app.dist(app.mouseX, app.mouseY, 292, 535) < 20 && Main.screen == 7)
		{
			if(!selectedGarlicBread)
			{
				selectedGarlicBread = true;
				System.out.println("SELECTED");
				app.fill(0, 0, 0, 40);
				app.circle(292, 535, 60);
			}
			
			else if(selectedGarlicBread)
			{
				selectedGarlicBread = false;
			}
		}
	}
	
	public void printToppingsToCart(PApplet app)
	{
		if(Main.screen == 5)
		{
			if(selectedExtraCheese)
			{
				app.fill(255, 168, 0);
				app.textSize(15);
				app.text("Extra cheese", 66, 265);
			}
			
			if(selectedSoda)
			{
				app.fill(255, 168, 0);
				app.textSize(15);
				app.text("Soda", 66, 285);
			}
			
			if(selectedGarlicDip)
			{
				app.fill(255, 168, 0);
				app.textSize(15);
				app.text("Garlic Dip", 66, 305);
			}
			
			if(selectedNachos)
			{
				app.fill(255, 168, 0);
				app.textSize(15);
				app.text("Nachos", 66, 325);
			}
			
			if(selectedCheeseCrust)
			{
				app.fill(255, 168, 0);
				app.textSize(15);
				app.text("Cheese Crust", 66, 345);
			}
			
			if(selectedGarlicBread)
			{
				app.fill(255, 168, 0);
				app.textSize(15);
				app.text("Garlic Bread", 66, 365);
			}
		}
	}
	
	public void confirmToppings(PApplet app)
	{
		if(app.mouseX > 198 && app.mouseY > 589 && app.mouseX < 308 && app.mouseY < 619 && Main.screen == 7 &&
				(selectedExtraCheese || selectedSoda || selectedGarlicDip || selectedNachos || selectedCheeseCrust
						|| selectedGarlicBread))
		{
			Main.screen = 8;
			System.out.println("hey");
		}
		
		if(app.mouseX > 66 && app.mouseY > 589 && app.mouseX < 177 & app.mouseY < 619 && Main.screen == 7 &&
				(selectedExtraCheese || selectedSoda || selectedGarlicDip || selectedNachos || selectedCheeseCrust
						|| selectedGarlicBread))
		{
			Main.screen = 5;
		}
	}

}
