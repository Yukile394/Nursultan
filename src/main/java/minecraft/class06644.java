package minecraft;

import org.jspecify.annotations.Nullable;

public class class06644 implements class00381<class07280> {
   public static final class02362<class00667, class06644> N = class00381.N(class06644::N, class06644::new);
   private final int y;
   private final byte L;

   public class06644(class07049 var1, byte var2) {
      super();
      this.y = var1.method_5628();
      this.L = var2;
   }

   private class06644(class00667 var1) {
      super();
      this.y = var1.E();
      this.L = var1.readByte();
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Nullable
   public class07049 N(class07299 var1) {
      return var1.method_8469(this.y);
   }

   private void N(class00667 var1) {
      var1.L(this.y);
      var1.writeByte(this.L);
   }

   public float N() {
      return class04995.N(this.L);
   }

   @Override
   public class02897<class06644> method_65080() {
      return class04248.Nt;
   }
}
