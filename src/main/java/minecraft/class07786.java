package minecraft;

import Nursultan.class10789;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;

public class class07786 implements ArgumentType<class07765> {
   public static final SuggestionProvider<class07701> N = (var0, var1) -> {
      StringReader stringreader = new StringReader(var1.getInput());
      stringreader.setCursor(var1.getStart());
      class06790 class06790 = new class06790(stringreader, ((class07701)var0.getSource()).N().hasPermission(class08162.i));

      try {
         class06790.v();
      } catch (CommandSyntaxException commandsyntaxexception) {
      }

      return class06790.N(var1, var1x -> class07689.y(((class07701)var0.getSource()).b(), var1x));
   };
   private static final Collection<String> L = Arrays.asList("Player", "0123", "*", "@e");
   private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.L("argument.scoreHolder.empty"));
   final boolean y;

   public static Collection<class01766> L(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return N(var0, var1, ((class07701)var0.getSource()).W().yB()::L);
   }

   public class07786(boolean var1) {
      super();
      this.y = var1;
   }

   public static Collection<class01766> y(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return N(var0, var1, Collections::emptyList);
   }

   public static class07786 y() {
      return new class07786(true);
   }

   public static Collection<class01766> N(CommandContext<class07701> var0, String var1, Supplier<Collection<class01766>> var2) throws CommandSyntaxException {
      Collection<class01766> collection = ((class07765)var0.getArgument(var1, class07765.class)).getNames((class07701)var0.getSource(), var2);
      if (collection.isEmpty()) {
         throw class07680.u.create();
      } else {
         return collection;
      }
   }

   public class07765 parse(StringReader var1) throws CommandSyntaxException {
      return this.N(var1, true);
   }

   public <S> class07765 parse(StringReader var1, S var2) throws CommandSyntaxException {
      return this.N(var1, class06790.N(var2));
   }

   private class07765 N(StringReader var1, boolean var2) throws CommandSyntaxException {
      if (var1.canRead() && var1.peek() == '@') {
         class06790 class06790 = new class06790(var1, var2);
         class06794 class06794 = class06790.v();
         if (!this.y && class06794.N() > 1) {
            throw class07680.N.createWithContext(var1);
         } else {
            return new class10789(class06794);
         }
      } else {
         int i = var1.getCursor();

         while (var1.canRead() && var1.peek() != ' ') {
            var1.skip();
         }

         String s = var1.getString().substring(i, var1.getCursor());
         if (s.equals("*")) {
            return (var0, var1x) -> {
               Collection collection = var1x.get();
               if (collection.isEmpty()) {
                  throw u.create();
               } else {
                  return collection;
               }
            };
         } else {
            List list = List.of(class01766.N(s));
            if (s.startsWith("#")) {
               return (var1x, var2x) -> list;
            } else {
               try {
                  return (var2x, var3x) -> {
                     class02796 class02796 = var2x.W();
                     class07049 class07049x = null;
                     ArrayList arraylist = null;
                     Iterator<class04782> iterator = class02796.NO().iterator();

                     while (iterator.hasNext()) {
                        class07049 class07049x = iterator.next().method_66347(var0);
                        if (class07049x != null) {
                           if (class07049x == null) {
                              class07049x = class07049x;
                           } else {
                              if (arraylist == null) {
                                 arraylist = new ArrayList();
                                 arraylist.add(class07049x);
                              }

                              arraylist.add(class07049x);
                           }
                        }
                     }

                     if (arraylist != null) {
                        return arraylist;
                     } else {
                        return class07049x != null ? List.of(class07049x) : list;
                     }
                  };
               } catch (IllegalArgumentException illegalargumentexception) {
                  return (var2x, var3x) -> {
                     class04770 class04770 = var2x.W().Nm().N(s);
                     return class04770 != null ? List.of(class04770) : list;
                  };
               }
            }
         }
      }
   }

   public static class01766 N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return y(var0, var1).iterator().next();
   }

   public static class07786 N() {
      return new class07786(false);
   }

   public Collection<String> getExamples() {
      return L;
   }
}
