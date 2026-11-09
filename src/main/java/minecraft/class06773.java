package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.objects.ReferenceArraySet;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;

class class06773 {
   private final StringReader y;
   private final class06777 L;

   private CompletableFuture<Suggestions> L(SuggestionsBuilder var1) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf('='));
      }

      return var1.buildFuture();
   }

   private void L() throws CommandSyntaxException {
      this.y.expect('[');
      this.L.N(this::i);
      ReferenceArraySet referencearrayset = new ReferenceArraySet();

      while (this.y.canRead() && this.y.peek() != ']') {
         this.y.skipWhitespace();
         if (this.y.canRead() && this.y.peek() == '!') {
            this.y.skip();
            this.L.N(this::R);
            class02477<?> class02477 = N(this.y);
            if (!referencearrayset.add(class02477)) {
               throw class06762.i.create(class02477);
            }

            this.L.N(class02477);
            this.L.N(class06762.U);
            this.y.skipWhitespace();
         } else {
            class02477<?> class02477 = N(this.y);
            if (!referencearrayset.add(class02477)) {
               throw class06762.i.create(class02477);
            }

            this.L.N(this::L);
            this.y.skipWhitespace();
            this.y.expect('=');
            this.L.N(class06762.U);
            this.y.skipWhitespace();
            this.N(this.N.m, this.N.W, class02477);
            this.y.skipWhitespace();
         }

         this.L.N(this::y);
         if (!this.y.canRead() || this.y.peek() != ',') {
            break;
         }

         this.y.skip();
         this.y.skipWhitespace();
         this.L.N(this::i);
         if (!this.y.canRead()) {
            throw class06762.u.createWithContext(this.y);
         }
      }

      this.y.expect(']');
      this.L.N(class06762.U);
   }

   class06773(class06762 var1, StringReader var2, class06777 var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   private CompletableFuture<Suggestions> i(SuggestionsBuilder var1) {
      var1.suggest(String.valueOf('!'));
      return this.N(var1, String.valueOf('='));
   }

   private CompletableFuture<Suggestions> u(SuggestionsBuilder var1) {
      return class07689.N(this.N.E.n().map(class05946::N), var1);
   }

   private void y() throws CommandSyntaxException {
      int i = this.y.getCursor();
      class01894 class01894 = class01894.N(this.y);
      this.L.N(this.N.E.N(class05946.N(class04227.F, class01894)).orElseThrow(() -> {
         this.y.setCursor(i);
         return class06762.N.createWithContext(this.y, class01894);
      }));
   }

   private CompletableFuture<Suggestions> y(SuggestionsBuilder var1) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(','));
         var1.suggest(String.valueOf(']'));
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> N(SuggestionsBuilder var1, String var2) {
      String s = var1.getRemaining().toLowerCase(Locale.ROOT);
      class07689.N(class04206.NW.Z(), s, var0 -> var0.getKey().N(), var2x -> {
         if (var2x.getValue().y() != null) {
            class01894 class01894 = var2x.getKey().N();
            var1.suggest(class01894 + var2);
         }
      });
      return var1.buildFuture();
   }

   public void N() throws CommandSyntaxException {
      this.L.N(this::u);
      this.y();
      this.L.N(this::N);
      if (this.y.canRead() && this.y.peek() == '[') {
         this.L.N(class06762.U);
         this.L();
      }
   }

   private CompletableFuture<Suggestions> N(SuggestionsBuilder var1) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf('['));
      }

      return var1.buildFuture();
   }

   public static class02477<?> N(StringReader var0) throws CommandSyntaxException {
      if (!var0.canRead()) {
         throw class06762.u.createWithContext(var0);
      } else {
         int i = var0.getCursor();
         class01894 class01894 = class01894.N(var0);
         class02477<?> class02477 = class04206.NW.N(class01894);
         if (class02477 != null && !class02477.u()) {
            return class02477;
         } else {
            var0.setCursor(i);
            throw class06762.y.createWithContext(var0, class01894);
         }
      }
   }

   private <T, O> void N(class07755<O> var1, class03519<O> var2, class02477<T> var3) throws CommandSyntaxException {
      int i = this.y.getCursor();
      Object object = var1.y(this.y);
      DataResult dataresult = var3.L().parse(var2, object);
      this.L.N(var3, dataresult.getOrThrow(var3x -> {
         this.y.setCursor(i);
         return class06762.L.createWithContext(this.y, var3.toString(), var3x);
      }));
   }

   private CompletableFuture<Suggestions> R(SuggestionsBuilder var1) {
      return this.N(var1, "");
   }
}
