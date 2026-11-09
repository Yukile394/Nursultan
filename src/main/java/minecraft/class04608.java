package minecraft;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.LongArgumentType;

public class class04608 implements class06799<LongArgumentType, class04615> {
   public class04608() {
      super();
   }

   public void N(class04615 var1, class00667 var2) {
      boolean flag = var1.N != Long.MIN_VALUE;
      boolean flag1 = var1.y != Long.MAX_VALUE;
      var2.writeByte(class01906.N(flag, flag1));
      if (flag) {
         var2.writeLong(var1.N);
      }

      if (flag1) {
         var2.writeLong(var1.y);
      }
   }

   public class04615 y(class00667 var1) {
      byte b0 = var1.readByte();
      long i = class01906.N(b0) ? var1.readLong() : Long.MIN_VALUE;
      long j = class01906.y(b0) ? var1.readLong() : Long.MAX_VALUE;
      return new class04615(this, i, j);
   }

   public void N(class04615 var1, JsonObject var2) {
      if (var1.N != Long.MIN_VALUE) {
         var2.addProperty("min", var1.N);
      }

      if (var1.y != Long.MAX_VALUE) {
         var2.addProperty("max", var1.y);
      }
   }

   public class04615 N(LongArgumentType var1) {
      return new class04615(this, var1.getMinimum(), var1.getMaximum());
   }
}
