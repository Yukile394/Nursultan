package minecraft;

import com.mojang.serialization.Codec;

public class class00839 extends class01396<class00811> {
   public class00839() {
      super();
   }

   public void N(class04770 var1, class06889 var2) {
      class06889 class06889 = var1.method_73189();
      this.N_27(var1, var3x -> var3x.N(var1.method_51469(), var2, class06889));
   }

   @Override
   public Codec<class00811> N() {
      return class00811.N;
   }
}
