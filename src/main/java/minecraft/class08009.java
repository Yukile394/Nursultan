package minecraft;

import org.jspecify.annotations.Nullable;

public class class08009 extends class07049 implements class03244 {
   public static final int N = 20;
   public static final int y = 2;
   public static final int L = 14;
   private static final int u = 0;
   private int i = 0;
   private boolean R;
   private int M = 22;
   private boolean B;
   @Nullable
   private class08372<class07438> Z;

   @Override
   protected void method_5693(class04293 var1) {
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.method_73183().method_8608()) {
         if (this.B) {
            this.M--;
            if (this.M == 14) {
               for (int var1 = 0; var1 < 12; var1++) {
                  double var2 = this.method_23317() + (this.field_5974.U() * 2.0 - 1.0) * this.method_17681() * 0.5;
                  double d1 = this.method_23318() + 0.05 + this.field_5974.U();
                  double d2 = this.method_23321() + (this.field_5974.U() * 2.0 - 1.0) * this.method_17681() * 0.5;
                  double d3 = (this.field_5974.U() * 2.0 - 1.0) * 0.3;
                  double d4 = 0.3 + this.field_5974.U() * 0.3;
                  double d5 = (this.field_5974.U() * 2.0 - 1.0) * 0.3;
                  this.method_73183().method_8406(class07107.M, var2, d1 + 1.0, d2, d3, d4, d5);
               }
            }
         }
      } else if (--this.i < 0) {
         if (this.i == -8) {
            for (class07438 class07438 : this.method_73183().N(class07438.class, this.method_5829().L(0.2, 0.0, 0.2))) {
               this.y(class07438);
            }
         }

         if (!this.R) {
            this.method_73183().method_8421(this, (byte)4);
            this.R = true;
         }

         if (--this.M < 0) {
            this.method_31472();
         }
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      return false;
   }

   @Override
   protected void method_5652(class08329 var1) {
      var1.N("Warmup", this.i);
      class08372.N(this.Z, var1, "Owner");
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.i = var1.N("Warmup", 0);
      this.Z = class08372.N(var1, "Owner");
   }

   @Override
   public void method_5711(byte var1) {
      super.method_5711(var1);
      if (var1 == 4) {
         this.B = true;
         if (!this.method_5701()) {
            this.method_73183()
               .method_8486(
                  this.method_23317(),
                  this.method_23318(),
                  this.method_23321(),
                  class04909.Uz,
                  this.method_5634(),
                  1.0F,
                  this.field_5974.z() * 0.2F + 0.85F,
                  false
               );
         }
      }
   }

   public class08009(class07078<? extends class08009> var1, class07299 var2) {
      super(var1, var2);
   }

   public class08009(class07299 var1, double var2, double var4, double var6, float var8, int var9, class07438 var10) {
      this(class07078.D, var1);
      this.i = var9;
      this.N(var10);
      this.method_36456(var8 * (180.0F / (float)Math.PI));
      this.method_5814(var2, var4, var6);
   }

   private void y(class07438 var1) {
      class07438 class07438 = this.z();
      if (var1.method_5805() && !var1.method_5655() && var1 != class07438) {
         if (class07438 == null) {
            var1.method_64419(this.method_48923().T(), 6.0F);
         } else {
            if (class07438.method_5722(var1)) {
               return;
            }

            class07072 class07072 = this.method_48923().L(this, (class07049)class07438);
            if (this.method_73183() instanceof class04782 class04782 && var1.method_64397(class04782, class07072, 6.0F)) {
               class07323.N(class04782, (class07049)var1, class07072);
            }
         }
      }
   }

   @Nullable
   public class07438 z() {
      return class08372.y(this.Z, this.method_73183());
   }

   public float N(float var1) {
      if (!this.B) {
         return 0.0F;
      } else {
         int ix = this.M - 2;
         return ix <= 0 ? 1.0F : 1.0F - (ix - var1) / 20.0F;
      }
   }

   public void N(@Nullable class07438 var1) {
      this.Z = class08372.N(var1);
   }
}
