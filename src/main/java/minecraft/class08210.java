package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.function.UnaryOperator;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;

class class08210 extends class02770 {
   private final Set<class01894> L;

   class08210(class01894 var1, Map var2) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = new ObjectArraySet();
   }

   @Nullable
   @Override
   public String N(boolean var1, String var2) {
      class01894 class01894;
      try {
         if (var1) {
            class01894 = this.N.N((UnaryOperator<String>)(var1x -> class06290.u(var1x + var2)));
         } else {
            class01894 = class01894.N(var2).R("shaders/include/");
         }
      } catch (class00719 class00719) {
         class08212.N.error("Malformed GLSL import {}: {}", var2, class00719.getMessage());
         return "#error " + class00719.getMessage();
      }

      if (!this.L.add(class01894)) {
         return null;
      } else {
         try {
            String s;
            try (BufferedReader bufferedreader = ((class01079)this.y.get(class01894)).method_43039()) {
               s = IOUtils.toString(bufferedreader);
            }

            return s;
         } catch (IOException ioexception) {
            class08212.N.error("Could not open GLSL import {}: {}", class01894, ioexception.getMessage());
            return "#error " + ioexception.getMessage();
         }
      }
   }
}
