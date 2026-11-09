package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiConsumer;

public class class05326 extends class05291 {
   public static final MapCodec<class05326> N = RecordCodecBuilder.mapCodec(var0 -> N(var0).apply(var0, class05326::new));

   public class05326(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected class05312<?> N() {
      return class05312.y;
   }

   @Override
   public List<class01467> N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, int var4, class07209 var5, class01476 var6) {
      N(var1, var2, var3, var5.method_10074(), var6);
      ArrayList arraylist = Lists.newArrayList();
      class07211 class07211x = class07221.field_11062.N(var3);
      int i = var4 - var3.y(4) - 1;
      int j = 3 - var3.y(3);
      class07218 class07218 = new class07218();
      int k = var5.method_10263();
      int l = var5.method_10260();
      OptionalInt optionalint = OptionalInt.empty();

      for (int i1 = 0; i1 < var4; i1++) {
         int j1 = var5.method_10264() + i1;
         if (i1 >= i && j > 0) {
            k += class07211x.P();
            l += class07211x.T();
            j--;
         }

         if (this.y(var1, var2, var3, class07218.N(k, j1, l), var6)) {
            optionalint = OptionalInt.of(j1 + 1);
         }
      }

      if (optionalint.isPresent()) {
         arraylist.add(new class01467(new class07209(k, optionalint.getAsInt(), l), 1, false));
      }

      k = var5.method_10263();
      l = var5.method_10260();
      class07211 class07211x = class07221.field_11062.N(var3);
      if (class07211x != class07211x) {
         int j2 = i - var3.y(2) - 1;
         int k1 = 1 + var3.y(3);
         optionalint = OptionalInt.empty();

         for (int l1 = j2; l1 < var4 && k1 > 0; k1--) {
            if (l1 >= 1) {
               int i2 = var5.method_10264() + l1;
               k += class07211x.P();
               l += class07211x.T();
               if (this.y(var1, var2, var3, class07218.N(k, i2, l), var6)) {
                  optionalint = OptionalInt.of(i2 + 1);
               }
            }

            l1++;
         }

         if (optionalint.isPresent()) {
            arraylist.add(new class01467(new class07209(k, optionalint.getAsInt(), l), 0, false));
         }
      }

      return arraylist;
   }
}
