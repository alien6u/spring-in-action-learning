package com.springinaction.springidol;

public class Instrumentalist implements Perfomer{

	public Instrumentalist(){
		
	}
	
	private String song;
	public String getSong() {
		return song;
	}
	public void setSong(String song) {
		this.song = song;
	}
	@Override
	public void perform() {
		
		System.out.println("Playing" + song + ":");
		instrument.play();
	}
	
	private Instrument instrument;
	
	public void setInstrument(Instrument instrument){
		this.instrument = instrument;
	}

}
