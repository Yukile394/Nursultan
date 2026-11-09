package minecraft;

import java.util.ArrayList;

public class class01230 extends class01209 {
   public class01230(class01224 var1, class07001 var2) {
      super(
         class04878.r,
         var2,
         var1,
         var1x -> N(var2.<class07111>N_15("Mi", class07111.field_56669).orElseThrow(), var2.<class06993>N_15("Rot", class06993.field_56670).orElseThrow())
      );
   }

   public class01230(class01224 var1, String var2, class07209 var3, class06993 var4, class07111 var5) {
      super(class04878.r, 0, var1, N(var2), var2, N(var5, var4), var3);
   }

   public class01230(class01224 var1, String var2, class07209 var3, class06993 var4) {
      this(var1, var2, var3, var4, class07111.field_11302);
   }

   @Override
   protected void N(class03298 var1, class07001 var2) {
      super.N(var1, var2);
      var2.N("Rot", class06993.field_56670, this.L.u());
      var2.N("Mi", class07111.field_56669, this.L.L());
   }

   @Override
   protected void N(String var1, class07209 var2, class01001 var3, class06069 var4, class05163 var5) {
      if (var1.startsWith("Chest")) {
         class06993 class06993 = this.L.u();
         class00500 class00500 = class00869.LA.W();
         if ("ChestWest".equals(var1)) {
            class00500 = class00500.y(class00860.u, class06993.N(class07211.field_11039));
         } else if ("ChestEast".equals(var1)) {
            class00500 = class00500.y(class00860.u, class06993.N(class07211.field_11034));
         } else if ("ChestSouth".equals(var1)) {
            class00500 = class00500.y(class00860.u, class06993.N(class07211.field_11035));
         } else if ("ChestNorth".equals(var1)) {
            class00500 = class00500.y(class00860.u, class06993.N(class07211.field_11043));
         }

         this.N(var3, var5, var4, var2, class06273.Q, class00500);
      } else {
         ArrayList arraylist = new ArrayList();
         switch (var1) {
            case "Mage":
               arraylist.add(class07078.x.N(var3.method_8410(), class06113.field_16474));
               break;
            case "Warrior":
               arraylist.add(class07078.yH.N(var3.method_8410(), class06113.field_16474));
               break;
            case "Group of Allays":
               int i = var3.method_8409().y(3) + 1;

               for (int j = 0; j < i; j++) {
                  arraylist.add(class07078.i.N(var3.method_8410(), class06113.field_16474));
               }
               break;
            default:
               return;
         }

         for (class07079 class07079 : arraylist) {
            if (class07079 != null) {
               class07079.NW();
               class07079.method_5725(var2, 0.0F, 0.0F);
               class07079.N(var3, var3.method_8404(class07079.method_24515()), class06113.field_16474, null);
               var3.y(class07079);
               var3.method_8652(var2, class00869.N.W(), 2);
            }
         }
      }
   }

   private static class01233 N(class07111 var0, class06993 var1) {
      return new class01233().N(true).N(var1).N(var0).N(class05282.y);
   }

   private static class01894 N(String var0) {
      return class01894.y("woodland_mansion/" + var0);
   }

   @Override
   protected class01894 N() {
      return N(this.N);
   }
}
