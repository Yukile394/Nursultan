package minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class class03374 {
   private final List<class03401<?>> y;

   public void L() {
      Iterator<class03401<?>> iterator = this.y.iterator();

      while (iterator.hasNext()) {
         iterator.next().L();
      }
   }

   public class03374(class03377 var1) {
      super();
      this.N = var1;
      this.y = new ArrayList<>();
   }

   public void y() {
      Iterator<class03401<?>> iterator = this.y.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(this.N.u.get(this.N.L));
      }
   }

   public <T> void N(class03416<T> var1, Consumer<T> var2) {
      class03401 class03401 = new class03401(this.N, var1, var2);
      this.y.add(class03401);
      class03401.N();
   }

   public void N() {
      Iterator<class03401<?>> iterator = this.y.iterator();

      while (iterator.hasNext()) {
         iterator.next().y();
      }
   }
}
