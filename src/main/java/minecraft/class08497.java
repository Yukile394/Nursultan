package minecraft;

import java.util.ArrayList;
import java.util.List;

public class class08497 {
   private final class01471 N;
   private final class02142 y;
   private List<class01474> L = new ArrayList<>();
   private List<class01474> u = new ArrayList<>();

   public class08497(class01471 var1, class02142 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class08497 y(List<class01474> var1) {
      this.u = var1;
      return this;
   }

   public class08497 N(List<class01474> var1) {
      this.L = var1;
      return this;
   }

   public class08531 N() {
      return new class08531(this.N, this.y, this.L, this.u);
   }
}
