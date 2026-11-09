package minecraft;

import Nursultan.class09445;
import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.LinkedList;
import java.util.Optional;
import java.util.function.Consumer;

public class class04761 extends class04748 {
   public static final MapCodec<class04761> N = N(class04761::new);

   public class04761(class04758 var1) {
      super(var1);
   }

   @Override
   public void N(class05974 var1, class05324 var2, class08088 var3, class06069 var4, class05163 var5, class07321 var6, class03300 var7) {
      class07218 class07218 = new class07218();
      int i = var1.method_31607();
      class05163 class05163 = var7.y();
      int j = class05163.Z();

      for (int k = var5.B(); k <= var5.U(); k++) {
         for (int l = var5.z(); l <= var5.W(); l++) {
            class07218.N(k, j, l);
            if (!var1.R(class07218) && class05163.y(class07218) && var7.N(class07218)) {
               for (int i1 = j - 1; i1 > i; i1--) {
                  class07218.method_10099(i1);
                  if (!var1.R(class07218) && !var1.method_8320(class07218).T()) {
                     break;
                  }

                  var1.method_8652(class07218, class00869.W.W(), 2);
               }
            }
         }
      }
   }

   @Override
   public class04367<?> N() {
      return class04367.s;
   }

   @Override
   public Optional<class04780> N(class04764 var1) {
      class06993 class06993 = class06993.N(var1.R());
      class07209 class07209 = this.N(var1, class06993);
      return class07209.method_10264() < 60
         ? Optional.empty()
         : Optional.of(new class04780(class07209, (Consumer<class03291>)(var4 -> this.N(var4, var1, class07209, class06993))));
   }

   private void N(class03291 var1, class04764 var2, class07209 var3, class06993 var4) {
      LinkedList linkedlist = Lists.newLinkedList();
      class09445.N(var2.i(), var3, var4, linkedlist, var2.R());
      linkedlist.forEach(var1::N);
   }
}
