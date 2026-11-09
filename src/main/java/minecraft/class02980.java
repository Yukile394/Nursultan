package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public abstract class class02980 implements class01057 {
   private static Logger N = LogUtils.getLogger();
   public static final String y = "vanilla";
   public static final String L = "tests";
   public static final class02298 u = class02298.N("core");
   private final class01603 i;
   private final class01611 R;
   private final class01894 M;
   private final class04173 B;

   public class01611 L() {
      return this.R;
   }

   public class02980(class01603 var1, class01611 var2, class01894 var3, class04173 var4) {
      super();
      this.i = var1;
      this.R = var2;
      this.M = var3;
      this.B = var4;
   }

   protected static class01061 y(class01622 var0) {
      return new class02962(var0);
   }

   @Nullable
   protected abstract class01055 N(String var1, class01061 var2, class00392 var3);

   private void N(Consumer var1, CallbackInfo var2) {
      if (this instanceof class00190) {
         ModResourcePackCreator.CLIENT_RESOURCE_PACK_PROVIDER.method_14453(var1);
      }
   }

   @Nullable
   protected abstract class01055 N(class01622 var1);

   protected abstract class00392 N(String var1);

   private void N(Consumer<class01055> var1) {
      HashMap hashmap = new HashMap();
      this.N(hashmap::put);
      hashmap.forEach((var1x, var2x) -> {
         class01055 class01055 = (class01055)var2x.apply(var1x);
         if (class01055 != null) {
            var1.accept(class01055);
         }
      });
   }

   private static String N(Path var0) {
      return StringUtils.removeEnd(var0.getFileName().toString(), ".zip");
   }

   protected void N(@Nullable Path var1, BiConsumer<String, Function<String, class01055>> var2) {
      if (var1 != null && Files.isDirectory(var1)) {
         try {
            class01626.N(var1, this.B, (var2x, var3) -> var2.accept(N(var2x), (Function<String, >)var2xx -> this.N(var2xx, var3, this.N(var2xx))));
         } catch (IOException ioexception) {
            N.warn("Failed to discover packs in {}", var1, ioexception);
         }
      }
   }

   protected void N(BiConsumer<String, Function<String, class01055>> var1) {
      this.R.N(this.i, this.M, var2 -> this.N(var2, var1));
   }

   @Override
   public void method_14453(Consumer<class01055> var1) {
      class01055 class01055 = this.N(this.R);
      if (class01055 != null) {
         var1.accept(class01055);
      }

      this.N(var1);
      this.N(var1, null);
   }
}
