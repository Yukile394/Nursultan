package minecraft;

public class class04438 extends class07206 {
   private final class02661 N;
   private final class02649 u;

   public class04438(class06581 var1) {
      super();
      if (var1 instanceof class02661 class02661) {
         this.N = class02661;
         this.u = class02661.N();
      } else {
         throw new IllegalArgumentException(var1 + " not instance of " + class02661.class.getSimpleName());
      }
   }

   @Override
   public class06584 N(class07210 var1, class06584 var2) {
      class04782 class04782 = var1.y();
      class07211 class07211 = var1.u().L(class06758.y);
      class00737 class00737 = this.u.y().getDispensePosition(var1, class07211);
      class08005.N(this.N.N(class04782, class00737, var2, class07211), class04782, var2, class07211.P(), class07211.s(), class07211.T(), this.u.u(), this.u.L());
      var2.B(1);
      return var2;
   }

   @Override
   protected void N(class07210 var1) {
      var1.y().N(this.u.i().orElse(1002), var1.L(), 0);
   }
}
