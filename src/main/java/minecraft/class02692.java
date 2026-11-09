package minecraft;

import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public record class02692(List<class02679> effects) implements class02694, class08237 {
   public static final class02692 N = new class02692(List.of());
   public static final int y = 160;
   public static final Codec<class02692> L = class02679.N.listOf().xmap(class02692::new, class02692::N);
   public static final class02362<class04247, class02692> u = class02679.y.N_33(class02389.N()).N_10(class02692::new, class02692::N);

   public class02692(List<class02679> effects) {
      super();
      this.effects = (List<class02679>)effects;
   }

   @Override
   public void N(class07299 var1, class07438 var2, class06584 var3, class08209 var4) {
      for (class02679 class02679 : this.effects) {
         var2.method_6092(class02679.N());
      }
   }

   public List<class02679> N() {
      return this.effects;
   }

   @Override
   public void N(class06591 var1, Consumer<class00392> var2, class06497 var3, class02666 var4) {
      if (var3.y()) {
         ArrayList arraylist = new ArrayList();

         for (class02679 class02679 : this.effects) {
            arraylist.add(class02679.N());
         }

         class06517.N(arraylist, var2, 1.0F, var1.y());
      }
   }

   public class02692 N(class02679 var1) {
      return new class02692(class07536.N(this.effects, var1));
   }
}
