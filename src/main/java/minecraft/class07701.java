package minecraft;

import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandExceptionType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class07701 implements class01711<class07701>, class07689 {
   public static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("permissions.requires.player"));
   public static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("permissions.requires.entity"));
   private final class07703 u;
   private final class06889 i;
   private final class04782 R;
   private final class08152 M;
   private final String B;
   private final class00392 Z;
   private final class02796 z;
   private final boolean U;
   @Nullable
   private final class07049 E;
   private final class03102 W;
   private final class07664 m;
   private final class07109 P;
   private final class04445 s;
   private final class03068 T;

   private void L(class00392 var1) {
      class05216 class05216 = class00392.N("chat.type.admin", this.L(), var1).N(class06541.field_1080, class06541.field_1056);
      class07305 class07305 = this.R.method_64395();
      if (class07305.N(class07305.F)) {
         for (class04770 class04770 : this.z.Nm().v()) {
            if (class04770.method_64401() != this.u && this.z.Nm().R(class04770.method_72498())) {
               class04770.method_64398(class05216);
            }
         }
      }

      if (this.u != this.z && class07305.N(class07305.G)) {
         this.z.N(class05216);
      }
   }

   public class00392 L() {
      return this.Z;
   }

   @Nullable
   public class07049 M() {
      return this.E;
   }

   public class04445 P() {
      return this.s;
   }

   @Override
   public class03102 T() {
      return this.W;
   }

   public class07701(
      class07703 var1,
      class06889 var2,
      class07109 var3,
      class04782 var4,
      class08152 var5,
      String var6,
      class00392 var7,
      class02796 var8,
      @Nullable class07049 var9
   ) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, false, class03102.N, class07664.field_9853, class04445.N, class03068.N(var8));
   }

   private class07701(
      class07703 var1,
      class06889 var2,
      class07109 var3,
      class04782 var4,
      class08152 var5,
      String var6,
      class00392 var7,
      class02796 var8,
      @Nullable class07049 var9,
      boolean var10,
      class03102 var11,
      class07664 var12,
      class04445 var13,
      class03068 var14
   ) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var4;
      this.U = var10;
      this.E = var9;
      this.M = var5;
      this.B = var6;
      this.Z = var7;
      this.z = var8;
      this.W = var11;
      this.m = var12;
      this.P = var3;
      this.s = var13;
      this.T = var14;
   }

   public class07049 B() throws CommandSyntaxException {
      if (this.E == null) {
         throw y.create();
      } else {
         return this.E;
      }
   }

   public class04770 Z() throws CommandSyntaxException {
      class07049 class07049 = this.E;
      if (class07049 instanceof class04770) {
         return (class04770)class07049;
      } else {
         throw N.create();
      }
   }

   public class06889 i() {
      return this.i;
   }

   @Override
   public Collection<String> b() {
      return Lists.newArrayList(this.z.z_());
   }

   public class03068 s() {
      return this.T;
   }

   @Override
   public Set<class05946<class07299>> n() {
      return this.z.NQ();
   }

   @Override
   public CommandDispatcher<class07701> l() {
      return this.W().Nr().N();
   }

   @Override
   public boolean d() {
      return this.U;
   }

   public class07664 m() {
      return this.m;
   }

   @Override
   public class01042 t() {
      return this.z.yt();
   }

   @Override
   public Stream<class01894> v() {
      return class04206.y.j().map(class04891::N);
   }

   @Override
   public Collection<String> j() {
      return this.z.yB().u();
   }

   public boolean U() {
      return this.E instanceof class04770;
   }

   @Nullable
   public class04770 z() {
      class07049 class07049 = this.E;
      return class07049 instanceof class04770 ? (class04770)class07049 : null;
   }

   public String u() {
      return this.B;
   }

   public void y(class00392 var1) {
      if (this.u.B_() && !this.U) {
         this.u.N(class00392.i().y(var1).N(class06541.field_1061));
      }
   }

   public class07701 y(class08152 var1) {
      return this.N(this.M.N(var1));
   }

   public class07701 y(class06889 var1) {
      class06889 class06889 = this.m.N(this);
      double d0 = var1.M - class06889.M;
      double d1 = var1.B - class06889.B;
      double d2 = var1.Z - class06889.Z;
      double d3 = Math.sqrt(d0 * d0 + d2 * d2);
      float f = class04995.R((float)(-(class04995.u(d1, d3) * 180.0F / (float)Math.PI)));
      float f1 = class04995.R((float)(class04995.u(d2, d0) * 180.0F / (float)Math.PI) - 90.0F);
      return this.N(new class07109(f, f1));
   }

   public class07701 y() {
      return !this.U && !this.u.G_()
         ? new class07701(this.u, this.i, this.P, this.R, this.M, this.B, this.Z, this.z, this.E, true, this.W, this.m, this.s, this.T)
         : this;
   }

   public class07109 E() {
      return this.P;
   }

   public class07701 N(class07703 var1) {
      return this.u == var1
         ? this
         : new class07701(var1, this.i, this.P, this.R, this.M, this.B, this.Z, this.z, this.E, this.U, this.W, this.m, this.s, this.T);
   }

   @Override
   public CompletableFuture<Suggestions> N(class05946<? extends class00751<?>> var1, class07666 var2, SuggestionsBuilder var3, CommandContext<?> var4) {
      if (var1 == class04227.yV) {
         return class07689.N(this.z.yM().u().stream().map(var0 -> var0.N().N()), var3);
      } else {
         return var1 == class04227.yK ? class07689.N(this.z.Nh().y().stream().map(class03711::N), var3) : this.N(var1).map(var3x -> {
            this.N((class01905<?>)var3x, var2, var3);
            return var3.buildFuture();
         }).orElseGet(Suggestions::empty);
      }
   }

   @Override
   public void N(CommandExceptionType var1, Message var2, boolean var3, @Nullable class01704 var4) {
      if (var4 != null) {
         var4.N(var2.getString());
      }

      if (!var3) {
         this.y(class00390.N(var2));
      }
   }

   @Override
   public CompletableFuture<Suggestions> N(CommandContext<?> var1) {
      return Suggestions.empty();
   }

   private Optional<? extends class01905<?>> N(class05946<? extends class00751<?>> var1) {
      Optional optional = this.t().method_46759(var1);
      return optional.isPresent() ? optional : this.z.yd().N().method_46759(var1);
   }

   public class07701 N(class04445 var1, class03068 var2) {
      return var1 == this.s && var2 == this.T
         ? this
         : new class07701(this.u, this.i, this.P, this.R, this.M, this.B, this.Z, this.z, this.E, this.U, this.W, this.m, var1, var2);
   }

   public class07701 N(class03102 var1, BinaryOperator<class03102> var2) {
      class03102 class03102 = var2.apply(this.W, var1);
      return this.y(class03102);
   }

   @Override
   public class08152 N() {
      return this.M;
   }

   public class07701 y(class03102 var1) {
      return Objects.equals(this.W, var1)
         ? this
         : new class07701(this.u, this.i, this.P, this.R, this.M, this.B, this.Z, this.z, this.E, this.U, var1, this.m, this.s, this.T);
   }

   public class07701 N(class08152 var1) {
      return var1 == this.M
         ? this
         : new class07701(this.u, this.i, this.P, this.R, var1, this.B, this.Z, this.z, this.E, this.U, this.W, this.m, this.s, this.T);
   }

   public class07701 N(class07664 var1) {
      return var1 == this.m
         ? this
         : new class07701(this.u, this.i, this.P, this.R, this.M, this.B, this.Z, this.z, this.E, this.U, this.W, var1, this.s, this.T);
   }

   public class07701 N(class04782 var1) {
      if (var1 == this.R) {
         return this;
      } else {
         double d0 = class07376.N(this.R.method_8597(), var1.method_8597());
         class06889 class06889 = new class06889(this.i.M * d0, this.i.B, this.i.Z * d0);
         return new class07701(this.u, class06889, this.P, var1, this.M, this.B, this.Z, this.z, this.E, this.U, this.W, this.m, this.s, this.T);
      }
   }

   public class07701 N(class07049 var1, class07664 var2) {
      return this.y(var2.N(var1));
   }

   public class07701 N(class06889 var1) {
      return this.i.equals(var1)
         ? this
         : new class07701(this.u, var1, this.P, this.R, this.M, this.B, this.Z, this.z, this.E, this.U, this.W, this.m, this.s, this.T);
   }

   public boolean N(class04770 var1) {
      class04770 class04770 = this.z();
      return var1 == class04770 ? false : class04770 != null && class04770.method_33793() || var1.method_33793();
   }

   public void N(Supplier<class00392> var1, boolean var2) {
      boolean flag = this.u.A_() && !this.U;
      boolean flag1 = var2 && this.u.B() && !this.U;
      if (flag || flag1) {
         class00392 class00392 = (class00392)var1.get();
         if (flag) {
            this.u.N(class00392);
         }

         if (flag1) {
            this.L(class00392);
         }
      }
   }

   public void N(class00392 var1) {
      if (!this.U) {
         class04770 class04770 = this.z();
         if (class04770 != null) {
            class04770.method_64398(var1);
         } else {
            this.u.N(var1);
         }
      }
   }

   public class07701 N(class07049 var1) {
      return this.E == var1
         ? this
         : new class07701(this.u, this.i, this.P, this.R, this.M, var1.method_74861(), var1.method_5476(), this.z, var1, this.U, this.W, this.m, this.s, this.T);
   }

   public class07701 N(class07109 var1) {
      return this.P.L(var1)
         ? this
         : new class07701(this.u, this.i, var1, this.R, this.M, this.B, this.Z, this.z, this.E, this.U, this.W, this.m, this.s, this.T);
   }

   public void N(class03059 var1, boolean var2, class00649 var3) {
      if (!this.U) {
         class04770 class04770 = this.z();
         if (class04770 != null) {
            class04770.method_43505(var1, var2, var3);
         } else {
            this.u.N(var3.N(var1.N()));
         }
      }
   }

   public class02796 W() {
      return this.z;
   }

   public class04782 R() {
      return this.R;
   }

   @Override
   public class03767 G() {
      return this.R.method_45162();
   }
}
