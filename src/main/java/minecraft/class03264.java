package minecraft;

import java.util.List;

public record class03264(class04540<class03674> variants) {
   public class03264(class04540<class03674> variants) {
      super();
      if (variants.L()) {
         throw new IllegalArgumentException("Variant list must contain at least one element");
      } else {
         this.variants = variants;
      }
   }

   public class04540<class03674> y() {
      return this.variants;
   }

   public class08880 N() {
      List<class04523<class03674>> list = this.variants.u();
      return (class08880)(list.size() == 1 ? new class08883(list.getFirst().N()) : new class00177(this.variants.N(class08883::new)));
   }

   public class03264 N(class08503 var1) {
      return new class03264(this.variants.N(var1));
   }
}
