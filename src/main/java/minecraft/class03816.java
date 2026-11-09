package minecraft;

import java.util.List;

class class03816 implements class03805 {
   class03816(class03837 var1, List var2, List var3) {
      super();
      this.L = var1;
      this.N = var2;
      this.y = var3;
   }

   @Override
   public List<class03821> y() {
      return this.N.stream().map(var0 -> new class03821(var0.N, var0.u)).toList();
   }

   @Override
   public void N(boolean var1) {
      if (!var1) {
         this.N.clear();

         for (class03845 class03845x : this.L.y) {
            switch (class03845x.M) {
               case field_47639:
                  class03845x.N(class03834.field_47654);
                  break;
               case field_47640:
                  class03845x.M = class03843.field_47639;
                  class03845x.N(class03834.field_47652);
                  break;
               case field_47641:
                  this.N.add(class03845x);
            }
         }

         this.L.N();
      } else {
         for (class03845 class03845 : this.L.y) {
            if (class03845.M == class03843.field_47640) {
               class03845.M = class03843.field_47639;
            }
         }
      }
   }

   @Override
   public void N() {
      for (class03845 class03845x : this.N) {
         class03845x.M = class03843.field_47641;
         if (class03845x.i == null) {
            this.L.N.N(class03845x.N, class03824.field_47624);
         }
      }

      for (class03845 class03845x : this.y) {
         class03845x.M = class03843.field_47639;
      }

      this.L.N();
   }
}
