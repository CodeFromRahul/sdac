package io.main;
import io.Manager.*;
import io.emp.*;
public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		Manager manager = new Manager();
		System.out.println(manager.calsal(30000, 1000));
		System.out.println(emp.calsal(2500));
	}
}
