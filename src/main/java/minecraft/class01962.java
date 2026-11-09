package minecraft;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class01962 {
   public class01962() {
      super();
   }

   public static boolean N(@Nullable short[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean N(@Nullable char[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean N(@Nullable byte[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean N(@Nullable boolean[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean N(@Nullable double[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean N(@Nullable float[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean N(@Nullable long[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static boolean N(@Nullable int[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static <T, R> R N(@Nullable T var0, Function<T, R> var1, Supplier<R> var2) {
      return (R)(var0 == null ? var2.get() : var1.apply(var0));
   }

   public static <T, R> R N(@Nullable T var0, Function<T, R> var1, R var2) {
      return (R)(var0 == null ? var2 : var1.apply(var0));
   }

   @Nullable
   public static <T, R> R N(@Nullable T var0, Function<T, R> var1) {
      return (R)(var0 == null ? null : var1.apply(var0));
   }

   @Deprecated
   public static <T> T N(@Nullable T var0, T var1) {
      return Objects.requireNonNullElse((T)var0, (T)var1);
   }

   public static <T> boolean N(@Nullable T[] var0) {
      return var0 == null || var0.length == 0;
   }

   public static <T> T N(Collection<T> var0, Supplier<T> var1) {
      Iterator iterator = var0.iterator();
      return (T)(iterator.hasNext() ? iterator.next() : var1.get());
   }

   public static <T> T N(Collection<T> var0, T var1) {
      Iterator iterator = var0.iterator();
      return (T)(iterator.hasNext() ? iterator.next() : var1);
   }

   @Nullable
   public static <T> T N(Collection<T> var0) {
      Iterator iterator = var0.iterator();
      return (T)(iterator.hasNext() ? iterator.next() : null);
   }
}
