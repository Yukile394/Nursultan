package minecraft;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class class05570 extends class02795<class05538, class08788, class05562> {
   private static final Map<class05541, class01894> N = class07536.N(Maps.newHashMap(), var0 -> {
      for (class05541 class05541 : class05541.values()) {
         var0.put(class05541, class01894.y(String.format(Locale.ROOT, "textures/entity/axolotl/axolotl_%s.png", class05541.y())));
      }
   });

   public class05570(class04832 var1) {
      super(var1, new class05562(var1.N(class04802.U)), new class05562(var1.N(class04802.E)), 0.5F);
   }

   public class08788 method_55269() {
      return new class08788();
   }

   public class01894 N(class08788 var1) {
      return N.get(var1.N);
   }

   public void method_62354(class05538 var1, class08788 var2, float var3) {
      super.method_62354(var1, var2, var3);
      var2.N = var1.m();
      var2.y = var1.M.N(var3);
      var2.u = var1.B.N(var3);
      var2.i = var1.Z.N(var3);
      var2.L = var1.X.N(var3);
   }
}
