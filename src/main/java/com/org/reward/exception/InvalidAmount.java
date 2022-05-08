package com.org.reward.exception;

/**
* The InvalidAmount program that handle exception
*
* @author  Pritee
* @version 1.0
* @since   05-07-2022
*/
public class InvalidAmount extends RuntimeException {
	public InvalidAmount(String message){
		super(message);
	}
}
