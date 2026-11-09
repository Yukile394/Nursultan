package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.LongSupplier;

public class class07587 {
   public static final Codec<class03556<class07587>> N = class03539.N(class04227.yG);
   private static final Codec<Map<class00607<?>, class07605<?, ?>>> u = Codec.dispatchedMap(class00608.f, class07536.y_4(class07605::N));
   public static final Codec<class07587> y = RecordCodecBuilder.create(
         var0 -> var0.group(
               class06338.b.optionalFieldOf("period_ticks").forGetter(var0x -> var0x.i), u.optionalFieldOf("tracks", Map.of()).forGetter(var0x -> var0x.R)
            )
            .apply(var0, class07587::new)
      )
      .validate(class07587::y);
   public static final Codec<class07587> L = y.xmap(class07587::N, class07587::N);
   private final Optional<Integer> i;
   private final Map<class00607<?>, class07605<?, ?>> R;

   public Set<class00607<?>> L() {
      return this.R.keySet();
   }

   class07587(Optional<Integer> var1, Map<class00607<?>, class07605<?, ?>> var2) {
      super();
      this.i = var1;
      this.R = var2;
   }

   private static DataResult<class07587> y(class07587 var0) {
      if (var0.i.isEmpty()) {
         return DataResult.success(var0);
      } else {
         int ix = var0.i.get();
         DataResult dataresult = DataResult.success(var0);

         for (class07605 class07605 : var0.R.values()) {
            dataresult = dataresult.apply2stable((var0x, var1x) -> var0x, class07605.N(class07605, ix));
         }

         return dataresult;
      }
   }

   public Optional<Integer> y() {
      return this.i;
   }

   public long y(class07299 var1) {
      return var1.method_8532();
   }

   private static class07587 N(class07587 var0) {
      Map map = Map.copyOf(Maps.filterKeys(var0.R, class00607::u));
      return new class07587(var0.i, map);
   }

   public long N(class07299 var1) {
      long ix = this.y(var1);
      return this.i.isEmpty() ? ix : ix % this.i.get().intValue();
   }

   public static class07595 N() {
      return new class07595();
   }

   public <Value> class07576<Value, ?> N(class00607<Value> var1, LongSupplier var2) {
      class07605 class07605 = this.R.get(var1);
      if (class07605 == null) {
         throw new IllegalStateException("Timeline has no track for " + var1);
      } else {
         return class07605.N(var1, this.i, var2);
      }
   }
}
