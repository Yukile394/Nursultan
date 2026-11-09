package minecraft;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class class07224 implements class06799<DoubleArgumentType, class07213> {
   public class07224() {
      super();
   }

   public void N(class07213 var1, class00667 var2) {
      boolean flag = var1.N != -Double.MAX_VALUE;
      boolean flag1 = var1.y != Double.MAX_VALUE;
      var2.writeByte(class01906.N(flag, flag1));
      if (flag) {
         var2.writeDouble(var1.N);
      }

      if (flag1) {
         var2.writeDouble(var1.y);
      }
   }

   public class07213 y(class00667 var1) {
      byte b0 = var1.readByte();
      double d0 = class01906.N(b0) ? var1.readDouble() : -Double.MAX_VALUE;
      double d1 = class01906.y(b0) ? var1.readDouble() : Double.MAX_VALUE;
      return new class07213(this, d0, d1);
   }

   public void N(class07213 var1, JsonObject var2) {
      if (var1.N != -Double.MAX_VALUE) {
         var2.addProperty("min", var1.N);
      }

      if (var1.y != Double.MAX_VALUE) {
         var2.addProperty("max", var1.y);
      }
   }

   public class07213 N(DoubleArgumentType var1) {
      return new class07213(this, var1.getMinimum(), var1.getMaximum());
   }
}
