package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;

public class class02693 extends class02840<class07627, class08470, class06032> {
   private final Map<class08603, class08637<class06032>> N;

   public class02693(class04832 var1) {
      super(var1, new class06032(var1.N(class04802.Lj)), 0.7F);
      this.N = N(var1);
      this.N(
         new class00207<>(this, var1.B(), class08719.field_56123, var0 -> var0.N, new class06032(var1.N(class04802.LQ)), new class06032(var1.N(class04802.LY)))
      );
   }

   public class08470 method_55269() {
      return new class08470();
   }

   private static Map<class08603, class08637<class06032>> N(class04832 var0) {
      return Maps.newEnumMap(
         Map.of(
            class08603.field_55688,
            new class08637<>(new class06032(var0.N(class04802.Lj)), new class06032(var0.N(class04802.Lk))),
            class08603.field_55689,
            new class08637<>(new class08598(var0.N(class04802.NM)), new class08598(var0.N(class04802.NB)))
         )
      );
   }

   public class01894 N(class08470 var1) {
      return var1.y == null ? class08923.L() : var1.y.y().y().y();
   }

   public void method_3936(class08470 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.y != null) {
         this.y = this.N.get(var1.y.y().N()).N(var1.NB);
         super.method_3936(var1, var2, var3, var4);
      }
   }

   public void method_62354(class07627 var1, class08470 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.method_6118(class07085.field_55946).t();
      var2.y = var1.m().N();
   }
}
