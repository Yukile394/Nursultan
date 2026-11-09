package minecraft;

import org.jspecify.annotations.Nullable;

public interface class02106 {
   void N(boolean var1);

   class04654 N();

   static class02106 N(class04654 var0, class01295... var1) {
      class02106 class02106 = N(var0);
      class01295[] aclass01295 = var1;
      int i = var1.length;

      for (int j = 0; j < i; j++) {
         class02106 = N(aclass01295[j], class02106);
      }

      return class02106;
   }

   @Nullable
   static class02106 N(class01295 var0, @Nullable class02106 var1) {
      return var1 == null ? null : new class02123(var0, var1);
   }

   static class02106 N(class04654 var0) {
      return new class02109(var0);
   }
}
