package util;

import java.util.logging.*;

/* This will be the logger of our project.
 * We will use it to display messages to the
 * console instead of System.out.println().
 */

public class MessageLogger {

	static private Handler messageHandler;
	static private Formatter messageFormatter;

	static public void setup() {
		Logger messageLogger = Logger.getGlobal();

		// Initialize handler.
		messageHandler = new ConsoleHandler();
		messageFormatter = new MessageFormatter();

		// Handler Configuration
		messageHandler.setLevel(Level.ALL); // Set the ConsoleHandler level to
											// ALL so
											// we see every message.

		messageHandler.setFormatter(messageFormatter); // Set the formatter to
														// our custom one.

		// Logger Configuration
		messageLogger.setUseParentHandlers(false); // Disable the parent
													// Handlers.

		messageLogger.addHandler(messageHandler); // Add our custom Handler to
													// our Logger.

		messageLogger.setLevel(Level.ALL); // Set the Logger's level to ALL so
											// it matches the Handlers.

	}

}
