package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;

public class class04668 extends class00453 {
   public static final MapCodec<class04668> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class03748.N.sizeLimitedListOf(256).fieldOf("lore").forGetter(var0x -> var0x.y),
               class02489.N(256).forGetter(var0x -> var0x.L),
               class05919.field_45792.optionalFieldOf("entity").forGetter(var0x -> var0x.u)
            )
         )
         .apply(var0, class04668::new)
   );
   private final List<class00392> y;
   private final class02489 L;
   private final Optional<class05919> u;

   public static class04686 L() {
      return new class04686();
   }

   public class04668(List<class05957> var1, List<class00392> var2, class02489 var3, Optional<class05919> var4) {
      super(var1);
      this.y = List.copyOf(var2);
      this.L = var3;
      this.u = var4;
   }

   @Override
   public Set<class07491<?>> y() {
      return this.u.<Set<class07491<?>>>map(var0 -> Set.of(var0.N())).orElseGet(Set::of);
   }

   @Override
   public class05959<class04668> N() {
      return class07439.k;
   }

   private List<class00392> N(@Nullable class02848 var1, class05908 var2) {
      if (var1 == null && this.y.isEmpty()) {
         return List.of();
      } else {
         UnaryOperator unaryoperator = class04646.N(var2, this.u.orElse(null));
         List list = this.y.stream().map(unaryoperator).toList();
         return this.L.N(var1.N(), list, 256);
      }
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      var1.N(class02484.W, class02848.N, var2x -> new class02848(this.N(var2x, var2)));
      return var1;
   }
}
