package com.nikolanew.testingnew;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TestingnewApplication {
	record UserNew(String name, String book) {}
	static Map<Integer, String> nikolaMap = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(TestingnewApplication.class, args);
		for (int i = 0; i < 1000; i++) {
			nikolaMap.put(i, "n" + i);
		}
	}
}
