package com.javatechie.app.sonarexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

	public void m1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
	}

	public Object getData() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		return null;
	}

	public static void main(String[] args) {
		App app = new App();
		app.m1();
	}
}
