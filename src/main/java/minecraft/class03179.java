package minecraft;

import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2BooleanMap;
import it.unimi.dsi.fastutil.longs.Long2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03179 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = -1;
   private final class03190 L;
   private final class01042 u;
   private final class01224 i;
   private final class05946<class07299> R;
   private final class08088 M;
   private final class04084 B;
   private final class05474 Z;
   private final class00765 z;
   private final long U;
   private final DataFixer E;
   private final Long2ObjectMap<Object2IntMap<class04748>> W = new Long2ObjectOpenHashMap();
   private final Map<class04748, Long2BooleanMap> m = new HashMap<>();

   public class03179(
      class03190 var1,
      class01042 var2,
      class01224 var3,
      class05946<class07299> var4,
      class08088 var5,
      class04084 var6,
      class05474 var7,
      class00765 var8,
      long var9,
      DataFixer var11
   ) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
      this.M = var5;
      this.B = var6;
      this.Z = var7;
      this.z = var8;
      this.U = var9;
      this.E = var11;
   }

   private boolean y(class07321 var1, class04748 var2) {
      return var2.y(new class04764(this.u, this.M, this.z, this.B, this.i, this.U, var1, this.Z, var2.y()::N)).isPresent();
   }

   private class03167 N(Object2IntMap<class04748> var1, class04748 var2, boolean var3) {
      int ix = var1.getOrDefault(var2, -1);
      return ix == -1 || var3 && ix != 0 ? class03167.field_36240 : class03167.field_36239;
   }

   private static Object2IntMap<class04748> N(Object2IntMap<class04748> var0) {
      return var0.isEmpty() ? Object2IntMaps.emptyMap() : var0;
   }

   @Nullable
   private Object2IntMap<class04748> N(class07001 var1) {
      Optional optional = var1.W("structures").flatMap(var0 -> var0.W("starts"));
      if (optional.isEmpty()) {
         return null;
      } else {
         class07001 class07001 = (class07001)optional.get();
         if (class07001.z()) {
            return Object2IntMaps.emptyMap();
         } else {
            Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();
            class00751 class00751 = this.u.L(class04227.yj);
            class07001.N((BiConsumer<String, class07709>)((var2x, var3x) -> {
               class01894 class01894 = class01894.L(var2x);
               if (class01894 != null) {
                  class04748 class04748 = (class04748)class00751.N(class01894);
                  if (class04748 != null) {
                     var3x.ak_().ifPresent(var2xx -> {
                        String s = var2xx.y("id", "");
                        if (!"INVALID".equals(s)) {
                           int ix = var2xx.y("references", 0);
                           object2intopenhashmap.put(class04748, ix);
                        }
                     });
                  }
               }
            }));
            return object2intopenhashmap;
         }
      }
   }

   @Nullable
   private class03167 N(class07321 var1, class04748 var2, boolean var3, long var4) {
      class03164 class03164 = new class03164(
         new class03152(class07720.N, "DataVersion"),
         new class03152("Level", "Structures", class07001.y, "Starts"),
         new class03152("structures", class07001.y, "starts")
      );

      try {
         this.L.N(var1, class03164).join();
      } catch (Exception exception1) {
         N.warn("Failed to read chunk {}", var1, exception1);
         return class03167.field_36241;
      }

      if (!(class03164.u() instanceof class07001 class07001x)) {
         return null;
      } else {
         int ix = class07717.R(class07001x);
         if (ix <= 1493) {
            return class03167.field_36241;
         } else {
            class06172.N(class07001x, class06265.N(this.R, this.M.L()));

            class07001 class07001;
            try {
               class07001 = class05715.field_19214.N(this.E, class07001x, ix);
            } catch (Exception exception) {
               N.warn("Failed to partially datafix chunk {}", var1, exception);
               return class03167.field_36241;
            }

            Object2IntMap<class04748> object2intmap = this.N(class07001);
            if (object2intmap == null) {
               return null;
            } else {
               this.N(var4, object2intmap);
               return this.N(object2intmap, var2, var3);
            }
         }
      }
   }

   public class03167 N(class07321 var1, class04748 var2, class03532 var3, boolean var4) {
      long ix = var1.y();
      Object2IntMap<class04748> object2intmap = (Object2IntMap<class04748>)this.W.get(ix);
      if (object2intmap != null) {
         return this.N(object2intmap, var2, var4);
      } else {
         class03167 class03167 = this.N(var1, var2, var4, ix);
         if (class03167 != null) {
            return class03167;
         } else if (!var3.N(var1.B, var1.Z, this.U)) {
            return class03167.field_36240;
         } else {
            return !this.m.computeIfAbsent(var2, var0 -> new Long2BooleanOpenHashMap()).computeIfAbsent(ix, var3x -> this.y(var1, var2))
               ? class03167.field_36240
               : class03167.field_36241;
         }
      }
   }

   public void N(class07321 var1, class04748 var2) {
      this.W.compute(var1.y(), (var1x, var2x) -> {
         if (var2x == null || var2x.isEmpty()) {
            var2x = new Object2IntOpenHashMap();
         }

         var2x.computeInt(var2, (var0x, var1xx) -> var1xx == null ? 1 : var1xx + 1);
         return var2x;
      });
   }

   private void N(long var1, Object2IntMap<class04748> var3) {
      this.W.put(var1, N(var3));
      this.m.values().forEach(var2 -> var2.remove(var1));
   }

   public void N(class07321 var1, Map<class04748, class04932> var2) {
      long ix = var1.y();
      Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();
      var2.forEach((var1x, var2x) -> {
         if (var2x.y()) {
            object2intopenhashmap.put(var1x, var2x.R());
         }
      });
      this.N(ix, object2intopenhashmap);
   }
}
