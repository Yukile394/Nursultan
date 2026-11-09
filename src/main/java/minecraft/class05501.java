package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class class05501 extends class00453 {
   public static final MapCodec<class05501> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class04206.i.b().fieldOf("block").forGetter(var0x -> var0x.y),
               Codec.STRING.listOf().fieldOf("properties").forGetter(var0x -> var0x.L.stream().map(class08092::R).toList())
            )
         )
         .apply(var0, class05501::new)
   );
   private final class03556<class00891> y;
   private final Set<class08092<?>> L;

   class05501(List<class05957> var1, class03556<class00891> var2, Set<class08092<?>> var3) {
      super(var1);
      this.y = var2;
      this.L = var3;
   }

   private class05501(List<class05957> var1, class03556<class00891> var2, List<String> var3) {
      this(var1, var2, var3.stream().map(((class00891)var2.N()).E()::N).filter(Objects::nonNull).collect(Collectors.toSet()));
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(class06551.Z);
   }

   public static class05496 N(class00891 var0) {
      return new class05496(var0);
   }

   @Override
   protected class06584 N(class06584 var1, class05908 var2) {
      class00500 class00500 = var2.L(class06551.Z);
      if (class00500 != null) {
         var1.N(class02484.Nl, class02841.N, var2x -> {
            for (class08092 class08092 : this.L) {
               if (class00500.y(class08092)) {
                  var2x = var2x.N(class08092, class00500);
               }
            }

            return var2x;
         });
      }

      return var1;
   }

   @Override
   public class05959<class05501> N() {
      return class07439.O;
   }
}
