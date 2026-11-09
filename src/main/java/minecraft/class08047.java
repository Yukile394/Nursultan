package minecraft;

public class class08047 extends class04882 implements class07172 {
   private static final class01894 N = class01894.y("drinking");
   private static final class07471 y = new class07471(N, -0.25, class07463.field_6328);
   private static final class02131<Boolean> R = class03289.N(class08047.class, class02154.U);
   private int M;
   private class06266<class04882> B;
   private class04856<class08036> Z;

   public boolean M() {
      return this.method_5841().N(R);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(R, false);
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 15) {
         for (int i = 0; i < this.field_5974.y(35) + 10; i++) {
            this.method_73183()
               .method_8406(
                  class07107.Nb,
                  this.method_23317() + this.field_5974.E() * 0.13F,
                  this.method_5829().i + 0.5 + this.field_5974.E() * 0.13F,
                  this.method_23321() + this.field_5974.E() * 0.13F,
                  0.0,
                  0.0,
                  0.0
               );
         }
      } else {
         super.method_5711(var1);
      }
   }

   public class08047(class07078<? extends class08047> var1, class07299 var2) {
      super(var1, var2);
   }

   public static class05300 B() {
      return class07150.Y().N(class05298.n, 26.0).N(class05298.l, 0.25);
   }

   @Override
   protected class04891 s() {
      return class04909.IH;
   }

   @Override
   public boolean v() {
      return false;
   }

   @Override
   public class04891 E() {
      return class04909.Ic;
   }

   @Override
   public void N(class04782 var1, int var2, boolean var3) {
   }

   public void N(boolean var1) {
      this.method_5841().N(R, var1);
   }

   @Override
   public void N(class07438 var1, float var2) {
      if (!this.M()) {
         class06889 class06889 = var1.method_18798();
         double d0 = var1.method_23317() + class06889.M - this.method_23317();
         double d1 = var1.method_23320() - 1.1F - this.method_23318();
         double d2 = var1.method_23321() + class06889.Z - this.method_23321();
         double d3 = Math.sqrt(d0 * d0 + d2 * d2);
         class03556 class03556 = class06506.k;
         if (var1 instanceof class04882) {
            if (var1.method_6032() <= 4.0F) {
               class03556 = class06506.d;
            } else {
               class03556 = class06506.I;
            }

            this.y(null);
         } else if (d3 >= 8.0 && !var1.method_6059(class07047.y)) {
            class03556 = class06506.T;
         } else if (var1.method_6032() >= 8.0F && !var1.method_6059(class07047.j)) {
            class03556 = class06506.Q;
         } else if (d3 <= 3.0 && !var1.method_6059(class07047.b) && this.field_5974.z() < 0.25F) {
            class03556 = class06506.e;
         }

         if (this.method_73183() instanceof class04782 class04782) {
            class06584 class06584 = class06517.N(class06570.lO, class03556);
            class08005.N(class08591::new, class04782, class06584, this, d0, d1 + d3 * 0.2, d2, 0.75F, 8.0F);
         }

         if (!this.method_5701()) {
            this.method_73183()
               .method_43128(
                  null,
                  this.method_23317(),
                  this.method_23318(),
                  this.method_23321(),
                  class04909.IF,
                  this.method_5634(),
                  1.0F,
                  0.8F + this.field_5974.z() * 0.4F
               );
         }
      }
   }

   @Override
   protected void l_() {
      super.l_();
      this.B = new class06266<>(this, class04882.class, true, (var1, var2) -> this.NQ() && var1.method_5864() != class07078.yp);
      this.Z = new class04856<>(this, class08036.class, 10, true, false, null);
      this.e.N(1, new class07427(this));
      this.e.N(2, new class07984(this, 1.0, 60, 10.0F));
      this.e.N(2, new class07957(this, 1.0));
      this.e.N(3, new class07962(this, class08036.class, 8.0F));
      this.e.N(3, new class07956(this));
      this.H.N(1, new class07989(this, class04882.class));
      this.H.N(2, this.B);
      this.H.N(3, this.Z);
   }

   @Override
   public class04891 method_6002() {
      return class04909.IX;
   }

   @Override
   public void method_6007() {
      if (!this.method_73183().method_8608() && this.method_5805()) {
         this.B.E();
         if (this.B.U() <= 0) {
            this.Z.N(true);
         } else {
            this.Z.N(false);
         }

         if (this.M()) {
            if (this.M-- <= 0) {
               this.N(false);
               class06584 class06584 = this.method_6047();
               this.method_5673(class07085.field_6173, class06584.E);
               class06517 class06517 = class06584.method_58694(class02484.h);
               if (class06584.N(class06570.ns) && class06517 != null) {
                  class06517.N(this::method_6092, class06584.a_(class02484.r, 1.0F));
               }

               this.method_32876(class01194.E);
               this.method_5996(class05298.l).L(y.N());
            }
         } else {
            class03556 class03556 = null;
            if (this.field_5974.z() < 0.15F && this.method_5777(class01231.N) && !this.method_6059(class07047.W)) {
               class03556 = class06506.G;
            } else if (this.field_5974.z() < 0.15F
               && (this.method_5809() || this.method_6081() != null && this.method_6081().N(class03696.Z))
               && !this.method_6059(class07047.E)) {
               class03556 = class06506.E;
            } else if (this.field_5974.z() < 0.05F && this.method_6032() < this.method_6063()) {
               class03556 = class06506.d;
            } else if (this.field_5974.z() < 0.5F && this.T() != null && !this.method_6059(class07047.N) && this.T().method_5858(this) > 121.0) {
               class03556 = class06506.m;
            }

            if (class03556 != null) {
               this.method_5673(class07085.field_6173, class06517.N(class06570.ns, class03556));
               this.M = this.method_6047().N((class07438)this);
               this.N(true);
               if (!this.method_5701()) {
                  this.method_73183()
                     .method_43128(
                        null,
                        this.method_23317(),
                        this.method_23318(),
                        this.method_23321(),
                        class04909.Ia,
                        this.method_5634(),
                        1.0F,
                        0.8F + this.field_5974.z() * 0.4F
                     );
               }

               class07469 class07469 = this.method_5996(class05298.l);
               class07469.L(N);
               class07469.y(y);
            }
         }

         if (this.field_5974.z() < 7.5E-4F) {
            this.method_73183().method_8421(this, (byte)15);
         }
      }

      super.method_6007();
   }

   @Override
   public float method_6036(class07072 var1, float var2) {
      var2 = super.method_6036(var1, var2);
      if (var1.u() == this) {
         var2 = 0.0F;
      }

      if (var1.N(class03696.U)) {
         var2 *= 0.15F;
      }

      return var2;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.Ip;
   }
}
