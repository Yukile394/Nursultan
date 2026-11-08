package nursultan;

import net.fabricmc.api.ClientModInitializer;

public class NursultanModInit implements ClientModInitializer {
   public NursultanModInit() {
      super();
   }

   public void onInitializeClient() {
      System.out.println("[NursultanMod] Initializing Nursultan Client Mod (Fabric)...");

      try {
         try {
            Class<?> oclass = Class.forName("Nursultan.class09948");
            oclass.getMethod("N").invoke(null);
            System.out.println("[NursultanMod] Nursultan Remapper initialized successfully.");
         } catch (Throwable throwable1) {
            System.out.println("[NursultanMod] Remapper init: " + throwable1.getMessage());
         }

         try {
            Class<?> oclass1 = Class.forName("Nursultan.class11938");
            oclass1.getMethod("l").invoke(null);
            System.out.println("[NursultanMod] Nursultan Core engine initialized successfully.");
         } catch (Throwable throwable) {
            System.out.println("[NursultanMod] Core engine init: " + throwable.getMessage());
         }

         System.out.println("[NursultanMod] Nursultan Mod Ready!");
      } catch (Throwable throwable2) {
         System.err.println("[NursultanMod] Error during Nursultan initialization: " + throwable2.getMessage());
         throwable2.printStackTrace();
      }
   }
}
