package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class class02349 extends class00453 {
   private static final Map<class01894, class02320> y = Stream.of(class02330.N, class02317.L, class02351.y)
      .collect(Collectors.toMap(class02320::N, Function.identity()));
   private static final Codec<class02320> L = class01894.N.comapFlatMap(var0 -> {
      class02320 class02320 = y.get(var0);
      return class02320 != null ? DataResult.success(class02320) : DataResult.error(() -> "No formula type with id: '" + var0 + "'");
   }, class02320::N);
   private static final MapCodec<class02339> u = class06338.N("formula", "parameters", L, class02339::N, class02320::y);
   public static final MapCodec<class02349> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(var0.group(class07304.L.fieldOf("enchantment").forGetter(var0x -> var0x.i), u.forGetter(var0x -> var0x.R)))
         .apply(var0, class02349::new)
   );
   private final class03556<class07304> i;
   private final class02339 R;

   private class02349(List<class05957> var1, class03556<class07304> var2, class02339 var3) {
      super(var1);
      this.i = var2;
      this.R = var3;
   }

   public static class00471<?> y(class03556<class07304> var0) {
      return N(var1 -> new class02349(var1, var0, new class02351(1)));
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(class06551.U);
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      class06584 class06584 = var2.L(class06551.U);
      if (class06584 != null) {
         int ix = class07323.N(this.i, class06584);
         int j = this.R.N(var2.y(), var1.c(), ix);
         var1.i(j);
      }

      return var1;
   }

   public static class00471<?> N(class03556<class07304> var0, float var1, int var2) {
      return N(var3 -> new class02349(var3, var0, new class02330(var2, var1)));
   }

   public static class00471<?> N(class03556<class07304> var0, int var1) {
      return N(var2 -> new class02349(var2, var0, new class02351(var1)));
   }

   @Override
   public class05959<class02349> N() {
      return class07439.l;
   }

   public static class00471<?> N(class03556<class07304> var0) {
      return N(var1 -> new class02349(var1, var0, class02317.N));
   }
}
