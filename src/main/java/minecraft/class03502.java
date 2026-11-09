package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import java.util.List;
import java.util.function.ToIntFunction;

public interface class03502 {
   List<class05946<class01194>> B = List.of(
      class01194.f.B(),
      class01194.C.B(),
      class01194.S.B(),
      class01194.x.B(),
      class01194.D.B(),
      class01194.h.B(),
      class01194.r.B(),
      class01194.NN.B(),
      class01194.Ny.B(),
      class01194.NL.B(),
      class01194.Nu.B(),
      class01194.Ni.B(),
      class01194.NR.B(),
      class01194.NM.B(),
      class01194.NB.B()
   );
   int Z = 0;
   ToIntFunction<class05946<class01194>> w_ = class07536.N(new Reference2IntOpenHashMap(), var0 -> {
      var0.defaultReturnValue(0);
      var0.put(class01194.a.B(), 1);
      var0.put(class01194.p.B(), 1);
      var0.put(class01194.l.B(), 1);
      var0.put(class01194.K.B(), 2);
      var0.put(class01194.k.B(), 2);
      var0.put(class01194.X.B(), 2);
      var0.put(class01194.Q.B(), 3);
      var0.put(class01194.V.B(), 3);
      var0.put(class01194.Y.B(), 3);
      var0.put(class01194.n.B(), 4);
      var0.put(class01194.m.B(), 4);
      var0.put(class01194.A.B(), 4);
      var0.put(class01194.T.B(), 5);
      var0.put(class01194.t.B(), 5);
      var0.put(class01194.b.B(), 6);
      var0.put(class01194.H.B(), 6);
      var0.put(class01194.j.B(), 6);
      var0.put(class01194.P.B(), 7);
      var0.put(class01194.E.B(), 8);
      var0.put(class01194.W.B(), 8);
      var0.put(class01194.z.B(), 9);
      var0.put(class01194.u.B(), 9);
      var0.put(class01194.i.B(), 9);
      var0.put(class01194.M.B(), 9);
      var0.put(class01194.U.B(), 10);
      var0.put(class01194.B.B(), 10);
      var0.put(class01194.N.B(), 10);
      var0.put(class01194.y.B(), 10);
      var0.put(class01194.q.B(), 10);
      var0.put(class01194.o.B(), 10);
      var0.put(class01194.L.B(), 11);
      var0.put(class01194.R.B(), 12);
      var0.put(class01194.d.B(), 12);
      var0.put(class01194.Z.B(), 13);
      var0.put(class01194.w.B(), 13);
      var0.put(class01194.v.B(), 14);
      var0.put(class01194.J.B(), 14);
      var0.put(class01194.F.B(), 14);
      var0.put(class01194.s.B(), 15);
      var0.put(class01194.G.B(), 15);

      for (int i = 1; i <= 15; i++) {
         var0.put(y(i), i);
      }
   });

   class03508 L();

   class03481 u();

   static class05946<class01194> y(int var0) {
      return B.get(var0 - 1);
   }

   static int N(class03556<class01194> var0) {
      return var0.i().map(class03502::N).orElse(0);
   }

   static int N(float var0, int var1) {
      double d0 = 15.0 / var1;
      return Math.max(1, 15 - class04995.N(d0 * var0));
   }

   static int N(class05946<class01194> var0) {
      return w_.applyAsInt((class05946<class01194>)var0);
   }
}
