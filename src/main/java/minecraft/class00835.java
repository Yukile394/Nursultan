package minecraft;

import com.mojang.serialization.Codec;

public class class00835 extends class01396<class00843> {
   public class00835() {
      super();
   }

   private void N(class04770 var1, class08044 var2, class06584 var3, int var4, int var5, int var6) {
      this.N_27(var1, var5x -> var5x.N(var2, var3, var4, var5, var6));
   }

   public void N(class04770 var1, class08044 var2, class06584 var3) {
      int i = 0;
      int j = 0;
      int k = 0;

      for (int l = 0; l < var2.method_5439(); l++) {
         class06584 class06584 = var2.method_5438(l);
         if (class06584.R()) {
            j++;
         } else {
            k++;
            if (class06584.c() >= class06584.U()) {
               i++;
            }
         }
      }

      this.N(var1, var2, var3, i, j, k);
   }

   @Override
   public Codec<class00843> N() {
      return class00843.N;
   }
}
