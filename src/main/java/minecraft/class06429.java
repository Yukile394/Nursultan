package minecraft;

import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class06429 {
   private final class01683 N;
   private int y = -1;
   @Nullable
   private Consumer<class07001> L;

   public class06429(class01683 var1) {
      super();
      this.N = var1;
   }

   public void N(class07209 var1, Consumer<class07001> var2) {
      int i = this.N(var2);
      this.N.N(new class00537(i, var1));
   }

   public void N(int var1, Consumer<class07001> var2) {
      int i = this.N(var2);
      this.N.N(new class00540(i, var1));
   }

   private int N(Consumer<class07001> var1) {
      this.L = var1;
      return ++this.y;
   }

   public boolean N(int var1, @Nullable class07001 var2) {
      if (this.y == var1 && this.L != null) {
         this.L.accept(var2);
         this.L = null;
         return true;
      } else {
         return false;
      }
   }
}
