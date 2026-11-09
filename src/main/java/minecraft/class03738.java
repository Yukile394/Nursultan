package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;

public class class03738 extends class02840<class07628, class08794, class01105> {
   private final Map<class08435, class08637<class01105>> N;

   public class03738(class04832 var1) {
      super(var1, new class01105(var1.N(class04802.r)), 0.3F);
      this.N = N(var1);
   }

   public class08794 method_55269() {
      return new class08794();
   }

   public void method_62354(class07628 var1, class08794 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = class04995.B(var3, var1.u, var1.N);
      var2.y = class04995.B(var3, var1.L, var1.y);
      var2.L = var1.W().N();
   }

   private static Map<class08435, class08637<class01105>> N(class04832 var0) {
      return Maps.newEnumMap(
         Map.of(
            class08435.field_56542,
            new class08637<>(new class01105(var0.N(class04802.r)), new class01105(var0.N(class04802.NN))),
            class08435.field_56543,
            new class08637<>(new class08424(var0.N(class04802.NL)), new class08424(var0.N(class04802.Nu)))
         )
      );
   }

   public void method_3936(class08794 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.L != null) {
         this.y = this.N.get(var1.L.y().N()).N(var1.NB);
         super.method_3936(var1, var2, var3, var4);
      }
   }

   public class01894 N(class08794 var1) {
      return var1.L == null ? class08923.L() : var1.L.y().y().y();
   }
}
