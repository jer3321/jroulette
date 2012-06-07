package com.rade.jeff.main.data;

import java.io.Serializable;

import com.rade.jeff.main.Casino;
import com.rade.jeff.main.io.GameIO;
import com.rade.jeff.main.player.Player;

public class JRouletteBean implements Serializable{
	
	/**
	 * Default 
	 */
	private static final long serialVersionUID = 1L;

	private Casino casino;
	
	private Player player;
	
	private GameIO io;
	
	private int numberWheelCount;

	public Casino getCasino() {
		return casino;
	}

	public void setCasino(Casino casino) {
		this.casino = casino;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public GameIO getIo() {
		return io;
	}

	public void setIo(GameIO io) {
		this.io = io;
	}

	public int getNumberWheelCount() {
		return numberWheelCount;
	}

	public void setNumberWheelCount(int numberWheelCount) {
		this.numberWheelCount = numberWheelCount;
	}
	
	

}
