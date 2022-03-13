package com.yurisuika.catherine;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Catherine implements ClientModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("Catherine");

	@Override
	public void onInitializeClient() {
		LOGGER.info("Loading Catherine!");
	}
}
