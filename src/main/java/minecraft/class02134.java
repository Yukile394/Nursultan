package minecraft;

import com.mojang.serialization.Codec;

public class class02134<T> {
   final T N;
   final int y;
   private double L;

   public double L() {
      return this.L;
   }

   class02134(T var1, int var2) {
      super();
      this.y = var2;
      this.N = (T)var1;
   }

   @Override
   public String toString() {
      return this.y + ":" + this.N;
   }

   public int y() {
      return this.y;
   }

   public static <E> Codec<class02134<E>> N(Codec<E> var0) {
      return new class02144<>(var0);
   }

   public T N() {
      return this.N;
   }

   void N(float var1) {
      this.L = -Math.pow(var1, 1.0F / this.y);
   }
}
