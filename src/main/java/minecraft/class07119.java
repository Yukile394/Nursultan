package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public class class07119 extends class00864 implements class00873 {
   public static final MapCodec<class07119> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05946.N(class04227.Nh).fieldOf("feature").forGetter(var0x -> var0x.L), t()).apply(var0, class07119::new)
   );
   private static final class00494 y = class00891.y(6.0, 0.0, 6.0);
   private final class05946<class03238<?, ?>> L;

   public class07119(class05946<class03238<?, ?>> var1, class01362 var2) {
      super(var2);
      this.L = var1;
   }

   @Override
   protected void y_2(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var4.y(25) == 0) {
         int i = 5;
         byte b0 = 4;

         for (class07209 class07209x : class07209.method_10097(var3.method_10069(-4, -1, -4), var3.method_10069(4, 1, 4))) {
            if (var2.method_8320(class07209x).N(this)) {
               if (--i <= 0) {
                  return;
               }
            }
         }

         class07209 class07209x = var3.method_10069(var4.y(3) - 1, var4.y(2) - var4.y(2), var4.y(3) - 1);

         for (int j = 0; j < 4; j++) {
            if (var2.R(class07209x) && var1.N(var2, class07209x)) {
               var3 = class07209x;
            }

            class07209x = var3.method_10069(var4.y(3) - 1, var4.y(2) - var4.y(2), var4.y(3) - 1);
         }

         if (var2.R(class07209x) && var1.N(var2, class07209x)) {
            var2.method_8652(class07209x, var1, 2);
         }
      }
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return var2.z() < 0.4;
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      this.N(var1, var3, var4, var2);
   }

   @Override
   public MapCodec<class07119> N() {
      return N;
   }

   @Override
   protected boolean N(class00500 var1, class07290 var2, class07209 var3) {
      return var1.t();
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return y;
   }

   public boolean N(class04782 var1, class07209 var2, class00500 var3, class06069 var4) {
      Optional optional = var1.method_30349().L(class04227.Nh).N(this.L);
      if (optional.isEmpty()) {
         return false;
      } else {
         var1.method_8650(var2, false);
         if (((class03238)((class03556)optional.get()).N()).N(var1, var1.method_14178().U(), var4, var2)) {
            return true;
         } else {
            var1.method_8652(var2, var3, 3);
            return false;
         }
      }
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return true;
   }

   @Override
   protected boolean a_(class00500 var1, class05487 var2, class07209 var3) {
      class07209 class07209 = var3.method_10074();
      class00500 class00500 = var2.method_8320(class07209);
      return class00500.N(class01210.yE) ? true : var2.method_22335(var3, 0) < 13 && this.N(class00500, var2, class07209);
   }
}
