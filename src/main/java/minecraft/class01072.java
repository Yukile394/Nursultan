package minecraft;

import com.google.gson.JsonObject;
import java.util.Date;
import org.jspecify.annotations.Nullable;

public class class01072 extends class01060<String> {
   public class01072(JsonObject var1) {
      super(y(var1), var1);
   }

   public class01072(String var1, @Nullable Date var2, @Nullable String var3, @Nullable Date var4, @Nullable String var5) {
      super(var1, var2, var3, var4, var5);
   }

   public class01072(String var1) {
      this(var1, null, null, null, null);
   }

   private static String y(JsonObject var0) {
      return var0.has("ip") ? var0.get("ip").getAsString() : null;
   }

   @Override
   protected void N(JsonObject var1) {
      if (this.B() != null) {
         var1.addProperty("ip", this.B());
         super.N(var1);
      }
   }

   @Override
   public class00392 R() {
      return class00392.y(String.valueOf(this.B()));
   }
}
