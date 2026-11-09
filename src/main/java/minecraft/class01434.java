package minecraft;

import java.util.Optional;

public class class01434 implements class01407 {
   private final class01422 N = class01407.N(new class02579(1536));
   private int y = -1;

   public class01434() {
      super();
   }

   public void N() {
      this.N.u();
   }

   public void N(int var1) {
      this.y = var1;
   }

   @Override
   public class01391 method_73477(class07311 var1) {
      if (var1.method_24295()) {
         class01391 class01391 = this.N.method_73477(var1);
         return new class01456(class01391, this.y);
      } else {
         Optional<class07311> optional = var1.method_23289();
         if (optional.isPresent()) {
            class01391 class01391x = this.N.method_73477(optional.get());
            return new class01456(class01391x, this.y);
         } else {
            throw new IllegalStateException("Can't render an outline for this rendertype!");
         }
      }
   }
}
