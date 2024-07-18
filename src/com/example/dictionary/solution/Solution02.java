package com.example.dictionary.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution02 {
	public static void main(String[] args) throws IOException {
		File file = new File("src/dictionary.txt");

		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = reader.readLine();
		List<String> words = new ArrayList<>();
		while (line != null) {
			words.add(line);
			line = reader.readLine();
		}

		List<String> result = words.stream()
				.dropWhile(w -> w.charAt(0) >= 'a' && w.charAt(0) <= 'm')
				.toList();

		System.out.println(result.size());

	}
}
