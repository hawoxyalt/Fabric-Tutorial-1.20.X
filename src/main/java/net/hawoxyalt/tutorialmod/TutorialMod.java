package net.hawoxyalt.tutorialmod;

import com.sun.jna.platform.win32.NTSecApi;
import net.fabricmc.api.ModInitializer;

import net.hawoxyalt.tutorialmod.item.ModItemGroups;
import net.hawoxyalt.tutorialmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}