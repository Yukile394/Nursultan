package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class class02121 {
   public class02121() {
      super();
   }

   private static <T> T[] y(ToIntFunction<T> var0, T[] var1) {
      int i = var1.length;
      if (i == 0) {
         throw new IllegalArgumentException("Empty value list");
      } else {
         Object[] aobject = (Object[])var1.clone();
         Arrays.fill(aobject, null);

         for (Object object : var1) {
            int j = var0.applyAsInt(object);
            if (j < 0 || j >= i) {
               throw new IllegalArgumentException("Values are not continous, found index " + j + " for value " + object);
            }

            Object object1 = aobject[j];
            if (object1 != null) {
               throw new IllegalArgumentException("Duplicate entry on id " + j + ": current=" + object + ", previous=" + object1);
            }

            aobject[j] = object;
         }

         for (int k = 0; k < i; k++) {
            if (aobject[k] == null) {
               throw new IllegalArgumentException("Missing value at index: " + k);
            }
         }

         return (T[])aobject;
      }
   }

   public static <T> IntFunction<T> N(ToIntFunction<T> var0, T[] var1, class02126 var2) {
      Object[] aobject = y(var0, var1);
      int i = aobject.length;

      return switch (var2) {
         case field_41664 -> {
            Object object = aobject[0];
            yield var3x -> var3x >= 0 && var3x < i ? aobject[var3x] : object;
         }
         case field_41665 -> var2x -> aobject[class04995.L(var2x, i)];
         case field_41666 -> var2x -> aobject[class04995.N(var2x, 0, i - 1)];
      };
   }

   public static <T> IntFunction<T> N(ToIntFunction<T> var0, T[] var1, T var2) {
      return var2x -> Objects.requireNonNullElse((T)var0x.apply(var2x), (T)var2);
   }

   private static <T> IntFunction<T> N(ToIntFunction<T> var0, T[] var1) {
      if (var1.length == 0) {
         throw new IllegalArgumentException("Empty value list");
      } else {
         Int2ObjectOpenHashMap int2objectopenhashmap = new Int2ObjectOpenHashMap();

         for (Object object : var1) {
            int i = var0.applyAsInt(object);
            Object object1 = int2objectopenhashmap.put(i, object);
            if (object1 != null) {
               throw new IllegalArgumentException("Duplicate entry on id " + i + ": current=" + object + ", previous=" + object1);
            }
         }

         return int2objectopenhashmap;
      }
   }
}
