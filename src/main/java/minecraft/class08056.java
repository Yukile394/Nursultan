package minecraft;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;

public class class08056 implements class00381<class07280> {
   public static final class02362<class04247, class08056> N = class02362.N(
      class02389.B, class08056::N, class08085.y.N_33(class02389.N()), class08056::y, class08056::new
   );
   private final int y;
   private final List<class08085> L;

   public class08056(int var1, Collection<class07469> var2) {
      super();
      this.y = var1;
      this.L = Lists.newArrayList();

      for (class07469 class07469 : var2) {
         this.L.add(new class08085(class07469.N(), class07469.y(), class07469.L()));
      }
   }

   private class08056(int var1, List<class08085> var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public List<class08085> y() {
      return this.L;
   }

   public int N() {
      return this.y;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class08056> method_65080() {
      return class04248.yE;
   }
}
