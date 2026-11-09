package minecraft;

import com.mojang.serialization.Codec;
import java.util.Collection;

public class class00846 extends class01396<class00824> {
   public class00846() {
      super();
   }

   public void N(class04770 var1, class06584 var2, class00696 var3, Collection<class06584> var4) {
      class05908 class05908 = class00821.y(var1, (class07049)(var3.u() != null ? var3.u() : var3));
      this.N_27(var1, var3x -> var3x.N(var2, class05908, var4));
   }

   @Override
   public Codec<class00824> N() {
      return class00824.N;
   }
}
