package com.journaldev.singleton;

public class StaticBlocKSingleton{
	
	
	private static final StaticBlocKSingleton instance ;
	
	//private constructor to avoid client application to use constructor
	
	private StaticBlocKSingleton(){}
	
	static{
		try{
			instance = new StaticBlocKSingleton();
		}catch(Exception e){
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}
	
	public static StaticBlocKSingleton getInstance(){
		return instance;
	}
	

}
