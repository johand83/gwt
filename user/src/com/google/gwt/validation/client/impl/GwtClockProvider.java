package com.google.gwt.validation.client.impl;

import java.time.Clock;

import jakarta.validation.ClockProvider;

/**
 * https://github.com/hibernate/hibernate-validator/blob/main/engine/src/main/java/org/hibernate/validator/internal/engine/DefaultClockProvider.java
 */
public class GwtClockProvider implements ClockProvider {

	public static final GwtClockProvider INSTANCE = new GwtClockProvider();

	private GwtClockProvider() {
	}

	@Override
	public Clock getClock() {
		return Clock.systemDefaultZone();
	}

}
