/*
 * Copyright (c) Nmote d.o.o. 2003-2015. All rights reserved.
 * See LICENSE.txt for licensing information.
 */

package com.nmote.io;

import org.slf4j.Logger;

/**
 * Support class for formatting hex dumps of input and output streams. Builds a
 * hex dump and plain text representation and periodically dumps it to a
 * supplied log.
 */
class LoggingStreamSupport {

	public LoggingStreamSupport(Logger log, String prefix) {
		this(log, prefix, 16);
	}

	public LoggingStreamSupport(Logger log, String prefix, int size) {
		this(log, prefix, size, true);
	}

	public LoggingStreamSupport(Logger log, String prefix, int size, boolean dumpPlainText) {
		if (log == null) {
			throw new NullPointerException("Log == null");
		}

		this.log = log;
		this.size = size;
		this.prefix = prefix != null ? prefix : "";
		hexDump = new StringBuffer(size * 2 + 4);
		if (dumpPlainText) {
			plainTextDump = new StringBuffer(size + 2);
		} else {
			plainTextDump = null;
		}
	}

	public void close() {
		logDumps(false);
	}

	public void flush() {
		logDumps(true);
	}

	public void logByte(int b) {
		if (atGroupEdge()) {
			hexDump.append(' ');
			plainTextDump.append(' ');
		}

		++pos;

		// Append to plain text dump
		if (plainTextDump != null) {
			char c = (char) b;
			if (!Character.isLetterOrDigit(c)) {
				c = '.';
			}
			plainTextDump.append(c);
		}

		// Append to hex dump
		hexDump.append(Integer.toHexString((b >> 4) & 0xf));
		hexDump.append(Integer.toHexString(b & 0xf));

		// Send a debug logging event
		if (pos == size) {
			logDumps(false);
		}
	}

	private boolean atGroupEdge() {
		return pos > 0 && (pos % groupSize) == 0;
	}

	private void clear() {
		hexDump.setLength(0);
		if (plainTextDump != null) {
			plainTextDump.setLength(0);
		}
		pos = 0;
	}

	private void logDumps(boolean flush) {
		StringBuffer buffer = new StringBuffer(3 * size + 20);
		buffer.append(prefix);
		buffer.append(hexDump);
		if (plainTextDump != null) {
			buffer.append(" | ");
			buffer.append(plainTextDump);
		}
		if (flush)
			buffer.append(" <flush>");
		log.debug(buffer.toString());
		clear();
	}

	private final Logger log;
	private final StringBuffer hexDump;
	private final StringBuffer plainTextDump;
	private final String prefix;
	private int pos;
	private final int size;
	private int groupSize = 4;
}
