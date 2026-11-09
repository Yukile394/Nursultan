package minecraft;

import com.mojang.serialization.Codec;

public class class07468 {
   public static final Codec<class03556<class07468>> N = class04206.v.b();
   public static final class02362<class04247, class03556<class07468>> y = class02389.y(class04227.L);
   private final double L;
   private boolean u;
   private final String i;
   private class07445 R = class07445.field_51885;

   public String L() {
      return this.i;
   }

   protected class07468(String var1, double var2) {
      super();
      this.L = var2;
      this.i = var1;
   }

   public class06541 y(boolean var1) {
      return this.R.N(var1);
   }

   public boolean y() {
      return this.u;
   }

   public double N() {
      return this.L;
   }

   public class07468 N(class07445 var1) {
      this.R = var1;
      return this;
   }

   public double N(double var1) {
      return var1;
   }

   public class07468 N(boolean var1) {
      this.u = var1;
      return this;
   }
}
