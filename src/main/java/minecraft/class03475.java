package minecraft;

import Nursultan.class10204;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Arrays;
import java.util.function.IntFunction;
import org.jspecify.annotations.Nullable;

public class class03475<T> {
   private static final int N = 8;
   private static final int y = 256;
   private static final int L = 255;
   private static final int u = 4351;
   private static final int i = 4352;
   private final T[] R;
   private final T[][] M;
   private final IntFunction<T[]> B;

   public class03475(IntFunction<T[]> var1, IntFunction<T[][]> var2) {
      super();
      this.R = (T[])((Object[])var1.apply(256));
      this.M = (T[][])((Object[][])var2.apply(4352));
      Arrays.fill(this.M, this.R);
      this.B = var1;
   }

   @Nullable
   public T y(int var1) {
      int ix = var1 >> 8;
      int j = var1 & 0xFF;
      Object[] aobject = this.M[ix];
      if (aobject == this.R) {
         return null;
      } else {
         Object object = aobject[j];
         aobject[j] = null;
         return (T)object;
      }
   }

   public IntSet y() {
      IntOpenHashSet intopenhashset = new IntOpenHashSet();
      this.N((var1x, var2) -> intopenhashset.add(var1x));
      return intopenhashset;
   }

   public void N(class10204<T> var1) {
      for (int ix = 0; ix < this.M.length; ix++) {
         Object[] aobject = this.M[ix];
         if (aobject != this.R) {
            for (int j = 0; j < aobject.length; j++) {
               Object object = aobject[j];
               if (object != null) {
                  int k = ix << 8 | j;
                  var1.accept(k, object);
               }
            }
         }
      }
   }

   public void N() {
      Arrays.fill(this.M, this.R);
   }

   @Nullable
   public T N(int var1) {
      int ix = var1 >> 8;
      int j = var1 & 0xFF;
      return this.M[ix][j];
   }

   @Nullable
   public T N(int var1, T var2) {
      int ix = var1 >> 8;
      int j = var1 & 0xFF;
      Object[] aobject = this.M[ix];
      if (aobject == this.R) {
         aobject = (Object[])this.B.apply(256);
         this.M[ix] = (T[])aobject;
         aobject[j] = var2;
         return null;
      } else {
         Object object = aobject[j];
         aobject[j] = var2;
         return (T)object;
      }
   }

   public T N(int var1, IntFunction<T> var2) {
      int ix = var1 >> 8;
      int j = var1 & 0xFF;
      Object[] aobject = this.M[ix];
      Object object = aobject[j];
      if (object != null) {
         return (T)object;
      } else {
         if (aobject == this.R) {
            aobject = (Object[])this.B.apply(256);
            this.M[ix] = (T[])aobject;
         }

         Object object1 = var2.apply(var1);
         aobject[j] = object1;
         return (T)object1;
      }
   }
}
