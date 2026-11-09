package minecraft;

import Nursultan.class10416;
import Nursultan.class10419;
import java.util.List;
import java.util.Optional;

public class class04492 {
   private final class04490 N;
   private final class02063 y;

   public class04492(class04490 var1, class02063 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public void N(class05196 var1, class06929 var2, String var3) {
      var1.N(new class05561(this.N.N_46(new class10419(var3)), var2, this.y));
   }

   public void N(List<class05196> var1, class06929 var2, String var3) {
      for (int i = 0; i < var1.size(); i++) {
         ((class05196)var1.get(i)).N(new class05561(this.N.N_46(new class10416(var3, i)), var2, this.y));
      }
   }

   public void N(class05196 var1, String var2) {
      this.N(var1, class06925.P, var2);
   }

   public void N(List<class05196> var1, String var2) {
      this.N(var1, class06925.P, var2);
   }

   public void N(Optional<class05196> var1, String var2) {
      var1.ifPresent(var2x -> this.N(var2x, var2));
   }
}
