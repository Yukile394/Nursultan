package minecraft;

import com.mojang.serialization.Codec;

public class class01265 extends class01396<class01243> {
   public class01265() {
      super();
   }

   public void N(class04770 var1, class06584 var2, class07049 var3) {
      class05908 class05908 = class00821.y(var1, var3);
      this.N_27(var1, var2x -> var2x.N(var2, class05908));
   }

   @Override
   public Codec<class01243> N() {
      return class01243.N;
   }
}
