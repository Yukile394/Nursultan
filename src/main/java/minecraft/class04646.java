package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04646 extends class00453 {
   private static final Logger y = LogUtils.getLogger();
   public static final MapCodec<class04646> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class03748.N.optionalFieldOf("name").forGetter(var0x -> var0x.L),
               class05919.field_45792.optionalFieldOf("entity").forGetter(var0x -> var0x.u),
               class04675.field_50212.optionalFieldOf("target", class04675.field_50210).forGetter(var0x -> var0x.i)
            )
         )
         .apply(var0, class04646::new)
   );
   private final Optional<class00392> L;
   private final Optional<class05919> u;
   private final class04675 i;

   private class04646(List<class05957> var1, Optional<class00392> var2, Optional<class05919> var3, class04675 var4) {
      super(var1);
      this.L = var2;
      this.u = var3;
      this.i = var4;
   }

   @Override
   public Set<class07491<?>> y() {
      return this.u.<Set<class07491<?>>>map(var0 -> Set.of(var0.N())).orElse(Set.of());
   }

   @Override
   public class05959<class04646> N() {
      return class07439.s;
   }

   public static class00471<?> N(class00392 var0, class04675 var1, class05919 var2) {
      return N(var3 -> new class04646(var3, Optional.of(var0), Optional.of(var2), var1));
   }

   public static class00471<?> N(class00392 var0, class04675 var1) {
      return N(var2 -> new class04646(var2, Optional.of(var0), Optional.empty(), var1));
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      this.L.ifPresent(var3 -> var1.N(this.i.N(), N(var2, this.u.orElse(null)).apply(var3)));
      return var1;
   }

   public static UnaryOperator<class00392> N(class05908 var0, @Nullable class05919 var1) {
      if (var1 != null) {
         class07049 class07049 = var0.L(var1.N());
         if (class07049 != null) {
            return var2x -> {
               try {
                  return class00390.N(var0x, var2x, class07049, 0);
               } catch (CommandSyntaxException commandsyntaxexception) {
                  y.warn("Failed to resolve text component", commandsyntaxexception);
                  return var2x;
               }
            };
         }
      }

      return var0x -> var0x;
   }
}
