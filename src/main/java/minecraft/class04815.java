package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class class04815 extends class00453 {
   public static final MapCodec<class04815> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               Codec.unboundedMap(class07304.L, class06339.N).optionalFieldOf("enchantments", Map.of()).forGetter(var0x -> var0x.y),
               Codec.BOOL.fieldOf("add").orElse(false).forGetter(var0x -> var0x.L)
            )
         )
         .apply(var0, class04815::new)
   );
   private final Map<class03556<class07304>, class06378> y;
   private final boolean L;

   class04815(List<class05957> var1, Map<class03556<class07304>, class06378> var2, boolean var3) {
      super(var1);
      this.y = Map.copyOf(var2);
      this.L = var3;
   }

   @Override
   public Set<class07491<?>> y() {
      return this.y.values().stream().flatMap(var0 -> var0.y().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      if (var1.N(class06570.jY)) {
         var1 = var1.N((class07310)class06570.Gq);
      }

      class07323.N(
         var1,
         var2x -> {
            if (this.L) {
               this.y
                  .forEach(
                     (var2xx, var3) -> var2x.N((class03556<class07304>)var2xx, class04995.N(var2x.N((class03556<class07304>)var2xx) + var3.N(var2), 0, 255))
                  );
            } else {
               this.y.forEach((var2xx, var3) -> var2x.N((class03556<class07304>)var2xx, class04995.N(var3.N(var2), 0, 255)));
            }
         }
      );
      return var1;
   }

   @Override
   public class05959<class04815> N() {
      return class07439.Z;
   }
}
