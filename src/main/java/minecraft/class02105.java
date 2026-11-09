package minecraft;

import java.time.Duration;
import java.time.Instant;
import org.jspecify.annotations.Nullable;

public abstract class class02105 {
   private static final int N = 60000;
   private static final int y = 10;
   private int L;
   private boolean u = false;
   @Nullable
   private Instant i;

   public boolean L() {
      return this.L >= 10;
   }

   public class02105() {
      super();
   }

   protected int i() {
      return this.L;
   }

   public void u() {
      this.u = false;
   }

   public abstract void y(class02097 var1);

   public boolean y() {
      return this.u && this.i != null && Duration.between(this.i, Instant.now()).toMillis() > 60000L;
   }

   public void N(class02097 var1) {
      if (this.y()) {
         this.R();
         this.L++;
         this.i = Instant.now();
      }

      if (this.L()) {
         this.y(var1);
         this.L = 0;
      }
   }

   public void N() {
      this.u = true;
      this.i = Instant.now();
      this.L = 0;
   }

   public abstract void R();
}
