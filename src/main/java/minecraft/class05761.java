package minecraft;

public class class05761 {
   private static final float N = 0.3F;

   public class05761() {
      super();
   }

   public static class04119<class07438> N() {
      return class04137.N_42(
         var0 -> var0.group(var0.N(class05378.m), var0.N(class05378.P), var0.y(class05378.i), var0.y(class05378.B), var0.L(class05378.b))
            .apply(
               var0,
               (var1, var2, var3, var4, var5) -> (var6, var7, var8) -> {
                  class06289 class06289 = var0.y(var3);
                  class04051 class04051 = var0.y(var4);
                  if (var6.method_8409().y(100) == 0
                     && var6.method_27983() == class06289.N()
                     && class06289.y().method_19769(var7.method_73189(), 4.0)
                     && class04051.u(var0xxx -> class07078.ye.equals(var0xxx.method_5864()))) {
                     class04051.N(var1xx -> class07078.ye.equals(var1xx.method_5864()) && var1xx.method_5858(var7) <= 32.0).ifPresent(var3xx -> {
                        var5.N(var3xx);
                        var2.N(new class05751(var3xx, true));
                        var1.N(new class05352(new class05751(var3xx, false), 0.3F, 1));
                     });
                     return true;
                  } else {
                     return false;
                  }
               }
            )
      );
   }
}
