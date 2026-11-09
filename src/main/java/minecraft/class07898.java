package minecraft;

import java.util.Iterator;

class class07898 extends class07952<class08036> {
   public class07898(class07869 var1) {
      super(var1, class08036.class, 20, true, true, null);
      this.Z = var1;
   }

   @Override
   protected double Z() {
      return super.Z() * 0.5;
   }

   @Override
   public boolean N() {
      if (this.Z.method_6109()) {
         return false;
      } else {
         if (super.N()) {
            Iterator<class07869> iterator = this.Z.method_73183().N(class07869.class, this.Z.method_5829().L(8.0, 4.0, 8.0)).iterator();

            while (iterator.hasNext()) {
               if (iterator.next().method_6109()) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
