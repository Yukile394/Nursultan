package minecraft;

import java.util.EnumSet;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class07993 extends class07473 {
   public static final int y = 1;
   protected final class07475 L;
   protected final double u;
   protected double i;
   protected double R;
   protected double M;
   protected boolean B;
   private final Function<class07475, class03530<class03689>> N;

   @Override
   public void L() {
      this.L.f().N(this.i, this.R, this.M, this.u);
      this.B = true;
   }

   protected boolean M() {
      return this.L.method_6081() != null && this.L.method_6081().N(this.N.apply(this.L));
   }

   public class07993(class07475 var1, double var2) {
      this(var1, var2, class03696.I);
   }

   public class07993(class07475 var1, double var2, Function<class07475, class03530<class03689>> var4) {
      super();
      this.L = var1;
      this.u = var2;
      this.N = var4;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   public class07993(class07475 var1, double var2, class03530<class03689> var4) {
      this(var1, var2, var1x -> var4);
   }

   protected boolean Z() {
      class06889 class06889 = class05475.N(this.L, 5, 4);
      if (class06889 == null) {
         return false;
      } else {
         this.i = class06889.M;
         this.R = class06889.B;
         this.M = class06889.Z;
         return true;
      }
   }

   public boolean U() {
      return this.B;
   }

   @Override
   public void u() {
      this.B = false;
   }

   @Override
   public boolean y() {
      return !this.L.f().U();
   }

   @Nullable
   protected class07209 N(class07290 var1, class07049 var2, int var3) {
      class07209 class07209 = var2.method_24515();
      return !var1.method_8320(class07209).M(var1, class07209).method_1110()
         ? null
         : class07209.method_25997(var2.method_24515(), var3, 1, var1x -> var1.method_8316(var1x).N(class01231.N)).orElse(null);
   }

   @Override
   public boolean N() {
      if (!this.M()) {
         return false;
      } else {
         if (this.L.method_5809()) {
            class07209 class07209 = this.N(this.L.method_73183(), this.L, 5);
            if (class07209 != null) {
               this.i = class07209.method_10263();
               this.R = class07209.method_10264();
               this.M = class07209.method_10260();
               return true;
            }
         }

         return this.Z();
      }
   }
}
