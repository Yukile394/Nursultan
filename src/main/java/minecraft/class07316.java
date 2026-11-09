package minecraft;

import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import org.jspecify.annotations.Nullable;

public class class07316 extends ArrayList<class07324> {
   public static final Codec<class07316> N = class07324.N.listOf().optionalFieldOf("Recipes", List.of()).xmap(class07316::new, Function.identity()).codec();
   public static final class02362<class04247, class07316> y = class07324.y.N_33(class02389.N(class07316::new));

   private class07316(Collection<class07324> var1) {
      super(var1);
   }

   private class07316(int var1) {
      super(var1);
   }

   public class07316() {
      super();
   }

   public class07316 N() {
      class07316 class07316 = new class07316(this.size());

      for (class07324 class07324 : this) {
         class07316.add(class07324.t());
      }

      return class07316;
   }

   @Nullable
   public class07324 N(class06584 var1, class06584 var2, int var3) {
      if (var3 > 0 && var3 < this.size()) {
         class07324 class07324 = this.get(var3);
         return class07324.N(var1, var2) ? class07324 : null;
      } else {
         for (int i = 0; i < this.size(); i++) {
            class07324 class07324x = this.get(i);
            if (class07324x.N(var1, var2)) {
               return class07324x;
            }
         }

         return null;
      }
   }
}
