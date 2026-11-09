package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.BiConsumer;

public class class05314 extends class05291 {
   public static final MapCodec<class05314> N = RecordCodecBuilder.mapCodec(var0 -> N(var0).apply(var0, class05314::new));

   public class05314(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   protected class05312<?> N() {
      return class05312.N;
   }

   @Override
   public List<class01467> N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, int var4, class07209 var5, class01476 var6) {
      N(var1, var2, var3, var5.method_10074(), var6);

      for (int i = 0; i < var4; i++) {
         this.y(var1, var2, var3, var5.method_10086(i), var6);
      }

      return ImmutableList.of(new class01467(var5.method_10086(var4), 0, false));
   }
}
