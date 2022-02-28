package com.solution;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindSmallestInterval {

	public static void main(String[] args) {
		int[] array = new int[] { 1, 6, 4, 8, 2 };
		System.out.println(findSmallestInterval(array));

	}

	public static int findSmallestInterval(int[] numbers) {
		Arrays.sort(numbers);
		return IntStream.range(0, numbers.length - 1).map(i -> numbers[i + 1] - numbers[i]).min().getAsInt();

	}

}
