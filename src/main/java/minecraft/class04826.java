package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.BlockEntityRendererRegistryImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class04826 {
   private static final Map<class00404<?>, class04795<?, ?>> N = Maps.newHashMap();

   public class04826() {
      super();
   }

   static {
      N(class00404.field_11911, class03341::new);
      N(class00404.field_40330, class02030::new);
      N(class00404.field_11889, class03333::new);
      N(class00404.field_11897, var0 -> new class03370());
      N(class00404.field_11914, class03343::new);
      N(class00404.field_11901, class03343::new);
      N(class00404.field_11891, class03343::new);
      N(class00404.field_11912, class03369::new);
      N(class00404.field_16412, class05842::new);
      N(class00404.field_11898, var0 -> new class00995());
      N(class00404.field_11906, var0 -> new class03363());
      N(class00404.field_11890, var0 -> new class03575());
      N(class00404.field_11913, class03359::new);
      N(class00404.field_11905, class03571::new);
      N(class00404.field_11895, var0 -> new class03356());
      N(class00404.field_55993, var0 -> new class00205());
      N(class00404.field_11896, class03360::new);
      N(class00404.field_11910, class03357::new);
      N(class00404.field_11902, class03362::new);
      N(class00404.field_16413, class06245::new);
      N(class00404.field_17380, class05841::new);
      N(class00404.field_42780, class03611::new);
      N(class00404.field_42781, class03574::new);
      N(class00404.field_47352, class01761::new);
      N(class00404.field_48859, class02305::new);
      N(class00404.field_61438, class08116::new);
      N(class00404.field_61437, class08101::new);
   }

   public static <T extends class00394, S extends class00985> void N(class00404<? extends T> var0, class04795<T, S> var1) {
      N.put(var0, var1);
   }

   public static Map<class00404<?>, class03358<?, ?>> N(class04811 var0) {
      Builder builder = ImmutableMap.builder();
      N.forEach((var2, var3) -> {
         try {
            builder.put(var2, var3.create(var0));
         } catch (Exception exception) {
            throw new IllegalStateException("Failed to create model for " + class04206.U.y((class00404<?>)var2), exception);
         }
      });
      return builder.build();
   }

   private static void N(CallbackInfo var0) {
      BlockEntityRendererRegistryImpl.setup((var0x, var1) -> N.put(var0x, var1));
   }
}
