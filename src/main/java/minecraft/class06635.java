package minecraft;

import org.jspecify.annotations.Nullable;

public class class06635 implements class00381<class07280> {
   public static final class02362<class00667, class06635> N = class00381.N(class06635::N, class06635::new);
   private final int y;
   private final int L;

   public class06635(class07049 var1, @Nullable class07049 var2) {
      super();
      this.y = var1.method_5628();
      this.L = var2 != null ? var2.method_5628() : 0;
   }

   private class06635(class00667 var1) {
      super();
      this.y = var1.readInt();
      this.L = var1.readInt();
   }

   public int y() {
      return this.L;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public int N() {
      return this.y;
   }

   private void N(class00667 var1) {
      var1.writeInt(this.y);
      var1.writeInt(this.L);
   }

   @Override
   public class02897<class06635> method_65080() {
      return class04248.Ne;
   }
}
