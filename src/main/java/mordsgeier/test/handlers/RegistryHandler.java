package mordsgeier.test.handlers;

import mordsgeier.test.init.BlockInit;
import mordsgeier.test.init.ItemInit;

public class RegistryHandler {
	
	public static void Client() {
			
	}

	public static void Common() {
		
		ItemInit.init();
		ItemInit.register();
		
		BlockInit.init();
		BlockInit.register();
		
	}
	
}
