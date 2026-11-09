package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class00679 extends class00710 {
   private static final class02131<class06584> L = class03289.N(class00679.class, class02154.B);
   private static final class02131<Integer> u = class03289.N(class00679.class, class02154.y);
   public static final int N = 8;
   private static final float i = 0.0625F;
   private static final float R = 0.75F;
   private static final float M = 0.75F;
   private static final byte B = 0;
   private static final float Z = 1.0F;
   private static final boolean z = false;
   private static final boolean U = false;
   private float E = 1.0F;
   private boolean W = false;

   private void L(class06584 var1) {
      class02265 class02265 = this.N(var1);
      if (class02265 != null) {
         class07769 class07769 = class06548.N(class02265, this.method_73183());
         if (class07769 != null) {
            class07769.N(this.y, this.method_5628());
         }
      }

      var1.N(null);
   }

   public class04891 M() {
      return class04909.sY;
   }

   protected class06584 P() {
      return new class06584(class06570.GP);
   }

   @Nullable
   @Override
   public class04803 method_32318(int var1) {
      return var1 == 0 ? class04803.N(this::Z, this::y) : super.method_32318(var1);
   }

   @Override
   public void method_5674(class02131<?> var1) {
      super.method_5674(var1);
      if (var1.equals(L)) {
         this.u(this.Z());
      }
   }

   @Override
   public void method_31471(class07276 var1) {
      super.method_31471(var1);
      this.y(class07211.N(var1.W()));
   }

   @Override
   public class06584 method_31480() {
      class06584 class06584 = this.Z();
      return class06584.R() ? this.P() : class06584.t();
   }

   @Override
   public class00381<class07280> method_18002(class01599 var1) {
      return new class07276(this, this.method_5735().L(), this.s());
   }

   @Override
   public float method_73188() {
      class07211 class07211 = this.method_5735();
      int ix = class07211.z().y() ? 90 * class07211.i().N() : 0;
      return class04995.y(180 + class07211.u() * 90 + this.E() * 45 + ix);
   }

   @Override
   protected void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(L, class06584.E);
      var1.N(u, 0);
   }

   @Override
   public void method_5768(class04782 var1) {
      this.L(this.Z());
      super.method_5768(var1);
   }

   @Override
   public void method_5784(class07451 var1, class06889 var2) {
      if (!this.W) {
         super.method_5784(var1, var2);
      }
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (!this.W) {
         if (this.method_64421(var2)) {
            return false;
         } else if (this.N(var2)) {
            this.N(var1, var2.u(), false);
            this.method_32875(class01194.L, var2.u());
            this.method_5783(this.R(), 1.0F, 1.0F);
            return true;
         } else {
            return super.method_64397(var1, var2, var3);
         }
      } else {
         return y(var2) && super.method_64397(var1, var2, var3);
      }
   }

   @Override
   public void method_5762(double var1, double var3, double var5) {
      if (!this.W) {
         super.method_5762(var1, var3, var5);
      }
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      class06584 class06584 = this.Z();
      if (!class06584.R()) {
         var1.N("Item", class06584.y, class06584);
      }

      var1.N("ItemRotation", (byte)this.E());
      var1.N("ItemDropChance", this.E);
      var1.N("Facing", class07211.field_57037, this.method_5735());
      var1.N("Invisible", this.method_5767());
      var1.N("Fixed", this.W);
   }

   @Override
   public boolean method_5640(double var1) {
      double d0 = 16.0;
      d0 *= 64.0 * method_5824();
      return var1 < d0 * d0;
   }

   @Override
   public boolean method_5643(class07072 var1) {
      return this.W && !y(var1) ? false : !this.method_64421(var1);
   }

   @Override
   public class07082 method_5688(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      boolean flag = !this.Z().R();
      boolean flag1 = !class06584.R();
      if (this.W) {
         return class07082.i;
      } else if (!var1.method_73183().method_8608()) {
         if (!flag) {
            if (flag1 && !this.method_31481()) {
               class07769 class07769 = class06548.y(class06584, this.method_73183());
               if (class07769 != null && class07769.N(256)) {
                  return class07082.u;
               } else {
                  this.y(class06584);
                  this.method_32875(class01194.L, var1);
                  class06584.N(1, var1);
                  return class07082.N;
               }
            } else {
               return class07082.i;
            }
         } else {
            this.method_5783(this.W(), 1.0F, 1.0F);
            this.N(this.E() + 1);
            this.method_32875(class01194.L, var1);
            return class07082.N;
         }
      } else {
         return (class07082)(!flag && !flag1 ? class07082.i : class07082.N);
      }
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      class06584 class06584x = var1.<class06584>N("Item", class06584.y).orElse(class06584.E);
      class06584 class06584x = this.Z();
      if (!class06584x.R() && !class06584.N(class06584x, class06584x)) {
         this.L(class06584x);
      }

      this.N(class06584x, false);
      this.N(var1.N("ItemRotation", (byte)0), false);
      this.E = var1.N("ItemDropChance", 1.0F);
      this.y(var1.<class07211>N("Facing", class07211.field_57037).orElse(class07211.field_11033));
      this.method_5648(var1.N("Invisible", false));
      this.W = var1.N("Fixed", false);
   }

   public class00679(class07078<? extends class00679> var1, class07299 var2) {
      super(var1, var2);
      this.method_5648(false);
   }

   public class00679(class07078<? extends class00679> var1, class07299 var2, class07209 var3, class07211 var4) {
      super(var1, var2, var3);
      this.y(var4);
      this.method_5648(false);
   }

   public class00679(class07299 var1, class07209 var2, class07211 var3) {
      this(class07078.Nl, var1, var2, var3);
   }

   public class04891 B() {
      return class04909.sQ;
   }

   public class06584 Z() {
      return this.method_5841().N(L);
   }

   @Override
   public void i() {
      this.method_5783(this.B(), 1.0F, 1.0F);
   }

   public int m() {
      return this.Z().R() ? 0 : this.E() % 8 + 1;
   }

   public class04891 U() {
      return class04909.sk;
   }

   public boolean z() {
      return this.Z().L(class02484.f);
   }

   private void u(class06584 var1) {
      if (!var1.R() && var1.q() != this) {
         var1.N(this);
      }

      this.N();
   }

   @Override
   protected class00734 u() {
      return this.N(this.y, this.method_5735(), false);
   }

   @Override
   public boolean y() {
      if (this.W) {
         return true;
      } else if (this.N(this.u())) {
         return false;
      } else {
         class00500 class00500 = this.method_73183().method_8320(this.y.method_10093(this.method_5735().b()));
         return class00500.B() || this.method_5735().z().L() && class06781.E(class00500) ? this.N(true) : false;
      }
   }

   public void y(class06584 var1) {
      this.N(var1, true);
   }

   @Override
   protected void y(class07211 var1) {
      Objects.requireNonNull(var1);
      super.N(var1);
      if (var1.z().L()) {
         this.method_36457(0.0F);
         this.method_36456(var1.u() * 90);
      } else {
         this.method_36457(-90 * var1.i().N());
         this.method_36456(0.0F);
      }

      this.field_6004 = this.method_36455();
      this.field_5982 = this.method_36454();
      this.N();
   }

   private static boolean y(class07072 var0) {
      return var0.N(class03696.u) || var0.B();
   }

   public int E() {
      return this.method_5841().N(u);
   }

   @Override
   protected final void N() {
      super.N();
      this.method_43391(this.method_23317(), this.method_23318(), this.method_23321());
   }

   @Override
   protected class00734 N(class07209 var1, class07211 var2) {
      return this.N(var1, var2, this.N(this));
   }

   private boolean N(class00679 var1) {
      return var1.z() && ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_21_7);
   }

   @Override
   public void N(class04782 var1, @Nullable class07049 var2) {
      this.method_5783(this.M(), 1.0F, 1.0F);
      this.N(var1, var2, true);
      this.method_32875(class01194.L, var2);
   }

   private boolean N(class07072 var1) {
      return !var1.N(class03696.E) && !this.Z().R();
   }

   public void N(class06584 var1, boolean var2) {
      if (!var1.R()) {
         var1 = var1.L(1);
      }

      this.u(var1);
      this.method_5841().N(L, var1);
      if (!var1.R()) {
         this.method_5783(this.U(), 1.0F, 1.0F);
      }

      if (var2 && this.y != null) {
         this.method_73183().method_8455(this.y, class00869.N);
      }
   }

   @Nullable
   public class02265 N(class06584 var1) {
      return var1.method_58694(class02484.f);
   }

   private void N(class04782 var1, @Nullable class07049 var2, boolean var3) {
      if (!this.W) {
         class06584 class06584 = this.Z();
         this.y(class06584.E);
         if (!var1.method_64395().N(class07305.U)) {
            if (var2 == null) {
               this.L(class06584);
            }
         } else if (var2 instanceof class08036 && ((class08036)var2).method_56992()) {
            this.L(class06584);
         } else {
            if (var3) {
               this.method_5775(var1, this.P());
            }

            if (!class06584.R()) {
               class06584 = class06584.t();
               this.L(class06584);
               if (this.field_5974.z() < this.E) {
                  this.method_5775(var1, class06584);
               }
            }
         }
      }
   }

   private class00734 N(class07209 var1, class07211 var2, boolean var3) {
      float f = 0.46875F;
      class06889 class06889 = class06889.y(var1).N(var2, -0.46875);
      float f1 = var3 ? 1.0F : 0.75F;
      float f2 = var3 ? 1.0F : 0.75F;
      class07185 class07185 = var2.z();
      double d0 = class07185 == class07185.field_11048 ? 0.0625 : f1;
      double d1 = class07185 == class07185.field_11052 ? 0.0625 : f2;
      double d2 = class07185 == class07185.field_11051 ? 0.0625 : f1;
      return class00734.N(class06889, d0, d1, d2);
   }

   private void N(int var1, boolean var2) {
      this.method_5841().N(u, var1 % 8);
      if (var2 && this.y != null) {
         this.method_73183().method_8455(this.y, class00869.N);
      }
   }

   public void N(int var1) {
      this.N(var1, true);
   }

   public class04891 W() {
      return class04909.sg;
   }

   public class04891 R() {
      return class04909.sO;
   }
}
