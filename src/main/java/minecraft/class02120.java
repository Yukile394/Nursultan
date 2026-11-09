package minecraft;

import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;

public final class class02120 extends class02105 {
   private static final long N = N(Runtime.getRuntime().maxMemory());
   private final LongList y = new LongArrayList();
   private final LongList L = new LongArrayList();
   private final LongList u = new LongArrayList();

   private void M() {
      this.y.clear();
      this.L.clear();
      this.u.clear();
   }

   public class02120() {
      super();
   }

   private void B() {
      long i = Runtime.getRuntime().totalMemory();
      long j = Runtime.getRuntime().freeMemory();
      long k = i - j;
      this.u.add(N(k));
   }

   @Override
   public void y(class02097 var1) {
      var1.send(class02129.u, var1x -> {
         var1x.N(class02117.b, new LongArrayList(this.y));
         var1x.N(class02117.j, new LongArrayList(this.L));
         var1x.N(class02117.v, new LongArrayList(this.u));
         var1x.N(class02117.n, this.i());
         var1x.N(class02117.t, ((class05630)class06202.Nq().i_7).Nh());
         var1x.N(class02117.G, (int)N);
      });
      this.M();
   }

   private static long N(long var0) {
      return var0 / 1000L;
   }

   @Override
   public void N(class02097 var1) {
      if (class06202.Nq().yz()) {
         super.N(var1);
      }
   }

   @Override
   public void R() {
      this.y.add(class06202.Nq().Nx());
      this.B();
      this.L.add(class06202.Nq().W());
   }
}
