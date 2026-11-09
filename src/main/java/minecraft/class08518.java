package minecraft;

import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class class08518 extends class06391<class08531> {
   private static final int NE = 1;
   private static final int NW = 2;
   private static final int Nm = 5;
   private static final int NP = 2;
   private static final int Ns = 2;

   public class08518(Codec<class08531> var1) {
      super(var1);
   }

   private boolean y(class07284 var1, class07209 var2) {
      return var1.method_8320(var2.method_10074()).L(var1, var2, class07211.field_11036);
   }

   private static Function<class00500, class00500> N(class07211 var0) {
      return var1 -> var1.L(class07004.L, var0.z());
   }

   private BiConsumer<class07209, class00500> N(class05974 var1) {
      return (var1x, var2) -> var1.method_8652(var1x, var2, 19);
   }

   private void N(class05974 var1, class06069 var2, Set<class07209> var3, List<class01474> var4) {
      if (!var4.isEmpty()) {
         class05894 class05894 = new class05894(var1, this.N(var1), var2, var3, Set.of(), Set.of());
         var4.forEach(var1x -> var1x.N(class05894));
      }
   }

   private class07209 N(class08531 var1, class05974 var2, class06069 var3, class07218 var4, Function<class00500, class00500> var5) {
      var2.method_8652(var4, (class00500)var5.apply(var1.y.N(var3, var4)), 3);
      this.N_59(var2, var4);
      return var4.method_10062();
   }

   private boolean N(class05974 var1, int var2, class07218 var3, class07211 var4) {
      int i = 0;

      for (int j = 0; j < var2; j++) {
         if (!class03194.L(var1, var3)) {
            return false;
         }

         if (!this.y(var1, var3)) {
            if (++i > 2) {
               return false;
            }
         } else {
            i = 0;
         }

         var3.N(var4);
      }

      var3.N(var4.b(), var2);
      return true;
   }

   private void N(class08531 var1, class05974 var2, class06069 var3, class07218 var4) {
      class07209 class07209 = this.N(var1, var2, var3, var4, Function.identity());
      this.N(var2, var3, Set.of(class07209), var1.u);
   }

   private void N(class05974 var1, class07218 var2) {
      var2.N(class07211.field_11036, 1);

      for (int i = 0; i < 6; i++) {
         if (this.N((class07284)var1, (class07209)var2)) {
            return;
         }

         var2.N(class07211.field_11033);
      }
   }

   private void N(class08531 var1, class07209 var2, class05974 var3, class06069 var4) {
      this.N(var1, var3, var4, var2.method_25503());
      class07211 class07211 = class07221.field_11062.N(var4);
      int i = var1.L.N(var4) - 2;
      class07218 class07218 = var2.method_10079(class07211, 2 + var4.y(2)).method_25503();
      this.N(var3, class07218);
      if (this.N(var3, i, class07218, class07211)) {
         this.N(var1, var3, var4, i, class07218, class07211);
      }
   }

   private void N(class08531 var1, class05974 var2, class06069 var3, int var4, class07218 var5, class07211 var6) {
      HashSet hashset = new HashSet();

      for (int i = 0; i < var4; i++) {
         hashset.add(this.N(var1, var2, var3, var5, N(var6)));
         var5.N(var6);
      }

      this.N(var2, var3, hashset, var1.i);
   }

   private boolean N(class07284 var1, class07209 var2) {
      return class03194.L(var1, var2) && this.y(var1, var2);
   }

   @Override
   public boolean N(class06058<class08531> var1) {
      this.N((class08531)var1.R(), var1.i(), var1.y(), var1.u());
      return true;
   }
}
