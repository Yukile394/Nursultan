package minecraft;

import Nursultan.class10321;
import java.util.Map;
import java.util.function.Consumer;

public class class04162 {
   private final class04782 N;
   private final class00311 y;
   private final Map<class01894, class10321> L;
   private final float u;

   public float L() {
      return this.u;
   }

   public class04162(class04782 var1, class00311 var2, Map<class01894, class10321> var3, float var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   public class00311 y() {
      return this.y;
   }

   public void N(class01894 var1, Consumer<class06584> var2) {
      class10321 class10321 = this.L.get(var1);
      if (class10321 != null) {
         class10321.add(var2);
      }
   }

   public class04782 N() {
      return this.N;
   }
}
