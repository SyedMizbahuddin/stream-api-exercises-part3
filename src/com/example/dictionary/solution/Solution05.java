package com.example.dictionary.solution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution05 {

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
		int[] chars = { 'a', 'e', 'i', 'o', 'u' };
		List<Integer> vowels = Arrays.stream(chars).boxed().collect(Collectors.toList());

		System.out.println(vowels);

		Map<Integer, Long> result = words.stream()
				.flatMap(w -> w.chars().boxed())
				.filter(c -> vowels.contains(c))
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));

		System.out.println(result);

	}
}
