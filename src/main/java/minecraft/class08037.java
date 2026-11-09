package minecraft;

import org.jspecify.annotations.Nullable;

public class class08037 extends class08007 {
   private static final int u = 600;
   private static final int R = -1;
   private static final class02131<Integer> M = class03289.N(class08037.class, class02154.y);
   private static final byte B = 0;

   @Override
   protected class06584 M() {
      return new class06584(class06570.sD);
   }

   @Override
   protected void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(M, -1);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.method_73183().method_8608()) {
         if (this.y()) {
            if (this.N % 5 == 0) {
               this.N(1);
            }
         } else {
            this.N(2);
         }
      } else if (this.y() && this.N != 0 && !this.b().equals(class06517.N) && this.N >= 600) {
         this.method_73183().method_8421(this, (byte)0);
         this.N(new class06584(class06570.sD));
      }
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 0) {
         int i = this.m();
         if (i != -1) {
            float f = (i >> 16 & 0xFF) / 255.0F;
            float f1 = (i >> 8 & 0xFF) / 255.0F;
            float f2 = (i >> 0 & 0xFF) / 255.0F;

            for (int j = 0; j < 20; j++) {
               this.method_73183()
                  .method_8406(class02329.N(class07107.t, f, f1, f2), this.method_23322(0.5), this.method_23319(), this.method_23325(0.5), 0.0, 0.0, 0.0);
            }
         }
      } else {
         super.method_5711(var1);
      }
   }

   public class08037(class07078<? extends class08037> var1, class07299 var2) {
      super(var1, var2);
   }

   public class08037(class07299 var1, class07438 var2, class06584 var3, @Nullable class06584 var4) {
      super(class07078.Z, var2, var1, var3, var4);
      this.v();
   }

   public class08037(class07299 var1, double var2, double var4, double var6, class06584 var8, @Nullable class06584 var9) {
      super(class07078.Z, var2, var4, var6, var1, var8, var9);
      this.v();
   }

   private class06517 b() {
      return this.B().a_(class02484.h, class06517.N);
   }

   public int m() {
      return this.field_6011.N(M);
   }

   private void v() {
      class06517 class06517 = this.b();
      this.field_6011.N(M, class06517.equals(class06517.N) ? -1 : class06517.y());
   }

   private float j() {
      return this.B().a_(class02484.r, 1.0F);
   }

   private void N(class06517 var1) {
      this.B().N(class02484.h, var1);
      this.v();
   }

   @Override
   protected void N(class06584 var1) {
      super.N(var1);
      this.v();
   }

   public void N(class07055 var1) {
      this.N(this.b().N(var1));
   }

   private void N(int var1) {
      int i = this.m();
      if (i != -1 && var1 > 0) {
         for (int j = 0; j < var1; j++) {
            this.method_73183().method_8406(class02329.N(class07107.t, i), this.method_23322(0.5), this.method_23319(), this.method_23325(0.5), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void N(class07438 var1) {
      super.N(var1);
      class07049 class07049 = this.P();
      class06517 class06517 = this.b();
      float f = this.j();
      class06517.N(var2x -> var1.method_37222(var2x, class07049), f);
   }
}
