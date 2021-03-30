package com.epam.jwd.task0.src.com.epam.jwd.app;


import com.epam.jwd.task0.src.com.epam.jwd.model.SomePojo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

	private static final Logger LOGGER = LogManager.getLogger(Main.class);

	public static void main(String[] args) {

		LOGGER.info("SomePojo class launched");

		SomePojo[] somePojo = new SomePojo[3];

		somePojo[0] = new SomePojo("Messi", 10, true);
		somePojo[1] = new SomePojo("Ronaldo", 7, true);
		somePojo[2] = new SomePojo("Xavi", 6, false);

		for (SomePojo pojo : somePojo) {
			LOGGER.info(pojo.toString());
		}

		LOGGER.info("SomePojo class finished work");

	}
}
