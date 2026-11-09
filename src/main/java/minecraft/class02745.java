package minecraft;

import Nursultan.class11647;

public class class02745 extends class06249<class08464, class05564> {
   private final class05564 N;
   private final class05564 y;
   private final class08720 L;

   public class02745(class06252<class08464, class05564> var1, class01140 var2, class08720 var3) {
      super(var1);
      this.L = var3;
      this.N = new class05564(var2.N(class04802.ya));
      this.y = new class05564(var2.N(class04802.yX));
   }

   private void N(class01421 var1, class01237 var2, class08464 var3, class06584 var4, class05946<class11647> var5, int var6) {
      class05564 class05564 = var3.NB ? this.y : this.N;
      this.L.N(class08719.field_54130, var5, class05564, var3, var4, var1, var2, var6, var3.l);
   }

   public void N(class01421 var1, class01237 var2, int var3, class08464 var4, float var5, float var6) {
      class06584 class06584 = var4.L;
      class08725 class08725 = class06584.method_58694(class02484.o);
      if (class08725 != null && class08725.u().isPresent()) {
         this.N(var1, var2, var4, class06584, class08725.u().get(), var3);
      } else if (var4.u) {
         this.N(var1, var2, var4, class06584.E, class08699.m, var3);
      }
   }
}
