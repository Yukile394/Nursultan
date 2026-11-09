package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;

public class class04258 extends class01396<class04276> {
   public class04258() {
      super();
   }

   public void N(class04770 var1, class07209 var2) {
      class04782 class04782 = var1.method_51469();
      class00500 class00500 = class04782.method_8320(var2);
      class04162 class04162 = new class04160(class04782).N(class06551.B, var2.method_46558()).N(class06551.N, var1).N(class06551.Z, class00500).N(class06925.T);
      class05908 class05908 = new class05927(class04162).N(Optional.empty());
      this.N_27(var1, var1x -> var1x.N(class05908));
   }

   @Override
   public Codec<class04276> N() {
      return class04276.N;
   }
}
