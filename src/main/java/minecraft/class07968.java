package minecraft;

import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class class07968 {
   private final class01894 N;
   private final class03556<class07468> y;
   private final class07463 L;
   private final class06378 u;
   private final Set<class02834> i = EnumSet.noneOf(class02834.class);

   public class07968(class01894 var1, class03556<class07468> var2, class07463 var3, class06378 var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   public class07968 N(class02834 var1) {
      this.i.add(var1);
      return this;
   }

   public class07965 N() {
      return new class07965(this.N, this.y, this.L, this.u, List.copyOf(this.i));
   }
}
