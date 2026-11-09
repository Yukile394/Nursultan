package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class00655 extends class00891 {
   public static final MapCodec<class00655> N = y(class00655::new);
   public static final class06667 y = class06665.o;

   public class00655(class01362 var1) {
      super(var1);
      this.P(this.W().y(y, false));
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (!var1.N(class06570.sf) && !var1.N(class06570.GZ)) {
         return super.N(var1, var2, var3, var4, var5, var6, var7);
      } else {
         if (N(var3, var4, var5)) {
            var3.method_8652(var4, class00869.N.W(), 11);
            class06581 class06581 = var1.B();
            if (var1.N(class06570.sf)) {
               var1.N(1, var5, var6.N());
            } else {
               var1.N(1, var5);
            }

            var5.method_7259(class01235.L.y(class06581));
         } else if (var3 instanceof class04782 && !((class04782)var3).method_64395().N(class07305.Nu)) {
            var5.method_7353(class00392.L("block.minecraft.tnt.disabled"), true);
            return class07082.i;
         }

         return class07082.N;
      }
   }

   @Override
   protected void N(class07299 var1, class00500 var2, class06183 var3, class08005 var4) {
      if (var1 instanceof class04782 class04782) {
         class07209 class07209 = var3.u();
         class07049 class07049 = var4.z();
         if (var4.method_5809()
            && var4.method_36971(class04782, class07209)
            && N(var1, class07209, class07049 instanceof class07438 ? (class07438)class07049 : null)) {
            var1.method_8650(class07209, false);
         }
      }
   }

   private static boolean N(class07299 var0, class07209 var1, @Nullable class07438 var2) {
      if (var0 instanceof class04782 && ((class04782)var0).method_64395().N(class07305.Nu)) {
         class00674 class00674 = new class00674(var0, var1.method_10263() + 0.5, var1.method_10264(), var1.method_10260() + 0.5, var2);
         var0.method_8649(class00674);
         var0.method_43128(
            null, class00674.method_23317(), class00674.method_23318(), class00674.method_23321(), class04909.Qp, class04911.field_15245, 1.0F, 1.0F
         );
         var0.N(var2, class01194.q, var1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean N(class07307 var1) {
      return false;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }

   @Override
   public MapCodec<class00655> N() {
      return N;
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var4.N(var1.i())) {
         if (var2.W(var3) && N(var2, var3)) {
            var2.method_8650(var3, false);
         }
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (var2.W(var3) && N(var2, var3)) {
         var2.method_8650(var3, false);
      }
   }

   @Override
   public class00500 N(class07299 var1, class07209 var2, class00500 var3, class08036 var4) {
      if (!var1.method_8608() && !var4.method_31549().u && var3.L(y)) {
         N(var1, var2);
      }

      return super.N(var1, var2, var3, var4);
   }

   @Override
   public void N_5(class04782 var1, class07209 var2, class07307 var3) {
      if (var1.method_64395().N(class07305.Nu)) {
         class00674 class00674 = new class00674(var1, var2.method_10263() + 0.5, var2.method_10264(), var2.method_10260() + 0.5, var3.L());
         int i = class00674.y();
         class00674.N((short)(var1.field_9229.y(i / 4) + i / 8));
         var1.method_8649(class00674);
      }
   }

   public static boolean N(class07299 var0, class07209 var1) {
      return N(var0, var1, null);
   }
}
