package minecraft;

public abstract class class05515 extends class06586 implements class02661 {
   public static float N = 0.5F;

   public class05515(class06573 var1) {
      super(var1);
   }

   protected abstract class07486 N(class07299 var1, class00737 var2, class06584 var3);

   @Override
   public class02649 N() {
      return class02649.N().N(class02649.N.L() * 0.5F).y(class02649.N.u() * 1.25F).N();
   }

   @Override
   public class08005 N(class07299 var1, class00737 var2, class06584 var3, class07211 var4) {
      return this.N(var1, var2, var3);
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      class06584 class06584 = var2.method_5998(var3);
      if (var1 instanceof class04782 class04782) {
         class08005.N(this::N, class04782, class06584, var2, -20.0F, N, 1.0F);
      }

      var2.method_7259(class01235.L.y(this));
      class06584.N(1, var2);
      return class07082.N;
   }

   protected abstract class07486 N(class04782 var1, class07438 var2, class06584 var3);
}
