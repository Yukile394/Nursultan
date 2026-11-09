package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

class class03992 implements class03481 {
   private static final int y = 16;
   private final class01190 L;

   @Override
   public boolean L() {
      return true;
   }

   class03992(class04003 var1) {
      super();
      this.N = var1;
      this.L = new class01177(this.N, this.N.method_5751());
   }

   @Override
   public class01190 y() {
      return this.L;
   }

   @Override
   public boolean N(class04782 var1, class07209 var2, class03556<class01194> var3, class01164 var4) {
      return !this.N.Nt() && !this.N.method_29504() && !this.N.method_18868().N(class05378.Nf) && !this.N.M() && var1.method_8621().N(var2)
         ? !(var4.N() instanceof class07438 class07438 && !this.N.L(class07438))
         : false;
   }

   @Override
   public void N(class04782 var1, class07209 var2, class03556<class01194> var3, @Nullable class07049 var4, @Nullable class07049 var5, float var6) {
      if (!this.N.method_29504()) {
         class04003.N(this.N).N(class05378.Nf, class06244.field_17274, 40L);
         var1.method_8421(this.N, (byte)61);
         this.N.method_5783(class04909.Ij, 5.0F, this.N.method_6017());
         class07209 class07209 = var2;
         if (var5 != null) {
            if (this.N.method_24516(var5, 30.0)) {
               if (this.N.method_18868().N(class05378.Ne)) {
                  if (this.N.L(var5)) {
                     class07209 = var5.method_24515();
                  }

                  this.N.i(var5);
               } else {
                  this.N.N(var5, 10, true);
               }
            }

            this.N.method_18868().N(class05378.Ne, class06244.field_17274, 100L);
         } else {
            this.N.i(var4);
         }

         if (!this.N.W().u()) {
            Optional<class07438> optional = this.N.M.N();
            if (var5 != null || optional.isEmpty() || optional.get() == var4) {
               class03984.N(this.N, class07209);
            }
         }
      }
   }

   @Override
   public int N() {
      return 16;
   }

   @Override
   public class03530<class01194> R() {
      return class06370.y;
   }
}
