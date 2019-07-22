package com.gl.userManagementApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class UserManagementAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(UserManagementAppApplication.class, args);
		int c = 0;
		for(int i=0; i<i+10; i++){
			c++;
		}
		System.out.println("done " + c);
	}

}
