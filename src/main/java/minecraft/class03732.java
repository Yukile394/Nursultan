package minecraft;

import java.time.Instant;
import java.util.UUID;

public class class03732 extends class02065 {
   private final String N;

   public class03732 y() {
      class03732 class03732 = new class03732(this.y, this.L, this.u, this.N);
      class03732.i = this.i;
      class03732.M = this.M;
      return class03732;
   }

   class03732(UUID var1, Instant var2, UUID var3, String var4) {
      super(var1, var2, var3);
      this.N = var4;
   }

   @Override
   public class05096 N(class05096 var1, class03409 var2) {
      return new class03743(var1, var2, this);
   }

   public String N() {
      return this.N;
   }
}
