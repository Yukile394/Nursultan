package minecraft;

import com.google.gson.JsonObject;

public class class07780 implements class06799<class07786, class07783> {
   private static final byte N = 1;

   public class07780() {
      super();
   }

   public void N(class07783 var1, class00667 var2) {
      byte b0 = 0;
      if (var1.N) {
         b0 |= 1;
      }

      var2.writeByte(b0);
   }

   public class07783 y(class00667 var1) {
      boolean flag = (var1.readByte() & 1) != 0;
      return new class07783(this, flag);
   }

   public void N(class07783 var1, JsonObject var2) {
      var2.addProperty("amount", var1.N ? "multiple" : "single");
   }

   public class07783 N(class07786 var1) {
      return new class07783(this, var1.y);
   }
}
