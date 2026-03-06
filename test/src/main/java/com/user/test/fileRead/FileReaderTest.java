package com.user.test.fileRead;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {

		try {
			BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			
			String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
