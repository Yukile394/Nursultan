package minecraft;

import org.jspecify.annotations.Nullable;

public class class07507 extends class07504 {
   private static final byte y = 10;
   private static final String L = "explosion_power";
   private static final String u = "explosion_speed_factor";
   private static final String B = "fuse";
   private static final float Z = 4.0F;
   private static final float z = 1.0F;
   private static final int U = -1;
   @Nullable
   private class07072 E;
   private int W = -1;
   private float m = 4.0F;
   private float P = 1.0F;

   private static boolean L(class07072 var0) {
      class07049 class07049 = var0.L();
      return class07049 instanceof class08005 ? ((class08005)class07049).method_5809() : var0.N(class03696.Z) || var0.N(class03696.E);
   }

   @Override
   public boolean method_5853(class07307 var1, class07290 var2, class07209 var3, class00500 var4, float var5) {
      return !this.E() || !var4.N(class01210.e) && !var2.method_8320(var3.method_10084()).N(class01210.e)
         ? super.method_5853(var1, var2, var3, var4, var5)
         : false;
   }

   @Override
   public float method_5774(class07307 var1, class07290 var2, class07209 var3, class00500 var4, class04688 var5, float var6) {
      return !this.E() || !var4.N(class01210.e) && !var2.method_8320(var3.method_10084()).N(class01210.e)
         ? super.method_5774(var1, var2, var3, var4, var5, var6)
         : 0.0F;
   }

   @Override
   public class06584 method_31480() {
      return new class06584(class06570.sE);
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.W > 0) {
         this.W--;
         this.method_73183().method_8406(class07107.NZ, this.method_23317(), this.method_23318() + 0.5, this.method_23321(), 0.0, 0.0, 0.0);
      } else if (this.W == 0) {
         this.N(this.E, this.method_18798().z());
      }

      if (this.field_5976) {
         double d0 = this.method_18798().z();
         if (d0 >= 0.01F) {
            this.N(this.E, d0);
         }
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (var2.L() instanceof class08007 class08007 && class08007.method_5809()) {
         class07072 class07072 = this.method_48923().u(this, var2.u());
         this.N(class07072, class08007.method_18798().B());
      }

      return super.method_64397(var1, var2, var3);
   }

   @Override
   public boolean method_5747(double var1, float var3, class07072 var4) {
      if (var1 >= 3.0) {
         double d0 = var1 / 10.0;
         this.N(this.E, d0 * d0);
      }

      return super.method_5747(var1, var3, var4);
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("fuse", this.W);
      if (this.m != 4.0F) {
         var1.N("explosion_power", this.m);
      }

      if (this.P != 1.0F) {
         var1.N("explosion_speed_factor", this.P);
      }
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.W = var1.N("fuse", -1);
      this.m = class04995.N(var1.N("explosion_power", 4.0F), 0.0F, 128.0F);
      this.P = class04995.N(var1.N("explosion_speed_factor", 1.0F), 0.0F, 128.0F);
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 10) {
         this.N(null);
      } else {
         super.method_5711(var1);
      }
   }

   public class07507(class07078<? extends class07507> var1, class07299 var2) {
      super(var1, var2);
   }

   public int U() {
      return this.W;
   }

   @Override
   protected class06581 z() {
      return class06570.sE;
   }

   @Override
   protected boolean y(class07072 var1) {
      return L(var1);
   }

   public boolean E() {
      return this.W > -1;
   }

   @Override
   public void N(class04782 var1, int var2, int var3, int var4, boolean var5) {
      if (var5 && this.W < 0) {
         this.N(null);
      }
   }

   @Override
   public void N(class04782 var1, class07072 var2) {
      double d0 = this.method_18798().z();
      if (!L(var2) && !(d0 >= 0.01F)) {
         this.N(var1, this.z());
      } else {
         if (this.W < 0) {
            this.N(var2);
            this.W = this.field_5974.y(20) + this.field_5974.y(20);
         }
      }
   }

   public void N(@Nullable class07072 var1) {
      class07299 class07299 = this.method_73183();
      if (!(class07299 instanceof class04782) || ((class04782)class07299).method_64395().N(class07305.Nu)) {
         this.W = 80;
         if (!this.method_73183().method_8608()) {
            if (var1 != null && this.E == null) {
               this.E = this.method_48923().u(this, var1.u());
            }

            this.method_73183().method_8421(this, (byte)10);
            if (!this.method_5701()) {
               this.method_73183()
                  .method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.Qp, class04911.field_15245, 1.0F, 1.0F);
            }
         }
      }
   }

   protected void N(@Nullable class07072 var1, double var2) {
      if (this.method_73183() instanceof class04782 class04782) {
         if (class04782.method_64395().N(class07305.Nu)) {
            double d0 = Math.min(Math.sqrt(var2), 5.0);
            class04782.method_55117(
               this,
               var1,
               null,
               this.method_23317(),
               this.method_23318(),
               this.method_23321(),
               (float)(this.m + this.P * this.field_5974.U() * 1.5 * d0),
               false,
               class07328.field_40891
            );
            this.method_31472();
         } else if (this.E()) {
            this.method_31472();
         }
      }
   }

   @Override
   public class00500 R() {
      return class00869.Ln.W();
   }
}
