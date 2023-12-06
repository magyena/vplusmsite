package org.Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll {
	public static void smoothScrollToBottom(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Get the total height of the document
		Long scrollHeight = 800L; // Set the number of pixels to scroll per iteration
		int scrollStep = 25;

		// Calculate the number of iterations needed for smooth scrolling
		int totalIterations = (int) (scrollHeight / scrollStep);

		// Perform smooth scrolling
		for (int i = 0; i < totalIterations; i++) {
			js.executeScript("window.scrollTo(0, " + i * scrollStep + ");");
			// Sleep for a short duration to add a delay between iterations
			sleep(50);
		}

		// Scroll to the very bottom in case there are remaining pixels
		js.executeScript("window.scrollTo(0, " + scrollHeight + ");");
	}

	public static void sleep(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void smoothScrollToBottom1(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Get the total height of the document
		Long scrollHeight = 1800L; // Set the number of pixels to scroll per iteration
		int scrollStep = 25;

		// Calculate the number of iterations needed for smooth scrolling
		int totalIterations = (int) (scrollHeight / scrollStep);

		// Perform smooth scrolling
		for (int i = 0; i < totalIterations; i++) {
			js.executeScript("window.scrollTo(0, " + i * scrollStep + ");");
			// Sleep for a short duration to add a delay between iterations
			sleep(50);
		}

		// Scroll to the very bottom in case there are remaining pixels
		js.executeScript("window.scrollTo(0, " + scrollHeight + ");");
	}

	public static void sleep1(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
