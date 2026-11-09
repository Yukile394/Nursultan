package minecraft;

import java.util.List;
import java.util.Optional;

public interface class00873 {
   default class07209 N(class07209 var1) {
      return switch (this.ay_()) {
         case field_47834 -> var1.method_10084();
         case field_47835 -> var1;
      };
   }

   private static Optional<class07209> N(List<class07211> var0, class05487 var1, class07209 var2, class00500 var3) {
      for (class07211 class07211 : var0) {
         class07209 class07209 = var2.method_10093(class07211);
         if (var1.R(class07209) && var3.N(var1, class07209)) {
            return Optional.of(class07209);
         }
      }

      return Optional.empty();
   }

   static Optional<class07209> N(class07299 var0, class07209 var1, class00500 var2) {
      return N(class07221.field_11062.L(var0.field_9229), var0, var1, var2);
   }

   boolean N(class07299 var1, class06069 var2, class07209 var3, class00500 var4);

   void N(class04782 var1, class06069 var2, class07209 var3, class00500 var4);

   boolean N(class05487 var1, class07209 var2, class00500 var3);

   default class00901 ay_() {
      return class00901.field_47835;
   }

   static boolean a_(class05487 var0, class07209 var1, class00500 var2) {
      return N(class07221.field_11062.N().toList(), var0, var1, var2).isPresent();
   }
}
