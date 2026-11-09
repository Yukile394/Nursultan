package minecraft;

import com.mojang.brigadier.RedirectModifier;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ContextChain;
import com.mojang.brigadier.context.ContextChain.Stage;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collection;
import java.util.List;
import net.fabricmc.fabric.mixin.entity.event.effect.BuildContextsAccessor;

public class class01736<T extends class01711<T>> implements BuildContextsAccessor {
   public static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("command.forkLimit", var0));
   private final String y;
   private final ContextChain<T> L;

   public class01736(String var1, ContextChain<T> var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   @Override
   public String toString() {
      return this.y;
   }

   protected void N(T var1, List<T> var2, class01752<T> var3, class03099 var4, class03126 var5) {
      ContextChain contextchain = this.L;
      class03126 class03126 = var5;
      Object object = var2;
      if (contextchain.getStage() != Stage.EXECUTE) {
         var3.L().N(() -> "prepare " + this.y);

         try {
            for (int i = var3.u(); contextchain.getStage() != Stage.EXECUTE; contextchain = contextchain.nextStage()) {
               CommandContext commandcontext = contextchain.getTopContext();
               if (commandcontext.isForked()) {
                  class03126 = class03126.y();
               }

               RedirectModifier redirectmodifier = commandcontext.getRedirectModifier();
               if (redirectmodifier instanceof class01727 class01727) {
                  class01727.N(var1, (List<class01711>)object, contextchain, class03126, class01744.N(var3, var4));
                  return;
               }

               if (redirectmodifier != null) {
                  var3.i();
                  boolean flag = class03126.N();
                  ObjectArrayList objectarraylist = new ObjectArrayList();

                  for (class01711 class01711xx : object) {
                     try {
                        Collection collection = ContextChain.runModifier(commandcontext, class01711xx, (var0, var1x, var2x) -> {}, flag);
                        if (objectarraylist.size() + collection.size() >= i) {
                           var1.N(N.create(i), flag, var3.y());
                           return;
                        }

                        objectarraylist.addAll(collection);
                     } catch (CommandSyntaxException commandsyntaxexception) {
                        class01711xx.N(commandsyntaxexception, flag, var3.y());
                        if (!flag) {
                           return;
                        }
                     }
                  }

                  object = objectarraylist;
               }
            }
         } finally {
            var3.L().L();
         }
      }

      if (object.isEmpty()) {
         if (class03126.L()) {
            var3.N(new class01714<>(var4, class03144.N()));
         }
      } else {
         CommandContext commandcontext1 = contextchain.getTopContext();
         if (commandcontext1.getCommand() instanceof class01729 class01729) {
            class01744 class01744 = class01744.N(var3, var4);

            for (class01711 class01711 : object) {
               class01729.N(class01711, contextchain, class03126, class01744);
            }
         } else {
            if (class03126.L()) {
               class01711 class01711x = (class01711)object.get(0);
               class01711x = class01711x.y(class03102.N(class01711x.T(), var4.u()));
               object = List.of(class01711x);
            }

            class01717 class01717 = new class01717(this.y, class03126, commandcontext1);
            class01722.N(var3, var4, (List<class01711>)object, (var1x, var2x) -> new class01714<>(var1x, class01717.N((T)var2x)));
         }
      }
   }

   protected void N(class01752<T> var1, class03099 var2) {
      class01704 class01704 = var1.y();
      if (class01704 != null) {
         class01704.N(var2.L(), this.y);
      }
   }
}
