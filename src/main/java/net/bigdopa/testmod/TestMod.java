package net.bigdopa.testmod;

import net.bigdopa.testmod.blocks.ModBlock;
import net.bigdopa.testmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItems.regsiterModItems();
		ModBlock.registerModBlock();
	}
}
