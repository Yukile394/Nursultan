package minecraft;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class class07198 implements class06799<FloatArgumentType, class07195> {
   public class07198() {
      super();
   }

   public void N(class07195 var1, class00667 var2) {
      boolean flag = var1.N != -Float.MAX_VALUE;
      boolean flag1 = var1.y != Float.MAX_VALUE;
      var2.writeByte(class01906.N(flag, flag1));
      if (flag) {
         var2.writeFloat(var1.N);
      }

      if (flag1) {
         var2.writeFloat(var1.y);
      }
   }

   public class07195 y(class00667 var1) {
      byte b0 = var1.readByte();
      float f = class01906.N(b0) ? var1.readFloat() : -Float.MAX_VALUE;
      float f1 = class01906.y(b0) ? var1.readFloat() : Float.MAX_VALUE;
      return new class07195(this, f, f1);
   }

   public void N(class07195 var1, JsonObject var2) {
      if (var1.N != -Float.MAX_VALUE) {
         var2.addProperty("min", var1.N);
      }

      if (var1.y != Float.MAX_VALUE) {
         var2.addProperty("max", var1.y);
      }
   }

   public class07195 N(FloatArgumentType var1) {
      return new class07195(this, var1.getMinimum(), var1.getMaximum());
   }
}
