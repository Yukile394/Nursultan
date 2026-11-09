package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class class07453 extends class07633 implements class02145 {
   public static final int B = 144;
   private static final int N = 2;
   private static final int y = 3;
   private static final int L = 1;
   private static final boolean u = false;
   protected static final class02131<Byte> Z = class03289.N(class07453.class, class02154.N);
   protected static final class02131<Optional<class08372<class07438>>> X = class03289.N(class07453.class, class02154.b);
   private boolean i = false;

   public void No() {
      class07438 class07438 = this.L_();
      if (class07438 != null) {
         this.N(class07438.method_24515());
      }
   }

   protected void M(boolean var1) {
      class07134 class07134 = class07107.f;
      if (!var1) {
         class07134 = class07107.NZ;
      }

      for (int ix = 0; ix < 7; ix++) {
         double d0 = this.field_5974.E() * 0.02;
         double d1 = this.field_5974.E() * 0.02;
         double d2 = this.field_5974.E() * 0.02;
         this.method_73183().method_8406(class07134, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), d0, d1, d2);
      }
   }

   @Nullable
   @Override
   public class00502 method_5781() {
      class00502 class00502 = super.method_5781();
      if (class00502 != null) {
         return class00502;
      } else {
         if (this.NQ()) {
            class07438 class07438 = this.Z();
            if (class07438 != null) {
               return class07438.method_5781();
            }
         }

         return null;
      }
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(Z, (byte)0);
      var1.N(X, Optional.empty());
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      class08372.N(this.NI(), var1, "Owner");
      var1.N("Sitting", this.i);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      class08372 class08372 = class08372.N(var1, "Owner", this.method_73183());
      if (class08372 != null) {
         try {
            this.field_6011.N(X, Optional.of(class08372));
            this.N(true, false);
         } catch (Throwable throwable) {
            this.N(false, true);
         }
      } else {
         this.field_6011.N(X, Optional.empty());
         this.N(false, true);
      }

      this.i = var1.N("Sitting", false);
      this.B(this.i);
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 7) {
         this.M(true);
      } else if (var1 == 6) {
         this.M(false);
      } else {
         super.method_5711(var1);
      }
   }

   @Override
   protected boolean method_61416(class07049 var1) {
      if (this.NQ()) {
         class07438 class07438 = this.Z();
         if (var1 == class07438) {
            return true;
         }

         if (class07438 != null) {
            return class07438.method_61416(var1);
         }
      }

      return super.method_61416(var1);
   }

   public class07453(class07078<? extends class07453> var1, class07299 var2) {
      super(var1, var2);
   }

   public void B(boolean var1) {
      byte b0 = this.field_6011.N(Z);
      if (var1) {
         this.field_6011.N(Z, (byte)(b0 | 1));
      } else {
         this.field_6011.N(Z, (byte)(b0 & -2));
      }
   }

   public void Z(boolean var1) {
      this.i = var1;
   }

   @Override
   public boolean L(class07438 var1) {
      return var1 == this.L_();
   }

   @Override
   public boolean g() {
      return true;
   }

   public void u(class08036 var1) {
      this.N(true, true);
      this.u((class07438)var1);
      if (var1 instanceof class04770 class04770) {
         class06912.d.N(class04770, this);
      }
   }

   public void u(@Nullable class07438 var1) {
      this.field_6011.N(X, Optional.ofNullable(var1).map(class08372::N));
   }

   private boolean y(class07209 var1) {
      if (class07955.N(this, var1) != class04425.field_12) {
         return false;
      } else {
         class00500 class00500 = this.method_73183().method_8320(var1.method_10074());
         if (!this.NV() && class00500.i() instanceof class07131) {
            return false;
         } else {
            class07209 class07209 = var1.method_10059(this.method_24515());
            return this.method_73183().method_8587(this, this.method_5829().N(class07209));
         }
      }
   }

   private boolean N(int var1, int var2, int var3) {
      if (!this.y(new class07209(var1, var2, var3))) {
         return false;
      } else {
         this.method_5808(var1 + 0.5, var2, var3 + 0.5, this.method_36454(), this.method_36455());
         this.V.W();
         return true;
      }
   }

   public void N(boolean var1, boolean var2) {
      byte b0 = this.field_6011.N(Z);
      if (var1) {
         this.field_6011.N(Z, (byte)(b0 | 4));
      } else {
         this.field_6011.N(Z, (byte)(b0 & -5));
      }

      if (var2) {
         this.NO();
      }
   }

   private void N(class07209 var1) {
      for (int ix = 0; ix < 10; ix++) {
         int j = this.field_5974.N(-3, 3);
         int k = this.field_5974.N(-3, 3);
         if (Math.abs(j) >= 2 || Math.abs(k) >= 2) {
            int l = this.field_5974.N(-1, 1);
            if (this.N(var1.method_10263() + j, var1.method_10264() + l, var1.method_10260() + k)) {
               return;
            }
         }
      }
   }

   public boolean N(class07438 var1, class07438 var2) {
      return true;
   }

   public void a_(@Nullable class08372<class07438> var1) {
      this.field_6011.N(X, Optional.ofNullable(var1));
   }

   protected void NO() {
   }

   public boolean NQ() {
      return (this.field_6011.N(Z) & 4) != 0;
   }

   public final boolean NK() {
      return this.NJ() || this.method_5765() || this.yz() || this.L_() != null && this.L_().method_7325();
   }

   public boolean Ng() {
      return (this.field_6011.N(Z) & 1) != 0;
   }

   public boolean NJ() {
      return this.i;
   }

   @Nullable
   @Override
   public class08372<class07438> NI() {
      return this.field_6011.N(X).orElse(null);
   }

   protected boolean NV() {
      return false;
   }

   public boolean Nq() {
      return this.L_() != null && this.method_5858(this.L_()) >= 144.0;
   }

   @Override
   public boolean method_18395(class07438 var1) {
      return this.L(var1) ? false : super.method_18395(var1);
   }

   @Override
   public void method_6078(class07072 var1) {
      class07299 class07299 = this.method_73183();
      if (class07299 instanceof class04782 && ((class04782)class07299).method_64395().N(class07305.f) && this.L_() instanceof class04770 class04770) {
         class04770.method_64398(this.method_6066().N());
      }

      super.method_6078(var1);
   }
}
