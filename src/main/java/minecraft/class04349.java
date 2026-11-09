package minecraft;

import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

class class04349 {
   private final class04116<class04086> N;

   class04349(class04116<class04086> var1) {
      super();
      this.N = var1;
   }

   private void N(
      class05946<class04086> var1,
      class07310 var2,
      class05946<class00780> var3,
      Set<class05946<class04412>> var4,
      boolean var5,
      boolean var6,
      class01627... var7
   ) {
      class02055 class02055xx = this.N.N(class04227.yb);
      class02055 class02055x = this.N.N(class04227.ys);
      class02055 class02055xx = this.N.N(class04227.NA);
      class03522 class03522 = class03543.N(var4.stream().map(class02055xx::y).collect(Collectors.toList()));
      class01584 class01584 = new class01584(Optional.of(class03522), class02055xx.y(var3), class01584.y(class02055x));
      if (var5) {
         class01584.N();
      }

      if (var6) {
         class01584.y();
      }

      for (int i = var7.length - 1; i >= 0; i--) {
         class01584.i().add(var7[i]);
      }

      this.N.N(var1, new class04086(var2.B().i(), class01584));
   }

   public void N() {
      this.N(
         class04095.N,
         class00869.Z,
         class00795.y,
         ImmutableSet.of(class04409.N),
         false,
         false,
         new class01627(1, class00869.Z),
         new class01627(2, class00869.z),
         new class01627(1, class00869.q)
      );
      this.N(
         class04095.y,
         class00869.y,
         class00795.n,
         ImmutableSet.of(class04409.z, class04409.b),
         true,
         false,
         new class01627(1, class00869.Z),
         new class01627(5, class00869.z),
         new class01627(230, class00869.y),
         new class01627(1, class00869.q)
      );
      this.N(
         class04095.L,
         class06570.jE,
         class00795.C,
         ImmutableSet.of(class04409.W, class04409.E, class04409.M),
         false,
         false,
         new class01627(90, class00869.K),
         new class01627(5, class00869.X),
         new class01627(5, class00869.z),
         new class01627(5, class00869.y),
         new class01627(64, class00869.nZ),
         new class01627(1, class00869.q)
      );
      this.N(
         class04095.u,
         class00869.yk,
         class00795.y,
         ImmutableSet.of(class04409.N, class04409.z, class04409.R, class04409.U, class04409.b),
         true,
         true,
         new class01627(1, class00869.Z),
         new class01627(3, class00869.z),
         new class01627(59, class00869.y),
         new class01627(1, class00869.q)
      );
      this.N(
         class04095.i,
         class00869.is,
         class00795.u,
         ImmutableSet.of(class04409.N, class04409.L),
         false,
         false,
         new class01627(1, class00869.is),
         new class01627(1, class00869.Z),
         new class01627(3, class00869.z),
         new class01627(59, class00869.y),
         new class01627(1, class00869.q)
      );
      this.N(
         class04095.R,
         class06570.Tr,
         class00795.y,
         ImmutableSet.of(class04409.N),
         false,
         false,
         new class01627(1, class00869.Z),
         new class01627(3, class00869.z),
         new class01627(2, class00869.W)
      );
      this.N(
         class04095.M,
         class00869.e,
         class00795.R,
         ImmutableSet.of(class04409.N, class04409.y, class04409.z, class04409.b),
         true,
         false,
         new class01627(8, class00869.e),
         new class01627(52, class00869.yL),
         new class01627(3, class00869.y),
         new class01627(1, class00869.q)
      );
      this.N(
         class04095.B,
         class06570.WY,
         class00795.R,
         ImmutableSet.of(),
         false,
         false,
         new class01627(116, class00869.yL),
         new class01627(3, class00869.y),
         new class01627(1, class00869.q)
      );
      this.N(class04095.Z, class00869.ZX, class00795.N, ImmutableSet.of(), true, false, new class01627(1, class00869.N));
   }
}
