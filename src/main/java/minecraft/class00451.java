package minecraft;

import java.util.Collection;
import java.util.Optional;

public class class00451 implements class07426 {
   private final class02796 N;
   private final class07932 y;

   public class00451(class02796 var1, class07932 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public void y(class08774 var1, class07403 var2) {
      this.y.N(var2, "Deop '{}'", var1);
      this.N.Nm().i(var1);
   }

   @Override
   public void N(class07403 var1) {
      this.y.N(var1, "Clear operator list");
      this.N.Nm().E().N();
   }

   @Override
   public void N(class08774 var1, class07403 var2) {
      this.y.N(var2, "Op '{}'", var1);
      this.N.Nm().u(var1);
   }

   @Override
   public void N(class08774 var1, Optional<class08195> var2, Optional<Boolean> var3, class07403 var4) {
      this.y.N(var4, "Op '{}'", var1);
      this.N.Nm().N(var1, var2.map(class06984::N), var3);
   }

   @Override
   public Collection<class01087> N() {
      return this.N.Nm().E().i();
   }
}
