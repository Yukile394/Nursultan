package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public class class08170 extends class06555 {
   private static final Codec<class08170> y = Codec.unboundedMap(class01894.N, Codec.LONG).fieldOf("stopwatches").codec().xmap(class08170::N, class08170::L);
   public static final class08413<class08170> N = new class08413<>("stopwatches", class08170::new, y, class05715.field_63265);
   private final Map<class01894, class08192> L = new Object2ObjectOpenHashMap();

   private Map<class01894, Long> L() {
      long i = y();
      TreeMap treemap = new TreeMap();
      this.L.forEach((var3x, var4) -> treemap.put(var3x, var4.N(i)));
      return treemap;
   }

   private class08170() {
      super();
   }

   public static long y() {
      return class07536.L();
   }

   public boolean y(class01894 var1) {
      boolean flag = this.L.remove(var1) != null;
      if (flag) {
         this.method_80();
      }

      return flag;
   }

   public List<class01894> N() {
      return List.copyOf(this.L.keySet());
   }

   @Nullable
   public class08192 N(class01894 var1) {
      return this.L.get(var1);
   }

   public boolean N(class01894 var1, class08192 var2) {
      if (this.L.putIfAbsent(var1, var2) == null) {
         this.method_80();
         return true;
      } else {
         return false;
      }
   }

   public boolean N(class01894 var1, UnaryOperator<class08192> var2) {
      if (this.L.computeIfPresent(var1, (var1x, var2x) -> (class08192)var2.apply(var2x)) != null) {
         this.method_80();
         return true;
      } else {
         return false;
      }
   }

   private static class08170 N(Map<class01894, Long> var0) {
      class08170 class08170 = new class08170();
      long i = y();
      var0.forEach((var3, var4) -> class08170.L.put(var3, new class08192(i, var4)));
      return class08170;
   }

   @Override
   public boolean method_79() {
      return super.method_79() || !this.L.isEmpty();
   }
}
