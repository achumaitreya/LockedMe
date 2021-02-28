package com.simplilearn.firstproj;

import java.io.File;
import java.io.IOException;

public class Operations {
	public void viewFiles(String path) {
		File file = new File(path);
		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println(f);
		}
	}

	public void addFile(String path, String newFile) {
		try {
			File myObj = new File(path + "\\" + newFile);
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public void findFile(String path, String findFile) {
		boolean flag = true;
		File file = new File(path);
		File[] files = file.listFiles();
		for (File f : files) {
			if (f.getName().equals(findFile)) {
				System.out.println("file has been found: " + findFile);
				return;
			} else {
				flag = false;
			}

		}
		if (flag == false)
			System.out.println("file not found");
	}

	public void deleteFile(String path, String deleteFile) {
		File file = new File(path + "\\" + deleteFile);
		if (file.delete()) {
			System.out.println("file got deleted: "+deleteFile);
		} else {
			System.out.println("file doesnt exist");
		}

	}
}
