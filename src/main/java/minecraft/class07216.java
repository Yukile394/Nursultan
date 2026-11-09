package minecraft;

import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public class class07216 implements class06799<StringArgumentType, class07222> {
   public class07216() {
      super();
   }

   public void N(class07222 var1, class00667 var2) {
      var2.N((Enum<?>)var1.N);
   }

   public class07222 y(class00667 var1) {
      StringType stringtype = var1.y(StringType.class);
      return new class07222(this, stringtype);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void N(class07222 var1, JsonObject var2) {
      var2.addProperty("type", switch (var1.N) {
         case SINGLE_WORD -> "word";
         case QUOTABLE_PHRASE -> "phrase";
         case GREEDY_PHRASE -> "greedy";
         default -> throw new MatchException(null, null);
      });
   }

   public class07222 N(StringArgumentType var1) {
      return new class07222(this, var1.getType());
   }
}
