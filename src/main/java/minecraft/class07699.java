package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;

public record class07699(String text, class07771[] parts) {

   public class07699(String text, class07771[] parts) {
      super();
      this.text = text;
      this.parts = parts;
   }

   public class07771[] y() {
      return this.parts;
   }

   public static class07699 N(StringReader var0, boolean var1) throws CommandSyntaxException {
      if (var0.getRemainingLength() > 256) {
         throw class07690.N.create(var0.getRemainingLength(), 256);
      } else {
         String s = var0.getRemaining();
         if (!var1) {
            var0.setCursor(var0.getTotalLength());
            return new class07699(s, new class07771[0]);
         } else {
            ArrayList arraylist = Lists.newArrayList();
            int i = var0.getCursor();

            while (true) {
               int j;
               class06794 class06794;
               while (true) {
                  if (!var0.canRead()) {
                     return new class07699(s, arraylist.toArray(new class07771[0]));
                  }

                  if (var0.peek() == '@') {
                     j = var0.getCursor();

                     try {
                        class06790 class06790 = new class06790(var0, true);
                        class06794 = class06790.v();
                        break;
                     } catch (CommandSyntaxException commandsyntaxexception) {
                        if (commandsyntaxexception.getType() != class06790.B && commandsyntaxexception.getType() != class06790.R) {
                           throw commandsyntaxexception;
                        }

                        var0.setCursor(j + 1);
                     }
                  } else {
                     var0.skip();
                  }
               }

               arraylist.add(new class07771(j - i, var0.getCursor() - i, class06794));
            }
         }
      }
   }

   public String N() {
      return this.text;
   }

   class00392 N(class07701 var1) throws CommandSyntaxException {
      return this.N(var1, var1.N().hasPermission(class08162.i));
   }

   public class00392 N(class07701 var1, boolean var2) throws CommandSyntaxException {
      if (this.parts.length != 0 && var2) {
         class05216 class05216 = class00392.y(this.text.substring(0, this.parts[0].N()));
         int i = this.parts[0].N();

         for (class07771 class07771 : this.parts) {
            class00392 class00392 = class07771.N(var1);
            if (i < class07771.N()) {
               class05216.i(this.text.substring(i, class07771.N()));
            }

            class05216.y(class00392);
            i = class07771.y();
         }

         if (i < this.text.length()) {
            class05216.i(this.text.substring(i));
         }

         return class05216;
      } else {
         return class00392.y(this.text);
      }
   }
}
