package view;

import controlP5.ControlP5;
import controlP5.Textfield;
import controller.Controller;
import model.pizzaSwitcher;
import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;

public class Main extends PApplet {
	
	Controller controls;
	PFont font;
	
	private ControlP5 cp5;
	public static int screen;
	boolean isLoginScreen;
	
	boolean hasLoggedIn, hasRegistered, hasAddedToCart;

	//// register	
	public Textfield userName,passWord, Phone, eMail, password, user;
	public String userLog, passwordLog,  name, userpass, phone, email;
	private String[] userInfo, infoText;
	// -------------------

	public static void main(String[] args) {
		PApplet.main("view.Main");
	}

	@Override
	public void settings() // void Awake
	{
		size(375, 667);
	}

	@Override
	public void setup() // void Start
	{
		cp5 = new ControlP5(this);
		controls = new Controller();

		font = createFont("VERDANA.TTF", 30);

		screen = 1;

		controls.loadScreenSw(this);
		controls.loadEm(this);
		userInfo = new String[50];
		createTextFields();
		createTextFieldsRegister();
		
		hasLoggedIn = false;
		hasRegistered = false;
		hasAddedToCart = false;

	}

	@Override
	public void draw() // void Update
	{
		background(0);
		textFont(font);

		controls.switchScreen(this);

		if (screen == 2) {
			user.setVisible(true);
			password.setVisible(true);

			userLog = user.getStringValue();
			passwordLog = password.getStringValue();
			
			//userInfo();

		} else {
			user.setVisible(false);
			password.setVisible(false);
		}

		if (screen == 3) {

			userName.setVisible(true);
			passWord.setVisible(true);
			Phone.setVisible(true);
			eMail.setVisible(true);

			name = userName.getStringValue();
			userpass = passWord.getStringValue();
			phone = Phone.getStringValue();
			email = eMail.getStringValue();

			userRegister();

		} else {			
			userName.setVisible(false);
			passWord.setVisible(false);
			Phone.setVisible(false);
			eMail.setVisible(false);

		}

		if (screen == 4) {
			controls.display(this);
		}

		if (screen == 5) {
			noStroke();
			fill(255, 168, 0);
			rect(225, 458, 80, 40);
			
			circle(267, 190, 50);
			
			printToCart();
			controls.printToppingsToCart(this);
			controls.printPrice(this);
		}
		
		if(screen == 6)
		{
			textSize(30);
			fill(255, 168, 0);
			text("Olives", 106, 264);
			text("Sausage", 106, 379);
			text("Sausage", 106, 494);
			
			circle(324, 258 - 115, 50);
			circle(324, 258, 50);
			circle(324, 258 + 115, 50);
			circle(324, 258 + 115 + 115, 50);
			textSize(14);
			text("Yesterday", 278, 332);
			text("25/05/21", 278, 332 + 115);
			text("02/05/21", 278, 332 + 115 + 115);
			fill(255);
			noStroke();
			textSize(18);
			text("M", 317, 265);
			text("L", 317, 265 + 115);
			text("P", 317, 265 + 115 + 115);
			
			controls.addPizzaToHistory(this);
		}
		
		printToCart();
		controls.paymentCart();
		controls.pizzaHasBeenSelected(this);
		System.out.println(mouseX + ", " + mouseY);

	}

	public void createTextFields() { // create the fields and buttons

		cp5 = new ControlP5(this); // create an instance of the controlP5 object for this program

		user= cp5.addTextfield(" ").setPosition(57, 219).setColorActive(color(239, 149, 109))
				.setColorBackground(color(240, 221, 170));

		password= cp5.addTextfield("  ").setPosition(57, 300).setColorActive(color(239, 149, 109))
				.setColorBackground(color(240, 221, 170));
	}

	public void createTextFieldsRegister() { // create the fields

		cp5 = new ControlP5(this); // create an instance of the controlP5 object for this program

		userName = cp5.addTextfield("   ").setPosition(55, 180).setColorActive(color(239, 149, 109))
				.setColorBackground(color(240, 221, 170));
		passWord = cp5.addTextfield("    ").setPosition(55, 250).setColorActive(color(239, 149, 109))
				.setColorBackground(color(240, 221, 170));
		Phone = cp5.addTextfield("     ").setPosition(55, 330).setColorActive(color(239, 149, 109))
				.setColorBackground(color(240, 221, 170));
		eMail = cp5.addTextfield("      ").setPosition(55, 410).setColorActive(color(239, 149, 109))
				.setColorBackground(color(240, 221, 170));
	}

	public void userInfo() { // divide el txt

		if (userInfo != null) {
			infoText = loadStrings("./data/info/userInfo.txt");
			System.out.println("se dividio el texto");

			for (int i = 0; i < infoText.length; i++) {

				String[] Line1 = infoText[i].split(" ");

				name = Line1[0];
				userpass = Line1[1];
				phone = Line1[2];
				email = Line1[3];

			}
			
			System.out.println(name.equals(userLog));
			System.out.println(userpass.equals(passwordLog));

		}

	}


	public void userRegister() { // guarde el txt

		for (int i = 0; i < userInfo.length; i++) {

			String line = name + " " + userpass + " " + phone + " " + email;
			userInfo[i] = line;
			System.out.println(userInfo[i]);
		}
		saveStrings("./data/info/userInfo.txt", userInfo);
		
		return;
	}

	public void mousePressed() {
		controls.pizzaSwitchSize(this);
		controls.toppingSelection(this);
		controls.confirmToppings(this);
	}
	
	public void printToCart()
	{
		controls.printToCart(this);
	}

	public void mouseReleased() {
		if (dist(mouseX, mouseY, 331, 313) < 20 && screen == 1) {
			screen = 2;
		}

		if (mouseX > 87 && mouseY > 500 && mouseX < 297 && mouseY < 547 && screen == 2) {
			screen = 3;
		}

		if (mouseX > 87 && mouseY > 540 && mouseX < 297 && mouseY < 580 && screen == 3) {
			screen = 4;
		}

		if (mouseX > 87 && mouseY > 444 && mouseX < 297 && mouseY < 487 && screen == 2) {
			
			screen = 4;
		}

		// 122, 200, 288

		if (dist(mouseX, mouseY, 40, 122) < 20 && (screen == 4 || screen == 6)) {
			screen = 4;
		}

		if (dist(mouseX, mouseY, 40, 53) < 20 && (screen == 5)) {
			screen = 4;
		}

		if (dist(mouseX, mouseY, 40, 200) < 20 && (screen == 4 || screen == 6)) {
			screen = 5;
		}

		if (dist(mouseX, mouseY, 40, 288) < 20 && (screen == 4 || screen == 6)) {
			screen = 6;
		}

		// 156, 591, 292, 614

		if (mouseX > 156 && mouseY > 591 && mouseX < 292 && mouseY < 614 && screen == 4) {
			screen = 7;
		}

		if (dist(mouseX, mouseY, 41, 53) < 20 && screen == 7) {
			hasAddedToCart = true;
			screen = 4;
		}

		if (dist(mouseX, mouseY, 340, 220) < 20 && screen == 4) {
			controls.pizzaSwitchUp();
		}

		if (dist(mouseX, mouseY, 118, 220) < 20 && screen == 4) {
			controls.pizzaSwitchDown();
		}

		// 66, 589, 177, 619, 198, 589, 308, 619

		/*
		 * if(mouseX > 66 && mouseY > 589 && mouseX < 177 & mouseY < 619 && screen == 7)
		 * { screen = 5; }
		 * 
		 * if(mouseX > 198 && mouseY > 589 && mouseX < 308 && mouseY < 619 && screen ==
		 * 7) { screen = 8; }
		 */
	}

}
