package minecraft;

import java.util.Optional;
import java.util.function.Function;

public class class08111 extends class02840<class08982, class08140, class04941> {
   public class08111(class04832 var1) {
      super(var1, new class04941(var1.N(class04802.Nm)), 0.5F);
      this.N(new class03971<>(this, u(), (var0, var1x) -> 1.0F, new class04941(var1.N(class04802.Nm)), class06851::T, false));
      this.N(new class02758<>(this));
      this.N(new class00939<>(this, var0 -> var0.B, this.y::y));
      this.N(new class02245<>(this, var1.R(), var1.U()));
   }

   private static Function<class08140, class01894> u() {
      return var0 -> class08971.N(var0.N).R();
   }

   public class08140 method_55269() {
      return new class08140();
   }

   public void method_62354(class08982 var1, class08140 var2, float var3) {
      super.method_62354(var1, var2, var3);
      class08827.N(var1, var2, this.L, var3);
      var2.N = var1.E();
      var2.y = var1.B();
      var2.L.N(var1.m());
      var2.u.N(var1.v());
      var2.i.N(var1.n());
      var2.R.N(var1.t());
      var2.M.N(var1.G());
      var2.B = Optional.of(var1.method_6118(class08982.N)).flatMap(var0 -> {
         if (var0.B() instanceof class06918 class06918) {
            class02841 class02841 = var0.a_(class02484.Nl, class02841.N);
            return Optional.of(class02841.N(class06918.L().W()));
         } else {
            return Optional.empty();
         }
      });
   }

   public class01894 N(class08140 var1) {
      return class08971.N(var1.N).i();
   }
}
