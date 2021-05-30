package view;
import controlP5.ControlP5;
import controlP5.Textfield;
import controller.Controller;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Main extends PApplet
{
	private ControlP5 cp5;
	Controller controls;
	
	PFont font;
	
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
		
		font = createFont("VERDANA.TTF", 30);
		
		screen = 1;
		
		controls.loadScreenSw(this);
		controls.loadEm(this);
		
//		cp5.addTextfield("name");		
//		cp5.setPosition(375, 667);
//		
//		cp5.addTextfield("password");		
//		cp5.setPosition(375, 667);
		
		
		
		//.setFocus(true)
		//.setColor(color(255, 168, 0));
		createGUI();

	}
	@Override
	public void draw() //void Update
	{		
		background(0);
		textFont(font);
		
		System.out.println(mouseX + ", " + mouseY);
		
		controls.switchScreen(this);
		
		if(screen == 4) 
		{
			controls.display(this);
		}
		
		if(screen == 2) 
		{
			
			cp5.setVisible(true);
		}
		else 
		{
			
			cp5.setVisible(false);
		}
		
		controls.pizzaHasBeenSelected(this);
		
		if(screen == 5)
		{
			noStroke();
			fill(255, 168, 0);
			rect(225, 458, 80, 40);
		}
		
	}
	public void createGUI() { // create the fields and buttons
		
		  cp5 = new ControlP5(this); // create an instance of the controlP5 object for this program

		  cp5.addTextfield(" ")
			.setPosition(57, 219)
			.setColorActive(color(239,149,109))     
		.setColorBackground(color(240,221,170))
		;
			
		  
		  cp5.addTextfield("  ")
			.setPosition(57, 300)
			.setColorActive(color(239,149,109))      
			.setColorBackground(color(240,221,170))
			; 
		
		
		}

	public void mousePressed()
	{
		controls.pizzaSwitchSize(this);
		controls.toppingSelection(this);
		controls.confirmToppings(this);
	}
	
	public void mouseReleased()
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
		
		if(dist(mouseX, mouseY, 41, 53) < 20 && screen == 7)
		{
			screen = 4;
		}
		
		if(dist(mouseX, mouseY, 340, 220) < 20 && screen == 4)
		{
			controls.pizzaSwitchUp();
		}
		
		if(dist(mouseX, mouseY, 118, 220) < 20 && screen == 4)
		{
			controls.pizzaSwitchDown();
		}
		
		//66, 589, 177, 619, 198, 589, 308, 619
		
		/*if(mouseX > 66 && mouseY > 589 && mouseX < 177 & mouseY < 619 && screen == 7)
		{
			screen = 5;
		}
		
		if(mouseX > 198 && mouseY > 589 && mouseX < 308 && mouseY < 619 && screen == 7)
		{
			screen = 8;
		}*/
	}
	
}
