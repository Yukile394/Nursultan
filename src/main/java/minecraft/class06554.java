package minecraft;

import java.util.Optional;
import java.util.function.Consumer;

public class class06554 extends class06581 {
   private static final class00392 N = class00392.L("painting.random").N(class06541.field_1080);
   private final class07078<? extends class00710> y;

   public class06554(class07078<? extends class00710> var1, class06573 var2) {
      super(var2);
      this.y = var1;
   }

   @Override
   public class07082 N(class06501 var1) {
      class07209 class07209x = var1.method_8037();
      class07211 class07211 = var1.method_8038();
      class07209 class07209x = class07209x.method_10093(class07211);
      class08036 class08036 = var1.method_8036();
      class06584 class06584 = var1.method_8041();
      if (class08036 != null && !this.N(class08036, class07211, class06584, class07209x)) {
         return class07082.u;
      } else {
         class07299 class07299 = var1.method_8045();
         Object object;
         if (this.y == class07078.NF) {
            Optional<class00698> optional = class00698.N(class07299, class07209x, class07211);
            if (optional.isEmpty()) {
               return class07082.L;
            }

            object = optional.get();
         } else if (this.y == class07078.Nl) {
            object = new class00679(class07299, class07209x, class07211);
         } else {
            if (this.y != class07078.NU) {
               return class07082.N;
            }

            object = new class02254(class07299, class07209x, class07211);
         }

         class07078.N(class07299, class06584, class08036).accept(object);
         if (((class00710)object).y()) {
            if (!class07299.method_8608()) {
               ((class00710)object).i();
               class07299.N(class08036, class01194.v, ((class00710)object).method_73189());
               class07299.method_8649((class07049)object);
            }

            class06584.B(1);
            return class07082.N;
         } else {
            return class07082.L;
         }
      }
   }

   @Override
   public void N(class06584 var1, class06591 var2, class08562 var3, Consumer<class00392> var4, class06497 var5) {
      if (this.y == class07078.NF && var3.N(class02484.NC)) {
         class03556 class03556 = var1.method_58694(class02484.NC);
         if (class03556 != null) {
            ((class00693)class03556.N()).i().ifPresent(var4);
            ((class00693)class03556.N()).R().ifPresent(var4);
            var4.accept(class00392.N("painting.dimensions", ((class00693)class03556.N()).y(), ((class00693)class03556.N()).L()));
         } else if (var5.y()) {
            var4.accept(N);
         }
      }
   }

   protected boolean N(class08036 var1, class07211 var2, class06584 var3, class07209 var4) {
      return !var2.z().y() && var1.method_7343(var4, var2, var3);
   }
}
