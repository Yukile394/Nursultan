package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;

public interface class06792 {
   Pair<class01894, Collection<class07684<class07701>>> L(CommandContext<class07701> var1) throws CommandSyntaxException;

   Pair<class01894, Either<class07684<class07701>, Collection<class07684<class07701>>>> y(CommandContext<class07701> var1) throws CommandSyntaxException;

   Collection<class07684<class07701>> N(CommandContext<class07701> var1) throws CommandSyntaxException;
}
