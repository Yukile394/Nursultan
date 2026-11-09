package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;

public class class01732 extends class02840<class08583, class08426, class01098> {
   private final Map<class08438, class08637<class01098>> N;

   public class01732(class04832 var1) {
      super(var1, new class01098(var1.N(class04802.Nv)), 0.7F);
      this.N = N(var1);
   }

   public class08426 method_55269() {
      return new class08426();
   }

   public void method_3936(class08426 var1, class01421 var2, class01237 var3, class06959 var4) {
      if (var1.N != null) {
         this.y = this.N.get(var1.N.y().N()).N(var1.NB);
         super.method_3936(var1, var2, var3, var4);
      }
   }

   private static Map<class08438, class08637<class01098>> N(class04832 var0) {
      return Maps.newEnumMap(
         Map.of(
            class08438.field_56429,
            new class08637<>(new class01098(var0.N(class04802.Nv)), new class01098(var0.N(class04802.Nn))),
            class08438.field_56431,
            new class08637<>(new class01098(var0.N(class04802.iM)), new class01098(var0.N(class04802.iB))),
            class08438.field_56430,
            new class08637<>(new class01098(var0.N(class04802.Ni)), new class01098(var0.N(class04802.NR)))
         )
      );
   }

   public class01894 N(class08426 var1) {
      return var1.N == null ? class08923.L() : var1.N.y().y().y();
   }

   public void method_62354(class08583 var1, class08426 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.N().N();
   }
}
