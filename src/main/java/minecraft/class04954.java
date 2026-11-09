package minecraft;

import com.mojang.serialization.Codec;

public class class04954 extends class01396<class04943> {
   public class04954() {
      super();
   }

   public void N(class04770 var1, class07049 var2, class06889 var3, int var4) {
      class05908 class05908 = class00821.y(var1, var2);
      this.N_27(var1, var3x -> var3x.N(class05908, var3, var4));
   }

   @Override
   public Codec<class04943> N() {
      return class04943.N;
   }
}
