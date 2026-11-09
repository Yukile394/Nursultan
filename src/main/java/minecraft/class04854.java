package minecraft;

import org.jspecify.annotations.Nullable;

public interface class04854 extends class07172 {
   @Nullable
   class07438 T();

   void m();

   default void y(class07438 var1, float var2) {
      class07050 class07050 = class08038.N(var1, class06570.dw);
      class06584 class06584 = var1.method_5998(class07050);
      class06581 class06581 = class06584.B();
      if (class06581 instanceof class06593) {
         ((class06593)class06581).N(var1.method_73183(), var1, class07050, class06584, var2, 14 - var1.method_73183().y().N() * 4, this.T());
      }

      this.m();
   }

   void N(boolean var1);
}
