package minecraft;

public final class class03867 {
   private static final float N = 0.4F;
   private static final int y = 20;
   private static final double L = 0.2;
   private static final float u = 0.7F;
   private static final float i = 0.1F;
   private static final float R = 0.3F;
   private static final float M = 0.6F;
   private static final float B = 0.02F;
   private static final float Z = -0.3F;

   private class03867() {
      super();
   }

   protected static class01828 N(class03877 var0, class03877 var1, class03877 var2, class01818 var3) {
      class00500 class00500 = class07529.NN ? class00869.N.W() : null;
      return var5 -> {
         double d0 = var0.N(var5);
         int ix = var5.L();
         class03896 class03896 = d0 > 0.0 ? class03896.field_33603 : class03896.field_33604;
         double d1 = Math.abs(d0);
         int j = class03896.field_33608 - ix;
         int k = ix - class03896.field_33607;
         if (k >= 0 && j >= 0) {
            double d2 = class04995.N((double)Math.min(j, k), 0.0, 20.0, -0.2, 0.0);
            if (d1 + d2 < 0.4F) {
               return class00500;
            } else {
               class06069 class06069 = var3.N(var5.y(), ix, var5.u());
               if (class06069.z() > 0.7F) {
                  return class00500;
               } else if (var1.N(var5) >= 0.0) {
                  return class00500;
               } else {
                  double d3 = class04995.N(d1, 0.4F, 0.6F, 0.1F, 0.3F);
                  if (class06069.z() < d3 && var2.N(var5) > -0.3F) {
                     return class06069.z() < 0.02F ? class03896.field_33668 : class03896.field_33605;
                  } else {
                     return class07529.NN ? class00869.BE.W() : class03896.field_33606;
                  }
               }
            }
         } else {
            return class00500;
         }
      };
   }
}
