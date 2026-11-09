package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record class08213(int value) implements class02694, class08237 {
   public static final int N = 120000;
   public static final int y = 0;
   public static final int L = 4;
   public static final Codec<class08213> u = class06338.N(0, 4).xmap(class08213::new, class08213::N);
   public static final class02362<class04247, class08213> i = class02362.N(class02389.B, class08213::N, class08213::new);

   public class08213(int value) {
      super();
      this.value = value;
   }

   @Override
   public void N(class07299 var1, class07438 var2, class06584 var3, class08209 var4) {
      var2.method_6092(new class07055(class07047.g, 120000, this.value, false, false, true));
   }

   public int N() {
      return this.value;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      class06517.N(List.of(new class07055(class07047.g, 120000, this.value, false, false, true)), var2, 1.0F, var1.y());
   }
}
