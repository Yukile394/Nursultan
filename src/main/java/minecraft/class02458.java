package minecraft;

import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class class02458 extends class02616 {
   public class02458(Codec<class02256> var1) {
      super(var1);
   }

   @Override
   protected boolean N(class05974 var1, class02256 var2, class08088 var3, class06069 var4, class07209 var5) {
      if (super.N(var1, var2, var3, var4, var5.method_10074())) {
         class00500 class00500 = var1.method_8320(var5);
         if (class00500.y(class06665.q) && !class00500.L(class06665.q)) {
            var1.method_8652(var5, class00500.y(class06665.q, true), 2);
         }

         return true;
      } else {
         return false;
      }
   }

   private static boolean N(class05974 var0, class07209 var1, class07218 var2, class07211 var3) {
      var2.N(var1, var3);
      return !var0.method_8320(var2).L(var0, var2, var3.b());
   }

   private static boolean N(class05974 var0, Set<class07209> var1, class07209 var2, class07218 var3) {
      return N(var0, var2, var3, class07211.field_11043)
         || N(var0, var2, var3, class07211.field_11034)
         || N(var0, var2, var3, class07211.field_11035)
         || N(var0, var2, var3, class07211.field_11039)
         || N(var0, var2, var3, class07211.field_11033);
   }

   @Override
   protected Set<class07209> N(class05974 var1, class02256 var2, class06069 var3, class07209 var4, Predicate<class00500> var5, int var6, int var7) {
      Set<class07209> set = super.N(var1, var2, var3, var4, var5, var6, var7);
      HashSet hashset = new HashSet();
      class07218 class07218 = new class07218();

      for (class07209 class07209x : set) {
         if (!N(var1, set, class07209x, class07218)) {
            hashset.add(class07209x);
         }
      }

      for (class07209 class07209x : hashset) {
         var1.method_8652(class07209x, class00869.K.W(), 2);
      }

      return hashset;
   }
}
