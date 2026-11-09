package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;

public record class04369(int minInclusive, int maxInclusive, boolean applyValueImmediately) implements class04372 {
   @Override
   public int L() {
      return this.maxInclusive;
   }

   public class04369(int var1, int var2) {
      this(var1, var2, true);
   }

   public class04369(int minInclusive, int maxInclusive, boolean applyValueImmediately) {
      this.minInclusive = minInclusive;
      this.maxInclusive = maxInclusive;
      this.applyValueImmediately = applyValueImmediately;
   }

   @Override
   public boolean u() {
      return this.applyValueImmediately;
   }

   @Override
   public Codec<Integer> y() {
      return Codec.intRange(this.minInclusive, this.maxInclusive + 1);
   }

   public Optional<Integer> u(Integer var1) {
      return var1.compareTo(this.aA_()) >= 0 && var1.compareTo(this.L()) <= 0 ? Optional.of(var1) : Optional.empty();
   }

   @Override
   public int aA_() {
      return this.minInclusive;
   }
}
