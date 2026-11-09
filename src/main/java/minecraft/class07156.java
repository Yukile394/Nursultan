package minecraft;

import java.util.function.IntFunction;

public enum class07156 {
   field_7377(0, 0.0, 0.0, 0.0),
   field_7379(1, 0.7, 0.7, 0.8),
   field_7380(2, 0.4, 0.3, 0.35),
   field_7381(3, 0.7, 0.5, 0.2),
   field_7382(4, 0.3, 0.3, 0.8),
   field_7378(5, 0.1, 0.1, 0.2);

   private static final IntFunction<class07156> field_41674 = class02121.N(var0 -> var0.field_7375, values(), class02126.field_41664);
   final int field_7375;
   final double[] field_7374;

   private class07156(int var3, double var4, double var6, double var8) {
      this.field_7375 = var3;
      this.field_7374 = new double[]{var4, var6, var8};
   }

   public static class07156 N(int var0) {
      return field_41674.apply(var0);
   }
}
