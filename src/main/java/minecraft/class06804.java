package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import java.util.Collections;

class class06804 implements class06792 {
   @Override
   public Pair<class01894, Collection<class07684<class07701>>> L(CommandContext<class07701> var1) throws CommandSyntaxException {
      return Pair.of(this.N, Collections.singleton(class06808.N(var1, this.N)));
   }

   class06804(class06808 var1, class01894 var2) {
      super();
      this.N = var2;
   }

   @Override
   public Pair<class01894, Either<class07684<class07701>, Collection<class07684<class07701>>>> y(CommandContext<class07701> var1) throws CommandSyntaxException {
      return Pair.of(this.N, Either.left(class06808.N(var1, this.N)));
   }

   @Override
   public Collection<class07684<class07701>> N(CommandContext<class07701> var1) throws CommandSyntaxException {
      return Collections.singleton(class06808.N(var1, this.N));
   }
}
