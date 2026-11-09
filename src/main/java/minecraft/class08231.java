package minecraft;

import Nursultan.class10883;
import com.mojang.blaze3d.shaders.ShaderType;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;

class class08231 implements AutoCloseable {
   private final class08204 u;
   final Map<class01894, Optional<class08086>> N;
   boolean y;

   class08231(class08212 var1, class08204 var2) {
      super();
      this.L = var1;
      this.N = new HashMap<>();
      this.u = var2;
   }

   @Override
   public void close() {
      this.N.values().forEach(var0 -> var0.ifPresent(class08086::close));
      this.N.clear();
   }

   private class08086 y(class01894 var1, Set<class01894> var2) throws class10883 {
      class02414 class02414 = this.u.y().get(var1);
      if (class02414 == null) {
         throw new class10883("Could not find post chain with id: " + var1);
      } else {
         return class08086.N(class02414, this.L.u, var2, var1, this.L.i);
      }
   }

   @Nullable
   public String N(class01894 var1, ShaderType var2) {
      return this.u.N().get(new class08205(var1, var2));
   }

   @Nullable
   public class08086 N(class01894 var1, Set<class01894> var2) throws class10883 {
      Optional<class08086> optional = this.N.get(var1);
      if (optional != null) {
         return optional.orElse(null);
      } else {
         class08086 class08086 = this.y(var1, var2);
         this.N.put(var1, Optional.of(class08086));
         return class08086;
      }
   }
}
