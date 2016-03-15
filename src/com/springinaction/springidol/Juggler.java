package com.springinaction.springidol;

public class Juggler implements Perfomer{

	private int beanBags = 3;
	
	public Juggler(){
		
	}
	
	public Juggler(int beanBags){
		this.beanBags = beanBags;
	}

	@Override
	public void perform(){
		System.out.println("JUGGLER" + beanBags + "BEANBAGES");
	}

	

}
