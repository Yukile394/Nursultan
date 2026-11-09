package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class00749 extends class07133 {
   public static final MapCodec<class00749> N = y(class00749::new);
   public static final int y = 3;
   public static final class08071 L = class06665.NG;
   private static final int R = 4;
   private static final int M = 2;

   public class00749(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, 0));
   }

   private boolean u(class00500 var1, class07299 var2, class07209 var3) {
      int i = var1.L(L);
      if (i < 3) {
         var2.method_8652(var3, var1.y(L, i + 1), 2);
         return false;
      } else {
         this.L(var1, var2, var3);
         return true;
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L);
   }

   private boolean N(class07290 var1, class07209 var2, int var3) {
      int i = 0;
      class07218 class07218 = new class07218();

      for (class07211 class07211 : class07211.values()) {
         class07218.N(var2, class07211);
         if (var1.method_8320(class07218).N(this)) {
            if (++i >= var3) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return class06584.E;
   }

   @Override
   public MapCodec<class00749> N() {
      return N;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (var4.W().N(this) && this.N(var2, var3, 2)) {
         this.L(var1, var2, var3);
      }

      super.N(var1, var2, var3, var4, var5, var6);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if ((var4.y(3) == 0 || this.N(var2, var3, 4))
         && (var2.method_27983() == class07299.field_25181 ? var2.method_8314(class00772.field_9282, var3) : var2.U(var3)) > 11 - var1.L(L) - var1.z()
         && this.u(var1, var2, var3)) {
         class07218 class07218 = new class07218();

         for (class07211 class07211 : class07211.values()) {
            class07218.N(var3, class07211);
            class00500 class00500 = var2.method_8320(class07218);
            if (class00500.N(this) && !this.u(class00500, var2, class07218)) {
               var2.N(class07218, this, class04995.N(var4, 20, 40));
            }
         }
      } else {
         var2.N(var3, this, class04995.N(var4, 20, 40));
      }
   }

   @Override
   public void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      var2.N(var3, this, class04995.N(var2.method_8409(), 60, 120));
   }
}
