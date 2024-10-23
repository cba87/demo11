package com.example.demo11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class HomeWork4 {
	@Test
	public void mapWork() {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 2);
		map.put(1, 7);
		map.put(2, 11);
		map.put(3, 15);
		int target = 9;
		List<Integer> list = Arrays.asList(2, 7, 11, 15);

		for (int i = 0; i <= map.size() - 1; i++) {
			int check = target - map.get(i);
//			System.out.println(check);

			if (map.containsValue(check)) {
				System.out.printf("%d %d", map.get(i), check);
				System.out.println();
				System.out.printf("%d %d", list.indexOf(map.get(i)), list.indexOf(check));
				break;
			}
		}
	}

	@Test
	public void mapWork2() {
		Map<Integer, Integer> map = new HashMap<>();
		int target = 9;
		int num1 = 2;
		int num2 = 7;
		int num3 = 9;
		int num4 = 11;

		map.put(num1, target);
		map.put(num2, target);
		map.put(num3, target);
		map.put(num4, target);
		int[] list = { num1, num2, num3, num4 };

		for (int i = 0; i <= map.size() - 1; i++) {
			int check = map.get(list[i]) - list[i];
// 			System.out.println(check);

			if (map.containsKey(check)) {
				System.out.printf("索引值%d 對應值:%d", i, list[i]);
				System.out.println();
// 				System.out.printf("%d %d",i,list. );
				continue;
			}
		}
	}

	@Test
	public void mapWork3() {
		int[] nums = { 2, 7, 9, 11 };
		int target = 9;
		
		outerLoop: for (int i = 0; i <= nums.length - 1; i++) {
			int sum1 = 0;
			sum1 += nums[i];
//			System.out.println(sum1);
			for (int j = 1; j <= nums.length - 1; j++) {
				int sum2 = sum1;
				sum2 += nums[j];
				if (sum2 == target) {
					System.out.printf("索引值%d&%d", i, j);
					break outerLoop;
				}
			}
		}
	}
	@Test
	public void playball2(){

		HomeTown hometown = new HomeTown("台南","台灣","安南區");
		
		Employee employee = new Employee("1213546","老王",18,"男",hometown);		
		
		System.out.println(employee);
		
		}
}
