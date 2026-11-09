package minecraft;

import Nursultan.class10316;

public class class04194 implements class01857 {
   private static final float N = 4.0F;
   private static final float y = 1.0F;
   private final class06202 L;
   private static final int u = class02566.y(255, 0, 155, 155);
   private static final int i = class02566.y(255, 255, 255, 0);
   private static final int R = class02566.N(1.0F, 0.25F, 0.25F, 1.0F);
   private class01391 M = new class10316(this);

   public class04194(class06202 var1) {
      super();
      this.L = var1;
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      class07049 class07049 = ((class03386)this.L.i_5).s().B();
      float f = ((class03448)this.L.T_3).method_31607();
      float f1 = ((class03448)this.L.T_3).method_31600() + 1;
      class01296 class01296 = class01296.N(class07049.method_24515());
      double d0 = class01296.u();
      double d1 = class01296.R();

      for (byte b0 = -16; b0 <= 32; b0 += 16) {
         for (byte b1 = -16; b1 <= 32; b1 += 16) {
            class06724.N(new class06889(d0 + b0, f, d1 + b1), new class06889(d0 + b0, f1, d1 + b1), class02566.N(0.5F, 1.0F, 0.0F, 0.0F), 4.0F);
         }
      }

      for (byte b2 = 2; b2 < 16; b2 += 2) {
         int l = b2 % 4 == 0 ? u : i;
         class06724.N(new class06889(d0 + b2, f, d1), new class06889(d0 + b2, f1, d1), l, 1.0F);
         class06724.N(new class06889(d0 + b2, f, d1 + 16.0), new class06889(d0 + b2, f1, d1 + 16.0), l, 1.0F);
      }

      for (byte b3 = 2; b3 < 16; b3 += 2) {
         int i1 = b3 % 4 == 0 ? u : i;
         class06724.N(new class06889(d0, f, d1 + b3), new class06889(d0, f1, d1 + b3), i1, 1.0F);
         class06724.N(new class06889(d0 + 16.0, f, d1 + b3), new class06889(d0 + 16.0, f1, d1 + b3), i1, 1.0F);
      }

      for (int j = ((class03448)this.L.T_3).method_31607(); j <= ((class03448)this.L.T_3).method_31600() + 1; j += 2) {
         float f2 = j;
         int ix = j % 8 == 0 ? u : i;
         class06724.N(new class06889(d0, f2, d1), new class06889(d0, f2, d1 + 16.0), ix, 1.0F);
         class06724.N(new class06889(d0, f2, d1 + 16.0), new class06889(d0 + 16.0, f2, d1 + 16.0), ix, 1.0F);
         class06724.N(new class06889(d0 + 16.0, f2, d1 + 16.0), new class06889(d0 + 16.0, f2, d1), ix, 1.0F);
         class06724.N(new class06889(d0 + 16.0, f2, d1), new class06889(d0, f2, d1), ix, 1.0F);
      }

      for (byte b4 = 0; b4 <= 16; b4 += 16) {
         for (byte b5 = 0; b5 <= 16; b5 += 16) {
            class06724.N(new class06889(d0 + b4, f, d1 + b5), new class06889(d0 + b4, f1, d1 + b5), R, 4.0F);
         }
      }

      class06724.N(
            new class00734(class01296.u(), class01296.i(), class01296.R(), class01296.M() + 1, class01296.B() + 1, class01296.Z() + 1), class06747.N(R, 1.0F)
         )
         .N();

      for (int k = ((class03448)this.L.T_3).method_31607(); k <= ((class03448)this.L.T_3).method_31600() + 1; k += 16) {
         class06724.N(new class06889(d0, k, d1), new class06889(d0, k, d1 + 16.0), R, 4.0F);
         class06724.N(new class06889(d0, k, d1 + 16.0), new class06889(d0 + 16.0, k, d1 + 16.0), R, 4.0F);
         class06724.N(new class06889(d0 + 16.0, k, d1 + 16.0), new class06889(d0 + 16.0, k, d1), R, 4.0F);
         class06724.N(new class06889(d0 + 16.0, k, d1), new class06889(d0, k, d1), R, 4.0F);
      }
   }
}
