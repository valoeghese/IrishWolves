package tk.valoeghese.irishwolves;

import org.apache.logging.log4j.Logger;

import java.util.Random;

import org.apache.logging.log4j.LogManager;

import net.fabricmc.api.ModInitializer;

public class IrishWolves implements ModInitializer {
	
	public static final Logger modLog = LogManager.getLogger("IrishWolves");
	
	@Override
	public void onInitialize() {
		int num = new Random().nextInt(6000);
		modLog.info("[Wolf #" + String.valueOf(num) + "] Top of the mornin to ya!");
	}

}
