package minecraft;

import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;

public class class03061 implements class03072 {
   private final class03962 u;
   private final BooleanSupplier i;
   @Nullable
   private class03926 R;
   private boolean M = true;

   public class03061(class03962 var1, BooleanSupplier var2) {
      super();
      this.u = var1;
      this.i = var2;
   }

   private boolean y(class03926 var1) {
      if (this.i.getAsBoolean()) {
         N.error("Received message with expired profile public key from {} with session {}", var1.M(), var1.U().u());
         return false;
      } else if (!var1.N(this.u)) {
         N.error("Received message with invalid signature (is the session wrong, or signature cache out of sync?): {}", class03926.N(var1));
         return false;
      } else {
         return this.N(var1);
      }
   }

   private boolean N(class03926 var1) {
      if (var1.equals(this.R)) {
         return true;
      } else if (this.R != null && !var1.U().N(this.R.U())) {
         N.error(
            "Received out-of-order chat message from {}: expected index > {} for session {}, but was {} for session {}",
            new Object[]{var1.M(), this.R.U().y(), this.R.U().u(), var1.U().y(), var1.U().u()}
         );
         return false;
      } else {
         return true;
      }
   }

   @Nullable
   @Override
   public class03926 method_45048(class03926 var1) {
      this.M = this.M && this.y(var1);
      if (!this.M) {
         return null;
      } else {
         this.R = var1;
         return var1;
      }
   }
}
