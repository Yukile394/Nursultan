package minecraft;

import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.model.FabricBlockModels;

@Environment(EnvType.CLIENT)
public class class03770 implements FabricBlockModels {
   private Map<class00500, class08887> N = Map.of();
   private final class00183 y;

   public class03770(class00183 var1) {
      super();
      this.y = var1;
   }

   public class08887 y(class00500 var1) {
      class08887 class08887 = this.N.get(var1);
      if (class08887 == null) {
         class08887 = this.y.N();
      }

      return class08887;
   }

   public class08388 N(class00500 var1) {
      return this.y(var1).method_68511();
   }

   public class00183 N() {
      return this.y;
   }

   public void N(Map<class00500, class08887> var1) {
      this.N = var1;
   }
}
