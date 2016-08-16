package com.reviewdayone;

import java.nio.file.*;
import java.io.*;

public class UsingFileIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Path ourNewPath = Paths.get("\\Users\\erine\\SSAResart\\ReviewDay\\src\\com\\reviewdayone\\countries.txt");
		File aBrandNewFile = ourNewPath.toFile();
		
		try (PrintWriter alienA = new PrintWriter(new BufferedWriter(new FileWriter(aBrandNewFile)))) {
			
			alienA.println();
			
		} catch (IOException alienEggs) {
			alienEggs.printStackTrace();
		}
		
		
	} //main

} //class
