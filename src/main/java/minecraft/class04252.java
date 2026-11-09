package minecraft;

import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface class04252 {
   class04252 N = (var0, var1, var2) -> {};
   class04252 y = (var0, var1, var2) -> {
      float f = 170.0F + var2.z() * 20.0F;
      var0.method_18799(var0.method_18798().L(-0.5));
      var0.method_36456(var0.method_36454() + f);
      var0.field_5982 += f;
      var0.field_64356 = true;
   };
   class04252 L = (var0, var1, var2) -> {
      if (var1 != null) {
         class06889 class06889 = var1.method_5720();
         var0.method_18799(class06889);
         var0.field_64356 = true;
      }
   };
   class04252 u = (var0, var1, var2) -> {
      if (var1 != null) {
         class06889 class06889 = var1.method_18798().u();
         var0.method_18799(class06889);
         var0.field_64356 = true;
      }
   };

   void deflect(class08005 var1, @Nullable class07049 var2, class06069 var3);
}
