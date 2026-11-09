package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import net.fabricmc.fabric.api.resource.v1.reloader.ResourceReloaderKeys.Server;
import net.fabricmc.fabric.impl.resource.FabricResourceReloader;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04478 extends class05703<class07151> implements FabricResourceReloader {
   private static final Logger N = LogUtils.getLogger();
   private Map<class01894, class03711> y = Map.of();
   private class07166 L = new class07166();
   private final class01929 u;
   private class01894 i;

   public class04478(class01929 var1) {
      super(var1, class07151.N, class04227.yK);
      this.u = var1;
   }

   public Collection<class03711> y() {
      return this.y.values();
   }

   protected void N(Map<class01894, class07151> var1, class01089 var2, class04643 var3) {
      Builder builder = ImmutableMap.builder();
      var1.forEach((var2x, var3x) -> {
         this.N(var2x, var3x);
         builder.put(var2x, new class03711(var2x, var3x));
      });
      this.y = builder.buildOrThrow();
      class07166 class07166 = new class07166();
      class07166.N(this.y.values());

      for (class03734 class03734 : class07166.y()) {
         if (class03734.y().y().L().isPresent()) {
            class07285.N(class03734);
         }
      }

      this.L = class07166;
   }

   @Nullable
   public class03711 N(class01894 var1) {
      return this.y.get(var1);
   }

   public class07166 N() {
      return this.L;
   }

   private void N(class01894 var1, class07151 var2) {
      class04482 class04482 = new class04482();
      var2.N(class04482, this.u);
      if (!class04482.N()) {
         N.warn("Found validation problems in advancement {}: \n{}", var1, class04482.y());
      }
   }

   public class01894 fabric$getId() {
      if (this.i == null) {
         if (this instanceof class06482) {
            this.i = Server.RECIPES;
         } else if (this instanceof class04478) {
            this.i = Server.ADVANCEMENTS;
         } else if (this instanceof class05961) {
            this.i = Server.FUNCTIONS;
         } else {
            this.i = class01894.y("private/" + this.getClass().getSimpleName().toLowerCase(Locale.ROOT));
         }
      }

      return this.i;
   }
}
