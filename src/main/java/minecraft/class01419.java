package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.Supplier;

record class01419<T>(class04922<T> type, class03556<T> value, class00836 range, Supplier<class04907<T>> stat) {
   public static final Codec<class01419<?>> N = class04206.G.T().dispatch(class01419::N, class01419::N);

   public class00836 L() {
      return this.range;
   }

   public class01419(class04922<T> var1, class03556<T> var2, class00836 var3) {
      this(var1, var2, var3, Suppliers.memoize(() -> var1.y(var2.N())));
   }

   private class01419(class04922<T> type, class03556<T> value, class00836 range, Supplier<class04907<T>> stat) {
      this.type = type;
      this.value = value;
      this.range = range;
      this.stat = stat;
   }

   public Supplier<class04907<T>> u() {
      return this.stat;
   }

   public class03556<T> y() {
      return this.value;
   }

   public class04922<T> N() {
      return this.type;
   }

   private static <T> MapCodec<class01419<T>> N(class04922<T> var0) {
      return RecordCodecBuilder.mapCodec(
         var1 -> var1.group(var0.y().b().fieldOf("stat").forGetter(class01419::y), class00836.u.optionalFieldOf("value", class00836.L).forGetter(class01419::L))
            .apply(var1, (var1x, var2) -> new class01419(var0, var1x, var2))
      );
   }

   public boolean N(class01205 var1) {
      return this.range.u(var1.N(this.stat.get()));
   }
}
