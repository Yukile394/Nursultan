package minecraft;

import it.unimi.dsi.fastutil.ints.IntImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public final class class08071 extends class08092<Integer> {
   private final IntImmutableList N;
   private final int y;
   private final int L;

   private class08071(String var1, int var2, int var3) {
      super(var1, Integer.class);
      if (var2 < 0) {
         throw new IllegalArgumentException("Min value of " + var1 + " must be 0 or greater");
      } else if (var3 <= var2) {
         throw new IllegalArgumentException("Max value of " + var1 + " must be greater than min (" + var2 + ")");
      } else {
         this.y = var2;
         this.L = var3;
         this.N = IntImmutableList.toList(IntStream.range(var2, var3 + 1));
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 instanceof class08071 class08071 && super.equals(var1) ? this.N.equals(class08071.N) : false;
      }
   }

   public int y(Integer var1) {
      return var1 <= this.L ? var1 - this.y : -1;
   }

   @Override
   public Optional<Integer> y(String var1) {
      try {
         int i = Integer.parseInt(var1);
         return i >= this.y && i <= this.L ? Optional.of(i) : Optional.empty();
      } catch (NumberFormatException numberformatexception) {
         return Optional.empty();
      }
   }

   @Override
   public int y() {
      return 31 * super.y() + this.N.hashCode();
   }

   @Override
   public List<Integer> N() {
      return this.N;
   }

   public static class08071 N(String var0, int var1, int var2) {
      return new class08071(var0, var1, var2);
   }

   public String N(Integer var1) {
      return var1.toString();
   }
}
