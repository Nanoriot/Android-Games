package com.nathan.managers;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;

public class GameInputProcessor extends InputAdapter{
	
	public boolean keyDown(int k){
		
		if(k == Keys.UP){
			GameKeys.setKey(GameKeys.UP, true);
		}
		if(k == Keys.DOWN){
			GameKeys.setKey(GameKeys.DOWN, true);
		}
		if(k == Keys.RIGHT){
			GameKeys.setKey(GameKeys.RIGHT, true);
		}
		if(k == Keys.LEFT){
			GameKeys.setKey(GameKeys.LEFT, true);
		}
		if(k == Keys.ENTER){
			GameKeys.setKey(GameKeys.ENTER, true);
		}
		if(k == Keys.SPACE){
			GameKeys.setKey(GameKeys.SPACE, true);
		}
		if(k == Keys.SHIFT_LEFT || k== Keys.SHIFT_RIGHT){
			GameKeys.setKey(GameKeys.SHIFT, true);
		}
		return true;
	}
	
	
	public boolean keyUp(int k){
		
		if(k == Keys.UP){
			GameKeys.setKey(GameKeys.UP, false);
		}
		if(k == Keys.DOWN){
			GameKeys.setKey(GameKeys.DOWN, false);
		}
		if(k == Keys.RIGHT){
			GameKeys.setKey(GameKeys.RIGHT, false);
		}
		if(k == Keys.LEFT){
			GameKeys.setKey(GameKeys.LEFT, false);
		}
		if(k == Keys.ENTER){
			GameKeys.setKey(GameKeys.ENTER, false);
		}
		if(k == Keys.SPACE){
			GameKeys.setKey(GameKeys.SPACE, false);
		}
		if(k == Keys.SHIFT_LEFT || k== Keys.SHIFT_RIGHT){
			GameKeys.setKey(GameKeys.SHIFT, false);
		}
		
		return true;
		}
	
	public boolean touchDown(int x,int y,int p,int b){
		
		if(b == Input.Buttons.LEFT){
			GameKeys.setKey(GameKeys.LEFTM, true);
			GameKeys.setTouchPosition(x,y);
		}
		return true;
		
	}
	
	public boolean touchUp(int x,int y,int p,int b){
		
		if(b == Input.Buttons.LEFT){
			GameKeys.setKey(GameKeys.LEFTM, false);
		}
		return true;
		
	}
	public boolean touchDragged(int x, int y, int p){
		GameKeys.setTouchPosition(x, y);
		return true;
	}

}























