package minecraft;

import java.util.Locale;
import java.util.function.Consumer;

public class class02248<T> {
   private final int N;
   private final int y;
   private final int L;
   private final int u;
   private final Object[] i;

   private int L(int var1, int var2) {
      int ix = var1 - this.N;
      int j = var2 - this.y;
      return ix * this.u + j;
   }

   private class02248(int var1, int var2, int var3, int var4, class02240<T> var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = new Object[this.L * this.u];

      for (int ix = var1; ix < var1 + var3; ix++) {
         for (int j = var2; j < var2 + var4; j++) {
            this.i[this.L(ix, j)] = var5.get(ix, j);
         }
      }
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "StaticCache2D[%d, %d, %d, %d]", this.N, this.y, this.N + this.L, this.y + this.u);
   }

   public boolean y(int var1, int var2) {
      int ix = var1 - this.N;
      int j = var2 - this.y;
      return ix >= 0 && ix < this.L && j >= 0 && j < this.u;
   }

   public static <T> class02248<T> N(int var0, int var1, int var2, class02240<T> var3) {
      int ix = var0 - var2;
      int j = var1 - var2;
      int k = 2 * var2 + 1;
      return new class02248<>(ix, j, k, k, var3);
   }

   public T N(int var1, int var2) {
      if (!this.y(var1, var2)) {
         throw new IllegalArgumentException("Requested out of range value (" + var1 + "," + var2 + ") from " + this);
      } else {
         return (T)this.i[this.L(var1, var2)];
      }
   }

   public void N(Consumer<T> var1) {
      for (Object object : this.i) {
         var1.accept(object);
      }
   }
}
