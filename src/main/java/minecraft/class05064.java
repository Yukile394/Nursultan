package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class class05064 extends class05291 {
   public static final MapCodec<class05064> N = RecordCodecBuilder.mapCodec(var0 -> N(var0).apply(var0, class05064::new));

   public class05064(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected class05312<?> N() {
      return class05312.i;
   }

   @Override
   public List<class01467> N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, int var4, class07209 var5, class01476 var6) {
      ArrayList arraylist = Lists.newArrayList();
      class07209 class07209x = var5.method_10074();
      N(var1, var2, var3, class07209x, var6);
      N(var1, var2, var3, class07209x.method_10078(), var6);
      N(var1, var2, var3, class07209x.method_10072(), var6);
      N(var1, var2, var3, class07209x.method_10072().method_10078(), var6);
      class07211 class07211 = class07221.field_11062.N(var3);
      int i = var4 - var3.y(4);
      int j = 2 - var3.y(3);
      int k = var5.method_10263();
      int l = var5.method_10264();
      int i1 = var5.method_10260();
      int j1 = k;
      int k1 = i1;
      int l1 = l + var4 - 1;

      for (int i2 = 0; i2 < var4; i2++) {
         if (i2 >= i && j > 0) {
            j1 += class07211.P();
            k1 += class07211.T();
            j--;
         }

         int j2 = l + i2;
         class07209 class07209x = new class07209(j1, j2, k1);
         if (class03194.y(var1, class07209x)) {
            this.y(var1, var2, var3, class07209x, var6);
            this.y(var1, var2, var3, class07209x.method_10078(), var6);
            this.y(var1, var2, var3, class07209x.method_10072(), var6);
            this.y(var1, var2, var3, class07209x.method_10078().method_10072(), var6);
         }
      }

      arraylist.add(new class01467(new class07209(j1, l1, k1), 0, true));

      for (int l2 = -1; l2 <= 2; l2++) {
         for (int i3 = -1; i3 <= 2; i3++) {
            if ((l2 < 0 || l2 > 1 || i3 < 0 || i3 > 1) && var3.y(3) <= 0) {
               int j3 = var3.y(3) + 2;

               for (int k2 = 0; k2 < j3; k2++) {
                  this.y(var1, var2, var3, new class07209(k + l2, l1 - k2 - 1, i1 + i3), var6);
               }

               arraylist.add(new class01467(new class07209(k + l2, l1, i1 + i3), 0, false));
            }
         }
      }

      return arraylist;
   }
}
