package minecraft;

import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public class class00776 extends class01396<class00806> {
   public class00776() {
      super();
   }

   public void N(class04770 var1, @Nullable class07049 var2) {
      class05908 class05908 = var2 != null ? class00821.y(var1, var2) : null;
      this.N_27(var1, var2x -> var2x.N(var1, class05908));
   }

   @Override
   public Codec<class00806> N() {
      return class00806.N;
   }
}
