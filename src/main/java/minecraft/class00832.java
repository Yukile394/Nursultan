package minecraft;

import com.mojang.serialization.Codec;

public class class00832 extends class01396<class00825> {
   public class00832() {
      super();
   }

   public void N(class04770 var1, class07049 var2, class07072 var3) {
      class05908 class05908 = class00821.y(var1, var2);
      this.N_27(var1, var3x -> var3x.N(var1, class05908, var3));
   }

   @Override
   public Codec<class00825> N() {
      return class00825.N;
   }
}
