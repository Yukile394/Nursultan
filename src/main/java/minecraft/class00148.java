package minecraft;

public record class00148(class03556<class06581> item, int count, class00146 components) implements class00176 {
   public static final class02362<class04247, class00148> L = class02362.N(
      class02389.y(class04227.F), class00148::N, class02389.B, class00148::y, class00146.N, class00148::L, class00148::new
   );

   public class00146 L() {
      return this.components;
   }

   public class00148(class03556<class06581> item, int count, class00146 components) {
      this.item = item;
      this.count = count;
      this.components = components;
   }

   public int y() {
      return this.count;
   }

   @Override
   public boolean N(class06584 var1, class00147 var2) {
      if (this.count != var1.c()) {
         return false;
      } else {
         return !this.item.equals(var1.Z()) ? false : this.components.y(var1.u(), var2);
      }
   }

   public class03556<class06581> N() {
      return this.item;
   }
}
