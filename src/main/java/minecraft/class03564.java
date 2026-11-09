package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;

public class class03564 extends class01219 {
   public static final MapCodec<class03564> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class05235.N.fieldOf("delegate").forGetter(var0x -> var0x.y), class02142.i.fieldOf("limit").forGetter(var0x -> var0x.L))
         .apply(var0, class03564::new)
   );
   private final class01219 y;
   private final class02142 L;

   public class03564(class01219 var1, class02142 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   @Override
   protected class05235<?> N() {
      return class05235.P;
   }

   @Override
   public final List<class01228> N(class01001 var1, class07209 var2, class07209 var3, List<class01228> var4, List<class01228> var5, class01233 var6) {
      if (this.L.L() != 0 && !var5.isEmpty()) {
         if (var4.size() != var5.size()) {
            class07536.y(
               "Original block info list not in sync with processed list, skipping processing. Original size: "
                  + var4.size()
                  + ", Processed size: "
                  + var5.size()
            );
            return var5;
         } else {
            class06069 class06069 = class06069.y(var1.method_8410().method_8412()).L().N(var2);
            int i = Math.min(this.L.N(class06069), var5.size());
            if (i < 1) {
               return var5;
            } else {
               IntIterator intiterator = class07536.N(IntStream.range(0, var5.size()), class06069).intIterator();
               int j = 0;

               while (intiterator.hasNext() && j < i) {
                  int k = intiterator.nextInt();
                  class01228 class01228xx = (class01228)var4.get(k);
                  class01228 class01228x = (class01228)var5.get(k);
                  class01228 class01228xx = this.y.N(var1, var2, var3, class01228xx, class01228x, var6);
                  if (class01228xx != null && !class01228x.equals(class01228xx)) {
                     j++;
                     var5.set(k, class01228xx);
                  }
               }

               return var5;
            }
         }
      } else {
         return var5;
      }
   }
}
