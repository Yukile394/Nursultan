package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Optional;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public record class04343(int minInclusive, IntSupplier maxSupplier, int encodableMaxInclusive) implements class04359<Integer>, class04372 {
   @Override
   public int L() {
      return this.maxSupplier.getAsInt();
   }

   public IntSupplier M() {
      return this.maxSupplier;
   }

   public class04343(int minInclusive, IntSupplier maxSupplier, int encodableMaxInclusive) {
      super();
      this.minInclusive = minInclusive;
      this.maxSupplier = maxSupplier;
      this.encodableMaxInclusive = encodableMaxInclusive;
   }

   public int B() {
      return this.encodableMaxInclusive;
   }

   @Override
   public boolean i() {
      return true;
   }

   @Override
   public Codec<Integer> y() {
      return Codec.INT
         .validate(
            var1 -> {
               int i = this.encodableMaxInclusive + 1;
               return var1.compareTo(this.minInclusive) >= 0 && var1.compareTo(i) <= 0
                  ? DataResult.success(var1)
                  : DataResult.error(() -> "Value " + var1 + " outside of range [" + this.minInclusive + ":" + i + "]", var1);
            }
         );
   }

   public Optional<Integer> u(Integer var1) {
      return Optional.of(class04995.N(var1, this.aA_(), this.L()));
   }

   @Override
   public class06363<Integer> N() {
      return class06363.N(IntStream.range(this.minInclusive, this.L() + 1).boxed().toList());
   }

   @Override
   public int aA_() {
      return this.minInclusive;
   }
}
