package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class06914 extends class06581 {
   private final class07078<? extends class00250> N;

   public class06914(class07078<? extends class00250> var1, class06573 var2) {
      super(var2);
      this.N = var1;
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584 = var2.method_5998(var3);
      class06183 class06183 = N(var1, var2, class05835.field_1347);
      if (class06183.N() == class07113.field_1333) {
         return class07082.i;
      } else {
         class06889 class06889x = var2.method_5828(1.0F);
         double d0 = 5.0;
         List<class07049> list = var1.method_8333(var2, var2.method_5829().y(class06889x.L(5.0)).M(1.0), class07042.B);
         if (!list.isEmpty()) {
            class06889 class06889x = var2.method_33571();

            for (class07049 class07049 : list) {
               if (class07049.method_5829().M(class07049.method_5871()).u(class06889x)) {
                  return class07082.i;
               }
            }
         }

         if (class06183.N() == class07113.field_1332) {
            class00250 class00250 = this.N(var1, class06183, class06584, var2);
            if (class00250 == null) {
               return class07082.u;
            } else {
               class00250.method_36456(var2.method_36454());
               if (!var1.method_8587(class00250, class00250.method_5829())) {
                  return class07082.u;
               } else {
                  if (!var1.method_8608()) {
                     var1.method_8649(class00250);
                     var1.N(var2, class01194.v, class06183.y());
                     class06584.N(1, var2);
                  }

                  var2.method_7259(class01235.L.y(this));
                  return class07082.N;
               }
            }
         } else {
            return class07082.i;
         }
      }
   }

   @Nullable
   private class00250 N(class07299 var1, class07089 var2, class06584 var3, class08036 var4) {
      class00250 class00250 = this.N.N(var1, class06113.field_16465);
      if (class00250 != null) {
         class06889 class06889 = var2.y();
         class00250.N(class06889.M, class06889.B, class06889.Z);
         if (var1 instanceof class04782) {
            class07078.<class00250>N((class04782)var1, var3, var4).accept(class00250);
         }
      }

      return class00250;
   }
}
