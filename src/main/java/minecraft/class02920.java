package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public record class02920(class00392 contents) implements Predicate<class02826<class00392>> {
   public static final Codec<class02920> N = class03748.N.xmap(class02920::new, class02920::N);

   public class02920(class00392 contents) {
      super();
      this.contents = contents;
   }

   public class00392 N() {
      return this.contents;
   }

   public boolean test(class02826<class00392> var1) {
      return ((class00392)var1.N()).equals(this.contents);
   }
}
