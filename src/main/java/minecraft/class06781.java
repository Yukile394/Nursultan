package minecraft;

import com.mojang.serialization.MapCodec;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracking;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class06781 extends class07101 {
   public static final class06667 L = class06665.k;
   private static final class00494 N = class00891.y(16.0, 0.0, 2.0);

   protected void L(class07299 var1, class07209 var2, class00500 var3) {
      if (!this.y((class05487)var1, var2, var3)) {
         boolean flag = var3.L(L);
         boolean flag1 = this.N(var1, var2, var3);
         if (flag != flag1 && !var1.method_8397().y(var2, this)) {
            class00763 class00763 = class00763.field_9310;
            if (this.y((class07290)var1, var2, var3)) {
               class00763 = class00763.field_9315;
            } else if (flag) {
               class00763 = class00763.field_9313;
            }

            var1.N(var2, this, this.U(var3), class00763);
         }
      }
   }

   public class06781(class01362 var1) {
      super(var1);
   }

   protected abstract int U(class00500 var1);

   protected void u(class07299 var1, class07209 var2, class00500 var3) {
      class07211 class07211 = var3.L(R);
      class07209 class07209 = var2.method_10093(class07211.b());
      class02733 class02733 = class02752.N(var1, class07211.b(), class07211.field_11036);
      var1.method_8492(class07209, this, class02733);
      var1.method_8508(class07209, this, class07211, class02733);
   }

   public boolean y(class05487 var1, class07209 var2, class00500 var3) {
      return false;
   }

   public int y(class07299 var1, class07209 var2, class00500 var3) {
      class07211 class07211 = var3.L(R);
      class07209 class07209 = var2.method_10093(class07211);
      int i = var1.u(class07209, class07211);
      if (i >= 15) {
         return i;
      } else {
         class00500 class00500 = var1.method_8320(class07209);
         return Math.max(i, class00500.N(class00869.Lf) ? class00500.L(class06884.R) : 0);
      }
   }

   protected boolean y() {
      return false;
   }

   public boolean y(class07290 var1, class07209 var2, class00500 var3) {
      class07211 class07211 = var3.L(R).b();
      class00500 class00500 = var1.method_8320(var2.method_10093(class07211));
      return E(class00500) && class00500.L(R) != class07211;
   }

   @Override
   protected int y(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      return var1.N(var2, var3, var4);
   }

   public static boolean E(class00500 var0) {
      return var0.i() instanceof class06781;
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      if (!var4) {
         this.u(var2, var3, var1);
      }
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      this.u(var2, var3, var1);
      this.N(var1, var2, var3, var4, var5, null);
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      if (this.N(var1, var2, var3)) {
         var1.N(var2, this, 1);
      }
   }

   private void N(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5, CallbackInfo var6) {
      if (this instanceof class06775 && !var4.N(class00869.Ba)) {
         ComparatorTracking.notifyNearbyBlockEntitiesAboutNewComparator(var2, var3);
      }
   }

   protected int N(class07290 var1, class07209 var2, class00500 var3) {
      return 15;
   }

   @Override
   protected int N_8(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      if (!var1.L(L)) {
         return 0;
      } else {
         return var1.L(R) == var4 ? this.N(var2, var3, var1) : 0;
      }
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (!this.y((class05487)var2, var3, var1)) {
         boolean flag = var1.L(L);
         boolean flag1 = this.N((class07299)var2, var3, var1);
         if (flag && !flag1) {
            var2.method_8652(var3, var1.y(L, false), 2);
         } else if (!flag) {
            var2.method_8652(var3, var1.y(L, true), 2);
            if (!flag1) {
               var2.N(var3, this, this.U(var1), class00763.field_9313);
            }
         }
      }
   }

   protected boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var3.N(var1, var2, class07211.field_11036, class01020.field_25824);
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return N;
   }

   @Override
   protected abstract MapCodec<? extends class06781> N();

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(R, var1.method_8042().b());
   }

   protected int N(class03589 var1, class07209 var2, class00500 var3) {
      class07211 class07211xx = var3.L(R);
      class07211 class07211x = class07211xx.R();
      class07211 class07211xx = class07211xx.M();
      boolean flag = this.y();
      return Math.max(var1.N(var2.method_10093(class07211x), class07211x, flag), var1.N(var2.method_10093(class07211xx), class07211xx, flag));
   }

   protected boolean N(class07299 var1, class07209 var2, class00500 var3) {
      return this.y(var1, var2, var3) > 0;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (var1.N((class05487)var2, var3)) {
         this.L(var2, var3, var1);
      } else {
         class00394 class00394 = var1.k() ? var2.method_8321(var3) : null;
         N(var1, var2, var3, class00394);
         var2.method_8650(var3, false);

         for (class07211 class07211 : class07211.values()) {
            var2.method_8408(var3.method_10093(class07211), this);
         }
      }
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10074();
      return this.N(var2, class07209, var2.method_8320(class07209));
   }

   @Override
   protected boolean i_(class00500 var1) {
      return true;
   }
}
