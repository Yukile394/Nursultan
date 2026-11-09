package minecraft;

import com.google.common.collect.Iterables;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class class07680 implements ArgumentType<class06794> {
   private static final Collection<String> Z = Arrays.asList("Player", "0123", "@e", "@e[type=foo]", "dd12be42-52a9-4a91-a8a1-11c01849e498");
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.entity.toomany"));
   public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("argument.player.toomany"));
   public static final SimpleCommandExceptionType L = new SimpleCommandExceptionType(class00392.L("argument.player.entities"));
   public static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.L("argument.entity.notfound.entity"));
   public static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.L("argument.entity.notfound.player"));
   public static final SimpleCommandExceptionType R = new SimpleCommandExceptionType(class00392.L("argument.entity.selector.not_allowed"));
   final boolean M;
   final boolean B;

   public static Collection<? extends class07049> L(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return ((class06794)var0.getArgument(var1, class06794.class)).y((class07701)var0.getSource());
   }

   public static class07680 L() {
      return new class07680(true, true);
   }

   protected class07680(boolean var1, boolean var2) {
      super();
      this.M = var1;
      this.B = var2;
   }

   public static class04770 i(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return ((class06794)var0.getArgument(var1, class06794.class)).L((class07701)var0.getSource());
   }

   public static class07680 u() {
      return new class07680(false, true);
   }

   public static Collection<class04770> u(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return ((class06794)var0.getArgument(var1, class06794.class)).u((class07701)var0.getSource());
   }

   public static class07680 y() {
      return new class07680(false, false);
   }

   public static Collection<? extends class07049> y(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      Collection<? extends class07049> collection = L(var0, var1);
      if (collection.isEmpty()) {
         throw u.create();
      } else {
         return collection;
      }
   }

   private class06794 N(StringReader var1, boolean var2) throws CommandSyntaxException {
      boolean flag = false;
      class06794 class06794 = new class06790(var1, var2).v();
      if (class06794.N() > 1 && this.M) {
         if (this.B) {
            var1.setCursor(0);
            throw y.createWithContext(var1);
         } else {
            var1.setCursor(0);
            throw N.createWithContext(var1);
         }
      } else if (class06794.y() && this.B && !class06794.L()) {
         var1.setCursor(0);
         throw L.createWithContext(var1);
      } else {
         return class06794;
      }
   }

   public static class07049 N(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      return ((class06794)var0.getArgument(var1, class06794.class)).N((class07701)var0.getSource());
   }

   public static class07680 N() {
      return new class07680(true, false);
   }

   public class06794 parse(StringReader var1) throws CommandSyntaxException {
      return this.N(var1, true);
   }

   public <S> class06794 parse(StringReader var1, S var2) throws CommandSyntaxException {
      return this.N(var1, class06790.N(var2));
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      if (var1.getSource() instanceof class07689 class07689) {
         StringReader stringreader = new StringReader(var2.getInput());
         stringreader.setCursor(var2.getStart());
         class06790 class06790 = new class06790(stringreader, class07689.N().hasPermission(class08162.i));

         try {
            class06790.v();
         } catch (CommandSyntaxException commandsyntaxexception) {
         }

         return class06790.N(var2, var2x -> {
            Collection<String> collection = class07689.b();
            class07689.y((Iterable<String>)(this.B ? collection : Iterables.concat(collection, class07689.ag_())), var2x);
         });
      } else {
         return Suggestions.empty();
      }
   }

   public Collection<String> getExamples() {
      return Z;
   }

   public static Collection<class04770> R(CommandContext<class07701> var0, String var1) throws CommandSyntaxException {
      List<class04770> list = ((class06794)var0.getArgument(var1, class06794.class)).u((class07701)var0.getSource());
      if (list.isEmpty()) {
         throw i.create();
      } else {
         return list;
      }
   }
}
