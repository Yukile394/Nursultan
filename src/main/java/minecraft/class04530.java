package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import it.unimi.dsi.fastutil.ints.Int2DoubleOpenHashMap;
import java.util.Locale;
import java.util.function.DoubleSupplier;
import java.util.function.ToDoubleFunction;
import org.jspecify.annotations.Nullable;

public class class04530 {
   private final String y;
   private final class02253 L;
   private final DoubleSupplier u;
   private final ByteBuf i;
   private final ByteBuf R;
   private volatile boolean M;
   @Nullable
   private final Runnable B;
   @Nullable
   final class04522 N;
   private double Z;

   DoubleSupplier L() {
      return this.u;
   }

   public boolean M() {
      return this.N != null && this.N.method_34792(this.Z);
   }

   protected class04530(String var1, class02253 var2, DoubleSupplier var3, @Nullable Runnable var4, @Nullable class04522 var5) {
      super();
      this.y = var1;
      this.L = var2;
      this.B = var4;
      this.u = var3;
      this.N = var5;
      this.R = ByteBufAllocator.DEFAULT.buffer();
      this.i = ByteBufAllocator.DEFAULT.buffer();
      this.M = true;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         class04530 class04530 = (class04530)var1;
         return this.y.equals(class04530.y) && this.L.equals(class04530.L);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.y.hashCode();
   }

   private void B() {
      if (!this.M) {
         throw new IllegalStateException(String.format(Locale.ROOT, "Sampler for metric %s not started!", this.y));
      }
   }

   public class02253 i() {
      return this.L;
   }

   public String u() {
      return this.y;
   }

   public void y() {
      this.B();
      this.R.release();
      this.i.release();
      this.M = false;
   }

   public void N(int var1) {
      this.B();
      this.Z = this.u.getAsDouble();
      this.R.writeDouble(this.Z);
      this.i.writeInt(var1);
   }

   public static class04530 N(String var0, class02253 var1, DoubleSupplier var2) {
      return new class04530(var0, var1, var2, null, null);
   }

   public static <T> class04530 N(String var0, class02253 var1, T var2, ToDoubleFunction<T> var3) {
      return N(var0, var1, var3, var2).N();
   }

   public static <T> class04527<T> N(String var0, class02253 var1, ToDoubleFunction<T> var2, T var3) {
      if (var2 == null) {
         throw new IllegalStateException();
      } else {
         return new class04527<>(var0, var1, var2, (T)var3);
      }
   }

   public void N() {
      if (!this.M) {
         throw new IllegalStateException("Not running");
      } else {
         if (this.B != null) {
            this.B.run();
         }
      }
   }

   public class04542 R() {
      Int2DoubleOpenHashMap int2doubleopenhashmap = new Int2DoubleOpenHashMap();
      int ix = Integer.MIN_VALUE;
      int j = Integer.MIN_VALUE;

      while (this.R.isReadable(8)) {
         int k = this.i.readInt();
         if (ix == Integer.MIN_VALUE) {
            ix = k;
         }

         int2doubleopenhashmap.put(k, this.R.readDouble());
         j = k;
      }

      return new class04542(ix, j, int2doubleopenhashmap);
   }
}
