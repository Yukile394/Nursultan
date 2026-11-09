package minecraft;

import java.util.List;

public class class06933 extends class06581 {
   public class06933(class06573 var1) {
      super(var1);
   }

   protected class06584 N(class06584 var1, class08036 var2, class06584 var3) {
      var2.method_7259(class01235.L.y(this));
      return class05970.N(var1, var2, var3);
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      List<class07048> list = var1.N(class07048.class, var2.method_5829().M(2.0), var0 -> var0.method_5805() && var0.z() instanceof class00690);
      class06584 class06584 = var2.method_5998(var3);
      if (!list.isEmpty()) {
         class07048 class07048 = list.get(0);
         class07048.N(class07048.N() - 0.5F);
         var1.method_43128(null, var2.method_23317(), var2.method_23318(), var2.method_23321(), class04909.La, class04911.field_15254, 1.0F, 1.0F);
         var1.N(var2, class01194.d, var2.method_73189());
         if (var2 instanceof class04770 class04770) {
            class06912.C.N(class04770, class06584, class07048);
         }

         return class07082.N.N(this.N(class06584, var2, new class06584(class06570.lQ)));
      } else {
         class06183 class06183 = N(var1, var2, class05835.field_1345);
         if (class06183.N() == class07113.field_1333) {
            return class07082.i;
         } else {
            if (class06183.N() == class07113.field_1332) {
               class07209 class07209 = class06183.u();
               if (!var1.method_8505(var2, class07209)) {
                  return class07082.i;
               }

               if (var1.method_8316(class07209).N(class01231.N)) {
                  var1.method_43128(var2, var2.method_23317(), var2.method_23318(), var2.method_23321(), class04909.LX, class04911.field_15254, 1.0F, 1.0F);
                  var1.N(var2, class01194.d, class07209);
                  return class07082.N.N(this.N(class06584, var2, class06517.N(class06570.ns, class06506.N)));
               }
            }

            return class07082.i;
         }
      }
   }
}
