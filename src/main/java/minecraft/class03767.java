package minecraft;

import it.unimi.dsi.fastutil.HashCommon;
import java.util.Arrays;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public final class class03767 {
   private static final class03767 y = new class03767(null, 0L);
   public static final int N = 64;
   @Nullable
   private final class03766 L;
   private final long u;

   public class03767 L(class03767 var1) {
      if (this.L == null) {
         return var1;
      } else if (var1.L == null) {
         return this;
      } else if (this.L != var1.L) {
         throw new IllegalArgumentException("Mismatched set elements: '" + this.L + "' != '" + var1.L + "'");
      } else {
         return new class03767(this.L, this.u | var1.u);
      }
   }

   private class03767(@Nullable class03766 var1, long var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class03767 class03767 && this.L == class03767.L && this.u == class03767.u;
   }

   @Override
   public int hashCode() {
      return (int)HashCommon.mix(this.u);
   }

   public class03767 u(class03767 var1) {
      if (this.L == null || var1.L == null) {
         return this;
      } else if (this.L != var1.L) {
         throw new IllegalArgumentException("Mismatched set elements: '" + this.L + "' != '" + var1.L + "'");
      } else {
         long i = this.u & ~var1.u;
         return i == 0L ? y : new class03767(this.L, i);
      }
   }

   public boolean y() {
      return this.equals(y);
   }

   public boolean y(class02957 var1) {
      return this.L != var1.N ? false : (this.u & var1.y) != 0L;
   }

   public boolean y(class03767 var1) {
      return this.L != null && var1.L != null && this.L == var1.L ? (this.u & var1.u) != 0L : false;
   }

   public static class03767 N(class02957 var0, class02957... var1) {
      long i = var1.length == 0 ? var0.y : N(var0.N, var0.y, Arrays.asList(var1));
      return new class03767(var0.N, i);
   }

   private static long N(class03766 var0, long var1, Iterable<class02957> var3) {
      for (class02957 class02957 : var3) {
         if (var0 != class02957.N) {
            throw new IllegalStateException("Mismatched feature universe, expected '" + var0 + "', but got '" + class02957.N + "'");
         }

         var1 |= class02957.y;
      }

      return var1;
   }

   public static class03767 N(class02957 var0) {
      return new class03767(var0.N, var0.y);
   }

   static class03767 N(class03766 var0, Collection<class02957> var1) {
      if (var1.isEmpty()) {
         return y;
      } else {
         long i = N(var0, 0L, var1);
         return new class03767(var0, i);
      }
   }

   public boolean N(class03767 var1) {
      if (this.L == null) {
         return true;
      } else {
         return this.L != var1.L ? false : (this.u & ~var1.u) == 0L;
      }
   }

   public static class03767 N() {
      return y;
   }
}
