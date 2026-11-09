package minecraft;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import java.util.Arrays;
import java.util.Iterator;
import org.jspecify.annotations.Nullable;

public class class01199<K> implements class00750<K> {
   private static final int y = -1;
   private static final Object L = null;
   private static final float u = 0.8F;
   private K[] i;
   private int[] R;
   private K[] M;
   private int B;
   private int Z;

   public static <A> class01199<A> L(int var0) {
      return new class01199((int)(var0 / 0.8F));
   }

   @Override
   public int L() {
      return this.Z;
   }

   private int M(int var1) {
      for (int ix = var1; ix < this.i.length; ix++) {
         if (this.i[ix] == L) {
            return ix;
         }
      }

      for (int j = 0; j < var1; j++) {
         if (this.i[j] == L) {
            return j;
         }
      }

      throw new RuntimeException("Overflowed :(");
   }

   private class01199(int var1) {
      super();
      this.i = (K[])(new Object[var1]);
      this.R = new int[var1];
      this.M = (K[])(new Object[var1]);
   }

   private class01199(K[] var1, int[] var2, K[] var3, int var4, int var5) {
      super();
      this.i = (K[])var1;
      this.R = var2;
      this.M = (K[])var3;
      this.B = var4;
      this.Z = var5;
   }

   @Override
   public Iterator<K> iterator() {
      return Iterators.filter(Iterators.forArray(this.M), Predicates.notNull());
   }

   private int i(@Nullable K var1) {
      return (class04995.B(System.identityHashCode(var1)) & 2147483647) % this.i.length;
   }

   private int i(int var1) {
      return var1 == -1 ? -1 : this.R[var1];
   }

   private int u() {
      while (this.B < this.M.length && this.M[this.B] != null) {
         this.B++;
      }

      return this.B;
   }

   public boolean u(int var1) {
      return this.N(var1) != null;
   }

   public int u(K var1) {
      int ix = this.u();
      this.N((K)var1, ix);
      return ix;
   }

   private int y(@Nullable K var1, int var2) {
      for (int ix = var2; ix < this.i.length; ix++) {
         if (this.i[ix] == var1) {
            return ix;
         }

         if (this.i[ix] == L) {
            return -1;
         }
      }

      for (int j = 0; j < var2; j++) {
         if (this.i[j] == var1) {
            return j;
         }

         if (this.i[j] == L) {
            return -1;
         }
      }

      return -1;
   }

   public class01199<K> y() {
      return new class01199<>((K[])((Object[])this.i.clone()), (int[])this.R.clone(), (K[])((Object[])this.M.clone()), this.B, this.Z);
   }

   public boolean y(K var1) {
      return this.N((K)var1) != -1;
   }

   @Override
   public int N(@Nullable K var1) {
      return this.i(this.y((K)var1, this.i((K)var1)));
   }

   public void N() {
      Arrays.fill(this.i, null);
      Arrays.fill(this.M, null);
      this.B = 0;
      this.Z = 0;
   }

   public void N(K var1, int var2) {
      if (Math.max(var2, this.Z + 1) >= this.i.length * 0.8F) {
         int ix = this.i.length << 1;

         while (ix < var2) {
            ix <<= 1;
         }

         this.R(ix);
      }

      int j = this.M(this.i((K)var1));
      this.i[j] = (K)var1;
      this.R[j] = var2;
      this.M[var2] = (K)var1;
      this.Z++;
      if (var2 == this.B) {
         this.B++;
      }
   }

   @Nullable
   @Override
   public K N(int var1) {
      return var1 >= 0 && var1 < this.M.length ? this.M[var1] : null;
   }

   private void R(int var1) {
      Object[] aobject = this.i;
      int[] aint = this.R;
      class01199 class01199 = new class01199(var1);

      for (int ix = 0; ix < aobject.length; ix++) {
         if (aobject[ix] != null) {
            class01199.N(aobject[ix], aint[ix]);
         }
      }

      this.i = class01199.i;
      this.R = class01199.R;
      this.M = class01199.M;
      this.B = class01199.B;
      this.Z = class01199.Z;
   }
}
