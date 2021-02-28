package com.simplilearn.firstproj;

import java.io.File;
import java.util.Scanner;

public class WelcomePage {
	static String path = "C:\\Users\\archana\\eclipse-workspace\\LockedMe\\Locked";

	public static void welcome() {
		System.out.println("Application Name:" + " LockedMe.com");
		System.out.println("Developer Name:" + " Archana Nair");
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		Operations o = new Operations();
		int option;
		mainMenu: while (true) {
			System.out.println("Main Menu");
			System.out.println("Enter your option");
			System.out.println("1)View Files in System");
			System.out.println("2)File Operations");
			System.out.println("3)Exit");
			option = sc.nextInt();

			switch (option) {
			case 1:
				o.viewFiles(path);
				continue mainMenu;
			case 2:

				Inner: while (true) {
					
					System.out.println("select an operation");

					System.out.println("a)Add Files");
					System.out.println("b)Search file");
					System.out.println("c)Delete file");
					System.out.println("d)Exit from operations");
					String choice = sc.next();
					switch (choice) {
					case "a":
						System.out.println("Enter filename");
						String newFile = sc.next();
						o.addFile(path, newFile);
						break;

					case "b":
						System.out.println("Enter filename ");
						String findFile = sc.next();
						o.findFile(path, findFile);
						break;

					case "c":
						System.out.println("enter filename");
						String deleteFile=sc.next();
						o.deleteFile(path, deleteFile);
						break;
					case "d":
						System.out.println("exiting from operations");
						continue mainMenu;
					default:
						System.out.println("invalid entry");
					}
				}
			case 3:
				System.out.println("exiting from main menu");
				break mainMenu;
			default:
				System.out.println("Invalid entry");
			}
		}
	}

	public static void main(String args[]) {
		welcome();
		menu();
	}
}
