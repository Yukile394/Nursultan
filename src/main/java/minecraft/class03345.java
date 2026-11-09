package minecraft;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

public class class03345 {
   public static final int N = 16;
   public final int y;
   public final AtomicReference<class08744> L;
   private class03332 M;
   private class03352 B;
   private class00734 Z;
   private boolean z;
   volatile long u;
   final class07218 i;
   private boolean U;
   private long E;
   private long W;
   private boolean m;

   public void L(long var1) {
      this.i();
      this.u = var1;
      int ix = class01296.L(class01296.y(var1));
      int j = class01296.L(class01296.L(var1));
      int k = class01296.L(class01296.u(var1));
      this.i.N(ix, j, k);
      this.Z = new class00734(ix, j, k, ix + 16, j + 16, k + 16);
   }

   public void L(class03176 var1) {
      this.N(var1).N(this.R.L);
   }

   public class00734 L() {
      return this.Z;
   }

   public long M() {
      return this.u;
   }

   public class03345(class03365 var1, int var2, long var3) {
      super();
      this.R = var1;
      this.L = new AtomicReference<>(class08777.N);
      this.z = true;
      this.u = class01296.y(-1, -1, -1);
      this.i = new class07218(-1, -1, -1);
      this.y = var2;
      this.L(var3);
   }

   public void B() {
      this.z = false;
      this.U = false;
   }

   public boolean Z() {
      return this.z;
   }

   public void i() {
      this.W();
      this.L.getAndSet(class08777.N).close();
      this.z = true;
      this.E = 0L;
      this.m = false;
   }

   public boolean U() {
      return this.u().L();
   }

   public boolean z() {
      return this.z && this.U;
   }

   private boolean u(long var1) {
      return this.R.i.method_8402(class01296.y(var1), class01296.u(var1), class00549.m, false) != null && this.R.i.method_22336().N(class01296.R(var1));
   }

   public class08744 u() {
      return this.L.get();
   }

   public void y(class03176 var1) {
      class03354 class03354 = this.N(var1);
      this.R.N(class03354);
   }

   public void y(long var1) {
      this.W = var1;
   }

   public void y(boolean var1) {
      boolean flag = this.z;
      this.z = true;
      this.U = var1 | (flag && this.U);
   }

   public boolean y() {
      return this.u(class01296.N(this.u, class07211.field_11039))
         && this.u(class01296.N(this.u, class07211.field_11043))
         && this.u(class01296.N(this.u, class07211.field_11034))
         && this.u(class01296.N(this.u, class07211.field_11035))
         && this.u(class01296.N(this.u, -1, 0, -1))
         && this.u(class01296.N(this.u, -1, 0, 1))
         && this.u(class01296.N(this.u, 1, 0, -1))
         && this.u(class01296.N(this.u, 1, 0, 1));
   }

   public boolean E() {
      return this.B != null && !this.B.y.get();
   }

   public class03354 N(class03176 var1) {
      this.W();
      class03498 class03498 = var1.N(this.R.i, this.u);
      boolean flag = this.L.get() != class08777.N;
      this.M = new class03332(this, class03498, flag);
      return this.M;
   }

   void N(class08744 var1) {
      class08744 class08744 = this.L.getAndSet(var1);
      this.R.y.add(class08744);
      this.R.R.N(this);
   }

   class03337 N(class01296 var1) {
      class06889 class06889 = this.R.M;
      return class03337.N((float)(class06889.M - var1.u()), (float)(class06889.B - var1.i()), (float)(class06889.Z - var1.R()));
   }

   public float N(long var1) {
      long ix = var1 - this.E;
      return ix >= this.W ? 1.0F : (float)ix / (float)this.W;
   }

   public boolean N() {
      return this.m;
   }

   public CompletableFuture<Void> N(class08777 var1, class02613 var2, class08743 var3) {
      if (this.R.u) {
         var2.close();
         return CompletableFuture.completedFuture(null);
      } else {
         return CompletableFuture.runAsync(() -> {
            try (class08694 class08694 = class08700.N().i("Upload Section Indices")) {
               var1.N(var3, var2, this.u);
               var2.close();
            }
         }, this.R.N);
      }
   }

   public void N(boolean var1) {
      this.m = var1;
   }

   public long N(class07211 var1) {
      return class01296.N(this.u, var1);
   }

   public void N(class03365 var1) {
      if (this.u() instanceof class08777 class08777) {
         this.B = new class03352(this, class08777);
         var1.N(this.B);
      }
   }

   public CompletableFuture<Void> N(Map<class08743, class02609> var1, class08777 var2) {
      if (this.R.u) {
         var1.values().forEach(class02609::close);
         return CompletableFuture.completedFuture(null);
      } else {
         return CompletableFuture.runAsync(() -> var1.forEach((var2xx, var3) -> {
            try (class08694 class08694 = class08700.N().i("Upload Section Layer")) {
               var2.N(var2xx, var3, this.u);
               var3.close();
            }

            if (this.E == 0L) {
               this.E = class07536.L();
            }
         }), this.R.N);
      }
   }

   protected void W() {
      if (this.M != null) {
         this.M.N();
         this.M = null;
      }

      if (this.B != null) {
         this.B.N();
         this.B = null;
      }
   }

   public class07209 R() {
      return this.i;
   }
}
