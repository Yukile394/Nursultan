package minecraft;

import java.nio.file.Path;
import java.util.Optional;
import java.util.function.Supplier;

class class06696 extends class06691 {
   class06696(class06711 var1) {
      super(var1, class05715.field_19214, "chunk", "region", class06711.R, class06711.M);
      this.u = var1;
   }

   @Override
   protected boolean N(class06172 var1, class07321 var2, class05946<class07299> var3) {
      class07001 class07001xx = var1.u(var2).join().orElse(null);
      if (class07001xx != null) {
         int i = class07717.R(class07001xx);
         class08088 class08088 = this.u.B.B(class04227.y(var3)).y();
         class07001 class07001x = var1.N(class07001xx, -1, class06265.N(var3, class08088.L()));
         class07321 class07321 = new class07321(class07001x.y("xPos", 0), class07001x.y("zPos", 0));
         if (!class07321.equals(var2)) {
            class06711.N.warn("Chunk {} has invalid position {}", var2, class07321);
         }

         boolean flag = i < class07529.y().comp_4026().y();
         if (this.u.z) {
            flag = flag || class07001x.y("Heightmaps");
            class07001x.b("Heightmaps");
            flag = flag || class07001x.y("isLightOn");
            class07001x.b("isLightOn");
            class07741 class07741 = class07001x.s("sections");

            for (int j = 0; j < class07741.size(); j++) {
               Optional<class07001> optional = class07741.N(j);
               if (!optional.isEmpty()) {
                  class07001 class07001xx = optional.get();
                  flag = flag || class07001xx.y("BlockLight");
                  class07001xx.b("BlockLight");
                  flag = flag || class07001xx.y("SkyLight");
                  class07001xx.b("SkyLight");
               }
            }
         }

         if (flag || this.u.U) {
            if (this.N != null) {
               this.N.join();
            }

            this.N = var1.N(var2, class07001x);
            return true;
         }
      }

      return false;
   }

   @Override
   protected class06172 N(class02277 var1, Path var2) {
      Supplier<class06820> supplier = class05176.N(var1.y(), () -> this.u.G, this.u.W);
      return (class06172)(this.u.U
         ? new class02877(var1.N("source"), var2, var1.N("target"), class06711.N(var2), this.u.W, true, class05715.field_19214, supplier)
         : new class06172(var1, var2, this.u.W, true, class05715.field_19214, supplier));
   }
}
