package minecraft;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

class class05600 implements class05622 {
   class05600(String var1) {
      super();
      this.N = var1;
   }

   @Override
   public class05598 N(CommandContext<class07701> var1) throws CommandSyntaxException {
      class07209 class07209 = class00894.N(var1, this.N + "Pos");
      class00394 class00394 = ((class07701)var1.getSource()).R().method_8321(class07209);
      if (class00394 == null) {
         throw class05608.N.create();
      } else {
         return new class05608(class00394, class07209);
      }
   }

   @Override
   public ArgumentBuilder<class07701, ?> N(ArgumentBuilder<class07701, ?> var1, Function<ArgumentBuilder<class07701, ?>, ArgumentBuilder<class07701, ?>> var2) {
      return var1.then(class07686.y("block").then((ArgumentBuilder)var2.apply(class07686.N(this.N + "Pos", class00894.N()))));
   }
}
