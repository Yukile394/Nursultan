package minecraft;

import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

class class05478 implements class05482 {
   @Nullable
   private List<class05468> R;
   @Nullable
   private class07018 M;

   private List<class05468> L() {
      class07018 class07018 = class07018.y();
      if (this.R != null && class07018 == this.M) {
         return this.R;
      } else {
         this.M = class07018;
         ArrayList arraylist = new ArrayList();

         for (class00392 class00392 : this.y) {
            arraylist.addAll(this.L.u(class00392, this.u));
         }

         this.R = new ArrayList<>();
         int ix = Math.min(arraylist.size(), this.i);
         List list = arraylist.subList(0, ix);

         for (int j = 0; j < list.size(); j++) {
            class05936 class05936 = (class05936)list.get(j);
            class01028 class01028 = class07018.y().N(class05936);
            if (j == list.size() - 1 && ix == this.i && ix != arraylist.size()) {
               class05936 class05936x = this.L.N(class05936, this.L.N(class05936) - this.L.N(class05220.G));
               class05936 class05936xx = class05936.N(class05936x, class05220.G.L().L(this.y[this.y.length - 1].method_10866()));
               this.R.add(new class05468(class07018.y().N(class05936xx), this.L.N(class05936xx)));
            } else {
               this.R.add(new class05468(class01028, this.L.N(class01028)));
            }
         }

         return this.R;
      }
   }

   class05478(class00392[] var1, class01590 var2, int var3, int var4) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
   }

   @Override
   public int y() {
      return Math.min(this.u, this.L().stream().mapToInt(class05468::y).max().orElse(0));
   }

   @Override
   public int N() {
      return this.L().size();
   }

   @Override
   public int N(class00937 var1, int var2, int var3, int var4, class00580 var5) {
      int ix = var3;

      for (class05468 class05468 : this.L()) {
         int j = var1.N(var2, class05468.y());
         var5.N(j, ix, class05468.N());
         ix += var4;
      }

      return ix;
   }
}
