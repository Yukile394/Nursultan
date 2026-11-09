package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

public class class03658 {
   final int N;
   private final List<class03703> R = new ArrayList<>();
   int y;
   int L = 4;
   int u;
   Optional<class03676> i = Optional.empty();

   public class03658(int var1) {
      super();
      this.N = var1;
   }

   public class03658 y(int var1) {
      this.L = var1;
      return this;
   }

   public class03668 y() {
      class02060 class02060 = new class02060().y(this.L);
      class02060.N(class02057.N(this.N - 44), 0, 0);
      class02060.N(class02057.N(44), 0, 1);
      ArrayList arraylist = new ArrayList();
      this.u = 0;

      for (class03703 class03703 : this.R) {
         arraylist.add(class03703.N(this, class02060, 0));
      }

      class02060.N();
      class03668 class03668 = new class03668(arraylist, class02060);
      class03668.y();
      return class03668;
   }

   public class03658 N(int var1, boolean var2) {
      this.i = Optional.of(new class03676(var1, var2));
      return this;
   }

   public class03658 N(int var1) {
      this.y = var1;
      return this;
   }

   public class03703 N(class00392 var1, BooleanSupplier var2, Consumer<Boolean> var3) {
      class03703 class03703 = new class03703(var1, var2, var3, 44);
      this.R.add(class03703);
      return class03703;
   }

   void N() {
      this.u++;
   }
}
