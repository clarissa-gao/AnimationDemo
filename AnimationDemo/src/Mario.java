

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;

	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS
	public void walk(int dir) {
		super.moveByAmount(dir, 0);
	}

	public void jump() {
		super.moveByAmount(0, -1);
	}

	public void act(ArrayList<Shape> obstacles) {
		for (int i = 0; i< obstacles.size(); i++) {
			while(!obstacles.get(i).contains(x, y)) {
				super.moveByAmount(0,1);
			}
		}

		
		// FALL (and stop when a platform is hit)
		
	}

}
