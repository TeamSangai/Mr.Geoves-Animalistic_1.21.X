package net.mrgeoves.mrgeovesanimalistic;

import net.fabricmc.api.ModInitializer;

import net.mrgeoves.mrgeovesanimalistic.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MrGeovesAnimalistic implements ModInitializer {
	public static final String MOD_ID = "mrgeovesanimalistic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}