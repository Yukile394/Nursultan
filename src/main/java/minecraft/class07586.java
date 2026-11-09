package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;

public interface class07586 {
   class06333<String, class07586> N = new class06333<>();
   Codec<class07586> y = Codec.either(N.N(Codec.STRING), class07571.q)
      .xmap(Either::unwrap, var0 -> var0 instanceof class07571 ? Either.right((class07571)var0) : Either.left(var0));
   class07586 L = N("constant", var0 -> 0.0F);
   class07586 u = N("linear", var0 -> var0);
   class07586 i = N("in_back", class08173::N);
   class07586 R = N("in_bounce", class08173::y);
   class07586 M = N("in_circ", class08173::Q);
   class07586 B = N("in_cubic", class08173::L);
   class07586 Z = N("in_elastic", class08173::u);
   class07586 z = N("in_expo", class08173::i);
   class07586 U = N("in_quad", class08173::w);
   class07586 E = N("in_quart", class08173::R);
   class07586 W = N("in_quint", class08173::M);
   class07586 m = N("in_sine", class08173::B);
   class07586 P = N("in_out_back", class08173::O);
   class07586 s = N("in_out_bounce", class08173::Z);
   class07586 T = N("in_out_circ", class08173::z);
   class07586 b = N("in_out_cubic", class08173::U);
   class07586 j = N("in_out_elastic", class08173::Y);
   class07586 v = N("in_out_expo", class08173::d);
   class07586 n = N("in_out_quad", class08173::E);
   class07586 t = N("in_out_quart", class08173::W);
   class07586 G = N("in_out_quint", class08173::m);
   class07586 l = N("in_out_sine", class08173::n);
   class07586 d = N("out_back", class08173::t);
   class07586 w = N("out_bounce", class08173::P);
   class07586 k = N("out_circ", class08173::k);
   class07586 Y = N("out_cubic", class08173::l);
   class07586 Q = N("out_elastic", class08173::s);
   class07586 O = N("out_expo", class08173::T);
   class07586 g = N("out_quad", class08173::b);
   class07586 I = N("out_quart", class08173::G);
   class07586 J = N("out_quint", class08173::j);
   class07586 o = N("out_sine", class08173::v);

   float apply(float var1);

   static class07586 N(String var0, class07586 var1) {
      N.N(var0, var1);
      return var1;
   }

   static class07586 N(float var0, float var1) {
      return N(var0, var1, 1.0F - var0, 1.0F - var1);
   }

   static class07586 N(float var0, float var1, float var2, float var3) {
      return new class07571(new class07602(var0, var1, var2, var3));
   }
}
