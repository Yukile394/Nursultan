package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

class class03440 {
   private final class03424 L;
   private final List<String> u;
   @Nullable
   class03438 N;
   boolean y;

   class03440(class03424 var1, List<String> var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   public void N(class07074 var1) {
      var1.N("Reload reason", this.L.field_33705);
      var1.N("Finished", this.y ? "Yes" : "No");
      var1.N("Packs", () -> String.join(", ", this.u));
      if (this.N != null) {
         this.N.N(var1);
      }
   }
}
