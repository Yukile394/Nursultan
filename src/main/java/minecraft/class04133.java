package minecraft;

public final class class04133 {
   private final class02135 N;
   private int y;

   public class04133(class02135 var1) {
      super();
      if (var1.y() <= 1) {
         throw new IllegalArgumentException();
      } else {
         this.N = var1;
      }
   }

   public boolean N(class06069 var1) {
      if (this.y == 0) {
         this.y = this.N.N(var1) - 1;
         return false;
      } else {
         return --this.y == 0;
      }
   }
}
