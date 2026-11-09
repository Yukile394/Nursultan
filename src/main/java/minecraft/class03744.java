package minecraft;

import java.time.Instant;
import java.util.UUID;
import java.util.function.Supplier;

public class class03744 extends class02065 {
   final Supplier<class01631> N;

   public class03744 y() {
      class03744 class03744 = new class03744(this.y, this.L, this.u, this.N);
      class03744.i = this.i;
      class03744.R = this.R;
      class03744.M = this.M;
      return class03744;
   }

   class03744(UUID var1, Instant var2, UUID var3, Supplier<class01631> var4) {
      super(var1, var2, var3);
      this.N = var4;
   }

   @Override
   public class05096 N(class05096 var1, class03409 var2) {
      return new class03724(var1, var2, this);
   }

   public Supplier<class01631> N() {
      return this.N;
   }
}
