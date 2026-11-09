package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import org.jspecify.annotations.Nullable;

public interface class02145 {
   class07299 method_73183();

   @Nullable
   default class07438 Z() {
      ObjectArraySet objectarrayset = new ObjectArraySet();
      class07438 class07438x = this.L_();
      objectarrayset.add(this);

      while (class07438x instanceof class02145) {
         class02145 class02145 = (class02145)class07438x;
         class07438 class07438x = class02145.L_();
         if (objectarrayset.contains(class07438x)) {
            return null;
         }

         objectarrayset.add(class07438x);
         class07438x = class02145.L_();
      }

      return class07438x;
   }

   @Nullable
   class08372<class07438> NI();

   @Nullable
   default class07438 L_() {
      return class08372.y(this.NI(), this.method_73183());
   }
}
