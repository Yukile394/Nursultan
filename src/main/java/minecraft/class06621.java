package minecraft;

import java.util.List;

public record class06621(class07373 factory, int bits) implements class06617 {
   @Override
   public int L() {
      return this.bits;
   }

   public class06621(class07373 factory, int bits) {
      super();
      this.factory = factory;
      this.bits = bits;
   }

   public int i() {
      return this.bits;
   }

   public class07373 u() {
      return this.factory;
   }

   @Override
   public int y() {
      return this.bits;
   }

   @Override
   public <T> class07340<T> N(class01807<T> var1, List<T> var2) {
      return this.factory.create(this.bits, var2);
   }

   @Override
   public boolean N() {
      return false;
   }
}
