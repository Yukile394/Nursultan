package minecraft;

import java.util.UUID;

class class00233 implements class03802 {
   class00233(class00642 var1) {
      super();
      this.N = var1;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void N(UUID var1, class03849 var2) {
      class00232.N.debug("Pack {} changed status to {}", var1, var2);

      class07369 class07369 = switch (var2) {
         case field_47699 -> class07369.field_13016;
         case field_47700 -> class07369.field_47704;
      };
      this.N.method_10743(new class07367(var1, class07369));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void N(UUID var1, class03824 var2) {
      class00232.N.debug("Pack {} changed status to {}", var1, var2);

      class07369 class07369 = switch (var2) {
         case field_47624 -> class07369.field_13017;
         case field_47626 -> class07369.field_13015;
         case field_47623 -> class07369.field_13018;
         case field_47625 -> class07369.field_47669;
         case field_47627 -> class07369.field_47668;
      };
      this.N.method_10743(new class07367(var1, class07369));
   }
}
