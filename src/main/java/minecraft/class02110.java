package minecraft;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class class02110 {
   private static final int N = -1;
   private Optional<Instant> y = Optional.empty();
   private long L;
   private long u;

   public class02110() {
      super();
   }

   public void N(class02097 var1) {
      this.y.ifPresent(var2 -> var1.send(class02129.R, var2x -> {
         var2x.N(class02117.s, this.N(var2));
         var2x.N(class02117.T, (int)this.L);
      }));
   }

   private int N(Instant var1) {
      return (int)Duration.between(var1, Instant.now()).toSeconds();
   }

   public void N(long var1) {
      if (this.u != -1L) {
         this.L = this.L + Math.max(0L, var1 - this.u);
      }

      this.u = var1;
   }

   public void N() {
      this.u = -1L;
      if (this.y.isEmpty()) {
         this.y = Optional.of(Instant.now());
      }
   }
}
