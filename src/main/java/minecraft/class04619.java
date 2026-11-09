package minecraft;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class class04619 extends class04596 {
   @Override
   public void L() {
      this.y.F = 200;
      List<class07209> list = this.U();
      if (!list.isEmpty()) {
         for (class07209 class07209 : list) {
            if (!this.y.x.N(class07209)) {
               this.y.C = class07209;
               return;
            }
         }

         this.y.x.U();
         this.y.C = list.get(0);
      }
   }

   @Override
   public boolean M() {
      return this.y.F == 0 && !this.y.Y() && this.y.d();
   }

   class04619(class04626 var1) {
      super(var1);
      this.y = var1;
   }

   @Override
   public boolean Z() {
      return false;
   }

   private List<class07209> U() {
      class07209 class07209 = this.y.method_24515();
      return ((class04782)this.y.method_73183())
         .method_19494()
         .i(var0 -> var0.N(class03949.L), class07209, 20, class05372.field_18489)
         .map(class05377::M)
         .filter(this.y::M)
         .sorted(Comparator.comparingDouble(var1x -> var1x.method_10262(class07209)))
         .collect(Collectors.toList());
   }
}
