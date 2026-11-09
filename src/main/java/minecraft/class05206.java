package minecraft;

import java.util.List;

public class class05206 extends class05222 {
   private final class06366<Boolean> y;

   public class05206(class00392 var1, List<class01028> var2, String var3, class06839<Boolean> var4, class06839 var5) {
      super(var1, var3, var2);
      this.N = var1;
      this.y = class06366.N(var1.y.<Boolean>N(var5).booleanValue())
         .N()
         .N_57(var1x -> var1x.L().i("\n").i(var4))
         .N(10, 5, 44, 20, var2, (var2x, var3x) -> this.N.y.N(var5, var3x, null));
      this.field_25630.add(this.y);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      this.method_29989(var1, this.method_73382(), this.method_73380());
      this.y.method_46421(this.method_73389() - 45);
      this.y.method_46419(this.method_73382());
      this.y.method_25394(var1, var2, var3, var5);
   }
}
