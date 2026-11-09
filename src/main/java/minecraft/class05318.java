package minecraft;

import com.mojang.serialization.Codec;

public abstract class class05318 {
   public static final Codec<class05318> L = class04206.s.T().dispatch("predicate_type", class05318::N, class05301::codec);

   public class05318() {
      super();
   }

   public abstract boolean N(class07209 var1, class07209 var2, class07209 var3, class06069 var4);

   protected abstract class05301<?> N();
}
