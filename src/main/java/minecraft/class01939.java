package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class class01939 extends class05291 {
   private static final Codec<class02135> M = class02135.N
      .codec()
      .validate(
         var0 -> var0.L() - var0.y() < 1
            ? DataResult.error(() -> "Need at least 2 blocks variation for the branch starts to fit both branches")
            : DataResult.success(var0)
      );
   public static final MapCodec<class01939> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class02142.N(1, 3).fieldOf("branch_count").forGetter(var0x -> var0x.B),
               class02142.N(2, 16).fieldOf("branch_horizontal_length").forGetter(var0x -> var0x.Z),
               class02142.N(-16, 0, M).fieldOf("branch_start_offset_from_top").forGetter(var0x -> var0x.z),
               class02142.N(-16, 16).fieldOf("branch_end_offset_from_top").forGetter(var0x -> var0x.E)
            )
         )
         .apply(var0, class01939::new)
   );
   private final class02142 B;
   private final class02142 Z;
   private final class02135 z;
   private final class02135 U;
   private final class02142 E;

   public class01939(int var1, int var2, int var3, class02142 var4, class02142 var5, class02135 var6, class02142 var7) {
      super(var1, var2, var3);
      this.B = var4;
      this.Z = var5;
      this.z = var6;
      this.U = class02135.y(var6.y(), var6.L() - 1);
      this.E = var7;
   }

   private class01467 N(
      class04887 var1,
      BiConsumer<class07209, class00500> var2,
      class06069 var3,
      int var4,
      class07209 var5,
      class01476 var6,
      Function<class00500, class00500> var7,
      class07211 var8,
      int var9,
      boolean var10,
      class07218 var11
   ) {
      var11.N(var5).N(class07211.field_11036, var9);
      int i = var4 - 1 + this.E.N(var3);
      boolean flag = var10 || i < var9;
      int j = this.Z.N(var3) + (flag ? 1 : 0);
      class07209 class07209 = var5.method_10079(var8, j).method_10086(i);
      int k = flag ? 2 : 1;

      for (int l = 0; l < k; l++) {
         this.N(var1, var2, var3, var11.N(var8), var6, var7);
      }

      class07211 class07211 = class07209.method_10264() > var11.method_10264() ? class07211.field_11036 : class07211.field_11033;

      while (true) {
         int i1 = var11.method_19455(class07209);
         if (i1 == 0) {
            return new class01467(class07209.method_10084(), 0, false);
         }

         float f = (float)Math.abs(class07209.method_10264() - var11.method_10264()) / i1;
         boolean flag1 = var3.z() < f;
         var11.N(flag1 ? class07211 : var8);
         this.N(var1, var2, var3, var11, var6, flag1 ? Function.identity() : var7);
      }
   }

   @Override
   public List<class01467> N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, int var4, class07209 var5, class01476 var6) {
      N(var1, var2, var3, var5.method_10074(), var6);
      int i = Math.max(0, var4 - 1 + this.z.N(var3));
      int j = Math.max(0, var4 - 1 + this.U.N(var3));
      if (j >= i) {
         j++;
      }

      int k = this.B.N(var3);
      boolean flag = k == 3;
      boolean flag1 = k >= 2;
      int l;
      if (flag) {
         l = var4;
      } else if (flag1) {
         l = Math.max(i, j) + 1;
      } else {
         l = i + 1;
      }

      for (int i1 = 0; i1 < l; i1++) {
         this.y(var1, var2, var3, var5.method_10086(i1), var6);
      }

      ArrayList arraylist = new ArrayList();
      if (flag) {
         arraylist.add(new class01467(var5.method_10086(l), 0, false));
      }

      class07218 class07218 = new class07218();
      class07211 class07211 = class07221.field_11062.N(var3);
      Function function = var1x -> var1x.L(class07004.L, class07211.z());
      arraylist.add(this.N(var1, var2, var3, var4, var5, var6, function, class07211, i, i < l - 1, class07218));
      if (flag1) {
         arraylist.add(this.N(var1, var2, var3, var4, var5, var6, function, class07211.b(), j, j < l - 1, class07218));
      }

      return arraylist;
   }

   @Override
   protected class05312<?> N() {
      return class05312.Z;
   }
}
