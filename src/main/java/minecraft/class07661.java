package minecraft;

import com.mojang.serialization.Codec;

public class class07661 extends class01396<class07679> {
   public class07661() {
      super();
   }

   public void N(class04770 var1, class07209 var2) {
      double d0 = var1.method_23317() - var2.method_10263();
      double d1 = var1.method_23321() - var2.method_10260();
      double d2 = d0 * d0 + d1 * d1;
      this.N_27(var1, var2x -> var2x.N(d2));
   }

   @Override
   public Codec<class07679> N() {
      return class07679.N;
   }
}
