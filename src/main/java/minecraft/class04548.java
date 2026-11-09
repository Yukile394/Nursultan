package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.function.Function;

public record class04548<T extends Comparable<T>>(T minInclusive, T maxInclusive) {
   public static final Codec<class04548<Integer>> N = N(Codec.INT);

   public class04548(T minInclusive, T maxInclusive) {
      if (minInclusive.compareTo(maxInclusive) > 0) {
         throw new IllegalArgumentException("min_inclusive must be less than or equal to max_inclusive");
      } else {
         this.minInclusive = (T)minInclusive;
         this.maxInclusive = (T)maxInclusive;
      }
   }

   public class04548(T var1) {
      this((T)var1, (T)var1);
   }

   @Override
   public String toString() {
      return "[" + this.minInclusive + ", " + this.maxInclusive + "]";
   }

   public T y() {
      return this.maxInclusive;
   }

   public static <T extends Comparable<T>> Codec<class04548<T>> N(Codec<T> var0) {
      return class06338.N(var0, "min_inclusive", "max_inclusive", class04548::N, class04548::N, class04548::y);
   }

   public static <T extends Comparable<T>> DataResult<class04548<T>> N(T var0, T var1) {
      return var0.compareTo(var1) <= 0
         ? DataResult.success(new class04548(var0, var1))
         : DataResult.error(() -> "min_inclusive must be less than or equal to max_inclusive");
   }

   public <S extends Comparable<S>> class04548<S> N(Function<? super T, ? extends S> var1) {
      return new class04548<>((S)var1.apply(this.minInclusive), (S)var1.apply(this.maxInclusive));
   }

   public boolean N(T var1) {
      return var1.compareTo(this.minInclusive) >= 0 && var1.compareTo(this.maxInclusive) <= 0;
   }

   public boolean N(class04548<T> var1) {
      return var1.N().compareTo(this.minInclusive) >= 0 && var1.maxInclusive.compareTo(this.maxInclusive) <= 0;
   }

   public static <T extends Comparable<T>> Codec<class04548<T>> N(Codec<T> var0, T var1, T var2) {
      return N(var0)
         .validate(
            var2x -> {
               if (var2x.N().compareTo(var1) < 0) {
                  return DataResult.error(() -> "Range limit too low, expected at least " + var1 + " [" + var2x.N() + "-" + var2x.y() + "]");
               } else {
                  return var2x.y().compareTo(var2) > 0
                     ? DataResult.error(() -> "Range limit too high, expected at most " + var2 + " [" + var2x.N() + "-" + var2x.y() + "]")
                     : DataResult.success(var2x);
               }
            }
         );
   }

   public T N() {
      return this.minInclusive;
   }
}
