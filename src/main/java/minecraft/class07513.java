package minecraft;

public class class07513 extends class08039 {
   private static final class02131<Boolean> u = class03289.N(class07513.class, class02154.U);
   private static final boolean R = false;

   public boolean M() {
      return this.field_6011.N(u);
   }

   @Override
   public float method_5774(class07307 var1, class07290 var2, class07209 var3, class00500 var4, class04688 var5, float var6) {
      return this.M() && class00680.N(var4) ? Math.min(0.8F, var6) : var6;
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(u, false);
   }

   @Override
   public boolean method_5809() {
      return false;
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("dangerous", this.M());
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.y(var1.N("dangerous", false));
   }

   public class07513(class07078<? extends class07513> var1, class07299 var2) {
      super(var1, var2);
   }

   public class07513(class07299 var1, class07438 var2, class06889 var3) {
      super(class07078.yf, var2, var3, var1);
   }

   @Override
   protected float i() {
      return this.M() ? 0.73F : super.i();
   }

   public void y(boolean var1) {
      this.field_6011.N(u, var1);
   }

   @Override
   protected void N(class07089 var1) {
      super.N(var1);
      if (!this.method_73183().method_8608()) {
         this.method_73183().method_8537(this, this.method_23317(), this.method_23318(), this.method_23321(), 1.0F, false, class07328.field_40890);
         this.method_31472();
      }
   }

   @Override
   protected void N(class06145 var1) {
      super.N(var1);
      if (this.method_73183() instanceof class04782 class04782) {
         class07049 class07049 = var1.L();
         boolean flag;
         if (this.z() instanceof class07438 class07438x) {
            class07072 class07072 = this.method_48923().N_41(this, class07438x);
            flag = class07049.method_64397(class04782, class07072, 8.0F);
            if (flag) {
               if (class07049.method_5805()) {
                  class07323.N(class04782, class07049, class07072);
               } else {
                  class07438x.method_6025(5.0F);
               }
            }
         } else {
            flag = class07049.method_64397(class04782, this.method_48923().T(), 5.0F);
         }

         if (flag && class07049 instanceof class07438 class07438x) {
            byte b0 = 0;
            if (this.method_73183().y() == class07086.field_5802) {
               b0 = 10;
            } else if (this.method_73183().y() == class07086.field_5807) {
               b0 = 40;
            }

            if (b0 > 0) {
               class07438x.method_37222(new class07055(class07047.v, 20 * b0, 1), this.P());
            }
         }
      }
   }

   @Override
   protected boolean ad_() {
      return false;
   }
}
