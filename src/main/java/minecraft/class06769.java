package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;

class class06769 implements class06792 {
   @Override
   public Pair<class01894, Collection<class07684<class07701>>> L(CommandContext<class07701> var1) throws CommandSyntaxException {
      return Pair.of(this.N, class06808.y(var1, this.N));
   }

   class06769(class06808 var1, class01894 var2) {
      super();
      this.N = var2;
   }

   @Override
   public Pair<class01894, Either<class07684<class07701>, Collection<class07684<class07701>>>> y(CommandContext<class07701> var1) throws CommandSyntaxException {
      return Pair.of(this.N, Either.right(class06808.y(var1, this.N)));
   }

   @Override
   public Collection<class07684<class07701>> N(CommandContext<class07701> var1) throws CommandSyntaxException {
      return class06808.y(var1, this.N);
   }
}
