/*
 * Copyright (c) Nmote d.o.o. 2003-2015. All rights reserved.
 * See LICENSE.txt for licensing information.
 */

package com.nmote.smpp;

/**
 * CommandCancelledException is thrown from synchronous Session calls if
 * command was cancelled before method competition.
 *
 * @author Vjekoslav Nesek
 */
public class CommandCancelledException extends SessionException {

	private static final long serialVersionUID = About.SERIAL_VERSION_UID;

	/**
	 * Constructor for CommandCancelledException.
	 */
	public CommandCancelledException() {
	}

	/**
	 * Constructor for CommandCancelledException.
	 *
	 * @param message
	 *            error message
	 */
	public CommandCancelledException(String message) {
		super(message);
	}

}
