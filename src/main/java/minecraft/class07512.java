package minecraft;

import squeek.appleskin.helpers.ExhaustionHelper.ExhaustionManipulator;

public class class07512 implements ExhaustionManipulator {
   private static final int N = 0;
   private static final float y = 0.0F;
   private int L = 20;
   private float u = 5.0F;
   private float i;
   private int R;

   public boolean L() {
      return this.L < 20;
   }

   public class07512() {
      super();
   }

   public float u() {
      return this.u;
   }

   public void y(float var1) {
      this.u = var1;
   }

   public boolean y() {
      return this.N() > 6.0F;
   }

   private void y(int var1, float var2) {
      this.L = class04995.N(var1 + this.L, 0, 20);
      this.u = class04995.N(var2 + this.u, 0.0F, (float)this.L);
   }

   public void N(class05349 var1) {
      this.y(var1.N(), var1.y());
   }

   public void N(float var1) {
      this.i = Math.min(this.i + var1, 40.0F);
   }

   public void N(int var1, float var2) {
      this.y(var1, class04387.N(var1, var2));
   }

   public void N(int var1) {
      this.L = var1;
   }

   public void N(class08299 var1) {
      this.L = var1.N("foodLevel", 20);
      this.R = var1.N("foodTickTimer", 0);
      this.u = var1.N("foodSaturationLevel", 5.0F);
      this.i = var1.N("foodExhaustionLevel", 0.0F);
   }

   public void N(class08329 var1) {
      var1.N("foodLevel", this.L);
      var1.N("foodTickTimer", this.R);
      var1.N("foodSaturationLevel", this.u);
      var1.N("foodExhaustionLevel", this.i);
   }

   public int N() {
      return this.L;
   }

   public void N(class04770 var1) {
      class04782 class04782 = var1.method_51469();
      class07086 class07086 = class04782.y();
      if (this.i > 4.0F) {
         this.i -= 4.0F;
         if (this.u > 0.0F) {
            this.u = Math.max(this.u - 1.0F, 0.0F);
         } else if (class07086 != class07086.field_5801) {
            this.L = Math.max(this.L - 1, 0);
         }
      }

      boolean flag = class04782.method_64395().N(class07305.J);
      if (flag && this.u > 0.0F && var1.method_7317() && this.L >= 20) {
         this.R++;
         if (this.R >= 10) {
            float f = Math.min(this.u, 6.0F);
            var1.method_6025(f / 6.0F);
            this.N(f);
            this.R = 0;
         }
      } else if (flag && this.L >= 18 && var1.method_7317()) {
         this.R++;
         if (this.R >= 80) {
            var1.method_6025(1.0F);
            this.N(6.0F);
            this.R = 0;
         }
      } else if (this.L <= 0) {
         this.R++;
         if (this.R >= 80) {
            if (var1.method_6032() > 10.0F || class07086 == class07086.field_5807 || var1.method_6032() > 1.0F && class07086 == class07086.field_5802) {
               var1.method_64397(class04782, var1.method_48923().z(), 1.0F);
            }

            this.R = 0;
         }
      } else {
         this.R = 0;
      }
   }

   public void setExhaustion(float var1) {
      this.i = var1;
   }

   public float getExhaustion() {
      return this.i;
   }
}
