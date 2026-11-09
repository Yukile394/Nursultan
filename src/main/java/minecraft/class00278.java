package minecraft;

import java.util.List;

public record class00278(List<class00268> entries, boolean replace) implements class00381<class07280> {
   public static final class02362<class04247, class00278> N = class02362.N(
      class00268.L.N_33(class02389.N()), class00278::N, class02389.y, class00278::y, class00278::new
   );

   public class00278(List<class00268> entries, boolean replace) {
      super();
      this.entries = entries;
      this.replace = replace;
   }

   public boolean y() {
      return this.replace;
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public List<class00268> N() {
      return this.entries;
   }

   @Override
   public class02897<class00278> method_65080() {
      return class04248.Ns;
   }
}
