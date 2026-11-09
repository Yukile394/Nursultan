package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.datafixers.util.Pair;
import java.util.Collection;
import org.jspecify.annotations.Nullable;

public abstract class class01578 extends class01723<class07701> implements class01743<class07701> {
   public class01578() {
      super();
   }

   @Nullable
   protected abstract class07001 N(CommandContext<class07701> var1) throws CommandSyntaxException;

   public void N(class07701 var1, ContextChain<class07701> var2, class03126 var3, class01744<class07701> var4) throws CommandSyntaxException {
      CommandContext commandcontext = var2.getTopContext().copyFor(var1);
      Pair<class01894, Collection<class07684<class07701>>> pair = class06808.L(commandcontext, "name");
      Collection<class07684<class07701>> collection = (Collection<class07684<class07701>>)pair.getSecond();
      if (collection.isEmpty()) {
         throw class01568.N.create(class00392.N((class01894)pair.getFirst()));
      } else {
         class07001 class07001 = this.N(commandcontext);
         class07701 class07701 = class01568.N(var1);
         if (collection.size() == 1) {
            var1.N(() -> class00392.N("commands.function.scheduled.single", class00392.N(collection.iterator().next().N())), true);
         } else {
            var1.N(
               () -> class00392.N("commands.function.scheduled.multiple", class00390.y(collection.stream().map(class07684::N).toList(), class00392::N)), true
            );
         }

         class01568.N(collection, class07001, var1, class07701, var4, class01568.u, var3);
      }
   }
}
