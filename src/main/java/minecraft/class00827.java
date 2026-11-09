package minecraft;

import com.mojang.serialization.Codec;

public class class00827 extends class01396<class00857> {
   public class00827() {
      super();
   }

   public void N(class04770 var1, class07049 var2, class07072 var3, float var4, float var5, boolean var6) {
      class05908 class05908 = class00821.y(var1, var2);
      this.N_27(var1, var6x -> var6x.N(var1, class05908, var3, var4, var5, var6));
   }

   @Override
   public Codec<class00857> N() {
      return class00857.N;
   }
}
