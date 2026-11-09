package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class class07205 extends class07796 implements class02234 {
   public static final MapCodec<class07205> N = y(class07205::new);

   public class07205(class01362 var1) {
      super(var1);
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (var4.method_5822(false) && !var2.method_8608() && var2.method_8321(var3) instanceof class00491 class00491 && !class00491.L()) {
         var4.method_60697(this, var3);
         class00491.L(var2, var3, var1, class00491);
      }
   }

   @Override
   protected boolean N(class00500 var1, class04651 var2) {
      return false;
   }

   @Nullable
   @Override
   public class01032 N(class04782 var1, class07049 var2, class07209 var3) {
      if (var1.method_8321(var3) instanceof class00491 class00491) {
         class06889 class06889 = class00491.N(var1, var3);
         if (class06889 == null) {
            return null;
         } else {
            return var2 instanceof class07488
               ? new class01032(var1, class06889, class06889.L, 0.0F, 0.0F, Set.of(), class01032.L)
               : new class01032(var1, class06889, class06889.L, 0.0F, 0.0F, class06681.N(class06681.field_54094, class06681.field_40711), class01032.L);
         }
      } else {
         return null;
      }
   }

   @Override
   public MapCodec<class07205> N() {
      return N;
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class00491(var1, var2);
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return N(var3, class00404.field_11906, var1.method_8608() ? class00491::N : class00491::y);
   }

   @Override
   public void N_20(class00500 var1, class07299 var2, class07209 var3, class06069 var4) {
      class00394 class00394 = var2.method_8321(var3);
      if (class00394 instanceof class00491) {
         int i = ((class00491)class00394).R();

         for (int j = 0; j < i; j++) {
            double d0 = var3.method_10263() + var4.U();
            double d1 = var3.method_10264() + var4.U();
            double d2 = var3.method_10260() + var4.U();
            double d3 = (var4.U() - 0.5) * 0.5;
            double d4 = (var4.U() - 0.5) * 0.5;
            double d5 = (var4.U() - 0.5) * 0.5;
            int k = var4.y(2) * 2 - 1;
            if (var4.Z()) {
               d2 = var3.method_10260() + 0.5 + 0.25 * k;
               d5 = var4.z() * 2.0F * k;
            } else {
               d0 = var3.method_10263() + 0.5 + 0.25 * k;
               d3 = var4.z() * 2.0F * k;
            }

            var2.method_8406(class07107.NM, d0, d1, d2, d3, d4, d5);
         }
      }
   }

   @Override
   public class06584 N(class05487 var1, class07209 var2, class00500 var3, boolean var4) {
      return class06584.E;
   }

   @Override
   protected class06898 d_(class00500 var1) {
      return class06898.field_11455;
   }
}
