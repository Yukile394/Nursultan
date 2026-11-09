package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.BiConsumer;

public class class05039 extends class05291 {
   public static final MapCodec<class05039> N = RecordCodecBuilder.mapCodec(var0 -> N(var0).apply(var0, class05039::new));

   public class05039(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   private void N(
      class04887 var1,
      BiConsumer<class07209, class00500> var2,
      class06069 var3,
      class07218 var4,
      class01476 var5,
      class07209 var6,
      int var7,
      int var8,
      int var9
   ) {
      var4.N(var6, var7, var8, var9);
      this.N(var1, var2, var3, var4, var5);
   }

   @Override
   public List<class01467> N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, int var4, class07209 var5, class01476 var6) {
      class07209 class07209 = var5.method_10074();
      N(var1, var2, var3, class07209, var6);
      N(var1, var2, var3, class07209.method_10078(), var6);
      N(var1, var2, var3, class07209.method_10072(), var6);
      N(var1, var2, var3, class07209.method_10072().method_10078(), var6);
      class07218 class07218 = new class07218();

      for (int i = 0; i < var4; i++) {
         this.N(var1, var2, var3, class07218, var6, var5, 0, i, 0);
         if (i < var4 - 1) {
            this.N(var1, var2, var3, class07218, var6, var5, 1, i, 0);
            this.N(var1, var2, var3, class07218, var6, var5, 1, i, 1);
            this.N(var1, var2, var3, class07218, var6, var5, 0, i, 1);
         }
      }

      return ImmutableList.of(new class01467(var5.method_10086(var4), 0, true));
   }

   @Override
   protected class05312<?> N() {
      return class05312.L;
   }
}
