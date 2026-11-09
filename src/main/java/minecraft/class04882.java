package minecraft;

import Nursultan.class10473;
import Nursultan.class10475;
import Nursultan.class10476;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public abstract class class04882 extends class06091 {
   protected static final class02131<Boolean> L = class03289.N(class04882.class, class02154.U);
   public static Predicate<class00717> u = var0 -> !var0.R()
      && var0.method_5805()
      && class06584.N(var0.N(), class04877.N(var0.method_56673().L(class04227.NF)));
   private static final int N = 0;
   private static final boolean y = false;
   @Nullable
   public class04877 i;
   private int R = 0;
   private boolean M = false;
   private int B;

   @Override
   protected void w() {
      super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 + 2;
   }

   @Nullable
   public class04877 K() {
      return this.i;
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(L, false);
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      if (this.NQ()) {
         this.K().j();
      }

      return super.method_64397(var1, var2, var3);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Wave", this.R);
      var1.N("CanJoinRaid", this.M);
      if (this.i != null) {
         class07299 class07299 = this.method_73183();
         if (class07299 instanceof class04782) {
            ((class04782)class07299).method_19495().N(this.i).ifPresent(var1x -> var1.N("RaidId", var1x));
         }
      }
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.R = var1.N("Wave", 0);
      this.M = var1.N("CanJoinRaid", false);
      if (this.method_73183() instanceof class04782 class04782) {
         var1.i("RaidId").ifPresent(var2x -> {
            this.i = class04782.method_19495().N(var2x);
            if (this.i != null) {
               this.i.N(class04782, this.R, this, false);
               if (this.Q()) {
                  this.i.N(this.R, this);
               }
            }
         });
      }
   }

   public class04882(class07078<? extends class04882> var1, class07299 var2) {
      super(var1, var2);
   }

   public void Z(boolean var1) {
      this.M = var1;
   }

   public boolean V() {
      boolean flag2;
      label21: {
         class06584 class06584 = this.method_6118(class07085.field_6169);
         if (!class06584.R()) {
            class00751 class00751 = this.method_56673().L(class04227.NF);
            if (class06584.N(class06584, this.N(class00751))) {
               flag2 = true;
               break label21;
            }
         }

         flag2 = false;
      }

      boolean flag = flag2;
      boolean flag1 = this.Q();
      return flag && flag1;
   }

   public boolean e() {
      return !(this.method_73183() instanceof class04782 class04782) ? false : this.K() != null || class04782.method_19502(this.method_24515()) != null;
   }

   public boolean q() {
      return this.M;
   }

   public void z(boolean var1) {
      this.field_6011.N(L, var1);
   }

   public void y(int var1) {
      this.B = var1;
   }

   public abstract class04891 E();

   @Override
   public boolean N(double var1) {
      return this.K() == null ? super.N(var1) : false;
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      this.Z(this.method_5864() != class07078.yp || var3 != class06113.field_16459);
      return super.N(var1, var2, var3, var4);
   }

   public void N(@Nullable class04877 var1) {
      this.i = var1;
   }

   @Override
   public void N(class04782 var1, class00717 var2) {
      class06584 class06584x = var2.N();
      boolean flag = this.NQ() && this.K().y(this.NO()) != null;
      if (this.NQ() && !flag) {
         class00751 class00751 = this.method_56673().L(class04227.NF);
         if (class06584.N(class06584x, this.N(class00751))) {
            class07085 class07085 = class07085.field_6169;
            class06584 class06584x = this.method_6118(class07085);
            double d0 = this.NE().y(class07085);
            if (!class06584x.R() && Math.max(this.field_5974.z() - 0.1F, 0.0F) < d0) {
               this.method_5775(var1, class06584x);
            }

            this.method_29499(var2);
            this.method_5673(class07085, class06584x);
            this.method_6103(var2, class06584x.c());
            var2.method_31472();
            this.K().N(this.NO(), this);
            this.M(true);
            return;
         }
      }

      super.N(var1, var2);
   }

   public void N(int var1) {
      this.R = var1;
   }

   private class06584 N(class02055 var1) {
      class06584 class06584 = this.method_73183().lithium$getData().ominousBanner();
      if (class06584 == null) {
         class06584 = class04877.N(var1);
      }

      return class06584;
   }

   public abstract void N(class04782 var1, int var2, boolean var3);

   @Override
   public boolean O() {
      return !this.NQ();
   }

   @Override
   public boolean Nu() {
      return super.Nu() || this.K() != null;
   }

   public int NO() {
      return this.R;
   }

   @Override
   public void l_() {
      super.l_();
      this.e.N(1, new class10473<>(this, this));
      this.e.N(3, new class04845<>(this));
      this.e.N(4, new class10476(this, 1.05F, 1));
      this.e.N(5, new class10475(this, this));
   }

   public boolean NQ() {
      return this.K() != null && this.K().T();
   }

   public boolean Ng() {
      return this.field_6011.N(L);
   }

   public int NI() {
      return this.B;
   }

   @Override
   public void method_6007() {
      if (this.method_73183() instanceof class04782 class04782 && this.method_5805()) {
         class04877 class04877 = this.K();
         if (this.q()) {
            if (class04877 == null) {
               if (this.method_73183().N() % 20L == 0L) {
                  class04877 class04877x = class04782.method_19502(this.method_24515());
                  if (class04877x != null && class04868.N(this)) {
                     class04877x.N(class04782, class04877x.z(), this, null, true);
                  }
               }
            } else {
               class07438 class07438 = this.T();
               if (class07438 != null && (class07438.method_5864() == class07078.Ly || class07438.method_5864() == class07078.Nn)) {
                  super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
               }
            }
         }
      }

      super.method_6007();
   }

   @Override
   public void method_6078(class07072 var1) {
      if (this.method_73183() instanceof class04782 class04782) {
         class07049 class07049 = var1.u();
         class04877 class04877 = this.K();
         if (class04877 != null) {
            if (this.Q()) {
               class04877.L(this.NO());
            }

            if (class07049 != null && class07049.method_5864() == class07078.Ly) {
               class04877.N(class07049);
            }

            class04877.N(class04782, this, false);
         }
      }

      super.method_6078(var1);
   }
}
