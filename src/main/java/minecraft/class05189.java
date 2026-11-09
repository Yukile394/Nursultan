package minecraft;

import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public class class05189 extends class01396<class05202> {
   public class05189() {
      super();
   }

   public void N(class04770 var1, class06584 var2, @Nullable class07049 var3) {
      class05908 class05908 = class00821.y(var1, var3);
      this.N_27(var1, var3x -> var3x.N(var1, var2, class05908));
   }

   @Override
   public Codec<class05202> N() {
      return class05202.N;
   }
}
