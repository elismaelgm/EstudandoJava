package exampleFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainFile {

	public static void main(String[] args) throws IOException {
		
		String path = "src\\exampleFile\\in.csv";
		
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		
		while (br.ready()) {
			System.out.println(br.readLine());
		}
		
		fr.close();
		br.close();
		
	}
}
