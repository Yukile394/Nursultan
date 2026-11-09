package minecraft;

import java.util.Optional;

public class class05751 implements class05779 {
   private final class07049 N;
   private final boolean y;
   private final boolean L;

   public class07049 L() {
      return this.N;
   }

   public class05751(class07049 var1, boolean var2) {
      this(var1, var2, false);
   }

   public class05751(class07049 var1, boolean var2, boolean var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public String toString() {
      return "EntityTracker for " + this.N;
   }

   @Override
   public class07209 y() {
      return this.L ? class07209.method_49638(this.N.method_33571()) : this.N.method_24515();
   }

   @Override
   public class06889 N() {
      return this.y ? this.N.method_73189().y(0.0, this.N.method_5751(), 0.0) : this.N.method_73189();
   }

   @Override
   public boolean N(class07438 var1) {
      if (this.N instanceof class07438 class07438) {
         if (!class07438.method_5805()) {
            return false;
         } else {
            Optional<class04051> optional = var1.method_18868().L(class05378.B);
            return optional.isPresent() && optional.get().N(class07438);
         }
      } else {
         return true;
      }
   }
}
