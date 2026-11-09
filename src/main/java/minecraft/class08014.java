package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.BitSet;
import java.util.List;
import org.jspecify.annotations.Nullable;

class class08014<T> {
   private final List<? extends class08022<T>> L;
   private final int u;
   private final List<T> i;
   private final int R;
   private final BitSet M;
   private final IntList B;

   @Nullable
   private IntList L(int var1) {
      this.B.clear();
      this.z(var1);
      this.B.add(var1);

      while (!this.B.isEmpty()) {
         int ix = this.B.size();
         if (N(ix - 1)) {
            int l = this.B.getInt(ix - 1);

            for (int j1 = 0; j1 < this.u; j1++) {
               if (!this.B(j1) && this.y(l, j1) && !this.u(l, j1)) {
                  this.M(j1);
                  this.B.add(j1);
                  break;
               }
            }
         } else {
            int j = this.B.getInt(ix - 1);
            if (!this.u(j)) {
               return this.B;
            }

            for (int k = 0; k < this.R; k++) {
               if (!this.U(k) && this.u(k, j)) {
                  if (!N && !this.y(k, j)) {
                     throw new AssertionError();
                  }

                  this.z(k);
                  this.B.add(k);
                  break;
               }
            }
         }

         int i1 = this.B.size();
         if (i1 == ix) {
            this.B.removeInt(i1 - 1);
         }
      }

      return null;
   }

   private int L(int var1, int var2) {
      if (N || var1 >= 0 && var1 < this.R) {
         if (N || var2 >= 0 && var2 < this.u) {
            return this.B() + var1 * this.u + var2;
         } else {
            throw new AssertionError();
         }
      } else {
         throw new AssertionError();
      }
   }

   private int L() {
      return this.u;
   }

   private int M(int var1, int var2) {
      if (N || var1 >= 0 && var1 < this.R) {
         if (N || var2 >= 0 && var2 < this.u) {
            return this.z() + var1 * this.u + var2;
         } else {
            throw new AssertionError();
         }
      } else {
         throw new AssertionError();
      }
   }

   private int M() {
      return this.u;
   }

   private void M(int var1) {
      this.M.set(this.Z(var1));
   }

   public class08014(List<? extends class08022<T>> var1, List var2) {
      super();
      this.y = var1;
      this.B = new IntArrayList();
      this.L = var2;
      this.u = var2.size();
      this.i = var1.N(var2);
      this.R = this.i.size();
      this.M = new BitSet(this.L() + this.i() + this.M() + this.Z() + this.U());
      this.N();
   }

   private void B(int var1, int var2) {
      this.M.clear(var1, var1 + var2);
   }

   private int B() {
      return this.R() + this.M();
   }

   private boolean B(int var1) {
      return this.M.get(this.Z(var1));
   }

   private int Z() {
      return this.u * this.R;
   }

   private int Z(int var1) {
      if (N || var1 >= 0 && var1 < this.u) {
         return this.y() + var1;
      } else {
         throw new AssertionError();
      }
   }

   private void i(int var1) {
      this.M.set(this.R(var1));
   }

   private int i() {
      return this.R;
   }

   private void i(int var1, int var2) {
      int ix = this.M(var1, var2);
      if (!N && this.M.get(ix)) {
         throw new AssertionError();
      } else {
         this.M.set(ix);
      }
   }

   private boolean U(int var1) {
      return this.M.get(this.E(var1));
   }

   private int U() {
      return this.u * this.R;
   }

   private int z() {
      return this.B() + this.Z();
   }

   private void z(int var1) {
      this.M.set(this.E(var1));
   }

   private boolean u(int var1, int var2) {
      return this.M.get(this.M(var1, var2));
   }

   private boolean u(int var1) {
      return this.M.get(this.R(var1));
   }

   private int u() {
      return this.y() + this.L();
   }

   private int y() {
      return 0;
   }

   public int y(int var1, @Nullable class08012<T> var2) {
      int ix = 0;
      int j = Math.min(var1, this.y.N(this.L)) + 1;

      while (true) {
         int k = (ix + j) / 2;
         if (this.N(k, null)) {
            if (j - ix <= 1) {
               if (k > 0) {
                  this.N(k, var2);
               }

               return k;
            }

            ix = k;
         } else {
            j = k;
         }
      }
   }

   @Nullable
   private IntList y(int var1) {
      this.W();

      for (int ix = 0; ix < this.R; ix++) {
         if (this.y.N(this.i.get(ix), var1)) {
            IntList intlist = this.L(ix);
            if (intlist != null) {
               return intlist;
            }
         }
      }

      return null;
   }

   private boolean y(int var1, int var2) {
      return this.M.get(this.L(var1, var2));
   }

   private void E() {
      this.B(this.R(), this.M());
   }

   private int E(int var1) {
      if (N || var1 >= 0 && var1 < this.R) {
         return this.u() + var1;
      } else {
         throw new AssertionError();
      }
   }

   private static boolean N(int var0) {
      return (var0 & 1) == 0;
   }

   private void N(int var1, int var2) {
      this.M.set(this.L(var1, var2));
   }

   public boolean N(int var1, @Nullable class08012<T> var2) {
      if (var1 <= 0) {
         return true;
      } else {
         int ix = 0;

         while (true) {
            IntList intlist = this.y(var1);
            if (intlist == null) {
               boolean flag = ix == this.u;
               boolean flag1 = flag && var2 != null;
               this.W();
               this.E();

               for (int k1 = 0; k1 < this.u; k1++) {
                  for (int l1 = 0; l1 < this.R; l1++) {
                     if (this.u(l1, k1)) {
                        this.R(l1, k1);
                        this.y.L(this.i.get(l1), var1);
                        if (flag1) {
                           var2.accept(this.i.get(l1));
                        }
                        break;
                     }
                  }
               }

               if (!N && !this.M.get(this.z(), this.z() + this.U()).isEmpty()) {
                  throw new AssertionError();
               }

               return flag;
            }

            int j = intlist.getInt(0);
            this.y.y(this.i.get(j), var1);
            int k = intlist.size() - 1;
            this.i(intlist.getInt(k));
            ix++;

            for (int l = 0; l < intlist.size() - 1; l++) {
               if (N(l)) {
                  int i1 = intlist.getInt(l);
                  int j1 = intlist.getInt(l + 1);
                  this.i(i1, j1);
               } else {
                  int i2 = intlist.getInt(l + 1);
                  int j2 = intlist.getInt(l);
                  this.R(i2, j2);
               }
            }
         }
      }
   }

   private void N() {
      for (int ix = 0; ix < this.u; ix++) {
         class08022 class08022 = this.L.get(ix);

         for (int j = 0; j < this.R; j++) {
            if (class08022.acceptsItem(this.i.get(j))) {
               this.N(j, ix);
            }
         }
      }
   }

   private void W() {
      this.B(this.y(), this.L());
      this.B(this.u(), this.i());
   }

   private void R(int var1, int var2) {
      int ix = this.M(var1, var2);
      if (!N && !this.M.get(ix)) {
         throw new AssertionError();
      } else {
         this.M.clear(ix);
      }
   }

   private int R() {
      return this.u() + this.i();
   }

   private int R(int var1) {
      if (N || var1 >= 0 && var1 < this.u) {
         return this.R() + var1;
      } else {
         throw new AssertionError();
      }
   }
}
