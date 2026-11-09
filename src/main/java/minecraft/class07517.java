package minecraft;

import java.util.Collection;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class07517 extends class08007 {
   private static final class02131<Byte> M = class03289.N(class07517.class, class02154.N);
   private static final class02131<Boolean> B = class03289.N(class07517.class, class02154.U);
   private static final float Z = 0.99F;
   private static final boolean z = false;
   public boolean u = false;
   public int R;

   @Override
   public void L() {
      byte b0 = this.field_6011.N(M);
      if (this.y != class08008.field_7593 || b0 <= 0) {
         super.L();
      }
   }

   @Override
   protected class06584 M() {
      return new class06584(class06570.db);
   }

   @Override
   public class06584 method_59958() {
      return this.B();
   }

   @Override
   protected void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(M, (byte)0);
      var1.N(B, false);
   }

   @Override
   public void method_5773() {
      if (this.N > 4) {
         this.u = true;
      }

      class07049 class07049 = this.z();
      byte b0 = this.field_6011.N(M);
      if (b0 > 0 && (this.u || this.W()) && class07049 != null) {
         if (!this.b()) {
            if (this.method_73183() instanceof class04782 class04782 && this.y == class08008.field_7593) {
               this.method_5699(class04782, this.R(), 0.1F);
            }

            this.method_31472();
         } else {
            if (!(class07049 instanceof class08036) && this.method_73189().R(class07049.method_33571()) < class07049.method_17681() + 1.0) {
               this.method_31472();
               return;
            }

            this.L(true);
            class06889 class06889 = class07049.method_33571().u(this.method_73189());
            this.method_23327(this.method_23317(), this.method_23318() + class06889.B * 0.015 * b0, this.method_23321());
            double d0 = 0.05 * b0;
            this.method_18799(this.method_18798().L(0.95).i(class06889.u().L(d0)));
            if (this.R == 0) {
               this.method_5783(class04909.QC, 10.0F, 1.0F);
            }

            this.R++;
         }
      }

      super.method_5773();
   }

   @Override
   public void method_5694(class08036 var1) {
      if (this.u(var1) || this.z() == null) {
         super.method_5694(var1);
      }
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("DealtDamage", this.u);
   }

   @Override
   public boolean method_5727(double var1, double var3, double var5) {
      return true;
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.u = var1.N("DealtDamage", false);
      this.field_6011.N(M, this.y(this.B()));
   }

   public class07517(class07299 var1, class07438 var2, class06584 var3) {
      super(class07078.yo, var2, var1, var3, null);
      this.field_6011.N(M, this.y(var3));
      this.field_6011.N(B, var3.Q());
   }

   public class07517(class07299 var1, double var2, double var4, double var6, class06584 var8) {
      super(class07078.yo, var2, var4, var6, var1, var8, var8);
      this.field_6011.N(M, this.y(var8));
      this.field_6011.N(B, var8.Q());
   }

   public class07517(class07078<? extends class07517> var1, class07299 var2) {
      super(var1, var2);
   }

   private boolean b() {
      class07049 class07049 = this.z();
      return class07049 == null || !class07049.method_5805() ? false : !(class07049 instanceof class04770) || !class07049.method_7325();
   }

   @Override
   public boolean m() {
      return this.field_6011.N(B);
   }

   @Override
   protected class04891 u() {
      return class04909.Qf;
   }

   @Override
   protected Collection<class06145> y(class06889 var1, class06889 var2) {
      class06145 class06145 = this.N(var1, var2);
      return class06145 != null ? List.of(class06145) : List.of();
   }

   private byte y(class06584 var1) {
      class07299 class07299 = this.method_73183();
      return class07299 instanceof class04782 ? (byte)class04995.N(class07323.L((class04782)class07299, var1, this), 0, 127) : 0;
   }

   @Override
   protected float E() {
      return 0.99F;
   }

   @Override
   protected boolean N(class08036 var1) {
      return super.N(var1) || this.W() && this.u(var1) && var1.method_31548().M(this.R());
   }

   @Override
   protected void N(class04782 var1, class06183 var2, class06584 var3) {
      class06889 class06889 = var2.u().method_60913(var2.y());
      class07049 class07049 = this.z();
      class07323.N(
         var1,
         var3,
         class07049 instanceof class07438 ? (class07438)class07049 : null,
         this,
         null,
         class06889,
         var1.method_8320(var2.u()),
         var2x -> this.method_5768(var1)
      );
   }

   @Nullable
   @Override
   protected class06145 N(class06889 var1, class06889 var2) {
      return this.u ? null : super.N(var1, var2);
   }

   @Override
   protected void N(class06145 var1) {
      class07049 class07049x = var1.L();
      float f = 8.0F;
      class07049 class07049x = this.z();
      class07072 class07072 = this.method_48923().N(this, (class07049)(class07049x == null ? this : class07049x));
      if (this.method_73183() instanceof class04782 class04782x) {
         f = class07323.N(class04782x, this.method_59958(), class07049x, class07072, f);
      }

      this.u = true;
      if (class07049x.method_64420(class07072, f)) {
         if (class07049x.method_5864() == class07078.F) {
            return;
         }

         if (this.method_73183() instanceof class04782 class04782) {
            class07323.N(class04782, class07049x, class07072, this.method_59958(), var2x -> this.method_5768(class04782));
         }

         if (class07049x instanceof class07438 class07438) {
            this.N(class07438, class07072);
            this.N(class07438);
         }
      }

      this.N(class04252.y, class07049x, this.i, false);
      this.method_18799(this.method_18798().u(0.02, 0.2, 0.02));
      this.method_5783(class04909.QA, 1.0F, 1.0F);
   }
}
