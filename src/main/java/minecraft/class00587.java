package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public final class class00587 {
   public static final class00587 N = new class00587(Map.of());
   public static final Codec<class00587> y = Codec.lazyInitialized(
      () -> Codec.dispatchedMap(class00608.f, class07536.y_4(class00599::N)).xmap(class00587::new, var0 -> var0.i)
   );
   public static final Codec<class00587> L = y.xmap(class00587::N, class00587::N);
   public static final Codec<class00587> u = y.validate(var0 -> {
      List<class00607<?>> list = var0.y().stream().filter(var0x -> !var0x.i()).toList();
      return !list.isEmpty() ? DataResult.error(() -> "The following attributes cannot be positional: " + list) : DataResult.success(var0);
   });
   final Map<class00607<?>, class00599<?, ?>> i;

   class00587(Map<class00607<?>, class00599<?, ?>> var1) {
      super();
      this.i = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this ? true : var1 instanceof class00587 class00587 && this.i.equals(class00587.i);
   }

   @Override
   public String toString() {
      return this.i.toString();
   }

   @Override
   public int hashCode() {
      return this.i.hashCode();
   }

   public boolean y(class00607<?> var1) {
      return this.i.containsKey(var1);
   }

   public Set<class00607<?>> y() {
      return this.i.keySet();
   }

   @Nullable
   public <Value> class00599<Value, ?> N(class00607<Value> var1) {
      return (class00599<Value, ?>)this.i.get(var1);
   }

   public static class00576 N() {
      return new class00576();
   }

   private static class00587 N(class00587 var0) {
      return new class00587(Map.copyOf(Maps.filterKeys(var0.i, class00607::u)));
   }

   public <Value> Value N(class00607<Value> var1, Value var2) {
      class00599 class00599 = this.N(var1);
      return (Value)(class00599 != null ? class00599.N(var2) : var2);
   }
}
