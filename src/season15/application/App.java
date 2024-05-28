package season15.application;

import season15.model.entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the file path:");
		Map<String, Integer> result = readFile(in.next());

		for (String key : result.keySet()) {
			System.out.println("Key: " + key + ", " + "Value: " + result.get(key));
		}
		in.close();

	}

	public static Map<String, Integer> readFile(String path) {
		Map<String, Integer> result = new HashMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] splited = line.split(",");
				Candidate candidate = new Candidate(splited[0], Integer.parseInt(splited[1]));
				if (result.containsKey(candidate.getName())) {
					int sumWishes = result.get(candidate.getName()) + candidate.getWishes();
					result.put(candidate.getName(), sumWishes);
				} else result.put(candidate.getName(), candidate.getWishes());
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
}
