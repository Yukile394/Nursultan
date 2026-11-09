package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

public class class05275 extends class00471<class05275> {
   private final class04794 N;
   private final List<class05644> y = Lists.newArrayList();

   class05275(class04794 var1) {
      super();
      this.N = var1;
   }

   @Override
   public class08122 y() {
      return new class05268(this.R(), this.N, this.y);
   }

   protected class05275 L() {
      return this;
   }

   public class05275 N(String var1, String var2) {
      return this.N(var1, var2, class05677.field_17032);
   }

   public class05275 N(String var1, String var2, class05677 var3) {
      try {
         this.y.add(new class05644(class07793.N(var1), class07793.N(var2), var3));
         return this;
      } catch (CommandSyntaxException commandsyntaxexception) {
         throw new IllegalArgumentException(commandsyntaxexception);
      }
   }
}
