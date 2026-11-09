package minecraft;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

class class05614 implements class05622 {
   class05614(String var1) {
      super();
      this.N = var1;
   }

   @Override
   public class05598 N(CommandContext<class07701> var1) throws CommandSyntaxException {
      return new class05605(class07680.N(var1, this.N));
   }

   @Override
   public ArgumentBuilder<class07701, ?> N(ArgumentBuilder<class07701, ?> var1, Function<ArgumentBuilder<class07701, ?>, ArgumentBuilder<class07701, ?>> var2) {
      return var1.then(class07686.y("entity").then((ArgumentBuilder)var2.apply(class07686.N(this.N, class07680.N()))));
   }
}
