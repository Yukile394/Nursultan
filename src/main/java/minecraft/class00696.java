package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collections;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00696 extends class08005 {
   private static final Logger y = LogUtils.getLogger();
   private final class06069 L = class06069.u();
   public boolean N;
   private int u;
   private static final int R = 10;
   private static final class02131<Integer> M = class03289.N(class00696.class, class02154.y);
   private static final class02131<Boolean> B = class03289.N(class00696.class, class02154.U);
   private int Z;
   private int z;
   private int U;
   private int E;
   private float W;
   private boolean m = true;
   @Nullable
   private class07049 P;
   private class00711 s = class00711.field_7180;
   private final int T;
   private final int b;
   private final class08382 j = new class08382(this);

   @Override
   public void L(@Nullable class07049 var1) {
      super.L(var1);
      this.N(this);
   }

   @Nullable
   public class08036 L() {
      class07049 class07049 = this.z();
      return class07049 instanceof class08036 ? (class08036)class07049 : null;
   }

   private class00677 L(class07209 var1) {
      class00500 class00500 = this.method_73183().method_8320(var1);
      if (!class00500.P() && !class00500.N(class00869.RS)) {
         class04688 class04688 = class00500.Y();
         return class04688.N(class01231.N) && class04688.u() && class00500.M(this.method_73183(), var1).method_1110()
            ? class00677.field_23237
            : class00677.field_23238;
      } else {
         return class00677.field_23236;
      }
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (M.equals(var1)) {
         int i = this.method_5841().N(M);
         this.P = i > 0 ? this.method_73183().method_8469(i - 1) : null;
      }

      if (B.equals(var1)) {
         this.N = this.method_5841().N(B);
         if (this.N) {
            this.method_18800(this.method_18798().M, -0.4F * class04995.N(this.L, 0.6F, 1.0F), this.method_18798().Z);
         }
      }

      super.method_5674(var1);
   }

   @Override
   public void method_31471(class07276 var1) {
      super.method_31471(var1);
      if (this.L() == null) {
         int i = var1.W();
         y.error("Failed to recreate fishing hook on client. {} (id: {}) is not a valid owner.", this.method_73183().method_8469(i), i);
         this.method_31472();
      }
   }

   @Override
   public class00381<class07280> method_18002(class01599 var1) {
      class07049 class07049 = this.z();
      return new class07276(this, var1, class07049 == null ? this.method_5628() : class07049.method_5628());
   }

   @Override
   protected void method_5693(class04293 var1) {
      var1.N(M, 0);
      var1.N(B, false);
   }

   @Override
   public void method_36209() {
      this.N(null);
   }

   @Override
   public void method_5773() {
      this.L.N(this.method_5667().getLeastSignificantBits() ^ this.method_73183().N());
      this.method_66233().method_66271();
      super.method_5773();
      class08036 class08036 = this.L();
      if (class08036 == null) {
         this.method_31472();
      } else if (this.method_73183().method_8608() || !this.N(class08036)) {
         if (this.method_24828()) {
            this.Z++;
            if (this.Z >= 1200) {
               this.method_31472();
               return;
            }
         } else {
            this.Z = 0;
         }

         float f = 0.0F;
         class07209 class07209 = this.method_24515();
         class04688 class04688 = this.method_73183().method_8316(class07209);
         if (class04688.N(class01231.N)) {
            f = class04688.N(this.method_73183(), class07209);
         }

         boolean flag = f > 0.0F;
         if (this.s == class00711.field_7180) {
            if (this.P != null) {
               this.method_18799(class06889.L);
               this.s = class00711.field_7178;
               return;
            }

            if (flag) {
               this.method_18799(this.method_18798().u(0.3, 0.2, 0.3));
               this.s = class00711.field_7179;
               return;
            }

            this.i();
         } else {
            if (this.s == class00711.field_7178) {
               if (this.P != null) {
                  if (!this.P.method_31481() && this.P.method_73187() && this.P.method_73183().method_27983() == this.method_73183().method_27983()) {
                     this.method_5814(this.P.method_23317(), this.P.method_23323(0.8), this.P.method_23321());
                  } else {
                     this.i(null);
                     this.s = class00711.field_7180;
                  }
               }

               return;
            }

            if (this.s == class00711.field_7179) {
               class06889 class06889 = this.method_18798();
               double d0 = this.method_23318() + class06889.B - class07209.method_10264() - f;
               if (Math.abs(d0) < 0.01) {
                  d0 += Math.signum(d0) * 0.1;
               }

               this.method_18800(class06889.M * 0.9, class06889.B - d0 * this.field_5974.z() * 0.2, class06889.Z * 0.9);
               if (this.z <= 0 && this.E <= 0) {
                  this.m = true;
               } else {
                  this.m = this.m && this.u < 10 && this.y(class07209);
               }

               if (flag) {
                  this.u = Math.max(0, this.u - 1);
                  if (this.N) {
                     this.method_18799(this.method_18798().y(0.0, -0.1 * this.L.z() * this.L.z(), 0.0));
                  }

                  if (!this.method_73183().method_8608()) {
                     this.N(class07209);
                  }
               } else {
                  this.u = Math.min(10, this.u + 1);
               }
            }
         }

         if (!class04688.N(class01231.N) && !this.method_24828() && this.P == null) {
            this.method_18799(this.method_18798().y(0.0, -0.03, 0.0));
         }

         this.method_5784(class07451.field_6308, this.method_18798());
         this.method_61409();
         this.T();
         if (this.s == class00711.field_7180 && (this.method_24828() || this.field_5976)) {
            this.method_18799(class06889.L);
         }

         double d1 = 0.92;
         this.method_18799(this.method_18798().L(0.92));
         this.method_23311();
      }
   }

   @Override
   public void method_5650(class07062 var1) {
      this.N(null);
      super.method_5650(var1);
   }

   @Override
   protected class07065 method_33570() {
      return class07065.field_28630;
   }

   @Override
   protected void method_5652(class08329 var1) {
   }

   @Override
   public boolean method_5640(double var1) {
      double d0 = 64.0;
      return var1 < 4096.0;
   }

   @Override
   protected void method_5749(class08299 var1) {
   }

   @Override
   public class08382 method_66233() {
      return this.j;
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 31 && this.method_73183().method_8608()) {
         class07049 class07049 = this.P;
         if (class07049 instanceof class08036 && ((class08036)class07049).method_7340()) {
            this.y(this.P);
         }
      }

      super.method_5711(var1);
   }

   @Override
   public boolean method_5822(boolean var1) {
      return false;
   }

   public class00696(class07078<? extends class00696> var1, class07299 var2, int var3, int var4) {
      super(var1, var2);
      this.T = Math.max(0, var3);
      this.b = Math.max(0, var4);
   }

   public class00696(class08036 var1, class07299 var2, int var3, int var4) {
      this(class07078.LL, var2, var3, var4);
      this.L(var1);
      float f = var1.method_36455();
      float f1 = var1.method_36454();
      float f2 = class04995.P(-f1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float f3 = class04995.m(-f1 * (float) (Math.PI / 180.0) - (float) Math.PI);
      float f4 = -class04995.P(-f * (float) (Math.PI / 180.0));
      float f5 = class04995.m(-f * (float) (Math.PI / 180.0));
      double d0 = var1.method_23317() - f3 * 0.3;
      double d1 = var1.method_23320();
      double d2 = var1.method_23321() - f2 * 0.3;
      this.method_5808(d0, d1, d2, f1, f);
      class06889 class06889 = new class06889(-f3, class04995.N(-(f5 / f4), -5.0F, 5.0F), -f2);
      double d3 = class06889.M();
      class06889 = class06889.u(
         0.6 / d3 + this.field_5974.N(0.5, 0.0103365), 0.6 / d3 + this.field_5974.N(0.5, 0.0103365), 0.6 / d3 + this.field_5974.N(0.5, 0.0103365)
      );
      this.method_18799(class06889);
      this.method_36456((float)(class04995.u(class06889.M, class06889.Z) * 180.0F / (float)Math.PI));
      this.method_36457((float)(class04995.u(class06889.B, class06889.Z()) * 180.0F / (float)Math.PI));
      this.field_5982 = this.method_36454();
      this.field_6004 = this.method_36455();
   }

   public class00696(class07078<? extends class00696> var1, class07299 var2) {
      this(var1, var2, 0, 0);
   }

   private void i(@Nullable class07049 var1) {
      this.P = var1;
      this.method_5841().N(M, var1 == null ? 0 : var1.method_5628() + 1);
   }

   private void i() {
      class07089 class07089 = class08038.N(this, this::N);
      this.y(class07089);
   }

   @Nullable
   public class07049 u() {
      return this.P;
   }

   protected void y(class07049 var1) {
      class07049 class07049 = this.z();
      if (class07049 != null) {
         class06889 class06889 = new class06889(
               class07049.method_23317() - this.method_23317(),
               class07049.method_23318() - this.method_23318(),
               class07049.method_23321() - this.method_23321()
            )
            .L(0.1);
         var1.method_18799(var1.method_18798().i(class06889));
      }
   }

   private boolean y(class07209 var1) {
      class00677 class00677x = class00677.field_23238;

      for (int i = -1; i <= 2; i++) {
         class00677 class00677x = this.N(var1.method_10069(-2, i, -2), var1.method_10069(2, i, 2));
         switch (class00677x) {
            case field_23236:
               if (class00677x == class00677.field_23238) {
                  return false;
               }
               break;
            case field_23237:
               if (class00677x == class00677.field_23236) {
                  return false;
               }
               break;
            case field_23238:
               return false;
         }

         class00677x = class00677x;
      }

      return true;
   }

   @Override
   public boolean y() {
      return this.m;
   }

   private boolean N(class08036 var1) {
      if (var1.method_73187()) {
         class06584 class06584x = var1.method_6047();
         class06584 class06584x = var1.method_6079();
         boolean flag = class06584x.N(class06570.jr);
         boolean flag1 = class06584x.N(class06570.jr);
         if ((flag || flag1) && this.method_5858(var1) <= 1024.0) {
            return false;
         }
      }

      this.method_31472();
      return true;
   }

   private class00677 N(class07209 var1, class07209 var2) {
      return class07209.method_20437(var1, var2)
         .map(this::L)
         .reduce((var0, var1x) -> var0 == var1x ? var0 : class00677.field_23238)
         .orElse(class00677.field_23238);
   }

   @Override
   protected void N(class06145 var1) {
      super.N(var1);
      if (!this.method_73183().method_8608()) {
         this.i(var1.L());
      }
   }

   @Override
   protected void N(class06183 var1) {
      super.N(var1);
      this.method_18799(this.method_18798().u().L(var1.N(this)));
   }

   public int N(class06584 var1) {
      class08036 class08036 = this.L();
      if (!this.method_73183().method_8608() && class08036 != null && !this.N(class08036)) {
         int i = 0;
         if (this.P != null) {
            this.y(this.P);
            class06912.g.N((class04770)class08036, var1, this, Collections.emptyList());
            this.method_73183().method_8421(this, (byte)31);
            i = this.P instanceof class00717 ? 3 : 5;
         } else if (this.z > 0) {
            class04162 class04162 = new class04160((class04782)this.method_73183())
               .N(class06551.B, this.method_73189())
               .N(class06551.U, var1)
               .N(class06551.N, this)
               .N(this.T + class08036.method_7292())
               .N(class06925.M);
            ObjectArrayList<class06584> objectarraylist = this.method_73183().method_8503().yd().N(class06273.NW).N(class04162);
            class06912.g.N((class04770)class08036, var1, this, objectarraylist);

            for (class06584 class06584 : objectarraylist) {
               class00717 class00717 = new class00717(this.method_73183(), this.method_23317(), this.method_23318(), this.method_23321(), class06584);
               double d0 = class08036.method_23317() - this.method_23317();
               double d1 = class08036.method_23318() - this.method_23318();
               double d2 = class08036.method_23321() - this.method_23321();
               double d3 = 0.1;
               class00717.method_18800(d0 * 0.1, d1 * 0.1 + Math.sqrt(Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2)) * 0.08, d2 * 0.1);
               this.method_73183().method_8649(class00717);
               class08036.method_73183()
                  .method_8649(
                     new class07057(
                        class08036.method_73183(),
                        class08036.method_23317(),
                        class08036.method_23318() + 0.5,
                        class08036.method_23321() + 0.5,
                        this.field_5974.y(6) + 1
                     )
                  );
               if (class06584.N(class01226.yP)) {
                  class08036.method_7339(class01235.f, 1);
               }
            }

            i = 1;
         }

         if (this.method_24828()) {
            i = 2;
         }

         this.method_31472();
         return i;
      } else {
         return 0;
      }
   }

   private void N(class07209 var1) {
      class04782 class04782 = (class04782)this.method_73183();
      int i = 1;
      class07209 class07209 = var1.method_10084();
      if (this.field_5974.z() < 0.25F && this.method_73183().method_8520(class07209)) {
         i++;
      }

      if (this.field_5974.z() < 0.5F && !this.method_73183().N_17(class07209)) {
         i--;
      }

      if (this.z > 0) {
         this.z--;
         if (this.z <= 0) {
            this.U = 0;
            this.E = 0;
            this.method_5841().N(B, false);
         }
      } else if (this.E > 0) {
         this.E -= i;
         if (this.E > 0) {
            this.W = this.W + (float)this.field_5974.N(0.0, 9.188);
            float f = this.W * (float) (Math.PI / 180.0);
            float f1 = class04995.m(f);
            float f2 = class04995.P(f);
            double d0 = this.method_23317() + f1 * this.E * 0.1F;
            double d1 = class04995.N(this.method_23318()) + 1.0F;
            double d2 = this.method_23321() + f2 * this.E * 0.1F;
            class00500 class00500x = class04782.method_8320(class07209.method_49637(d0, d1 - 1.0, d2));
            if (class00500x.N(class00869.K)) {
               if (this.field_5974.z() < 0.15F) {
                  class04782.method_65096(class07107.u, d0, d1 - 0.1F, d2, 1, f1, 0.1, f2, 0.0);
               }

               float f3 = f1 * 0.04F;
               float f4 = f2 * 0.04F;
               class04782.method_65096(class07107.I, d0, d1, d2, 0, f4, 0.01, -f3, 1.0);
               class04782.method_65096(class07107.I, d0, d1, d2, 0, -f4, 0.01, f3, 1.0);
            }
         } else {
            this.method_5783(class04909.Ue, 0.25F, 1.0F + (this.field_5974.z() - this.field_5974.z()) * 0.4F);
            double d3 = this.method_23318() + 0.5;
            class04782.method_65096(
               class07107.u,
               this.method_23317(),
               d3,
               this.method_23321(),
               (int)(1.0F + this.method_17681() * 20.0F),
               this.method_17681(),
               0.0,
               this.method_17681(),
               0.2F
            );
            class04782.method_65096(
               class07107.I,
               this.method_23317(),
               d3,
               this.method_23321(),
               (int)(1.0F + this.method_17681() * 20.0F),
               this.method_17681(),
               0.0,
               this.method_17681(),
               0.2F
            );
            this.z = class04995.N(this.field_5974, 20, 40);
            this.method_5841().N(B, true);
         }
      } else if (this.U > 0) {
         this.U -= i;
         float f5 = 0.15F;
         if (this.U < 20) {
            f5 += (20 - this.U) * 0.05F;
         } else if (this.U < 40) {
            f5 += (40 - this.U) * 0.02F;
         } else if (this.U < 60) {
            f5 += (60 - this.U) * 0.01F;
         }

         if (this.field_5974.z() < f5) {
            float f6 = class04995.N(this.field_5974, 0.0F, 360.0F) * (float) (Math.PI / 180.0);
            float f7 = class04995.N(this.field_5974, 25.0F, 60.0F);
            double d4 = this.method_23317() + class04995.m(f6) * f7 * 0.1;
            double d5 = class04995.N(this.method_23318()) + 1.0F;
            double d6 = this.method_23321() + class04995.P(f6) * f7 * 0.1;
            class00500 class00500 = class04782.method_8320(class07209.method_49637(d4, d5 - 1.0, d6));
            if (class00500.N(class00869.K)) {
               class04782.method_65096(class07107.NT, d4, d5, d6, 2 + this.field_5974.y(2), 0.1F, 0.0, 0.1F, 0.0);
            }
         }

         if (this.U <= 0) {
            this.W = class04995.N(this.field_5974, 0.0F, 360.0F);
            this.E = class04995.N(this.field_5974, 20, 80);
         }
      } else {
         this.U = class04995.N(this.field_5974, 100, 600);
         this.U = this.U - this.b;
      }
   }

   @Override
   protected boolean N(class07049 var1) {
      return super.N(var1) || var1.method_5805() && var1 instanceof class00717;
   }

   private void N(@Nullable class00696 var1) {
      class08036 class08036 = this.L();
      if (class08036 != null) {
         class08036.fields_57fa3311b0e9d3e9b883d09222919bf5a_2 = var1;
      }
   }

   @Override
   protected boolean v_() {
      return true;
   }
}
