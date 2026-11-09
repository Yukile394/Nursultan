package minecraft;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType.StringType;

public final class class07222 implements class06763<StringArgumentType> {
   final StringType N;

   public class07222(class07216 var1, StringType var2) {
      super();
      this.y = var1;
      this.N = var2;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public StringArgumentType y(class04348 var1) {
      return switch (this.N) {
         case SINGLE_WORD -> StringArgumentType.word();
         case QUOTABLE_PHRASE -> StringArgumentType.string();
         case GREEDY_PHRASE -> StringArgumentType.greedyString();
         default -> throw new MatchException(null, null);
      };
   }

   @Override
   public class06799<StringArgumentType, ?> N() {
      return this.y;
   }
}
