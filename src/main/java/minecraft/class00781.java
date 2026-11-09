package minecraft;

import com.mojang.serialization.Codec;

public class class00781 extends class01396<class00784> {
   public class00781() {
      super();
   }

   public void N(class04770 var1, class08004 var2, class08041 var3) {
      class05908 class05908x = class00821.y(var1, var2);
      class05908 class05908x = class00821.y(var1, var3);
      this.N_27(var1, var2x -> var2x.N(class05908x, class05908));
   }

   @Override
   public Codec<class00784> N() {
      return class00784.N;
   }
}
