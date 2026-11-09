package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05255 extends class01219 {
   private static final Logger L = LogUtils.getLogger();
   public static final MapCodec<class05255> N = MapCodec.unit(() -> class05255.y);
   public static final class05255 y = new class05255();

   private class05255() {
      super();
   }

   @Nullable
   @Override
   public class01228 N(class05487 var1, class07209 var2, class07209 var3, class01228 var4, class01228 var5, class01233 var6) {
      if (!var5.y().N(class00869.sr) || class07529.x) {
         return var5;
      } else if (var5.L() == null) {
         L.warn("Jigsaw block at {} is missing nbt, will not replace", var2);
         return var5;
      } else {
         String s = var5.L().y("final_state", "minecraft:air");

         class00500 class00500;
         try {
            class00904 class00904 = class00892.N(var1.N_51(class04227.Z), s, true);
            class00500 = class00904.N();
         } catch (CommandSyntaxException commandsyntaxexception) {
            L.error("Failed to parse jigsaw replacement state '{}' at {}: {}", new Object[]{s, var2, commandsyntaxexception.getMessage()});
            return null;
         }

         return class00500.N(class00869.EK) ? null : new class01228(var5.N(), class00500, null);
      }
   }

   @Override
   protected class05235<?> N() {
      return class05235.B;
   }
}
