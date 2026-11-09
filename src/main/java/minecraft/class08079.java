package minecraft;

import java.util.List;

public class class08079 implements class00381<class07280> {
   public static final class02362<class00667, class08079> N = class00381.N(class08079::N, class08079::new);
   private final int y;
   private final int[] L;

   public class08079(class07049 var1) {
      super();
      this.y = var1.method_5628();
      List<class07049> list = var1.method_5685();
      this.L = new int[list.size()];

      for (int i = 0; i < list.size(); i++) {
         this.L[i] = list.get(i).method_5628();
      }
   }

   private class08079(class00667 var1) {
      super();
      this.y = var1.E();
      this.L = var1.L();
   }

   public int y() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int[] N() {
      return this.L;
   }

   private void N(class00667 var1) {
      var1.L(this.y);
      var1.N(this.L);
   }

   @Override
   public class02897<class08079> method_65080() {
      return class04248.NA;
   }
}
