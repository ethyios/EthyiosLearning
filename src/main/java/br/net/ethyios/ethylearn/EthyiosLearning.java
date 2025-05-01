package br.net.ethyios.ethylearn;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EthyiosLearning implements ModInitializer {
	public static final String MOD_ID = "ethylearn";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing EthyiosLearning!");
	}
}