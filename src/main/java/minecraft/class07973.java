package minecraft;

import java.util.function.BiPredicate;
import net.caffeinemc.mods.lithium.common.ai.non_poi_block_search.LithiumMoveToBlockGoal;
import org.jspecify.annotations.Nullable;

public class class07973 extends class07969 implements LithiumMoveToBlockGoal {
   private final class00891 M;
   private final class07079 B;
   private int Z;
   private static final int z = 20;
   private static final BiPredicate U = class07973::N;

   @Override
   public void L() {
      super.L();
      this.Z = 0;
   }

   public class07973(class00891 var1, class07475 var2, double var3, int var5) {
      super(var2, var3, 24, var5);
      this.M = var1;
      this.B = var2;
   }

   @Override
   public void i() {
      super.i();
      class07299 class07299 = this.B.method_73183();
      class07209 class07209x = this.B.method_24515();
      class07209 class07209x = this.N(class07209x, class07299);
      class06069 class06069 = this.B.method_59922();
      if (this.W() && class07209x != null) {
         if (this.Z > 0) {
            class06889 class06889x = this.B.method_18798();
            this.B.method_18800(class06889x.M, 0.3, class06889x.Z);
            if (!class07299.method_8608()) {
               double d0 = 0.08;
               ((class04782)class07299)
                  .method_65096(
                     new class07092(class07107.S, new class06584(class06570.jO)),
                     class07209x.method_10263() + 0.5,
                     class07209x.method_10264() + 0.7,
                     class07209x.method_10260() + 0.5,
                     3,
                     (class06069.z() - 0.5) * 0.08,
                     (class06069.z() - 0.5) * 0.08,
                     (class06069.z() - 0.5) * 0.08,
                     0.15F
                  );
            }
         }

         if (this.Z % 2 == 0) {
            class06889 class06889 = this.B.method_18798();
            this.B.method_18800(class06889.M, -0.3, class06889.Z);
            if (this.Z % 6 == 0) {
               this.N((class07284)class07299, this.i);
            }
         }

         if (this.Z > 60) {
            class07299.method_8650(class07209x, false);
            if (!class07299.method_8608()) {
               for (int i = 0; i < 20; i++) {
                  double d3 = class06069.E() * 0.02;
                  double d1 = class06069.E() * 0.02;
                  double d2 = class06069.E() * 0.02;
                  ((class04782)class07299)
                     .method_65096(
                        class07107.NR, class07209x.method_10263() + 0.5, class07209x.method_10264(), class07209x.method_10260() + 0.5, 1, d3, d1, d2, 0.15F
                     );
               }

               this.N(class07299, class07209x);
            }
         }

         this.Z++;
      }
   }

   @Override
   public void u() {
      super.u();
      this.B.field_6017 = 1.0;
   }

   protected boolean N(class07973 var1) {
      return var1.lithium$findNearestBlock(this::N, U, false);
   }

   private boolean N(class00500 var1) {
      return var1.N(this.M);
   }

   private static boolean N(class08050 var0, class07218 var1) {
      return var0.method_8320(var1.y(0, 1, 0)).P() && var0.method_8320(var1.y(0, 1, 0)).P();
   }

   @Override
   protected boolean N(class05487 var1, class07209 var2) {
      class08050 class08050 = var1.method_8402(class01296.N(var2.method_10263()), class01296.N(var2.method_10260()), class00549.m, false);
      return class08050 == null
         ? false
         : class08050.method_8320(var2).N(this.M) && class08050.method_8320(var2.method_10084()).P() && class08050.method_8320(var2.method_10086(2)).P();
   }

   public void N(class07299 var1, class07209 var2) {
   }

   @Override
   public boolean N() {
      if (!N(this.B).method_64395().N(class07305.I)) {
         return false;
      } else if (this.L > 0) {
         this.L--;
         return false;
      } else if (this.N(this)) {
         this.L = y(20);
         return true;
      } else {
         this.L = this.N(this.N);
         return false;
      }
   }

   @Nullable
   private class07209 N(class07209 var1, class07290 var2) {
      if (var2.method_8320(var1).N(this.M)) {
         return var1;
      } else {
         for (class07209 class07209 : new class07209[]{
            var1.method_10074(), var1.method_10067(), var1.method_10078(), var1.method_10095(), var1.method_10072(), var1.method_10074().method_10074()
         }) {
            if (var2.method_8320(class07209).N(this.M)) {
               return class07209;
            }
         }

         return null;
      }
   }

   public void N(class07284 var1, class07209 var2) {
   }
}
