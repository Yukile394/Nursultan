package minecraft;

import java.util.Optional;

public interface class01108<T extends Enum<T>> {
   int m_ = 4;

   default Optional<class00500> L(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      int i = this.i().ordinal();
      int j = 0;
      int k = 0;

      for (class07209 class07209 : class07209.method_25996(var3, 4, 4, 4)) {
         if (class07209.method_19455(var3) > 4) {
            break;
         }

         if (!class07209.equals(var3)) {
            class00891 class00891 = var2.method_8320(class07209).i();
            if (class00891 instanceof class01108) {
               Enum oenum = ((class01108)class00891).i();
               if (this.i().getClass() == oenum.getClass()) {
                  int l = oenum.ordinal();
                  if (l < i) {
                     return Optional.empty();
                  }

                  if (l > i) {
                     k++;
                  } else {
                     j++;
                  }
               }
            }
         }
      }

      float f = (float)(k + 1) / (k + j + 1);
      float f1 = f * f * this.J_();
      return var4.z() < f1 ? this.h_(var1) : Optional.empty();
   }

   T i();

   default void a_(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      float f = 0.05688889F;
      if (var4.z() < 0.05688889F) {
         this.L(var1, var2, var3, var4).ifPresent(var2x -> var2.method_8501(var3, var2x));
      }
   }

   float J_();

   Optional<class00500> h_(class00500 var1);
}
