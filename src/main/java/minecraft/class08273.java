package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectFunction;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import org.slf4j.Logger;

public class class08273 {
   private static final Logger N = LogUtils.getLogger();
   private final Object2ObjectMap<class01894, class08250> y = new Object2ObjectOpenHashMap();
   private final class08250 L;
   private final Object2ObjectFunction<class01894, class08250> u;
   private final class08350 i;
   private final Queue<class08250> R = new ArrayDeque<>();

   public class08273(Map<class01894, class00167> var1, class00167 var2) {
      super();
      this.L = new class08250(class08256.N, var2, true);
      this.y.put(class08256.N, this.L);
      this.u = var2x -> {
         class01894 class01894 = (class01894)var2x;
         class00167 class00167 = (class00167)var1.get(class01894);
         if (class00167 == null) {
            N.warn("Missing block model: {}", class01894);
            return this.L;
         } else {
            return this.y(class01894, class00167);
         }
      };
      this.i = this::N;
   }

   private static void y(List<class08250> var0) {
      boolean flag = true;

      while (flag) {
         flag = false;
         Iterator iterator = var0.iterator();

         while (iterator.hasNext()) {
            class08250 class08250 = (class08250)iterator.next();
            if (Objects.requireNonNull(class08250.y).N) {
               class08250.N = true;
               iterator.remove();
               flag = true;
            }
         }
      }
   }

   private class08250 y(class01894 var1, class00167 var2) {
      boolean flag = N(var2);
      class08250 class08250 = new class08250(var1, var2, flag);
      if (!flag) {
         this.R.add(class08250);
      }

      return class08250;
   }

   public Map<class01894, class08529> y() {
      ArrayList arraylist = new ArrayList();
      this.N(arraylist);
      y(arraylist);
      Builder builder = ImmutableMap.builder();
      this.y.forEach((var1x, var2x) -> {
         if (var2x.N) {
            builder.put(var1x, var2x);
         } else {
            N.warn("Model {} ignored due to cyclic dependency", var1x);
         }
      });
      return builder.build();
   }

   private void N(List<class08250> var1) {
      class08250 class08250x;
      while ((class08250x = this.R.poll()) != null) {
         class01894 class01894 = Objects.requireNonNull(class08250x.L.comp_3744());
         class08250 class08250x = this.N(class01894);
         class08250x.y = class08250x;
         if (class08250x.N) {
            class08250x.N = true;
         } else {
            var1.add(class08250x);
         }
      }
   }

   public class08529 N() {
      return this.L;
   }

   public void N(class08389 var1) {
      var1.method_62326(this.i);
   }

   public void N(class01894 var1, class00167 var2) {
      if (!N(var2)) {
         N.warn("Trying to add non-root special model {}, ignoring", var1);
      } else {
         if ((class08250)this.y.put(var1, this.y(var1, var2)) != null) {
            N.warn("Duplicate special model {}", var1);
         }
      }
   }

   private static boolean N(class00167 var0) {
      return var0.comp_3744() == null;
   }

   private class08250 N(class01894 var1) {
      return (class08250)this.y.computeIfAbsent(var1, this.u);
   }
}
