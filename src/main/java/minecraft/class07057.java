package minecraft;

import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class07057 extends class07049 {
   protected static final class02131<Integer> N = class03289.N(class07057.class, class02154.y);
   private static final int y = 6000;
   private static final int L = 20;
   private static final int u = 8;
   private static final int i = 40;
   private static final double R = 0.5;
   private static final short M = 5;
   private static final short B = 0;
   private static final short Z = 0;
   private static final int z = 1;
   private int U = 0;
   private int E = 5;
   private int W = 1;
   @Nullable
   private class08036 m;
   private final class08382 P = new class08382(this);

   private void L() {
      if (this.m == null || this.m.method_7325() || this.m.method_5858(this) > 64.0) {
         class08036 class08036 = this.method_73183().N(this, 8.0);
         if (class08036 != null && !class08036.method_7325() && !class08036.method_29504()) {
            this.m = class08036;
         } else {
            this.m = null;
         }
      }

      if (this.m != null) {
         class06889 class06889 = new class06889(
            this.m.method_23317() - this.method_23317(),
            this.m.method_23318() + this.m.method_5751() / 2.0 - this.method_23318(),
            this.m.method_23321() - this.method_23321()
         );
         double d0 = class06889.B();
         double d1 = 1.0 - Math.sqrt(d0) / 8.0;
         this.method_18799(this.method_18798().i(class06889.u().L(d1 * d1 * 0.1)));
      }
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(N, 0);
   }

   @Override
   public void method_5773() {
      this.P.method_66271();
      if (this.field_5953 && this.method_73183().method_8608()) {
         this.field_5953 = false;
      } else {
         super.method_5773();
         boolean flag = !this.method_73183().y(this.method_5829());
         if (this.method_5777(class01231.N)) {
            this.i();
         } else if (!flag) {
            this.method_56990();
         }

         if (this.method_73183().method_8316(this.method_24515()).N(class01231.y)) {
            this.method_18800((this.field_5974.z() - this.field_5974.z()) * 0.2F, 0.2F, (this.field_5974.z() - this.field_5974.z()) * 0.2F);
         }

         if (this.field_6012 % 20 == 1) {
            this.u();
         }

         this.L();
         if (this.m == null && !this.method_73183().method_8608() && flag) {
            boolean flag1 = !this.method_73183().y(this.method_5829().L(this.method_18798()));
            if (flag1) {
               this.method_5632(this.method_23317(), (this.method_5829().y + this.method_5829().i) / 2.0, this.method_23321());
               this.field_64356 = true;
            }
         }

         double d0 = this.method_18798().B;
         this.method_5784(class07451.field_6308, this.method_18798());
         this.method_61409();
         float f = 0.98F;
         if (this.method_24828()) {
            f = this.method_73183().method_8320(this.method_23314()).i().Z() * 0.98F;
         }

         this.method_18799(this.method_18798().L((double)f));
         if (this.field_36331 && d0 < -this.method_56989()) {
            this.method_18799(new class06889(this.method_18798().M, -d0 * 0.4, this.method_18798().Z));
         }

         this.U++;
         if (this.U >= 6000) {
            this.method_31472();
         }
      }
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15256;
   }

   @Override
   public final boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.method_64421(var2)) {
         return false;
      } else {
         this.method_5785();
         this.E = (int)(this.E - var3);
         if (this.E <= 0) {
            this.method_31472();
         }

         return true;
      }
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28630;
   }

   @Override
   public class07209 method_23314() {
      return this.method_43258(0.999999F);
   }

   @Override
   protected double method_7490() {
      return 0.03;
   }

   @Override
   protected void method_5746() {
   }

   @Override
   public void method_5694(class08036 var1) {
      if (var1 instanceof class04770 class04770) {
         if (var1.fields_17fa3311b0e9d3e9b883d09222919bf5a_2 == 0) {
            var1.fields_17fa3311b0e9d3e9b883d09222919bf5a_2 = 2;
            var1.method_6103(this, 1);
            int ix = this.N(class04770, this.N());
            if (ix > 0) {
               var1.method_7255(ix);
            }

            this.W--;
            if (this.W == 0) {
               this.method_31472();
            }
         }
      }
   }

   @Override
   protected void method_5652(class08329 var1) {
      var1.N("Health", (short)this.E);
      var1.N("Age", (short)this.U);
      var1.N("Value", (short)this.N());
      var1.N("Count", this.W);
   }

   @Override
   public final boolean method_5643(class07072 var1) {
      return !this.method_64421(var1);
   }

   @Override
   protected void method_5749(class08299 var1) {
      this.E = var1.N("Health", (short)5);
      this.U = var1.N("Age", (short)0);
      this.y(var1.N("Value", (short)0));
      this.W = var1.<Integer>N("Count", class06338.b).orElse(1);
   }

   @Override
   public class08382 method_66233() {
      return this.P;
   }

   @Override
   public boolean method_5732() {
      return false;
   }

   public class07057(class07299 var1, double var2, double var4, double var6, int var8) {
      this(var1, new class06889(var2, var4, var6), class06889.L, var8);
   }

   public class07057(class07078<? extends class07057> var1, class07299 var2) {
      super(var1, var2);
   }

   public class07057(class07299 var1, class06889 var2, class06889 var3, int var4) {
      this(class07078.r, var1);
      this.method_33574(var2);
      if (!var1.method_8608()) {
         this.method_36456(this.field_5974.z() * 360.0F);
         class06889 class06889 = new class06889(
            (this.field_5974.U() * 0.2 - 0.1) * 2.0, this.field_5974.U() * 0.2 * 2.0, (this.field_5974.U() * 0.2 - 0.1) * 2.0
         );
         if (var3.B() > 0.0 && var3.y(class06889) < 0.0) {
            class06889 = class06889.L(-1.0);
         }

         double d0 = this.method_5829().N();
         this.method_33574(var2.i(var3.u().L(d0 * 0.5)));
         this.method_18799(class06889);
         if (!var1.y(this.method_5829())) {
            this.N(d0);
         }
      }

      this.y(var4);
   }

   private void i() {
      class06889 class06889 = this.method_18798();
      this.method_18800(class06889.M * 0.99F, Math.min(class06889.B + 5.0E-4F, 0.06F), class06889.Z * 0.99F);
   }

   private void u() {
      if (this.method_73183() instanceof class04782) {
         for (class07057 class07057 : this.method_73183().method_18023(class01128.N(class07057.class), this.method_5829().M(0.5), this::N)) {
            this.y(class07057);
         }
      }
   }

   private void y(int var1) {
      this.field_6011.N(N, var1);
   }

   private void y(class07057 var1) {
      this.W = this.W + var1.W;
      this.U = Math.min(this.U, var1.U);
      var1.method_31472();
   }

   public int y() {
      int ix = this.N();
      if (ix >= 2477) {
         return 10;
      } else if (ix >= 1237) {
         return 9;
      } else if (ix >= 617) {
         return 8;
      } else if (ix >= 307) {
         return 7;
      } else if (ix >= 149) {
         return 6;
      } else if (ix >= 73) {
         return 5;
      } else if (ix >= 37) {
         return 4;
      } else if (ix >= 17) {
         return 3;
      } else if (ix >= 7) {
         return 2;
      } else {
         return ix >= 3 ? 1 : 0;
      }
   }

   private static boolean y(class04782 var0, class06889 var1, int var2) {
      class00734 class00734 = class00734.N(var1, 1.0, 1.0, 1.0);
      int ix = var0.method_8409().y(40);
      List list = var0.method_18023(class01128.N(class07057.class), class00734, var2x -> N(var2x, ix, var2));
      if (!list.isEmpty()) {
         class07057 class07057 = (class07057)list.get(0);
         class07057.W++;
         class07057.U = 0;
         return true;
      } else {
         return false;
      }
   }

   public static void N(class04782 var0, class06889 var1, int var2) {
      N(var0, var1, class06889.L, var2);
   }

   protected void N(double var1) {
      class06889 class06889 = this.method_73189().y(0.0, this.method_17682() / 2.0, 0.0);
      class00494 class00494 = class00389.N(class00734.N(class06889, var1, var1, var1));
      this.method_73183()
         .method_33594(this, class00494, class06889, this.method_17681(), this.method_17682(), this.method_17681())
         .ifPresent(var1x -> this.method_33574(var1x.y(0.0, -this.method_17682() / 2.0, 0.0)));
   }

   private static boolean N(class07057 var0, int var1, int var2) {
      return !var0.method_31481() && (var0.method_5628() - var1) % 40 == 0 && var0.N() == var2;
   }

   public static void N(class04782 var0, class06889 var1, class06889 var2, int var3) {
      while (var3 > 0) {
         int ix = N(var3);
         var3 -= ix;
         if (!y(var0, var1, ix)) {
            var0.method_8649(new class07057(var0, var1, var2, ix));
         }
      }
   }

   private int N(class04770 var1, int var2) {
      Optional<class02525> optional = class07323.N(class02523.k, var1, class06584::m);
      if (optional.isPresent()) {
         class06584 class06584 = optional.get().N();
         int ix = class07323.L(var1.method_51469(), class06584, var2);
         int j = Math.min(ix, class06584.P());
         class06584.y(class06584.P() - j);
         if (j > 0) {
            int k = var2 - j * var2 / ix;
            if (k > 0) {
               return this.N(var1, k);
            }
         }

         return 0;
      } else {
         return var2;
      }
   }

   public int N() {
      return this.field_6011.N(N);
   }

   private boolean N(class07057 var1) {
      return var1 != this && N(var1, this.method_5628(), this.N());
   }

   public static int N(int var0) {
      if (var0 >= 2477) {
         return 2477;
      } else if (var0 >= 1237) {
         return 1237;
      } else if (var0 >= 617) {
         return 617;
      } else if (var0 >= 307) {
         return 307;
      } else if (var0 >= 149) {
         return 149;
      } else if (var0 >= 73) {
         return 73;
      } else if (var0 >= 37) {
         return 37;
      } else if (var0 >= 17) {
         return 17;
      } else if (var0 >= 7) {
         return 7;
      } else {
         return var0 >= 3 ? 3 : 1;
      }
   }
}
