package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class class05069 extends class05039 {
   public static final MapCodec<class05069> M = RecordCodecBuilder.mapCodec(var0 -> N(var0).apply(var0, class05069::new));

   public class05069(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected class05312<?> N() {
      return class05312.u;
   }

   @Override
   public List<class01467> N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, int var4, class07209 var5, class01476 var6) {
      ArrayList arraylist = Lists.newArrayList();
      arraylist.addAll(super.N(var1, var2, var3, var4, var5, var6));

      for (int i = var4 - 2 - var3.y(4); i > var4 / 2; i -= 2 + var3.y(4)) {
         float f = var3.z() * (float) (Math.PI * 2);
         int j = 0;
         int k = 0;

         for (int l = 0; l < 5; l++) {
            j = (int)(1.5F + class04995.P(f) * l);
            k = (int)(1.5F + class04995.m(f) * l);
            class07209 class07209 = var5.method_10069(j, i - 3 + l / 2, k);
            this.y(var1, var2, var3, class07209, var6);
         }

         arraylist.add(new class01467(var5.method_10069(j, i, k), -2, false));
      }

      return arraylist;
   }
}
