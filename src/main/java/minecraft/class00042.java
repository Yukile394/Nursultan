package minecraft;

import java.util.Optional;

public interface class00042 extends class00001 {
   int E = 332;

   boolean method_70674();

   static boolean y(class07438 var0, class04770 var1) {
      return var0.method_5739(var1) > 332.0F;
   }

   static boolean N(class07438 var0, class04770 var1) {
      if (var1.method_7325()) {
         return false;
      } else if (!var0.method_7325() && !var0.method_5821(var1)) {
         double d0 = Math.min(var0.method_45325(class05298.q), var1.method_45325(class05298.K));
         return var0.method_5739(var1) >= d0;
      } else {
         return true;
      }
   }

   static boolean N(class07321 var0, class04770 var1) {
      return var1.method_52372().y(var0.B, var0.Z);
   }

   Optional<class00038> method_70672(class04770 var1);

   class00028 method_70675();
}
