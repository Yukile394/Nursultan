package minecraft;

import java.util.Optional;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public abstract class class02260 extends class08039 implements class05640 {
   public static final class01284 u = new class02247(true, false, Optional.empty(), class04206.i.N(class01210.Lp).map(Function.identity()));
   public static final double R = 0.25;

   @Override
   public class06584 L() {
      return class06584.E;
   }

   @Override
   protected class00734 method_65341(class06889 var1) {
      float f = this.method_5864().E().N() / 2.0F;
      float f1 = this.method_5864().E().y();
      float f2 = 0.15F;
      return new class00734(var1.M - f, var1.B - 0.15F, var1.Z - f, var1.M + f, var1.B - 0.15F + f1, var1.Z + f);
   }

   @Override
   public void method_5773() {
      if (!this.method_73183().method_8608() && this.method_31478() > this.method_73183().method_31600() + 30) {
         this.N(this.method_73189());
         this.method_31472();
      } else {
         super.method_5773();
      }
   }

   @Override
   public void method_5762(double var1, double var3, double var5) {
   }

   @Override
   public boolean method_30949(class07049 var1) {
      return var1 instanceof class02260 ? false : super.method_30949(var1);
   }

   public class02260(class07078<? extends class02260> var1, class07299 var2, class07049 var3, double var4, double var6, double var8) {
      super(var1, var4, var6, var8, var2);
      this.L(var3);
      this.L = 0.0;
   }

   class02260(class07078<? extends class02260> var1, double var2, double var4, double var6, class06889 var8, class07299 var9) {
      super(var1, var2, var4, var6, var8, var9);
      this.L = 0.0;
   }

   public class02260(class07078<? extends class02260> var1, class07299 var2) {
      super(var1, var2);
      this.L = 0.0;
   }

   @Override
   protected float i() {
      return 1.0F;
   }

   @Nullable
   @Override
   protected class07126 u() {
      return null;
   }

   protected abstract void N(class06889 var1);

   @Override
   protected boolean N(class07049 var1) {
      if (var1 instanceof class02260) {
         return false;
      } else {
         return var1.method_5864() == class07078.S ? false : super.N(var1);
      }
   }

   @Override
   protected void N(class06183 var1) {
      super.N(var1);
      if (!this.method_73183().method_8608()) {
         class06889 class06889x = class06889.N(var1.i().E()).u(0.25, 0.25, 0.25);
         class06889 class06889x = var1.y().i(class06889x);
         this.N(class06889x);
         this.method_31472();
      }
   }

   @Override
   protected void N(class07089 var1) {
      super.N(var1);
      if (!this.method_73183().method_8608()) {
         this.method_31472();
      }
   }

   @Override
   protected void N(class06145 var1) {
      super.N(var1);
      if (this.method_73183() instanceof class04782 class04782) {
         class07438 class07438 = this.z() instanceof class07438 class07438x ? class07438x : null;
         class07049 class07049 = var1.L();
         if (class07438 != null) {
            class07438.method_6114(class07049);
         }

         class07072 class07072 = this.method_48923().L(this, class07438);
         if (class07049.method_64397(class04782, class07072, 1.0F) && class07049 instanceof class07438 class07438xx) {
            class07323.N(class04782, (class07049)class07438xx, class07072);
         }

         this.N(this.method_73189());
      }
   }

   @Override
   protected float R() {
      return this.i();
   }

   @Override
   protected boolean ad_() {
      return false;
   }
}
