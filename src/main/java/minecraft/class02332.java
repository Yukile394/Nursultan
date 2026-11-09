package minecraft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public final class class02332 {
   private static final int y = -1;
   private static final Object L = new class02335();
   private static final int u = 2;
   private Object[] i = new Object[128];
   private int R = 0;
   private int M = 0;

   public void L() {
      int ix = this.M;
      int j = (this.R - this.M) / 2;
      this.N(j + 1);
      this.B();
      int k = ix + 2;
      int l = this.R;

      for (int i1 = 0; i1 < j; i1++) {
         l += 2;
         Object object = this.i[k];

         assert object != null;

         this.i[l] = object;
         this.i[l + 1] = null;
         k += 2;
      }

      this.R = l;

      assert this.Z();
   }

   private int L(class02353<?> var1) {
      for (int ix = this.R; ix > this.M; ix -= 2) {
         Object object = this.i[ix];

         assert object instanceof class02353;

         if (object == var1) {
            return ix + 1;
         }
      }

      return -1;
   }

   @SafeVarargs
   public final <T> T L(class02353<? extends T>... var1) {
      int ix = this.N(var1);
      if (ix == -1) {
         throw new IllegalArgumentException("No value for atoms " + Arrays.toString((Object[])var1));
      } else {
         return (T)this.i[ix];
      }
   }

   public boolean M() {
      for (int ix = this.R; ix > 0; ix--) {
         if (this.i[ix] == L) {
            return false;
         }
      }

      if (this.i[0] != L) {
         throw new IllegalStateException("Corrupted stack");
      } else {
         return true;
      }
   }

   public class02332() {
      super();
      this.i[0] = L;
      this.i[1] = null;
   }

   @Override
   public String toString() {
      StringBuilder stringbuilder = new StringBuilder();
      boolean flag = true;

      for (byte b0 = 0; b0 <= this.R; b0 += 2) {
         Object object = this.i[b0];
         Object object1 = this.i[b0 + 1];
         if (object == L) {
            stringbuilder.append('|');
            flag = true;
         } else {
            if (!flag) {
               stringbuilder.append(',');
            }

            flag = false;
            stringbuilder.append(object).append(':').append(object1);
         }
      }

      return stringbuilder.toString();
   }

   private void B() {
      this.R += 2;
      this.i[this.R] = L;
      this.i[this.R + 1] = this.M;
      this.M = this.R;
   }

   private boolean Z() {
      assert this.M >= 0;

      assert this.R >= this.M;

      for (byte b0 = 0; b0 <= this.R; b0 += 2) {
         Object object = this.i[b0];
         if (object != L && !(object instanceof class02353)) {
            return false;
         }
      }

      for (int ix = this.M; ix != 0; ix = this.y(ix)) {
         Object object1 = this.i[ix];
         if (object1 != L) {
            return false;
         }
      }

      return true;
   }

   public void i() {
      int ix = this.y(this.M);
      int j = ix;
      int k = this.M;

      while (k < this.R) {
         j += 2;
         k += 2;
         Object object = this.i[k];

         assert object instanceof class02353;

         Object object1 = this.i[k + 1];
         if (this.i[j] != object) {
            this.i[j] = object;
            this.i[j + 1] = object1;
         } else if (object1 != null) {
            this.i[j + 1] = object1;
         }
      }

      this.R = j;
      this.M = ix;

      assert this.Z();
   }

   public void u() {
      for (int ix = this.R; ix > this.M; ix -= 2) {
         assert this.i[ix] instanceof class02353;

         this.i[ix + 1] = null;
      }

      assert this.Z();
   }

   public <T> T y(class02353<T> var1) {
      int ix = this.L(var1);
      if (ix == -1) {
         throw new IllegalArgumentException("No value for atom " + var1);
      } else {
         return (T)this.i[ix];
      }
   }

   public <T> T y(class02353<T> var1, T var2) {
      int ix = this.L(var1);
      return (T)(ix != -1 ? this.i[ix] : var2);
   }

   @SafeVarargs
   @Nullable
   public final <T> T y(class02353<? extends T>... var1) {
      int ix = this.N(var1);
      return (T)(ix != -1 ? this.i[ix] : null);
   }

   public void y() {
      assert this.M != 0;

      this.R = this.M - 2;
      this.M = this.y(this.M);

      assert this.Z();
   }

   private int y(int var1) {
      return (Integer)this.i[var1 + 1];
   }

   public int N(class02353<?>... var1) {
      for (int ix = this.R; ix > this.M; ix -= 2) {
         Object object = this.i[ix];

         assert object instanceof class02353;

         class02353[] aclass02353 = var1;
         int j = var1.length;

         for (int k = 0; k < j; k++) {
            if (aclass02353[k] == object) {
               return ix + 1;
            }
         }
      }

      return -1;
   }

   public <T> void N(class02353<T> var1, @Nullable T var2) {
      int ix = this.L(var1);
      if (ix != -1) {
         this.i[ix] = var2;
      } else {
         this.N(1);
         this.R += 2;
         this.i[this.R] = var1;
         this.i[this.R + 1] = var2;
      }

      assert this.Z();
   }

   @Nullable
   public <T> T N(class02353<T> var1) {
      int ix = this.L(var1);
      return (T)(ix != -1 ? this.i[ix] : null);
   }

   public void N() {
      this.N(1);
      this.B();

      assert this.Z();
   }

   private void N(int var1) {
      int ix = this.i.length;
      int j = this.R + 1 + var1 * 2;
      if (j >= ix) {
         Object[] aobject = new Object[class07536.N(ix, j + 1)];
         System.arraycopy(this.i, 0, aobject, 0, ix);
         this.i = aobject;
      }

      assert this.Z();
   }

   public Map<class02353<?>, ?> R() {
      HashMap hashmap = new HashMap();

      for (int ix = this.R; ix > this.M; ix -= 2) {
         Object object = this.i[ix];
         Object object1 = this.i[ix + 1];
         hashmap.put((class02353)object, object1);
      }

      return hashmap;
   }
}
