package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class05338 {
   private static final Codec<class05338> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06339.N.optionalFieldOf("min").forGetter(var0x -> Optional.ofNullable(var0x.L)),
            class06339.N.optionalFieldOf("max").forGetter(var0x -> Optional.ofNullable(var0x.u))
         )
         .apply(var0, class05338::new)
   );
   public static final Codec<class05338> N = Codec.either(Codec.INT, y).xmap(var0 -> (class05338)var0.map(class05338::N, Function.identity()), var0 -> {
      OptionalInt optionalint = var0.y();
      return optionalint.isPresent() ? Either.left(optionalint.getAsInt()) : Either.right(var0);
   });
   @Nullable
   private final class06378 L;
   @Nullable
   private final class06378 u;
   private final class05381 i;
   private final class05353 R;

   public static class05338 L(int var0) {
      return new class05338(Optional.empty(), Optional.of(class04711.N(var0)));
   }

   private class05338(Optional<class06378> var1, Optional<class06378> var2) {
      this(var1.orElse(null), var2.orElse(null));
   }

   private class05338(@Nullable class06378 var1, @Nullable class06378 var2) {
      super();
      this.L = var1;
      this.u = var2;
      if (var1 == null) {
         if (var2 == null) {
            this.i = (var0, var1x) -> var1x;
            this.R = (var0, var1x) -> true;
         } else {
            this.i = (var1x, var2x) -> Math.min(var2.N(var1x), var2x);
            this.R = (var1x, var2x) -> var2x <= var2.N(var1x);
         }
      } else if (var2 == null) {
         this.i = (var1x, var2x) -> Math.max(var1.N(var1x), var2x);
         this.R = (var1x, var2x) -> var2x >= var1.N(var1x);
      } else {
         this.i = (var2x, var3) -> class04995.N(var3, var1.N(var2x), var2.N(var2x));
         this.R = (var2x, var3) -> var3 >= var1.N(var2x) && var3 <= var2.N(var2x);
      }
   }

   public static class05338 y(int var0) {
      return new class05338(Optional.of(class04711.N(var0)), Optional.empty());
   }

   public boolean y(class05908 var1, int var2) {
      return this.R.test(var1, var2);
   }

   private OptionalInt y() {
      return Objects.equals(this.L, this.u) && this.L instanceof class04711 class04711 && Math.floor(class04711.L()) == class04711.L()
         ? OptionalInt.of((int)class04711.L())
         : OptionalInt.empty();
   }

   public Set<class07491<?>> N() {
      Builder builder = ImmutableSet.builder();
      if (this.L != null) {
         builder.addAll(this.L.y());
      }

      if (this.u != null) {
         builder.addAll(this.u.y());
      }

      return builder.build();
   }

   public static class05338 N(int var0) {
      class04711 class04711 = class04711.N(var0);
      return new class05338(Optional.of(class04711), Optional.of(class04711));
   }

   public static class05338 N(int var0, int var1) {
      return new class05338(Optional.of(class04711.N(var0)), Optional.of(class04711.N(var1)));
   }

   public int N(class05908 var1, int var2) {
      return this.i.apply(var1, var2);
   }
}
