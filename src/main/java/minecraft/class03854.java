package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import org.slf4j.Logger;

public class class03854 extends class03855 {
   public static final MapCodec<class03854> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06055.N.fieldOf("min_inclusive").forGetter(var0x -> var0x.u), class06055.N.fieldOf("max_inclusive").forGetter(var0x -> var0x.i))
         .apply(var0, class03854::new)
   );
   private static final Logger y = LogUtils.getLogger();
   private final class06055 u;
   private final class06055 i;
   private final LongSet R = new LongOpenHashSet();

   private class03854(class06055 var1, class06055 var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   @Override
   public String toString() {
      return "[" + this.u + "-" + this.i + "]";
   }

   @Override
   public int N(class06069 var1, class06057 var2) {
      int ix = this.u.N(var2);
      int j = this.i.N(var2);
      if (ix > j) {
         if (this.R.add((long)ix << 32 | j)) {
            y.warn("Empty height range: {}", this);
         }

         return ix;
      } else {
         return class04995.y(var1, ix, j);
      }
   }

   public static class03854 N(class06055 var0, class06055 var1) {
      return new class03854(var0, var1);
   }

   @Override
   public class03862<?> N() {
      return class03862.y;
   }
}
