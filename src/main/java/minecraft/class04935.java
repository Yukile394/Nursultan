package minecraft;

public class class04935 extends class01209 {
   private final class04902 i;
   private final float R;
   private final boolean M;

   public class04935(class01224 var1, class01894 var2, class07209 var3, class06993 var4, float var5, class04902 var6, boolean var7) {
      super(class04878.o, 0, var1, var2, var2.toString(), N(var4, var5, var6), var3);
      this.R = var5;
      this.i = var6;
      this.M = var7;
   }

   private class04935(class01224 var1, class07001 var2, class06993 var3, float var4, class04902 var5, boolean var6) {
      super(class04878.o, var2, var1, var3x -> N(var3, var4, var5));
      this.R = var4;
      this.i = var5;
      this.M = var6;
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class07209 var7) {
      int ix = var1.method_8624(class07830.field_13195, this.u.method_10263(), this.u.method_10260());
      this.u = new class07209(this.u.method_10263(), ix, this.u.method_10260());
      class07209 class07209 = class01207.N(
            new class07209(this.y.N().method_10263() - 1, 0, this.y.N().method_10260() - 1), class07111.field_11302, this.L.u(), class07209.field_10980
         )
         .method_10081(this.u);
      this.u = new class07209(this.u.method_10263(), this.N(this.u, var1, class07209), this.u.method_10260());
      super.N(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   protected void N(String var1, class07209 var2, class01001 var3, class06069 var4, class05163 var5) {
      if ("chest".equals(var1)) {
         var3.method_8652(var2, class00869.LA.W().y(class00860.R, var3.method_8316(var2).N(class01231.N)), 2);
         class00394 class00394 = var3.method_8321(var2);
         if (class00394 instanceof class00379) {
            ((class00379)class00394).N(this.M ? class06273.g : class06273.O, var4.B());
         }
      } else if ("drowned".equals(var1)) {
         class07541 class07541 = class07078.X.N(var3.method_8410(), class06113.field_16474);
         if (class07541 != null) {
            class07541.NW();
            class07541.method_5725(var2, 0.0F, 0.0F);
            class07541.N(var3, var3.method_8404(var2), class06113.field_16474, null);
            var3.y(class07541);
            if (var2.method_10264() > var3.method_8615()) {
               var3.method_8652(var2, class00869.N.W(), 2);
            } else {
               var3.method_8652(var2, class00869.K.W(), 2);
            }
         }
      }
   }

   private int N(class07209 var1, class07290 var2, class07209 var3) {
      int ix = var1.method_10264();
      int j = 512;
      int k = ix - 1;
      int l = 0;

      for (class07209 class07209 : class07209.method_10097(var1, var3)) {
         int i1 = class07209.method_10263();
         int j1 = class07209.method_10260();
         int k1 = var1.method_10264() - 1;
         class07218 class07218 = new class07218(i1, k1, j1);
         class00500 class00500 = var2.method_8320(class07218);

         for (class04688 class04688 = var2.method_8316(class07218);
            (class00500.P() || class04688.N(class01231.N) || class00500.N(class01210.NQ)) && k1 > var2.method_31607() + 1;
            class04688 = var2.method_8316(class07218)
         ) {
            class07218.N(i1, --k1, j1);
            class00500 = var2.method_8320(class07218);
         }

         j = Math.min(j, k1);
         if (k1 < k - 2) {
            l++;
         }
      }

      int l1 = Math.abs(var1.method_10263() - var3.method_10263());
      if (k - j > 2 && l > l1 - 2) {
         ix = j + 1;
      }

      return ix;
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Rot", class06993.field_56670, this.L.u());
      var2.N("Integrity", this.R);
      var2.N("BiomeType", class04902.field_56682, this.i);
      var2.N("IsLarge", this.M);
   }

   public static class04935 N(class01224 var0, class07001 var1) {
      class06993 class06993 = var1.<class06993>N_15("Rot", class06993.field_56670).orElseThrow();
      float f = var1.y("Integrity", 0.0F);
      class04902 class04902 = var1.<class04902>N_15("BiomeType", class04902.field_56682).orElseThrow();
      boolean flag = var1.y("IsLarge", false);
      return new class04935(var0, var1, class06993, f, class04902, flag);
   }

   private static class01233 N(class06993 var0, float var1, class04902 var2) {
      class01219 class01219 = var2 == class04902.field_14528 ? class04939.y : class04939.N;
      return new class01233().N(var0).N(class07111.field_11302).N(new class01201(var1)).N(class05282.u).N(class01219);
   }
}
