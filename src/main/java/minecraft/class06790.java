package minecraft;

import com.google.common.primitives.Doubles;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import net.fabricmc.fabric.api.command.v2.FabricEntitySelectorReader;
import org.jspecify.annotations.Nullable;

public class class06790 implements FabricEntitySelectorReader {
   public static final char N = '@';
   private static final char P = '[';
   private static final char s = ']';
   public static final char y = '=';
   private static final char T = ',';
   public static final char L = '!';
   public static final char u = '#';
   private static final char b = 'p';
   private static final char j = 'a';
   private static final char v = 'r';
   private static final char n = 's';
   private static final char t = 'e';
   private static final char G = 'n';
   public static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.L("argument.entity.invalid"));
   public static final DynamicCommandExceptionType R = new DynamicCommandExceptionType(var0 -> class00392.y("argument.entity.selector.unknown", var0));
   public static final SimpleCommandExceptionType M = new SimpleCommandExceptionType(class00392.L("argument.entity.selector.not_allowed"));
   public static final SimpleCommandExceptionType B = new SimpleCommandExceptionType(class00392.L("argument.entity.selector.missing"));
   public static final SimpleCommandExceptionType Z = new SimpleCommandExceptionType(class00392.L("argument.entity.options.unterminated"));
   public static final DynamicCommandExceptionType z = new DynamicCommandExceptionType(var0 -> class00392.y("argument.entity.options.valueless", var0));
   public static final BiConsumer<class06889, List<? extends class07049>> U = (var0, var1) -> var1.sort(
      (var1x, var2) -> Doubles.compare(var1x.method_5707(var0), var2.method_5707(var0))
   );
   public static final BiConsumer<class06889, List<? extends class07049>> E = (var0, var1) -> var1.sort(
      (var1x, var2) -> Doubles.compare(var2.method_5707(var0), var1x.method_5707(var0))
   );
   public static final BiConsumer<class06889, List<? extends class07049>> W = (var0, var1) -> Collections.shuffle(var1);
   public static final BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> m = (var0, var1) -> var0.buildFuture();
   private final StringReader l;
   private final boolean d;
   private int w;
   private boolean k;
   private boolean Y;
   @Nullable
   private class00816 Q;
   @Nullable
   private class00836 O;
   @Nullable
   private Double g;
   @Nullable
   private Double I;
   @Nullable
   private Double J;
   @Nullable
   private Double o;
   @Nullable
   private Double q;
   @Nullable
   private Double K;
   @Nullable
   private class00838 V;
   @Nullable
   private class00838 e;
   private final List<Predicate<class07049>> H;
   private BiConsumer<class06889, List<? extends class07049>> c;
   private boolean X;
   @Nullable
   private String a;
   private int p;
   @Nullable
   private UUID F;
   private BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> A;
   private boolean f;
   private boolean C;
   private boolean S;
   private boolean x;
   private boolean D;
   private boolean h;
   private boolean r;
   private boolean NN;
   @Nullable
   private class07078<?> Ny;
   private boolean NL;
   private boolean Nu;
   private boolean Ni;
   private boolean NR;
   private final Set NM = new HashSet();

   public boolean w() {
      return this.D;
   }

   public void L(double var1) {
      this.J = var1;
   }

   public void L(boolean var1) {
      this.C = var1;
   }

   protected void L() throws CommandSyntaxException {
      if (this.l.canRead()) {
         this.A = this::L;
      }

      int ix = this.l.getCursor();
      String sx = this.l.readString();

      try {
         this.F = UUID.fromString(sx);
         this.k = true;
      } catch (IllegalArgumentException illegalargumentexception) {
         if (sx.isEmpty() || sx.length() > 16) {
            this.l.setCursor(ix);
            throw i.createWithContext(this.l);
         }

         this.k = false;
         this.a = sx;
      }

      this.w = 1;
   }

   private CompletableFuture<Suggestions> L(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      SuggestionsBuilder suggestionsbuilder = var1.createOffset(this.p);
      var2.accept(suggestionsbuilder);
      return var1.add(suggestionsbuilder).buildFuture();
   }

   public void M(boolean var1) {
      this.h = var1;
   }

   public StringReader M() {
      return this.l;
   }

   private CompletableFuture<Suggestions> M(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      class06767.N(this, var1);
      return var1.buildFuture();
   }

   @Nullable
   public Double P() {
      return this.J;
   }

   @Nullable
   public Double T() {
      return this.q;
   }

   public boolean Q() {
      return this.NN;
   }

   public class06790(StringReader var1, boolean var2) {
      super();
      this.H = new ArrayList<>();
      this.c = class06794.y;
      this.A = m;
      this.l = var1;
      this.d = var2;
   }

   public void B() {
      this.Y = true;
   }

   public void B(boolean var1) {
      this.r = var1;
   }

   private CompletableFuture<Suggestions> B(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf(','));
      var1.suggest(String.valueOf(']'));
      return var1.buildFuture();
   }

   public boolean I() {
      return this.NL;
   }

   public boolean J() {
      return this.Nu;
   }

   @Nullable
   public class00816 Z() {
      return this.Q;
   }

   public void Z(boolean var1) {
      this.NN = var1;
   }

   private CompletableFuture<Suggestions> Z(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf('='));
      return var1.buildFuture();
   }

   public void i(double var1) {
      this.q = var1;
   }

   public void i(boolean var1) {
      this.x = var1;
   }

   private CompletableFuture<Suggestions> i(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf('['));
      return var1.buildFuture();
   }

   public boolean i() {
      this.l.skipWhitespace();
      if (this.l.canRead() && this.l.peek() == '!') {
         this.l.skip();
         this.l.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   @Nullable
   public Double b() {
      return this.K;
   }

   @Nullable
   public Double s() {
      return this.o;
   }

   public boolean n() {
      return this.X;
   }

   public boolean l() {
      return this.S;
   }

   public boolean d() {
      return this.x;
   }

   @Nullable
   public Double m() {
      return this.I;
   }

   public boolean o() {
      return this.Ni;
   }

   public boolean k() {
      return this.h;
   }

   public boolean t() {
      return this.f;
   }

   public boolean g() {
      return this.Ny != null;
   }

   public class06794 v() throws CommandSyntaxException {
      this.p = this.l.getCursor();
      this.A = this::y;
      if (this.l.canRead() && this.l.peek() == '@') {
         if (!this.d) {
            throw M.createWithContext(this.l);
         }

         this.l.skip();
         this.y();
      } else {
         this.L();
      }

      this.q();
      return this.N();
   }

   public BiConsumer<class06889, List<? extends class07049>> j() {
      return this.c;
   }

   private void q() {
      if (this.V != null) {
         this.H.add(this.N(this.V, class07049::method_36455));
      }

      if (this.e != null) {
         this.H.add(this.N(this.e, class07049::method_36454));
      }

      if (this.O != null) {
         this.H.add(var1 -> var1 instanceof class04770 class04770 && this.O.u(class04770.fields_37fa3311b0e9d3e9b883d09222919bf5a_0));
      }
   }

   @Nullable
   public class00838 U() {
      return this.V;
   }

   public void U(boolean var1) {
      this.Ni = var1;
   }

   public void z(boolean var1) {
      this.Nu = var1;
   }

   @Nullable
   public class00836 z() {
      return this.O;
   }

   public void u(boolean var1) {
      this.S = var1;
   }

   public void u(double var1) {
      this.o = var1;
   }

   protected void u() throws CommandSyntaxException {
      this.A = this::M;
      this.l.skipWhitespace();

      while (this.l.canRead() && this.l.peek() != ']') {
         this.l.skipWhitespace();
         int ix = this.l.getCursor();
         String sx = this.l.readString();
         class06798 class06798 = class06767.N(this, sx, ix);
         this.l.skipWhitespace();
         if (!this.l.canRead() || this.l.peek() != '=') {
            this.l.setCursor(ix);
            throw z.createWithContext(this.l, sx);
         }

         this.l.skip();
         this.l.skipWhitespace();
         this.A = m;
         class06798.handle(this);
         this.l.skipWhitespace();
         this.A = this::B;
         if (this.l.canRead()) {
            if (this.l.peek() != ',') {
               if (this.l.peek() != ']') {
                  throw Z.createWithContext(this.l);
               }
               break;
            }

            this.l.skip();
            this.A = this::M;
         }
      }

      if (this.l.canRead()) {
         this.l.skip();
         this.A = m;
      } else {
         throw Z.createWithContext(this.l);
      }
   }

   private CompletableFuture<Suggestions> u(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      SuggestionsBuilder suggestionsbuilder = var1.createOffset(var1.getStart() - 1);
      N(suggestionsbuilder);
      var1.add(suggestionsbuilder);
      return var1.buildFuture();
   }

   public void y(boolean var1) {
      this.f = var1;
   }

   public void y(double var1) {
      this.I = var1;
   }

   public void y(class00838 var1) {
      this.e = var1;
   }

   private CompletableFuture<Suggestions> y(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var2.accept(var1);
      if (this.d) {
         N(var1);
      }

      return var1.buildFuture();
   }

   protected void y() throws CommandSyntaxException {
      this.NR = true;
      this.A = this::u;
      if (!this.l.canRead()) {
         throw B.createWithContext(this.l);
      } else {
         int ix = this.l.getCursor();
         char c0 = this.l.read();

         if (switch (c0) {
            case 'a' -> {
               this.w = Integer.MAX_VALUE;
               this.k = false;
               this.c = class06794.y;
               this.N(class07078.Ly);
               yield false;
            }
            default -> {
               this.l.setCursor(ix);
               throw R.createWithContext(this.l, "@" + c0);
            }
            case 'e' -> {
               this.w = Integer.MAX_VALUE;
               this.k = true;
               this.c = class06794.y;
               yield true;
            }
            case 'n' -> {
               this.w = 1;
               this.k = true;
               this.c = U;
               yield true;
            }
            case 'p' -> {
               this.w = 1;
               this.k = false;
               this.c = U;
               this.N(class07078.Ly);
               yield false;
            }
            case 'r' -> {
               this.w = 1;
               this.k = false;
               this.c = W;
               this.N(class07078.Ly);
               yield false;
            }
            case 's' -> {
               this.w = 1;
               this.k = true;
               this.X = true;
               yield false;
            }
         }) {
            this.H.add(class07049::method_5805);
         }

         this.A = this::i;
         if (this.l.canRead() && this.l.peek() == '[') {
            this.l.skip();
            this.A = this::R;
            this.u();
         }
      }
   }

   @Nullable
   public class00838 E() {
      return this.e;
   }

   private class00734 N(double var1, double var3, double var5) {
      boolean flag = var1 < 0.0;
      boolean flag1 = var3 < 0.0;
      boolean flag2 = var5 < 0.0;
      double d0 = flag ? var1 : 0.0;
      double d1 = flag1 ? var3 : 0.0;
      double d2 = flag2 ? var5 : 0.0;
      double d3 = (flag ? 0.0 : var1) + 1.0;
      double d4 = (flag1 ? 0.0 : var3) + 1.0;
      double d5 = (flag2 ? 0.0 : var5) + 1.0;
      return new class00734(d0, d1, d2, d3, d4, d5);
   }

   private Predicate<class07049> N(class00838 var1, class06620<class07049> var2) {
      float fx = class04995.R(var1.y().orElse(0.0F));
      float f1 = class04995.R(var1.L().orElse(359.0F));
      return var3x -> {
         float f2 = class04995.R(var2.applyAsFloat(var3x));
         return fx > f1 ? f2 >= fx || f2 <= f1 : f2 >= fx && f2 <= f1;
      };
   }

   private static void N(SuggestionsBuilder var0) {
      var0.suggest("@p", class00392.L("argument.entity.selector.nearestPlayer"));
      var0.suggest("@a", class00392.L("argument.entity.selector.allPlayers"));
      var0.suggest("@r", class00392.L("argument.entity.selector.randomPlayer"));
      var0.suggest("@s", class00392.L("argument.entity.selector.self"));
      var0.suggest("@e", class00392.L("argument.entity.selector.allEntities"));
      var0.suggest("@n", class00392.L("argument.entity.selector.nearestEntity"));
   }

   public static <S> boolean N(S var0) {
      return var0 instanceof class08168 && ((class08168)var0).N().hasPermission(class08162.i);
   }

   @Deprecated
   public static boolean N(class08168 var0) {
      return var0.N().hasPermission(class08162.i);
   }

   public class06794 N() {
      class00734 class00734;
      if (this.o == null && this.q == null && this.K == null) {
         if (this.Q != null && this.Q.L().isPresent()) {
            double d0 = this.Q.L().get();
            class00734 = new class00734(-d0, -d0, -d0, d0 + 1.0, d0 + 1.0, d0 + 1.0);
         } else {
            class00734 = null;
         }
      } else {
         class00734 = this.N(this.o == null ? 0.0 : this.o, this.q == null ? 0.0 : this.q, this.K == null ? 0.0 : this.K);
      }

      Function function;
      if (this.g == null && this.I == null && this.J == null) {
         function = var0 -> var0;
      } else {
         function = var1x -> new class06889(this.g == null ? var1x.M : this.g, this.I == null ? var1x.B : this.I, this.J == null ? var1x.Z : this.J);
      }

      return new class06794(this.w, this.k, this.Y, List.copyOf(this.H), this.Q, function, class00734, this.c, this.X, this.a, this.F, this.Ny, this.NR);
   }

   public void N(double var1) {
      this.g = var1;
   }

   public CompletableFuture<Suggestions> N(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      return this.A.apply(var1.createOffset(this.l.getCursor()), var2);
   }

   public void N_63(BiFunction<SuggestionsBuilder, Consumer<SuggestionsBuilder>, CompletableFuture<Suggestions>> var1) {
      this.A = var1;
   }

   public void N(int var1) {
      this.w = var1;
   }

   public void N(boolean var1) {
      this.k = var1;
   }

   public void N(BiConsumer<class06889, List<? extends class07049>> var1) {
      this.c = var1;
   }

   public void N(class07078<?> var1) {
      this.Ny = var1;
   }

   public void N(Predicate<class07049> var1) {
      this.H.add(var1);
   }

   public void N(class00816 var1) {
      this.Q = var1;
   }

   public void N(class00836 var1) {
      this.O = var1;
   }

   public void N(class00838 var1) {
      this.V = var1;
   }

   public boolean getCustomFlag(class01894 var1) {
      return this.NM.contains(var1);
   }

   public void setCustomFlag(class01894 var1, boolean var2) {
      if (var2) {
         this.NM.add(var1);
      } else {
         this.NM.remove(var1);
      }
   }

   @Nullable
   public Double W() {
      return this.g;
   }

   private CompletableFuture<Suggestions> R(SuggestionsBuilder var1, Consumer<SuggestionsBuilder> var2) {
      var1.suggest(String.valueOf(']'));
      class06767.N(this, var1);
      return var1.buildFuture();
   }

   public boolean R() {
      this.l.skipWhitespace();
      if (this.l.canRead() && this.l.peek() == '#') {
         this.l.skip();
         this.l.skipWhitespace();
         return true;
      } else {
         return false;
      }
   }

   public void R(boolean var1) {
      this.D = var1;
   }

   public void R(double var1) {
      this.K = var1;
   }

   public void O() {
      this.NL = true;
   }

   public boolean G() {
      return this.C;
   }

   public boolean Y() {
      return this.r;
   }
}
