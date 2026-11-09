package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public abstract class class01869 implements class08781 {
   protected class01869(class01866 var1) {
      super();
      this.y = var1;
   }

   @Override
   public class02243 N() {
      return this.y.o();
   }

   @Override
   public void N(class01894 var1, Optional<class07709> var2) {
      this.y.N(new class09036(var1, var2));
   }

   @Override
   public void N(class03556<class09037> var1, @Nullable class05096 var2) {
      this.y.N(var1, this, var2);
   }

   @Override
   public void N(class00392 var1) {
      this.y.u.method_10747(var1);
      this.y.u.method_10768();
   }
}
