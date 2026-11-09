package minecraft;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class class03640 extends class05291 {
   public static final MapCodec<class03640> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class02142.i.fieldOf("extra_branch_steps").forGetter(var0x -> var0x.M),
               Codec.floatRange(0.0F, 1.0F).fieldOf("place_branch_per_log_probability").forGetter(var0x -> var0x.B),
               class02142.u.fieldOf("extra_branch_length").forGetter(var0x -> var0x.Z),
               class03541.N(class04227.Z).fieldOf("can_grow_through").forGetter(var0x -> var0x.z)
            )
         )
         .apply(var0, class03640::new)
   );
   private final class02142 M;
   private final float B;
   private final class02142 Z;
   private final class03543<class00891> z;

   public class03640(int var1, int var2, int var3, class02142 var4, float var5, class02142 var6, class03543<class00891> var7) {
      super(var1, var2, var3);
      this.M = var4;
      this.B = var5;
      this.Z = var6;
      this.z = var7;
   }

   @Override
   protected class05312<?> N() {
      return class05312.B;
   }

   private void N(
      class04887 var1,
      BiConsumer<class07209, class00500> var2,
      class06069 var3,
      int var4,
      class01476 var5,
      List<class01467> var6,
      class07218 var7,
      int var8,
      class07211 var9,
      int var10,
      int var11
   ) {
      int i = var8 + var10;
      int j = var7.method_10263();
      int k = var7.method_10260();
      int l = var10;

      while (l < var4 && var11 > 0) {
         if (l >= 1) {
            int i1 = var8 + l;
            j += var9.P();
            k += var9.T();
            i = i1;
            if (this.y(var1, var2, var3, var7.N(j, i1, k), var5)) {
               i = i1 + 1;
            }

            var6.add(new class01467(var7.method_10062(), 0, false));
         }

         l++;
         var11--;
      }

      if (i - var8 > 1) {
         class07209 class07209 = new class07209(j, i, k);
         var6.add(new class01467(class07209, 0, false));
         var6.add(new class01467(class07209.method_10087(2), 0, false));
      }
   }

   @Override
   protected boolean N(class04887 var1, class07209 var2) {
      return super.N(var1, var2) || var1.method_16358(var2, var1x -> var1x.N(this.z));
   }

   @Override
   public List<class01467> N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, int var4, class07209 var5, class01476 var6) {
      ArrayList arraylist = Lists.newArrayList();
      class07218 class07218 = new class07218();

      for (int i = 0; i < var4; i++) {
         int j = var5.method_10264() + i;
         if (this.y(var1, var2, var3, class07218.N(var5.method_10263(), j, var5.method_10260()), var6) && i < var4 - 1 && var3.z() < this.B) {
            class07211 class07211 = class07221.field_11062.N(var3);
            int k = this.Z.N(var3);
            int l = Math.max(0, k - this.Z.N(var3) - 1);
            int i1 = this.M.N(var3);
            this.N(var1, var2, var3, var4, var6, arraylist, class07218, j, class07211, l, i1);
         }

         if (i == var4 - 1) {
            arraylist.add(new class01467(class07218.N(var5.method_10263(), j + 1, var5.method_10260()), 0, false));
         }
      }

      return arraylist;
   }
}
