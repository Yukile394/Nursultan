package minecraft;

import com.google.gson.JsonObject;

public class class07683 implements class06799<class07680, class07697> {
   private static final byte N = 1;
   private static final byte y = 2;

   public class07683() {
      super();
   }

   public void N(class07697 var1, class00667 var2) {
      byte b0 = 0;
      if (var1.N) {
         b0 |= 1;
      }

      if (var1.y) {
         b0 |= 2;
      }

      var2.writeByte(b0);
   }

   public class07697 y(class00667 var1) {
      byte b0 = var1.readByte();
      return new class07697(this, (b0 & 1) != 0, (b0 & 2) != 0);
   }

   public void N(class07697 var1, JsonObject var2) {
      var2.addProperty("amount", var1.N ? "single" : "multiple");
      var2.addProperty("type", var1.y ? "players" : "entities");
   }

   public class07697 N(class07680 var1) {
      return new class07697(this, var1.M, var1.B);
   }
}
