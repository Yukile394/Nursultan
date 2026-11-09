package minecraft;

public interface class08978 {
   default class07438 aB_() {
      if (this instanceof class07438) {
         return (class07438)this;
      } else {
         throw new IllegalStateException("A container user must be a LivingEntity");
      }
   }

   double method_72381();

   boolean method_72380(class01114 var1, class07209 var2);
}
