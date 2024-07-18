package com.example.dictionary.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution03 {
	public static void main(String[] args) throws IOException {
		File file = new File("src/dictionary.txt");

		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = reader.readLine();
		List<String> words = new ArrayList<>();
		while (line != null) {
			words.add(line);
			line = reader.readLine();
		}

		words.stream()
				.filter(a -> a.length() >= 3)
				.collect(Collectors.groupingBy(a -> a.substring(0, 3), Collectors.counting()));

	}
}
