package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Predicate;

public record class02916(String contents) implements Predicate<class02826<String>> {
   public static final Codec<class02916> N = Codec.STRING.xmap(class02916::new, class02916::N);

   public class02916(String contents) {
      this.contents = contents;
   }

   public String N() {
      return this.contents;
   }

   public boolean test(class02826<String> var1) {
      return ((String)var1.N()).equals(this.contents);
   }
}
