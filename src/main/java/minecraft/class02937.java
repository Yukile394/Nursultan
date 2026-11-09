package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class02937 extends class00453 {
   private static final Codec<class06378> y = Codec.withAlternative(class06339.N, class06338.E, class04711::new);
   public static final MapCodec<class02937> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class02501.N(class06339.N, Integer.MAX_VALUE).optionalFieldOf("floats").forGetter(var0x -> var0x.L),
               class02501.N(Codec.BOOL, Integer.MAX_VALUE).optionalFieldOf("flags").forGetter(var0x -> var0x.u),
               class02501.N(Codec.STRING, Integer.MAX_VALUE).optionalFieldOf("strings").forGetter(var0x -> var0x.i),
               class02501.N(y, Integer.MAX_VALUE).optionalFieldOf("colors").forGetter(var0x -> var0x.R)
            )
         )
         .apply(var0, class02937::new)
   );
   private final Optional<class02501<class06378>> L;
   private final Optional<class02501<Boolean>> u;
   private final Optional<class02501<String>> i;
   private final Optional<class02501<class06378>> R;

   public class02937(
      List<class05957> var1,
      Optional<class02501<class06378>> var2,
      Optional<class02501<Boolean>> var3,
      Optional<class02501<String>> var4,
      Optional<class02501<class06378>> var5
   ) {
      super(var1);
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
   }

   @Override
   public Set<class07491<?>> y() {
      return Stream.concat(this.L.stream(), this.R.stream()).flatMap(var0 -> var0.N().stream()).flatMap(var0 -> var0.y().stream()).collect(Collectors.toSet());
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      class02845 class02845 = var1.a_(class02484.j, class02845.N);
      var1.N(
         class02484.j,
         new class02845(
            N(this.L, class02845.N(), var1x -> var1x.y(var2)),
            N(this.u, class02845.y()),
            N(this.i, class02845.L()),
            N(this.R, class02845.u(), var1x -> var1x.N(var2))
         )
      );
      return var1;
   }

   private static <T, E> List<E> N(Optional<class02501<T>> var0, List<E> var1, Function<T, E> var2) {
      return var0.<List<E>>map(var2x -> {
         List list = var2x.N().stream().map(var2).toList();
         return var2x.y().N(var1, list);
      }).orElse(var1);
   }

   private static <T> List<T> N(Optional<class02501<T>> var0, List<T> var1) {
      return var0.<List<T>>map(var1x -> var1x.N(var1)).orElse(var1);
   }

   @Override
   public class05959<class02937> N() {
      return class07439.F;
   }
}
