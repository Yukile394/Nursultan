package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.fabricmc.fabric.impl.resource.FabricLifecycledResourceManager;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03545 implements class03554, FabricLifecycledResourceManager {
   private static final Logger N = LogUtils.getLogger();
   private final Map<String, class01066> y;
   private final List<class01622> u;
   private class01603 i;

   @Override
   public Map<class01894, List<class01079>> L(String var1, Predicate<class01894> var2) {
      N(var1);
      TreeMap treemap = new TreeMap();

      for (class01066 class01066 : this.y.values()) {
         treemap.putAll(class01066.L(var1, var2));
      }

      return treemap;
   }

   public class03545(class01603 var1, List<class01622> var2) {
      super();
      this.u = List.copyOf(var2);
      HashMap hashmap = new HashMap();
      List list = var2.stream().flatMap(var1x -> var1x.method_14406(var1).stream()).distinct().toList();

      for (class01622 class01622 : var2) {
         class04414 class04414 = this.N(class01622);
         Set<String> set = class01622.method_14406(var1);
         Predicate predicate = class04414 != null ? var1x -> class04414.y(var1x.N()) : null;

         for (String s : list) {
            boolean flag = set.contains(s);
            boolean flag1 = class04414 != null && class04414.N(s);
            if (flag || flag1) {
               class01066 class01066 = (class01066)hashmap.get(s);
               if (class01066 == null) {
                  class01066 = new class01066(var1, s);
                  hashmap.put(s, class01066);
               }

               if (flag && flag1) {
                  class01066.N(class01622, predicate);
               } else if (flag) {
                  class01066.N(class01622);
               } else {
                  class01066.N(class01622.method_14409(), predicate);
               }
            }
         }
      }

      this.y = hashmap;
      this.N(var1, var2, null);
   }

   @Override
   public void close() {
      this.u.forEach(class01622::close);
   }

   @Override
   public Map<class01894, class01079> y(String var1, Predicate<class01894> var2) {
      N(var1);
      TreeMap treemap = new TreeMap();

      for (class01066 class01066 : this.y.values()) {
         treemap.putAll(class01066.y(var1, var2));
      }

      return treemap;
   }

   @Override
   public Stream<class01622> y() {
      return this.u.stream();
   }

   private void N(class01603 var1, List var2, CallbackInfo var3) {
      this.i = var1;
   }

   @Nullable
   private class04414 N(class01622 var1) {
      try {
         return var1.method_14407(class04414.N);
      } catch (IOException ioexception) {
         N.error("Failed to get filter section from pack {}", var1.method_14409());
         return null;
      }
   }

   @Override
   public Set<String> N() {
      return this.y.keySet();
   }

   private static void N(String var0) {
      if (var0.endsWith("/")) {
         throw new IllegalArgumentException("Trailing slash in path " + var0);
      }
   }

   @Override
   public List<class01079> N(class01894 var1) {
      class01089 class01089 = this.y.get(var1.y());
      return class01089 != null ? class01089.N(var1) : List.of();
   }

   @Override
   public Optional<class01079> method_14486(class01894 var1) {
      class01089 class01089 = this.y.get(var1.y());
      return class01089 != null ? class01089.method_14486(var1) : Optional.empty();
   }

   public class01603 fabric$getResourceType() {
      return this.i;
   }
}
