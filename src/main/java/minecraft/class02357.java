package minecraft;

import java.util.ArrayList;
import java.util.List;

public class class02357<S> implements class02346<S> {
   private class02345<S>[] N = new class02345[16];
   private int y;
   private int L = -1;

   public class02357() {
      super();
   }

   public int y() {
      return this.L;
   }

   private void y(int var1) {
      if (var1 > this.L) {
         this.L = var1;
         this.y = 0;
      }
   }

   @Override
   public void N(int var1, class02350<S> var2, Object var3) {
      this.y(var1);
      if (var1 == this.L) {
         this.N(var2, var3);
      }
   }

   public List<class02333<S>> N() {
      int i = this.y;
      if (i == 0) {
         return List.of();
      } else {
         ArrayList arraylist = new ArrayList(i);

         for (int j = 0; j < i; j++) {
            class02345 class02345 = this.N[j];
            arraylist.add(new class02333<>(this.L, class02345.N, class02345.y));
         }

         return arraylist;
      }
   }

   private void N(class02350<S> var1, Object var2) {
      int i = this.N.length;
      if (this.y >= i) {
         int j = class07536.N(i, this.y + 1);
         class02345[] aclass02345 = new class02345[j];
         System.arraycopy(this.N, 0, aclass02345, 0, i);
         this.N = aclass02345;
      }

      int k = this.y++;
      class02345 class02345 = this.N[k];
      if (class02345 == null) {
         class02345 = new class02345();
         this.N[k] = class02345;
      }

      class02345.N = var1;
      class02345.y = var2;
   }

   @Override
   public void N(int var1) {
      this.y(var1);
   }
}
