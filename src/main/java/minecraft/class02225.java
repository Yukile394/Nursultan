package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import org.jspecify.annotations.Nullable;

public class class02225 {
   private final class00549 N;
   @Nullable
   private final class02237 y;
   private class00549[] L;
   private int u = -1;
   private class00574 i = class02696::N;

   protected class02225(class00549 var1) {
      super();
      if (var1.L() != var1) {
         throw new IllegalArgumentException("Not starting with the first status: " + var1);
      } else {
         this.N = var1;
         this.y = null;
         this.L = new class00549[0];
      }
   }

   protected class02225(class00549 var1, class02237 var2) {
      super();
      if (var2.N().y() != var1.y() - 1) {
         throw new IllegalArgumentException("Out of order status: " + var1);
      } else {
         this.N = var1;
         this.y = var2;
         this.L = new class00549[]{var2.N()};
      }
   }

   private class00549[] y() {
      if (this.y == null) {
         return this.L;
      } else {
         int ix = this.N(this.y.N());
         class02209 class02209 = this.y.L();
         class00549[] aclass00549 = new class00549[Math.max(ix + class02209.y(), this.L.length)];

         for (int j = 0; j < aclass00549.length; j++) {
            int k = j - ix;
            if (k < 0 || k >= class02209.y()) {
               aclass00549[j] = this.L[j];
            } else if (j >= this.L.length) {
               aclass00549[j] = class02209.N(k);
            } else {
               aclass00549[j] = class00549.N(this.L[j], class02209.N(k));
            }
         }

         return aclass00549;
      }
   }

   public class02237 N() {
      return new class02237(this.N, new class02209(ImmutableList.copyOf(this.L)), new class02209(ImmutableList.copyOf(this.y())), this.u, this.i);
   }

   private int N(class00549 var1) {
      for (int ix = this.L.length - 1; ix >= 0; ix--) {
         if (this.L[ix].N(var1)) {
            return ix;
         }
      }

      return 0;
   }

   public class02225 N(class00574 var1) {
      this.i = var1;
      return this;
   }

   public class02225 N(int var1) {
      this.u = var1;
      return this;
   }

   public class02225 N(class00549 var1, int var2) {
      if (var1.N(this.N)) {
         throw new IllegalArgumentException("Status " + var1 + " can not be required by " + this.N);
      } else {
         class00549[] aclass00549 = this.L;
         int ix = var2 + 1;
         if (ix > aclass00549.length) {
            this.L = new class00549[ix];
            Arrays.fill(this.L, var1);
         }

         for (int j = 0; j < Math.min(ix, aclass00549.length); j++) {
            this.L[j] = class00549.N(aclass00549[j], var1);
         }

         return this;
      }
   }
}
