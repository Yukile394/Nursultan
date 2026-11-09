package minecraft;

import com.google.common.base.CharMatcher;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface class07689 extends class08168 {
   CharMatcher L = CharMatcher.anyOf("._/");

   default Collection<class07665> Q() {
      return Collections.singleton(class07665.y);
   }

   Collection<String> b();

   Set<class05946<class07299>> n();

   class01042 t();

   Stream<class01894> v();

   Collection<String> j();

   static CompletableFuture<Suggestions> y(String var0, Collection<class07665> var1, SuggestionsBuilder var2, Predicate<String> var3) {
      ArrayList arraylist = Lists.newArrayList();
      if (Strings.isNullOrEmpty(var0)) {
         for (class07665 class07665x : var1) {
            String s = class07665x.L + " " + class07665x.i;
            if (var3.test(s)) {
               arraylist.add(class07665x.L);
               arraylist.add(s);
            }
         }
      } else {
         String[] astring = var0.split(" ");
         if (astring.length == 1) {
            for (class07665 class07665x : var1) {
               String s1 = astring[0] + " " + class07665x.i;
               if (var3.test(s1)) {
                  arraylist.add(s1);
               }
            }
         }
      }

      return y(arraylist, var2);
   }

   static <T> CompletableFuture<Suggestions> y(Iterable<T> var0, SuggestionsBuilder var1, Function<T, String> var2, Function<T, Message> var3) {
      String s = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (Object object : var0) {
         String s1 = (String)var2.apply(object);
         if (N(s, s1.toLowerCase(Locale.ROOT))) {
            var1.suggest(s1, (Message)var3.apply(object));
         }
      }

      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> y(Stream<String> var0, SuggestionsBuilder var1) {
      String s = var1.getRemaining().toLowerCase(Locale.ROOT);
      var0.filter(var1x -> N(s, var1x.toLowerCase(Locale.ROOT))).forEach(var1::suggest);
      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> y(Iterable<String> var0, SuggestionsBuilder var1) {
      String s = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (String s1 : var0) {
         if (N(s, s1.toLowerCase(Locale.ROOT))) {
            var1.suggest(s1);
         }
      }

      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> N(String[] var0, SuggestionsBuilder var1) {
      String s = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (String s1 : var0) {
         if (N(s, s1.toLowerCase(Locale.ROOT))) {
            var1.suggest(s1);
         }
      }

      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> N(String var0, Collection<class07665> var1, SuggestionsBuilder var2, Predicate<String> var3) {
      ArrayList arraylist = Lists.newArrayList();
      if (Strings.isNullOrEmpty(var0)) {
         for (class07665 class07665xx : var1) {
            String s = class07665xx.L + " " + class07665xx.u + " " + class07665xx.i;
            if (var3.test(s)) {
               arraylist.add(class07665xx.L);
               arraylist.add(class07665xx.L + " " + class07665xx.u);
               arraylist.add(s);
            }
         }
      } else {
         String[] astring = var0.split(" ");
         if (astring.length == 1) {
            for (class07665 class07665x : var1) {
               String s1 = astring[0] + " " + class07665x.u + " " + class07665x.i;
               if (var3.test(s1)) {
                  arraylist.add(astring[0] + " " + class07665x.u);
                  arraylist.add(s1);
               }
            }
         } else if (astring.length == 2) {
            for (class07665 class07665xx : var1) {
               String s2 = astring[0] + " " + astring[1] + " " + class07665xx.i;
               if (var3.test(s2)) {
                  arraylist.add(s2);
               }
            }
         }
      }

      return y(arraylist, var2);
   }

   static <T> CompletableFuture<Suggestions> N(Stream<T> var0, SuggestionsBuilder var1, Function<T, class01894> var2, Function<T, Message> var3) {
      return N(var0::iterator, var1, var2, var3);
   }

   static CompletableFuture<Suggestions> N(Iterable<class01894> var0, SuggestionsBuilder var1) {
      String s = var1.getRemaining().toLowerCase(Locale.ROOT);
      N(var0, s, var0x -> var0x, var1x -> var1.suggest(var1x.toString()));
      return var1.buildFuture();
   }

   static boolean N(String var0, String var1) {
      int i = 0;

      while (!var1.startsWith(var0, i)) {
         int j = L.indexIn(var1, i);
         if (j < 0) {
            return false;
         }

         i = j + 1;
      }

      return true;
   }

   static <T> void N(Iterable<T> var0, String var1, String var2, Function<T, class01894> var3, Consumer<T> var4) {
      if (var1.isEmpty()) {
         var0.forEach(var4);
      } else {
         String s = Strings.commonPrefix(var1, var2);
         if (!s.isEmpty()) {
            String s1 = var1.substring(s.length());
            N(var0, s1, var3, var4);
         }
      }
   }

   static <T> void N(Iterable<T> var0, String var1, Function<T, class01894> var2, Consumer<T> var3) {
      boolean flag = var1.indexOf(58) > -1;

      for (Object object : var0) {
         class01894 class01894 = (class01894)var2.apply(object);
         if (flag) {
            String s = class01894.toString();
            if (N(var1, s)) {
               var3.accept(object);
            }
         } else if (N(var1, class01894.y()) || N(var1, class01894.N())) {
            var3.accept(object);
         }
      }
   }

   CompletableFuture<Suggestions> N(class05946<? extends class00751<?>> var1, class07666 var2, SuggestionsBuilder var3, CommandContext<?> var4);

   static <S> CompletableFuture<Suggestions> N(CommandContext<S> var0, SuggestionsBuilder var1, class05946<? extends class00751<?>> var2, class07666 var3) {
      Object object = var0.getSource();
      return object instanceof class07689 ? ((class07689)object).N(var2, var3, var1, var0) : var1.buildFuture();
   }

   default void N(class01905<?> var1, class07666 var2, SuggestionsBuilder var3) {
      if (var2.N()) {
         N(var1.t().map(class03530::y), var3, "#");
      }

      if (var2.y()) {
         N(var1.n().map(class05946::N), var3);
      }
   }

   CompletableFuture<Suggestions> N(CommandContext<?> var1);

   static CompletableFuture<Suggestions> N(Stream<class01894> var0, SuggestionsBuilder var1) {
      return N(var0::iterator, var1);
   }

   static <T> CompletableFuture<Suggestions> N(Iterable<T> var0, SuggestionsBuilder var1, Function<T, class01894> var2, Function<T, Message> var3) {
      String s = var1.getRemaining().toLowerCase(Locale.ROOT);
      N(var0, s, var2, var3x -> var1.suggest(((class01894)var2.apply(var3x)).toString(), (Message)var3.apply(var3x)));
      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> N(Iterable<class01894> var0, SuggestionsBuilder var1, String var2) {
      String s = var1.getRemaining().toLowerCase(Locale.ROOT);
      N(var0, s, var2, var0x -> var0x, var2x -> var1.suggest(var2 + var2x));
      return var1.buildFuture();
   }

   static CompletableFuture<Suggestions> N(Stream<class01894> var0, SuggestionsBuilder var1, String var2) {
      return N(var0::iterator, var1, var2);
   }

   class03767 G();

   default Collection<class07665> Y() {
      return Collections.singleton(class07665.y);
   }

   default Collection<String> ag_() {
      return Collections.emptyList();
   }

   default Collection<String> af_() {
      return this.b();
   }
}
