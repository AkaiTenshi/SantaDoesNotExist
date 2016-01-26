package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* This is the formatter of our logger.
 * It formats the Logger's message String
 * according to our needs.
 */

public class MessageFormatter extends Formatter {

	// DateFormat for the date&time displayed at the start of our message.
	private static final DateFormat fDate = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

	// We override the format function inside of Formatter to make our String.
	@Override
	public String format(LogRecord lrec) {
		StringBuilder builder = new StringBuilder(1000); // The builder makes
															// our string piece
															// by piece.
		
		builder.append(fDate.format(new Date(lrec.getMillis()))).append(" : "); // We
																				// append
																				// the
																				// date
		
		builder.append("[").append(lrec.getLevel()).append("] - "); // Then the
																	// log level
		
		builder.append(formatMessage(lrec)); // Our message
		
		builder.append("\n"); // And finally terminate our string

		return builder.toString();
	}

	// This functions get called when the Handler using our formatter opens and
	// closes respectively.
	public String getHead(Handler h) {
		return super.getHead(h);

	}

	public String getTail(Handler h) {
		return super.getTail(h);

	}

}
