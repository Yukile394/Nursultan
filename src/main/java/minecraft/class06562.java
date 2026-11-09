package minecraft;

import java.time.Instant;
import org.jspecify.annotations.Nullable;

public class class06562 {
   @Nullable
   private Instant N;

   public void L() {
      this.N = null;
   }

   public class06562() {
      super();
   }

   public class06562(Instant var1) {
      super();
      this.N = var1;
   }

   @Override
   public String toString() {
      return "CriterionProgress{obtained=" + (this.N == null ? "false" : this.N) + "}";
   }

   @Nullable
   public Instant u() {
      return this.N;
   }

   public static class06562 y(class00667 var0) {
      class06562 class06562 = new class06562();
      class06562.N = var0.L(class00667::j);
      return class06562;
   }

   public void y() {
      this.N = Instant.now();
   }

   public void N(class00667 var1) {
      var1.N(this.N, class00667::N);
   }

   public boolean N() {
      return this.N != null;
   }
}
