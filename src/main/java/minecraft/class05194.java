package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public final class class05194 {
   private static final String y = "#";
   public static final Codec<class05194> N = Codec.STRING.comapFlatMap(class05194::N, class05194::y);
   private static final Map<class06541, class05194> L = Stream.of(class06541.values())
      .filter(class06541::u)
      .collect(ImmutableMap.toImmutableMap(Function.identity(), var0 -> new class05194(var0.i(), var0.R())));
   private static final Map<String, class05194> u = L.values().stream().collect(ImmutableMap.toImmutableMap(var0 -> var0.R, Function.identity()));
   private final int i;
   @Nullable
   private final String R;

   public final String L() {
      return String.format(Locale.ROOT, "#%06X", this.i);
   }

   private class05194(int var1, String var2) {
      super();
      this.i = var1 & 16777215;
      this.R = var2;
   }

   private class05194(int var1) {
      super();
      this.i = var1 & 16777215;
      this.R = null;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class05194 class05194 = (class05194)var1;
         return this.i == class05194.i;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.y();
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.i, this.R);
   }

   public String y() {
      return this.R != null ? this.R : this.L();
   }

   @Nullable
   public static class05194 N(class06541 var0) {
      return L.get(var0);
   }

   public static class05194 N(int var0) {
      return new class05194(var0);
   }

   public int N() {
      return this.i;
   }

   public static DataResult<class05194> N(String var0) {
      if (var0.startsWith("#")) {
         try {
            int ix = Integer.parseInt(var0.substring(1), 16);
            return ix >= 0 && ix <= 16777215 ? DataResult.success(N(ix), Lifecycle.stable()) : DataResult.error(() -> "Color value out of range: " + var0);
         } catch (NumberFormatException numberformatexception) {
            return DataResult.error(() -> "Invalid color value: " + var0);
         }
      } else {
         class05194 class05194 = u.get(var0);
         return class05194 == null ? DataResult.error(() -> "Invalid color name: " + var0) : DataResult.success(class05194, Lifecycle.stable());
      }
   }
}
