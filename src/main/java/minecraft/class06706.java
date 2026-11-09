package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Set;

public class class06706 extends class00453 {
   public static final int N = 0;
   public static final MapCodec<class06706> y = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class07304.L.fieldOf("enchantment").forGetter(var0x -> var0x.L),
               class06339.N.fieldOf("count").forGetter(var0x -> var0x.u),
               Codec.INT.optionalFieldOf("limit", 0).forGetter(var0x -> var0x.i)
            )
         )
         .apply(var0, class06706::new)
   );
   private final class03556<class07304> L;
   private final class06378 u;
   private final int i;

   private boolean L() {
      return this.i > 0;
   }

   class06706(List<class05957> var1, class03556<class07304> var2, class06378 var3, int var4) {
      super(var1);
      this.L = var2;
      this.u = var3;
      this.i = var4;
   }

   @Override
   public Set<class07491<?>> y() {
      return Sets.union(ImmutableSet.of(class06551.R), this.u.y());
   }

   @Override
   public class05959<class06706> N() {
      return class07439.W;
   }

   public static class06700 N(class01929 var0, class06378 var1) {
      class01921 class01921 = var0.y(class04227.yR);
      return new class06700(class01921.y(class07314.j), var1);
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      class07049 class07049 = var2.L(class06551.R);
      if (class07049 instanceof class07438 class07438) {
         int ix = class07323.N(this.L, class07438);
         if (ix == 0) {
            return var1;
         }

         float f = ix * this.u.y(var2);
         var1.M(Math.round(f));
         if (this.L()) {
            var1.R(this.i);
         }
      }

      return var1;
   }
}
