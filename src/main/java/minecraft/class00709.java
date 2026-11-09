package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.List;
import java.util.Set;

public class class00709 extends class00453 {
   private static final Codec<List<class00678>> y = class00678.N.listOf().validate(var0 -> {
      ObjectOpenHashSet objectopenhashset = new ObjectOpenHashSet();

      for (class00678 class00678 : var0) {
         if (!objectopenhashset.add(class00678.N())) {
            return DataResult.error(() -> "Encountered duplicate mob effect: '" + class00678.N() + "'");
         }
      }

      return DataResult.success(var0);
   });
   public static final MapCodec<class00709> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(y.optionalFieldOf("effects", List.of()).forGetter(var0x -> var0x.L)).apply(var0, class00709::new)
   );
   private final List<class00678> L;

   public static class00714 L() {
      return new class00714();
   }

   class00709(List<class05957> var1, List<class00678> var2) {
      super(var1);
      this.L = var2;
   }

   @Override
   public Set<class07491<?>> y() {
      return this.L.stream().flatMap(var0 -> var0.y().y().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public class05959<class00709> N() {
      return class07439.b;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      if (var1.N(class06570.dk) && !this.L.isEmpty()) {
         class00678 class00678 = class07536.N_77(this.L, var2.y());
         class03556 class03556 = class00678.N();
         int i = class00678.y().N(var2);
         if (!((class07084)class03556.N()).N()) {
            i *= 20;
         }

         class02679 class02679 = new class02679(class03556, i);
         var1.N(class02484.NN, class02692.N, class02679, class02692::N);
         return var1;
      } else {
         return var1;
      }
   }
}
