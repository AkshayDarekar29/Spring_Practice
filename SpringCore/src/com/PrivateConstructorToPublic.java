package com;

import java.lang.reflect.Constructor;

public class PrivateConstructorToPublic {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName("com.Student");
			Constructor<?> con[] = c.getDeclaredConstructors();
			//con[1].newInstance(5);
			con[1].setAccessible(true);
			con[1].newInstance(5);
			/*System.out.println(con[0]);
			System.out.println(con[1]);
			System.out.println(con[2]);*/

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
