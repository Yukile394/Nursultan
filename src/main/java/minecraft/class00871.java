package minecraft;

import com.google.gson.JsonObject;

public class class00871 implements class06799<class07798, class00907> {
   public class00871() {
      super();
   }

   public void N(class00907 var1, class00667 var2) {
      var2.writeInt(var1.N);
   }

   public class00907 y(class00667 var1) {
      int i = var1.readInt();
      return new class00907(this, i);
   }

   public void N(class00907 var1, JsonObject var2) {
      var2.addProperty("min", var1.N);
   }

   public class00907 N(class07798 var1) {
      return new class00907(this, var1.N);
   }
}
