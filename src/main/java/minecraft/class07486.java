package minecraft;

import Nursultan.class11367;
import Nursultan.class11938;
import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.function.Predicate;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class07486 extends class05668 {
   public static final double N = 4.0;
   protected static final double y = 16.0;
   public static final Predicate<class07438> L = var0 -> var0.method_29503() || var0.method_5809();
   private boolean u;

   @Override
   protected double method_7490() {
      return 0.05;
   }

   public class07486(class07078<? extends class07486> var1, class07299 var2) {
      super(var1, var2);
   }

   public class07486(class07078<? extends class07486> var1, class07299 var2, double var3, double var5, double var7, class06584 var9) {
      super(var1, var3, var5, var7, var2, var9);
   }

   public class07486(class07078<? extends class07486> var1, class07299 var2, class07438 var3, class06584 var4) {
      super(var1, var3, var2, var4);
   }

   private void y(class04782 var1) {
      class00734 class00734 = this.method_5829().L(4.0, 2.0, 4.0);

      for (class07438 var5 : this.method_73183().N(class07438.class, class00734, L)) {
         double d0 = this.method_5858(var5);
         if (d0 < 16.0) {
            if (var5.method_29503()) {
               var5.method_64397(var1, this.method_48923().L(this, this.z()), 1.0F);
            }

            if (var5.method_5809() && var5.method_5805()) {
               var5.method_46395();
            }
         }
      }

      for (class05538 class05538 : this.method_73183().N(class05538.class, class00734)) {
         class05538.W();
      }
   }

   @Override
   protected void N(class06183 var1) {
      super.N(var1);
      if (!this.method_73183().method_8608()) {
         class06584 class06584 = this.L();
         class07211 class07211x = var1.i();
         class07209 class07209 = var1.u().method_10093(class07211x);
         if (class06584.a_(class02484.h, class06517.N).N(class06506.N)) {
            this.N(class07209);
            this.N(class07209.method_10093(class07211x.b()));

            for (class07211 class07211x : class07221.field_11062) {
               this.N(class07209.method_10093(class07211x));
            }
         }
      }
   }

   private void N(class07089 var1, CallbackInfo var2) {
      if (this.method_73183().method_8608() && !this.u) {
         class11367 class11367 = class11367.N(this, var1);
         class11938.L().L(class11367);
         this.u = true;
      }
   }

   @Override
   protected void N(class07089 var1) {
      super.N(var1);
      this.N(var1, null);
      if (this.method_73183() instanceof class04782 class04782) {
         class06584 class06584 = this.L();
         class06517 class06517 = class06584.a_(class02484.h, class06517.N);
         if (class06517.N(class06506.N)) {
            this.y(class04782);
         } else if (class06517.L()) {
            this.N(class04782, class06584, var1);
         }

         int i = class06517.i().isPresent() && class06517.i().get().N().L() ? 2007 : 2002;
         class04782.N(i, this.method_24515(), class06517.y());
         this.method_31472();
      }
   }

   protected abstract void N(class04782 var1, class06584 var2, class07089 var3);

   private void N(class07209 var1) {
      class00500 class00500 = this.method_73183().method_8320(var1);
      if (class00500.N(class01210.Nh)) {
         this.method_73183().N(var1, false, this);
      } else if (class05465.T(class00500)) {
         class05465.N(null, class00500, this.method_73183(), var1);
      } else if (class05847.U(class00500)) {
         this.method_73183().method_8444(null, 1009, var1, 0);
         class05847.N(this.z(), this.method_73183(), var1, class00500);
         this.method_73183().method_8501(var1, class00500.y(class05847.y, false));
      }
   }

   @Override
   public DoubleDoubleImmutablePair a_(class07438 var1, class07072 var2) {
      double d0 = var1.method_73189().M - this.method_73189().M;
      double d1 = var1.method_73189().Z - this.method_73189().Z;
      return DoubleDoubleImmutablePair.of(d0, d1);
   }
}
