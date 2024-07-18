package com.example.dictionary.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Solution06 {

	static Function<String, String> reverse = s -> ((new StringBuilder(s)).reverse().toString());

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
				.max((a, b) -> a.length() - b.length());
	}
}
