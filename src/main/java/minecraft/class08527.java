package minecraft;

import org.jspecify.annotations.Nullable;

record class08527<T>(T value, int markAfterParse) {
   public static final class08527<?> L = new class08527(null, -1);

   public int L() {
      return this.markAfterParse;
   }

   class08527(@Nullable T value, int markAfterParse) {
      super();
      this.value = (T)value;
      this.markAfterParse = markAfterParse;
   }

   @Nullable
   public T y() {
      return this.value;
   }

   public static <T> class08527<T> N() {
      return (class08527<T>)L;
   }
}
