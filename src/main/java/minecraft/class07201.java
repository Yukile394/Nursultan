package minecraft;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class class07201 implements class06799<IntegerArgumentType, class07187> {
   public class07201() {
      super();
   }

   public void N(class07187 var1, class00667 var2) {
      boolean flag = var1.N != Integer.MIN_VALUE;
      boolean flag1 = var1.y != Integer.MAX_VALUE;
      var2.writeByte(class01906.N(flag, flag1));
      if (flag) {
         var2.writeInt(var1.N);
      }

      if (flag1) {
         var2.writeInt(var1.y);
      }
   }

   public class07187 y(class00667 var1) {
      byte b0 = var1.readByte();
      int i = class01906.N(b0) ? var1.readInt() : Integer.MIN_VALUE;
      int j = class01906.y(b0) ? var1.readInt() : Integer.MAX_VALUE;
      return new class07187(this, i, j);
   }

   public void N(class07187 var1, JsonObject var2) {
      if (var1.N != Integer.MIN_VALUE) {
         var2.addProperty("min", var1.N);
      }

      if (var1.y != Integer.MAX_VALUE) {
         var2.addProperty("max", var1.y);
      }
   }

   public class07187 N(IntegerArgumentType var1) {
      return new class07187(this, var1.getMinimum(), var1.getMaximum());
   }
}
