package minecraft;

import Nursultan.class10213;
import com.mojang.serialization.Codec;
import java.util.Optional;

public record class03890(class03556<class03877> function) implements class04573<class03903> {
   public static final Codec<class03890> N = class03877.i.xmap(class03890::new, class03890::N);

   @Override
   public float L() {
      return this.function.y() ? (float)this.function.N().y() : Float.POSITIVE_INFINITY;
   }

   public class03890(class03556<class03877> function) {
      super();
      this.function = function;
   }

   @Override
   public String toString() {
      Optional<class05946<class03877>> optional = this.function.i();
      if (optional.isPresent()) {
         class05946<class03877> class05946 = optional.get();
         if (class05946 == class03882.i) {
            return "continents";
         }

         if (class05946 == class03882.R) {
            return "erosion";
         }

         if (class05946 == class03882.M) {
            return "weirdness";
         }

         if (class05946 == class03882.B) {
            return "ridges";
         }
      }

      return "Coordinate[" + this.function + "]";
   }

   @Override
   public float y() {
      return this.function.y() ? (float)this.function.N().N() : Float.NEGATIVE_INFINITY;
   }

   public class03890 N(class03881 var1) {
      return new class03890(new class10213<>(this.function.N().N(var1)));
   }

   public class03556<class03877> N() {
      return this.function;
   }

   public float N(class03903 var1) {
      return (float)this.function.N().N(var1.N());
   }
}
