package com.springinaction.springidol;

@StringedInstrument
public class Guitar implements Instrument{

	@Override
	public void play() {
		System.out.println("palying guitar");
	}

}
