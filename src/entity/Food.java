package entity;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.Random;

import static main.Main.SCENE_WIDTH;
import static main.Main.SCENE_HEIGHT;
import static main.Game.ENTITY_SIZE;
import static main.Main.gameRoot;

public class Food extends Rectangle {

	private Random rand = new Random();
	
	public Food(int x, int y) {
		super(x, y, ENTITY_SIZE, ENTITY_SIZE);
		this.setFocused(true);
		setFill(Color.RED);
		gameRoot.getChildren().add(this);
	}

	public void update() {
		setX(rand.nextInt(SCENE_WIDTH / ENTITY_SIZE) * ENTITY_SIZE);
		setY(rand.nextInt(SCENE_HEIGHT / ENTITY_SIZE) * ENTITY_SIZE);		
	}

}