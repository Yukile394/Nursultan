package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01066 implements class01089 {
   static final Logger N = LogUtils.getLogger();
   protected final List<class01088> y = Lists.newArrayList();
   private final class01603 u;
   private final String i;

   @Override
   public Map<class01894, List<class01079>> L(String var1, Predicate<class01894> var2) {
      HashMap hashmap = Maps.newHashMap();

      for (class01088 class01088 : this.y) {
         N(class01088, hashmap);
         this.N(class01088, var1, var2, hashmap);
      }

      TreeMap treemap = Maps.newTreeMap();

      for (class01059 class01059 : hashmap.values()) {
         if (!class01059.L().isEmpty()) {
            ArrayList arraylist = new ArrayList();

            for (class01071 class01071 : class01059.L()) {
               class01622 class01622 = class01071.N();
               class03652 class03652x = class01059.u().get(class01622);
               class03652 class03652x = class03652x != null ? N(class03652x) : class03643.y;
               arraylist.add(N(class01622, class01059.N(), class01071.y(), class03652x));
            }

            treemap.put(class01059.N(), arraylist);
         }
      }

      return treemap;
   }

   private static class01894 M(class01894 var0) {
      String s = var0.N().substring(0, var0.N().length() - ".mcmeta".length());
      return var0.i(s);
   }

   public class01066(class01603 var1, String var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   @Override
   public Map<class01894, class01079> y(String var1, Predicate<class01894> var2) {
      HashMap hashmap = new HashMap();
      HashMap hashmap1 = new HashMap();
      int ix = this.y.size();

      for (int j = 0; j < ix; j++) {
         class01088 class01088 = this.y.get(j);
         class01088.N(hashmap.keySet());
         class01088.N(hashmap1.keySet());
         class01622 class01622 = class01088.y();
         if (class01622 != null) {
            int k = j;
            class01622.method_14408(this.u, this.i, var1, (var5x, var6x) -> {
               if (R(var5x)) {
                  if (var2.test(M(var5x))) {
                     hashmap1.put(var5x, new class01063(class01622, var6x, k));
                  }
               } else if (var2.test(var5x)) {
                  hashmap.put(var5x, new class01063(class01622, var6x, k));
               }
            });
         }
      }

      TreeMap treemap = Maps.newTreeMap();
      hashmap.forEach((var2x, var3x) -> {
         class01894 class01894 = y(var2x);
         class01063 class01063 = (class01063)hashmap1.get(class01894);
         class03652 class03652;
         if (class01063 != null && class01063.L() >= var3x.L()) {
            class03652 = N(class01063.y());
         } else {
            class03652 = class03643.y;
         }

         treemap.put(var2x, N(var3x.N(), var2x, var3x.y(), class03652));
      });
      return treemap;
   }

   private static class03643 y(class03652<InputStream> var0) throws IOException {
      class03643 class03643;
      try (InputStream inputstream = (InputStream)var0.get()) {
         class03643 = class03643.N(inputstream);
      }

      return class03643;
   }

   static class01894 y(class01894 var0) {
      return var0.i(var0.N() + ".mcmeta");
   }

   @Override
   public Stream<class01622> y() {
      return this.y.stream().map(var0 -> var0.y()).filter(Objects::nonNull);
   }

   public void N(class01622 var1, Predicate<class01894> var2) {
      this.N(var1.method_14409(), var1, var2);
   }

   public void N(class01622 var1) {
      this.N(var1.method_14409(), var1, null);
   }

   private static class03652<class03643> N(class03652<InputStream> var0) {
      return () -> y(var0);
   }

   private void N(String var1, @Nullable class01622 var2, @Nullable Predicate<class01894> var3) {
      this.y.add(new class01088(var1, var2, var3));
   }

   @Override
   public Set<String> N() {
      return ImmutableSet.of(this.i);
   }

   @Override
   public List<class01079> N(class01894 var1) {
      class01894 class01894 = y(var1);
      ArrayList arraylist = new ArrayList();
      boolean flag = false;
      String s = null;

      for (int ix = this.y.size() - 1; ix >= 0; ix--) {
         class01088 class01088 = this.y.get(ix);
         class01622 class01622 = class01088.y();
         if (class01622 != null) {
            class03652 class03652x = class01622.method_14405(this.u, var1);
            if (class03652x != null) {
               class03652 class03652x;
               if (flag) {
                  class03652x = class03643.y;
               } else {
                  class03652x = () -> {
                     class03652 class03652xx = class01622.method_14405(this.u, class01894);
                     return class03652xx != null ? y(class03652xx) : class03643.N;
                  };
               }

               arraylist.add(new class01079(class01622, class03652x, class03652x));
            }
         }

         if (class01088.N(var1)) {
            s = class01088.N();
            break;
         }

         if (class01088.N(class01894)) {
            flag = true;
         }
      }

      if (arraylist.isEmpty() && s != null) {
         N.warn("Resource {} not found, but was filtered by pack {}", var1, s);
      }

      return Lists.reverse(arraylist);
   }

   private static class03652<InputStream> N(class01894 var0, class01622 var1, class03652<InputStream> var2) {
      return N.isDebugEnabled() ? () -> new class01082((InputStream)var2.get(), var0, var1.method_14409()) : var2;
   }

   private static class01079 N(class01622 var0, class01894 var1, class03652<InputStream> var2, class03652<class03643> var3) {
      return new class01079(var0, N(var1, var0, var2), var3);
   }

   private void N(class01088 var1, String var2, Predicate<class01894> var3, Map<class01894, class01059> var4) {
      class01622 class01622 = var1.y();
      if (class01622 != null) {
         class01622.method_14408(this.u, this.i, var2, (var3x, var4x) -> {
            if (R(var3x)) {
               class01894 class01894 = M(var3x);
               if (!var3.test(class01894)) {
                  return;
               }

               var4.computeIfAbsent(class01894, class01059::new).u().put(class01622, var4x);
            } else {
               if (!var3.test(var3x)) {
                  return;
               }

               var4.computeIfAbsent(var3x, class01059::new).L().add(new class01071(class01622, var4x));
            }
         });
      }
   }

   private static void N(class01088 var0, Map<class01894, class01059> var1) {
      for (class01059 class01059 : var1.values()) {
         if (var0.N(class01059.N())) {
            class01059.L().clear();
         } else if (var0.N(class01059.y())) {
            class01059.u().clear();
         }
      }
   }

   public void N(String var1, Predicate<class01894> var2) {
      this.N(var1, null, var2);
   }

   private class03652<class03643> N(class01894 var1, int var2) {
      return () -> {
         class01894 class01894 = y(var1);

         for (int ix = this.y.size() - 1; ix >= var2; ix--) {
            class01088 class01088 = this.y.get(ix);
            class01622 class01622 = class01088.y();
            if (class01622 != null) {
               class03652 class03652 = class01622.method_14405(this.u, class01894);
               if (class03652 != null) {
                  return y(class03652);
               }
            }

            if (class01088.N(class01894)) {
               break;
            }
         }

         return class03643.N;
      };
   }

   @Override
   public Optional<class01079> method_14486(class01894 var1) {
      for (int ix = this.y.size() - 1; ix >= 0; ix--) {
         class01088 class01088 = this.y.get(ix);
         class01622 class01622 = class01088.y();
         if (class01622 != null) {
            class03652 class03652x = class01622.method_14405(this.u, var1);
            if (class03652x != null) {
               class03652 class03652x = this.N(var1, ix);
               return Optional.of(N(class01622, var1, class03652x, class03652x));
            }
         }

         if (class01088.N(var1)) {
            N.warn("Resource {} not found, but was filtered by pack {}", var1, class01088.N());
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean R(class01894 var0) {
      return var0.N().endsWith(".mcmeta");
   }
}
