package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Consumer;

public record class08588(List<class05534> bees) implements class02694 {
   public static final Codec<class08588> N = class05534.u.xmap(class08588::new, class08588::N);
   public static final class02362<class04247, class08588> y = class05534.i.N_33(class02389.N()).N_10(class08588::new, class08588::N);
   public static final class08588 L = new class08588(List.of());

   public class08588(List<class05534> bees) {
      this.bees = (List<class05534>)bees;
   }

   public List<class05534> N() {
      return this.bees;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      var2.accept(class00392.N("container.beehive.bees", this.bees.size(), 3).N(class06541.field_1080));
   }
}
