package minecraft;

import com.mojang.serialization.Codec;

public class class00842 extends class01396<class00826> {
   public class00842() {
      super();
   }

   public void N(class04770 var1, class07072 var2, float var3, float var4, boolean var5) {
      this.N_27(var1, var5x -> var5x.N(var1, var2, var3, var4, var5));
   }

   @Override
   public Codec<class00826> N() {
      return class00826.N;
   }
}
