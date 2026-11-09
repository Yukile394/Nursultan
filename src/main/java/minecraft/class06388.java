package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;

class class06388 extends class01723<class07701> implements class01743<class07701> {
   class06388() {
      super();
   }

   public void N(class07701 var1, ContextChain<class07701> var2, class03126 var3, class01744<class07701> var4) throws CommandSyntaxException {
      if (var3.L()) {
         throw class06401.L.create();
      } else if (var4.N() != null) {
         throw class06401.y.create();
      } else {
         Collection<class07684<class07701>> collection = class06808.N(var2.getTopContext(), "name");
         class02796 class02796 = var1.W();
         String s = "debug-trace-" + class07536.R() + ".txt";
         CommandDispatcher<class07701> commanddispatcher = var1.W().Nr().N();
         int i = 0;

         try {
            Path path = class02796.i("debug");
            Files.createDirectories(path);
            PrintWriter printwriter = new PrintWriter(Files.newBufferedWriter(path.resolve(s), StandardCharsets.UTF_8));
            class06410 class06410 = new class06410(printwriter);
            var4.N(class06410);

            for (class07684<class07701> class07684 : collection) {
               try {
                  class07701 class07701 = var1.N(class06410).y(class06984.L);
                  class01747<class07701> class01747 = class07684.N(null, commanddispatcher);
                  var4.N(new class06408(this, class01747, class03102.N, false, printwriter, class07684).N(class07701));
                  i += class01747.y().size();
               } catch (class01878 class01878) {
                  var1.y(class01878.N());
               }
            }
         } catch (IOException | UncheckedIOException uncheckedioexception) {
            class06401.N.warn("Tracing failed", uncheckedioexception);
            var1.y(class00392.L("commands.debug.function.traceFailed"));
         }

         int j = i;
         var4.N((var4x, var5) -> {
            if (collection.size() == 1) {
               var1.N(() -> class00392.N("commands.debug.function.success.single", j, class00392.N(collection.iterator().next().N()), s), true);
            } else {
               var1.N(() -> class00392.N("commands.debug.function.success.multiple", j, collection.size(), s), true);
            }
         });
      }
   }
}
