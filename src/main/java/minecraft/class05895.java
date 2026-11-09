package minecraft;

import com.mojang.serialization.Codec;

public class class05895 extends class01396<class05912> {
   public class05895() {
      super();
   }

   public void N(class04770 var1, class00500 var2, class06584 var3, int var4) {
      this.N_27(var1, var3x -> var3x.N(var2, var3, var4));
   }

   @Override
   public Codec<class05912> N() {
      return class05912.N;
   }
}
