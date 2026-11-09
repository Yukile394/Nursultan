package minecraft;

import java.util.List;

public class class06515 extends class06581 {
   public class06515(class06573 var1) {
      super(var1);
   }

   @Override
   public class07082 N(class06501 var1) {
      class07299 class07299 = var1.method_8045();
      class07209 class07209 = var1.method_8037();
      class00500 class00500x = class07299.method_8320(class07209);
      if (class00500x.i() instanceof class04983 class04983 && !class04983.b(class00500x)) {
         class08036 class08036 = var1.method_8036();
         class06584 class06584 = var1.method_8041();
         if (class08036 instanceof class04770) {
            class06912.X.N((class04770)class08036, class07209, class06584);
         }

         class07299.method_8396(class08036, class07209, class04909.mR, class04911.field_15245, 1.0F, 1.0F);
         class00500 class00500x = class04983.T(class00500x);
         class07299.method_8501(class07209, class00500x);
         class07299.N(class01194.L, class07209, class01164.N(var1.method_8036(), class00500x));
         if (class08036 != null) {
            class06584.N(1, class08036, var1.method_20287().N());
         }

         return class07082.N;
      } else {
         return super.N(var1);
      }
   }

   @Override
   public boolean N(class06584 var1, class07299 var2, class00500 var3, class07209 var4, class07438 var5) {
      class02197 class02197 = var1.method_58694(class02484.O);
      if (class02197 == null) {
         return false;
      } else {
         if (!var2.method_8608() && !var3.N(class01210.Nh) && class02197.L() > 0) {
            var1.N(class02197.L(), var5, class07085.field_6173);
         }

         return true;
      }
   }

   public static class02197 N() {
      class02055 class02055 = class04206.N(class04206.i);
      return new class02197(
         List.of(
            class02191.N(class03543.N(class00869.yw.s()), 15.0F),
            class02191.y(class02055.y(class01210.H), 15.0F),
            class02191.y(class02055.y(class01210.N), 5.0F),
            class02191.y(class03543.N(class00869.Rc.s(), class00869.RX.s()), 2.0F)
         ),
         1.0F,
         1,
         true
      );
   }
}
