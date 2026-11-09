package minecraft;

import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;

class class05277 extends class06937 {
   private int M(class06584 var1) {
      int i = 0;

      for (Entry entry : class07323.y(var1).y()) {
         class03556<class07304> class03556 = (class03556<class07304>)entry.getKey();
         int j = entry.getIntValue();
         if (!class03556.N(class02625.P)) {
            i += class03556.N().y(j);
         }
      }

      return i;
   }

   class05277(class05262 var1, class06695 var2, int var3, int var4, int var5, class05880 var6) {
      super(var2, var3, var4, var5);
      this.y = var1;
      this.N = var6;
   }

   private int N(class07299 var1) {
      int i = 0;
      i += this.M(this.y.i.method_5438(0));
      i += this.M(this.y.i.method_5438(1));
      if (i > 0) {
         int j = (int)Math.ceil(i / 2.0);
         return j + var1.field_9229.y(j);
      } else {
         return 0;
      }
   }

   @Override
   public void N(class08036 var1, class06584 var2) {
      this.N.N_53((var1x, var2x) -> {
         if (var1x instanceof class04782) {
            class07057.N((class04782)var1x, class06889.y(var2x), this.N(var1x));
         }

         var1x.N(1042, var2x, 0);
      });
      this.y.i.method_5447(0, class06584.E);
      this.y.i.method_5447(1, class06584.E);
   }

   @Override
   public boolean N(class06584 var1) {
      return false;
   }
}
