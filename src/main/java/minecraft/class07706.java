package minecraft;

import com.mojang.serialization.Codec;

public class class07706 extends class01396<class07677> {
   public class07706() {
      super();
   }

   public void N(class04770 var1, class06171 var2, class06584 var3) {
      class05908 class05908 = class00821.y(var1, var2);
      this.N_27(var1, var2x -> var2x.N(class05908, var3));
   }

   @Override
   public Codec<class07677> N() {
      return class07677.N;
   }
}
