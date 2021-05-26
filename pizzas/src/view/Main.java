package view;
import controlP5.ControlP5;
import controlP5.Textfield;
import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet
{
	private ControlP5 cp5;
	Controller controls;
	
	PImage firstScreen, loginScreen, registerScreen, homeScreen, pizzaSelectScreen, 
			deliveryScreen, cartScreen, paymentScreen, selectPaymentScreen, exitScreen, historyScreen;
	
	PImage pizza1, pizza2, pizza3, pizza4, pizza5;
	
	public static int screen;
	
	boolean isLoginScreen;

	public static void main(String[] args) 
	{
		PApplet.main("view.Main");
	}
	
	@Override
	public void settings() //void Awake
	{
		size(375, 667);
	}
	
	@Override
	public void setup() //void Start
	{
		cp5 = new ControlP5(this);
		controls = new Controller();
		
		screen = 1;
		
		firstScreen = loadImage("screen1.png");
		loginScreen = loadImage("loginScreen.png");
		registerScreen = loadImage("signUpScreen.png");
		homeScreen = loadImage("pizzaTypeSelect.png");
		historyScreen = loadImage("deliveryHistory.png");
		cartScreen = loadImage("shoppingCart.png");
		pizzaSelectScreen = loadImage("toppingSelect.png");
		paymentScreen = loadImage("paymentScreen.png");
		
		pizza1 = loadImage("2.png");
		pizza2 = loadImage("3.png");
		pizza3 = loadImage("4.png");
		pizza4 = loadImage("5.png");
		pizza5 = loadImage("6.png");
		
		if(screen == 2)
		{
			cp5.addTextfield(" ")
			.setPosition(57, 219)
			.setFocus(true)
			.setColor(color(255, 168, 0));
		}
	}
	
	@Override
	public void draw() //void Update
	{		
		background(0);
		
		System.out.println(mouseX + ", " + mouseY);
		
		if(screen == 1)
		{
			image(firstScreen, 0, 0);
		}
		
		if(screen == 2)
		{
			image(loginScreen, 0, 0);
		}
		
		if(screen == 3)
		{
			image(registerScreen, 0, 0);
		}
		
		if(screen == 4)
		{
			image(homeScreen, 0, 0);
		}
		
		if(screen == 5)
		{
			image(cartScreen, 0, 0);
		}
		
		if(screen == 6)
		{
			image(historyScreen, 0, 0);
		}
		
		if(screen == 7)
		{
			image(pizzaSelectScreen, 0, 0);
		}
		
		if(screen == 8)
		{
			image(paymentScreen, 0, 0);
		}
	}

	public void mousePressed()
	{
		if(dist(mouseX, mouseY, 331, 313) < 20 && screen == 1)
		{
			screen = 2;
		}
		
		if(mouseX > 87 && mouseY > 500 && mouseX < 297 && mouseY < 547 && screen == 2)
		{
			screen = 3;
		}
		
		if(mouseX > 87 && mouseY > 540 && mouseX < 297 && mouseY < 580 && screen == 3)
		{
			screen = 4;
		}
		
		if(mouseX > 87 && mouseY > 444 && mouseX < 297 && mouseY < 487 && screen == 2)
		{
			screen = 4;
		}
		
		//122, 200, 288
		
		if(dist(mouseX, mouseY, 40, 122) < 20 && (screen == 4 || screen == 6))
		{
			screen = 4;
		}
		
		if(dist(mouseX, mouseY, 40, 53) < 20 && (screen == 5))
		{
			screen = 4;
		}
		
		if(dist(mouseX, mouseY, 40, 200) < 20 && (screen == 4 || screen == 6))
		{
			screen = 5;
		}
		
		if(dist(mouseX, mouseY, 40, 288) < 20 && (screen == 4 || screen == 6))
		{
			screen = 6;
		}
		
		//156, 591, 292, 614
		
		if(mouseX > 156 && mouseY > 591 && mouseX < 292 && mouseY < 614 && screen == 4)
		{
			screen = 7;
		}
		
	}
	
	public void mouseReleased()
	{
		//66, 589, 177, 619, 198, 589, 308, 619
		
		if(mouseX > 66 && mouseY > 589 && mouseX < 177 & mouseY < 619 && screen == 7)
		{
			screen = 5;
		}
		
		if(mouseX > 198 && mouseY > 589 && mouseX < 308 && mouseY < 619 && screen == 7)
		{
			screen = 8;
		}
	}
	
}