package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;

public class class00725 extends class07732 implements class00873 {
   public static final MapCodec<class00725> N = y(class00725::new);

   public class00725(class01362 var1) {
      super(var1);
   }

   @Override
   public void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4) {
      class07209 class07209x = var3.method_10084();
      class00500 class00500x = class00869.yk.W();
      Optional optional = var1.method_30349().L(class04227.ys).N(class03189.P);

      label51:
      for (int i = 0; i < 128; i++) {
         class07209 class07209x = class07209x;

         for (int j = 0; j < i / 16; j++) {
            class07209x = class07209x.method_10069(var2.y(3) - 1, (var2.y(3) - 1) * var2.y(3) / 2, var2.y(3) - 1);
            if (!var1.method_8320(class07209x.method_10074()).N(this) || var1.method_8320(class07209x).W(var1, class07209x)) {
               continue label51;
            }
         }

         class00500 class00500x = var1.method_8320(class07209x);
         if (class00500x.N(class00500x.i()) && var2.y(10) == 0) {
            class00873 var11 = (class00873)class00500x.i();
            if (var11.N((class05487)var1, class07209x, class00500x)) {
               var11.N(var1, var2, class07209x, class00500x);
            }
         }

         if (class00500x.P()) {
            class03556<class04336> class03556;
            if (var2.y(8) == 0) {
               List<class03238<?, ?>> list = var1.i(class07209x).N().L().y();
               if (list.isEmpty()) {
                  continue;
               }

               int k = var2.y(list.size());
               class03556 = ((class01478)list.get(k).L()).i();
            } else {
               if (!optional.isPresent()) {
                  continue;
               }

               class03556 = (class03556<class04336>)optional.get();
            }

            class03556.N().N(var1, var1.method_14178().U(), var2, class07209x);
         }
      }
   }

   @Override
   public MapCodec<class00725> N() {
      return N;
   }

   @Override
   public boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4) {
      return true;
   }

   @Override
   public boolean N(class05487 var1, class07209 var2, class00500 var3) {
      return var1.method_8320(var2.method_10084()).P();
   }

   @Override
   public class00901 ay_() {
      return class00901.field_47834;
   }
}
