package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class08376<T extends class08387> {
   private final int N;
   private final int y;
   private final int L;
   private final int u;
   @Nullable
   private List<class08376<T>> i;
   @Nullable
   private class08345<T> R;

   public class08376(int var1, int var2, int var3, int var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   @Override
   public String toString() {
      return "Slot{originX="
         + this.N
         + ", originY="
         + this.y
         + ", width="
         + this.L
         + ", height="
         + this.u
         + ", texture="
         + this.R
         + ", subSlots="
         + this.i
         + "}";
   }

   public int y() {
      return this.y;
   }

   public boolean N(class08345<T> var1) {
      if (this.R != null) {
         return false;
      } else {
         int ix = var1.y();
         int j = var1.L();
         if (ix <= this.L && j <= this.u) {
            if (ix == this.L && j == this.u) {
               this.R = var1;
               return true;
            } else {
               if (this.i == null) {
                  this.i = new ArrayList<>(1);
                  this.i.add(new class08376<>(this.N, this.y, ix, j));
                  int k = this.L - ix;
                  int l = this.u - j;
                  if (l > 0 && k > 0) {
                     int i1 = Math.max(this.u, k);
                     int j1 = Math.max(this.L, l);
                     if (i1 >= j1) {
                        this.i.add(new class08376<>(this.N, this.y + j, ix, l));
                        this.i.add(new class08376<>(this.N + ix, this.y, k, this.u));
                     } else {
                        this.i.add(new class08376<>(this.N + ix, this.y, k, j));
                        this.i.add(new class08376<>(this.N, this.y + j, this.L, l));
                     }
                  } else if (k == 0) {
                     this.i.add(new class08376<>(this.N, this.y + j, ix, l));
                  } else if (l == 0) {
                     this.i.add(new class08376<>(this.N + ix, this.y, k, j));
                  }
               }

               for (class08376 class08376 : this.i) {
                  if (class08376.N(var1)) {
                     return true;
                  }
               }

               return false;
            }
         } else {
            return false;
         }
      }
   }

   public void N(class08368<T> var1, int var2) {
      if (this.R != null) {
         var1.load(this.R.N(), this.N(), this.y(), var2);
      } else if (this.i != null) {
         Iterator iterator = this.i.iterator();

         while (iterator.hasNext()) {
            ((class08376)iterator.next()).N(var1, var2);
         }
      }
   }

   public int N() {
      return this.N;
   }
}
