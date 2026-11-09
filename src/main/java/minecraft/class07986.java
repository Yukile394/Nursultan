package minecraft;

import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Set;

public class class07986 extends class00453 {
   public static final MapCodec<class07986> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class07965.R.listOf().fieldOf("modifiers").forGetter(var0x -> var0x.y), Codec.BOOL.optionalFieldOf("replace", true).forGetter(var0x -> var0x.L)
            )
         )
         .apply(var0, class07986::new)
   );
   private final List<class07965> y;
   private final boolean L;

   public static class07992 L() {
      return new class07992();
   }

   class07986(List<class05957> var1, List<class07965> var2, boolean var3) {
      super(var1);
      this.y = List.copyOf(var2);
      this.L = var3;
   }

   @Override
   public Set<class07491<?>> y() {
      return this.y.stream().flatMap(var0 -> var0.u().y().stream()).collect(ImmutableSet.toImmutableSet());
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      if (this.L) {
         var1.N(class02484.b, this.N(var2, class02833.N));
      } else {
         var1.N(class02484.b, class02833.N, var2x -> this.N(var2, var2x));
      }

      return var1;
   }

   private class02833 N(class05908 var1, class02833 var2) {
      class06069 class06069 = var1.y();

      for (class07965 class07965 : this.y) {
         class02834 class02834 = class07536.N_77(class07965.i(), class06069);
         var2 = var2.N(class07965.y(), new class07471(class07965.N(), class07965.u().y(var1), class07965.L()), class02834);
      }

      return var2;
   }

   public static class07968 N(class01894 var0, class03556<class07468> var1, class07463 var2, class06378 var3) {
      return new class07968(var0, var1, var2, var3);
   }

   @Override
   public class05959<class07986> N() {
      return class07439.P;
   }
}
