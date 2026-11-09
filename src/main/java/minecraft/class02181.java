package minecraft;

import com.mojang.serialization.Codec;
import org.jspecify.annotations.Nullable;

public class class02181 extends class01396<class02187> {
   public class02181() {
      super();
   }

   public void N(class04770 var1, class06889 var2, @Nullable class07049 var3) {
      class06889 class06889 = var1.method_73189();
      class05908 class05908 = var3 != null ? class00821.y(var1, var3) : null;
      this.N_27(var1, var4x -> var4x.N(var1.method_51469(), var2, class06889, class05908));
   }

   @Override
   public Codec<class02187> N() {
      return class02187.N;
   }
}
