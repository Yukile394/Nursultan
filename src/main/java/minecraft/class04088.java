package minecraft;

import com.mojang.serialization.MapCodec;

public class class04088 extends class00891 {
   public static final MapCodec<class04088> N = y(class04088::new);
   private static final int y = 2;
   private static final int L = 5;
   private static final int u = 3600;
   private static final int i = 12000;
   private static final class00494 R = class00891.y(16.0, 0.0, 1.5);
   private static int M = 3600;
   private static int B = 12000;

   public class04088(class01362 var1) {
      super(var1);
   }

   private double y(class06069 var1) {
      double d0 = 0.2F;
      return class04995.N(var1.U(), 0.2F, 0.7999999970197678);
   }

   private void y(class04782 var1, class07209 var2, class06069 var3) {
      int ix = var3.y(2, 6);

      for (int j = 1; j <= ix; j++) {
         class04096 class04096 = class07078.yQ.N(var1, class06113.field_16466);
         if (class04096 != null) {
            double d0 = var2.method_10263() + this.y(var3);
            double d1 = var2.method_10260() + this.y(var3);
            int k = var3.y(1, 361);
            class04096.method_5808(d0, var2.method_10264() - 0.5, d1, k, 0.0F);
            class04096.NW();
            var1.method_8649(class04096);
         }
      }
   }

   public static void y() {
      M = 3600;
      B = 12000;
   }

   private void N(class07299 var1, class07209 var2) {
      var1.N(var2, false);
   }

   private void N(class04782 var1, class07209 var2, class06069 var3) {
      this.N((class07299)var1, var2);
      var1.method_8396(null, var2, class04909.EG, class04911.field_15245, 1.0F, 1.0F);
      this.y(var1, var2, var3);
   }

   private static boolean N(class07290 var0, class07209 var1) {
      class04688 class04688x = var0.method_8316(var1);
      class04688 class04688x = var0.method_8316(var1.method_10084());
      return class04688x.N() == class04684.L && class04688x.N() == class04684.N;
   }

   @Override
   public MapCodec<class04088> N() {
      return N;
   }

   public static void N(int var0, int var1) {
      M = var0;
      B = var1;
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return R;
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      var2.N(var3, this, N(var2.method_8409()));
   }

   private static int N(class06069 var0) {
      return var0.y(M, B);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (var4.method_5864().equals(class07078.Ny)) {
         this.N(var2, var3);
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!this.a_(var1, var2, var3)) {
         this.N((class07299)var2, var3);
      } else {
         this.N(var2, var3, var4);
      }
   }

   @Override
   protected class00500 N(
      class00500 var1, class05487 var2, class08713 var3, class07209 var4, class07211 var5, class07209 var6, class00500 var7, class06069 var8
   ) {
      return !this.a_(var1, var2, var4) ? class00869.N.W() : super.N(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      return N(var2, var3.method_10074());
   }
}
