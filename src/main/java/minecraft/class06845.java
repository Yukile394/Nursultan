package minecraft;

import java.util.function.Supplier;

record class06845(class01894 location, Supplier<class08188> sampler) {

   class06845(class01894 location, Supplier<class08188> sampler) {
      this.location = location;
      this.sampler = sampler;
   }

   public Supplier<class08188> y() {
      return this.sampler;
   }

   public class01894 N() {
      return this.location;
   }
}
