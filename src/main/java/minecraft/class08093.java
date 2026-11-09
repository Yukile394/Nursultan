package minecraft;

import org.jspecify.annotations.Nullable;

public class class08093 implements class00381<class07280> {
   public static final class02362<class00667, class08093> N = class00381.N(class08093::N, class08093::new);
   private final int y;
   @Nullable
   private final class07001 L;

   public class08093(int var1, @Nullable class07001 var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   private class08093(class00667 var1) {
      super();
      this.y = var1.E();
      this.L = var1.P();
   }

   @Override
   public boolean i() {
      return true;
   }

   @Nullable
   public class07001 y() {
      return this.L;
   }

   public int N() {
      return this.y;
   }

   private void N(class00667 var1) {
      var1.L(this.y);
      var1.N((class07709)this.L);
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class08093> method_65080() {
      return class04248.yM;
   }
}
