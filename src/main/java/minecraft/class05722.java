package minecraft;

import java.util.Set;
import java.util.stream.Collectors;

class class05722 extends class05724<class05690> {
   public class05722(class05720 var1, class01042 var2, class03767 var3) {
      super(var1.field_22787, var1.field_22789, var1.field_22790 - 117, 80, 24);
      this.N = var1;

      for (class03556 class03556 : var2.L(class04227.yM).u(class04401.N)) {
         Set set = ((class04086)class03556.N()).y().i().stream().map(var0 -> var0.y().i()).filter(var1x -> !var1x.N(var3)).collect(Collectors.toSet());
         if (!set.isEmpty()) {
            class05720.y
               .info(
                  "Discarding flat world preset {} since it contains experimental blocks {}",
                  class03556.i().map(var0 -> var0.N().toString()).orElse("<unknown>"),
                  set
               );
         } else {
            this.method_25321(new class05690(this, class03556));
         }
      }
   }

   public void method_25313(class05690 var1) {
      super.method_25313(var1);
      this.N.N(var1 != null);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (super.method_25404(var1)) {
         return true;
      } else {
         if (var1.L() && this.method_25334() != null) {
            this.method_25334().N();
         }

         return false;
      }
   }
}
