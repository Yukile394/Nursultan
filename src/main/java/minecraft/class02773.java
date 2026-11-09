package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class class02773 extends class05291 {
   public static final MapCodec<class02773> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class06338.b.optionalFieldOf("min_height_for_leaves", 1).forGetter(var0x -> var0x.M),
               class02142.N(1, 64).fieldOf("bend_length").forGetter(var0x -> var0x.B)
            )
         )
         .apply(var0, class02773::new)
   );
   private final int M;
   private final class02142 B;

   public class02773(int var1, int var2, int var3, int var4, class02142 var5) {
      super(var1, var2, var3);
      this.M = var4;
      this.B = var5;
   }

   @Override
   public List<class01467> N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, int var4, class07209 var5, class01476 var6) {
      class07211 class07211 = class07221.field_11062.N(var3);
      int i = var4 - 1;
      class07218 class07218 = var5.method_25503();
      class07209 class07209 = class07218.method_10074();
      N(var1, var2, var3, class07209, var6);
      ArrayList arraylist = Lists.newArrayList();

      for (int j = 0; j <= i; j++) {
         if (j + 1 >= i + var3.y(2)) {
            class07218.N(class07211);
         }

         if (class03194.L(var1, class07218)) {
            this.y(var1, var2, var3, class07218, var6);
         }

         if (j >= this.M) {
            arraylist.add(new class01467(class07218.method_10062(), 0, false));
         }

         class07218.N(class07211.field_11036);
      }

      int l = this.B.N(var3);

      for (int k = 0; k <= l; k++) {
         if (class03194.L(var1, class07218)) {
            this.y(var1, var2, var3, class07218, var6);
         }

         arraylist.add(new class01467(class07218.method_10062(), 0, false));
         class07218.N(class07211);
      }

      return arraylist;
   }

   @Override
   protected class05312<?> N() {
      return class05312.M;
   }
}
