package minecraft;

import com.google.common.collect.Maps;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.datafixers.util.Either;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class00892 {
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("argument.block.tag.disallowed"));
   public static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("argument.block.id.invalid", var0));
   public static final Dynamic2CommandExceptionType L = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("argument.block.property.unknown", var0, var1)
   );
   public static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("argument.block.property.duplicate", var1, var0)
   );
   public static final Dynamic3CommandExceptionType i = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> class00392.y("argument.block.property.invalid", var0, var2, var1)
   );
   public static final Dynamic2CommandExceptionType R = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("argument.block.property.novalue", var1, var0)
   );
   public static final SimpleCommandExceptionType M = new SimpleCommandExceptionType(class00392.L("argument.block.property.unclosed"));
   public static final DynamicCommandExceptionType B = new DynamicCommandExceptionType(var0 -> class00392.y("arguments.block.tag.unknown", var0));
   private static final char Z = '[';
   private static final char z = '{';
   private static final char U = ']';
   private static final char E = '=';
   private static final char W = ',';
   private static final char m = '#';
   private static final Function<SuggestionsBuilder, CompletableFuture<Suggestions>> P = SuggestionsBuilder::buildFuture;
   private final class01905<class00891> s;
   private final StringReader T;
   private final boolean b;
   private final boolean j;
   private final Map<class08092<?>, Comparable<?>> v = Maps.newHashMap();
   private final Map<String, String> n = Maps.newHashMap();
   private class01894 t = class01894.y("");
   @Nullable
   private class00507<class00891, class00500> G;
   @Nullable
   private class00500 l;
   @Nullable
   private class07001 d;
   @Nullable
   private class03543<class00891> w;
   private Function<SuggestionsBuilder, CompletableFuture<Suggestions>> k = P;

   private CompletableFuture<Suggestions> L(SuggestionsBuilder var1) {
      String sx = var1.getRemaining().toLowerCase(Locale.ROOT);

      for (class08092<?> class08092 : this.l.y()) {
         if (!this.v.containsKey(class08092) && class08092.R().startsWith(sx)) {
            var1.suggest(class08092.R() + "=");
         }
      }

      return var1.buildFuture();
   }

   private void L() throws CommandSyntaxException {
      int ix = this.T.getCursor();
      this.t = class01894.N(this.T);
      class00891 class00891 = this.s.N(class05946.N(class04227.Z, this.t)).orElseThrow(() -> {
         this.T.setCursor(ix);
         return y.createWithContext(this.T, this.t.toString());
      }).N();
      this.G = class00891.E();
      this.l = class00891.W();
   }

   private void M() throws CommandSyntaxException {
      this.d = class07755.L(this.T);
   }

   private CompletableFuture<Suggestions> M(SuggestionsBuilder var1) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      if (var1.getRemaining().isEmpty() && this.v.size() < this.l.y().size()) {
         var1.suggest(String.valueOf(','));
      }

      return var1.buildFuture();
   }

   private class00892(class01905<class00891> var1, StringReader var2, boolean var3, boolean var4) {
      super();
      this.s = var1;
      this.T = var2;
      this.b = var3;
      this.j = var4;
   }

   private CompletableFuture<Suggestions> B(SuggestionsBuilder var1) {
      if (var1.getRemaining().isEmpty() && this.w != null) {
         boolean flag = false;
         boolean flag1 = false;
         Iterator<class03556<class00891>> iterator = this.w.iterator();

         while (iterator.hasNext()) {
            class00891 class00891 = iterator.next().N();
            flag |= !class00891.E().u().isEmpty();
            flag1 |= class00891.W().k();
            if (flag && flag1) {
               break;
            }
         }

         if (flag) {
            var1.suggest(String.valueOf('['));
         }

         if (flag1) {
            var1.suggest(String.valueOf('{'));
         }
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> Z(SuggestionsBuilder var1) {
      if (var1.getRemaining().isEmpty()) {
         if (!this.G.u().isEmpty()) {
            var1.suggest(String.valueOf('['));
         }

         if (this.l.k()) {
            var1.suggest(String.valueOf('{'));
         }
      }

      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> i(SuggestionsBuilder var1) {
      if (var1.getRemaining().isEmpty() && this.y()) {
         var1.suggest(String.valueOf('{'));
      }

      return var1.buildFuture();
   }

   private void i() throws CommandSyntaxException {
      this.T.skip();
      this.k = this::N;
      this.T.skipWhitespace();

      while (this.T.canRead() && this.T.peek() != ']') {
         this.T.skipWhitespace();
         int ix = this.T.getCursor();
         String sx = this.T.readString();
         class08092<?> class08092 = this.G.N(sx);
         if (class08092 == null) {
            this.T.setCursor(ix);
            throw L.createWithContext(this.T, this.t.toString(), sx);
         }

         if (this.v.containsKey(class08092)) {
            this.T.setCursor(ix);
            throw u.createWithContext(this.T, this.t.toString(), sx);
         }

         this.T.skipWhitespace();
         this.k = this::R;
         if (!this.T.canRead() || this.T.peek() != '=') {
            throw R.createWithContext(this.T, this.t.toString(), sx);
         }

         this.T.skip();
         this.T.skipWhitespace();
         this.k = var1x -> N(var1x, class08092).buildFuture();
         int jx = this.T.getCursor();
         this.N(class08092, this.T.readString(), jx);
         this.k = this::M;
         this.T.skipWhitespace();
         if (this.T.canRead()) {
            if (this.T.peek() != ',') {
               if (this.T.peek() != ']') {
                  throw M.createWithContext(this.T);
               }
               break;
            }

            this.T.skip();
            this.k = this::L;
         }
      }

      if (this.T.canRead()) {
         this.T.skip();
      } else {
         throw M.createWithContext(this.T);
      }
   }

   private CompletableFuture<Suggestions> U(SuggestionsBuilder var1) {
      return class07689.N(this.s.n().map(class05946::N), var1);
   }

   private CompletableFuture<Suggestions> z(SuggestionsBuilder var1) {
      return class07689.N(this.s.t().map(class03530::y), var1, String.valueOf('#'));
   }

   private void u() throws CommandSyntaxException {
      if (!this.b) {
         throw N.createWithContext(this.T);
      } else {
         int ix = this.T.getCursor();
         this.T.expect('#');
         this.k = this::z;
         class01894 class01894 = class01894.N(this.T);
         this.w = this.s.N(class03530.N(class04227.Z, class01894)).orElseThrow(() -> {
            this.T.setCursor(ix);
            return B.createWithContext(this.T, class01894.toString());
         });
      }
   }

   private CompletableFuture<Suggestions> u(SuggestionsBuilder var1) {
      String sx = var1.getRemaining().toLowerCase(Locale.ROOT);
      if (this.w != null) {
         Iterator<class03556<class00891>> iterator = this.w.iterator();

         while (iterator.hasNext()) {
            for (class08092<?> class08092 : iterator.next().N().E().u()) {
               if (!this.n.containsKey(class08092.R()) && class08092.R().startsWith(sx)) {
                  var1.suggest(class08092.R() + "=");
               }
            }
         }
      }

      return var1.buildFuture();
   }

   public static Either<class00904, class00896> y(class01905<class00891> var0, String var1, boolean var2) throws CommandSyntaxException {
      return y(var0, new StringReader(var1), var2);
   }

   private CompletableFuture<Suggestions> y(SuggestionsBuilder var1) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      return this.u(var1);
   }

   private boolean y() {
      if (this.l != null) {
         return this.l.k();
      } else {
         if (this.w != null) {
            Iterator<class03556<class00891>> iterator = this.w.iterator();

            while (iterator.hasNext()) {
               if (iterator.next().N().W().k()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public static Either<class00904, class00896> y(class01905<class00891> var0, StringReader var1, boolean var2) throws CommandSyntaxException {
      int ix = var1.getCursor();

      try {
         class00892 class00892 = new class00892(var0, var1, true, var2);
         class00892.N();
         return class00892.w != null
            ? Either.right(new class00896(class00892.w, class00892.n, class00892.d))
            : Either.left(new class00904(class00892.l, class00892.v, class00892.d));
      } catch (CommandSyntaxException commandsyntaxexception) {
         var1.setCursor(ix);
         throw commandsyntaxexception;
      }
   }

   private CompletableFuture<Suggestions> E(SuggestionsBuilder var1) {
      this.z(var1);
      this.U(var1);
      return var1.buildFuture();
   }

   private CompletableFuture<Suggestions> N(SuggestionsBuilder var1) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf(']'));
      }

      return this.L(var1);
   }

   private void N() throws CommandSyntaxException {
      if (this.b) {
         this.k = this::E;
      } else {
         this.k = this::U;
      }

      if (this.T.canRead() && this.T.peek() == '#') {
         this.u();
         this.k = this::B;
         if (this.T.canRead() && this.T.peek() == '[') {
            this.R();
            this.k = this::i;
         }
      } else {
         this.L();
         this.k = this::Z;
         if (this.T.canRead() && this.T.peek() == '[') {
            this.i();
            this.k = this::i;
         }
      }

      if (this.j && this.T.canRead() && this.T.peek() == '{') {
         this.k = P;
         this.M();
      }
   }

   public static class00904 N(class01905<class00891> var0, String var1, boolean var2) throws CommandSyntaxException {
      return N(var0, new StringReader(var1), var2);
   }

   public static class00904 N(class01905<class00891> var0, StringReader var1, boolean var2) throws CommandSyntaxException {
      int ix = var1.getCursor();

      try {
         class00892 class00892 = new class00892(var0, var1, false, var2);
         class00892.N();
         return new class00904(class00892.l, class00892.v, class00892.d);
      } catch (CommandSyntaxException commandsyntaxexception) {
         var1.setCursor(ix);
         throw commandsyntaxexception;
      }
   }

   private CompletableFuture<Suggestions> N(SuggestionsBuilder var1, String var2) {
      boolean flag = false;
      if (this.w != null) {
         Iterator<class03556<class00891>> iterator = this.w.iterator();

         while (iterator.hasNext()) {
            class00891 class00891 = iterator.next().N();
            class08092<?> class08092 = class00891.E().N(var2);
            if (class08092 != null) {
               N(var1, class08092);
            }

            if (!flag) {
               for (class08092<?> class08092x : class00891.E().u()) {
                  if (!this.n.containsKey(class08092x.R())) {
                     flag = true;
                     break;
                  }
               }
            }
         }
      }

      if (flag) {
         var1.suggest(String.valueOf(','));
      }

      var1.suggest(String.valueOf(']'));
      return var1.buildFuture();
   }

   public static CompletableFuture<Suggestions> N(class01905<class00891> var0, SuggestionsBuilder var1, boolean var2, boolean var3) {
      StringReader stringreader = new StringReader(var1.getInput());
      stringreader.setCursor(var1.getStart());
      class00892 class00892 = new class00892(var0, stringreader, var2, var3);

      try {
         class00892.N();
      } catch (CommandSyntaxException commandsyntaxexception) {
      }

      return class00892.k.apply(var1.createOffset(stringreader.getCursor()));
   }

   private static <T extends Comparable<T>> SuggestionsBuilder N(SuggestionsBuilder var0, class08092<T> var1) {
      for (Comparable comparable : var1.N()) {
         if (comparable instanceof Integer integer) {
            var0.suggest(integer);
         } else {
            var0.suggest(var1.y((T)comparable));
         }
      }

      return var0;
   }

   private static <T extends Comparable<T>> void N(StringBuilder var0, class08092<T> var1, Comparable<?> var2) {
      var0.append(var1.R());
      var0.append('=');
      var0.append(var1.y((T)var2));
   }

   private <T extends Comparable<T>> void N(class08092<T> var1, String var2, int var3) throws CommandSyntaxException {
      Optional optional = var1.y(var2);
      if (optional.isPresent()) {
         this.l = this.l.y(var1, (Comparable)optional.get());
         this.v.put(var1, (Comparable<?>)optional.get());
      } else {
         this.T.setCursor(var3);
         throw i.createWithContext(this.T, this.t.toString(), var1.R(), var2);
      }
   }

   public static String N(class00500 var0) {
      StringBuilder stringbuilder = new StringBuilder(var0.R().i().map(var0x -> var0x.N().toString()).orElse("air"));
      if (!var0.y().isEmpty()) {
         stringbuilder.append('[');
         boolean flag = false;

         for (Entry entry : var0.L().entrySet()) {
            if (flag) {
               stringbuilder.append(',');
            }

            N(stringbuilder, (class08092)entry.getKey(), (Comparable<?>)entry.getValue());
            flag = true;
         }

         stringbuilder.append(']');
      }

      return stringbuilder.toString();
   }

   private void R() throws CommandSyntaxException {
      this.T.skip();
      this.k = this::y;
      int ix = -1;
      this.T.skipWhitespace();

      while (this.T.canRead() && this.T.peek() != ']') {
         this.T.skipWhitespace();
         int jx = this.T.getCursor();
         String sx = this.T.readString();
         if (this.n.containsKey(sx)) {
            this.T.setCursor(jx);
            throw u.createWithContext(this.T, this.t.toString(), sx);
         }

         this.T.skipWhitespace();
         if (!this.T.canRead() || this.T.peek() != '=') {
            this.T.setCursor(jx);
            throw R.createWithContext(this.T, this.t.toString(), sx);
         }

         this.T.skip();
         this.T.skipWhitespace();
         this.k = var2x -> this.N(var2x, sx);
         ix = this.T.getCursor();
         String s1 = this.T.readString();
         this.n.put(sx, s1);
         this.T.skipWhitespace();
         if (this.T.canRead()) {
            ix = -1;
            if (this.T.peek() != ',') {
               if (this.T.peek() != ']') {
                  throw M.createWithContext(this.T);
               }
               break;
            }

            this.T.skip();
            this.k = this::u;
         }
      }

      if (this.T.canRead()) {
         this.T.skip();
      } else {
         if (ix >= 0) {
            this.T.setCursor(ix);
         }

         throw M.createWithContext(this.T);
      }
   }

   private CompletableFuture<Suggestions> R(SuggestionsBuilder var1) {
      if (var1.getRemaining().isEmpty()) {
         var1.suggest(String.valueOf('='));
      }

      return var1.buildFuture();
   }
}
