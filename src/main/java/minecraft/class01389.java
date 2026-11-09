package minecraft;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Function;

class class01389 implements class05622 {
   class01389(String var1) {
      super();
      this.N = var1;
   }

   @Override
   public class05598 N(CommandContext<class07701> var1) {
      return new class01413(class01413.N(var1), class07778.N(var1, this.N));
   }

   @Override
   public ArgumentBuilder<class07701, ?> N(ArgumentBuilder<class07701, ?> var1, Function<ArgumentBuilder<class07701, ?>, ArgumentBuilder<class07701, ?>> var2) {
      return var1.then(class07686.y("storage").then((ArgumentBuilder)var2.apply(class07686.N(this.N, class07778.N()).suggests(class01413.N))));
   }
}
