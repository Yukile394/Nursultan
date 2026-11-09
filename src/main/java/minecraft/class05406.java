package minecraft;

import java.util.Map.Entry;
import java.util.stream.Stream;

record class05406(class05390 properties, class03264 variant) {

   class05406(class05390 properties, class03264 variant) {
      this.properties = properties;
      this.variant = variant;
   }

   public class03264 y() {
      return this.variant;
   }

   public class05390 N() {
      return this.properties;
   }

   public Stream<class05406> N(class05415<class08503> var1) {
      return var1.N().entrySet().stream().map(var1x -> {
         class05390 class05390 = this.properties.N((class05390)var1x.getKey());
         class03264 class03264 = this.variant.N((class08503)var1x.getValue());
         return new class05406(class05390, class03264);
      });
   }

   public Stream<class05406> N(class08503 var1) {
      return Stream.of(new class05406(this.properties, this.variant.N(var1)));
   }
}
