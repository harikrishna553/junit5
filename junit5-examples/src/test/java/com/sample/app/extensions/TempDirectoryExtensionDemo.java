package com.sample.app.extensions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class TempDirectoryExtensionDemo {
	@TempDir
	static Path sharedTempDir;

	@Test
	void writeItemsToFile_1() throws IOException {
		File file = sharedTempDir.resolve("test1.txt").toFile();

		try (FileWriter fileWriter = new FileWriter(file.getAbsolutePath());
				PrintWriter printWriter = new PrintWriter(fileWriter)) {
			printWriter.print("Hello World");

		}

		assertEquals("Hello World", Files.readAllLines(file.toPath()).get(0));
	}

	@Test
	void writeItemsToFil_2() throws IOException {
		File file = sharedTempDir.resolve("test2.txt").toFile();

		try (FileWriter fileWriter = new FileWriter(file.getAbsolutePath());
				PrintWriter printWriter = new PrintWriter(fileWriter)) {
			printWriter.print("Hello World");

		}

		assertEquals("Hello World", Files.readAllLines(file.toPath()).get(0));
	}

}
