package comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort02 {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		String path = "src\\comparable\\in.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] filds = employeeCsv.split(",");
				String name = filds[0];
				double salary = Double.parseDouble(filds[1]);
				list.add(new Employee(name, salary));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for (Employee s : list) {
				System.out.println(s.toString());
			}
		
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
