package minecraft;

import org.jspecify.annotations.Nullable;

public interface class05544 {
   class01894 N = class01894.y("recipes/root");

   static class01894 y(class07310 var0) {
      return class04206.B.y(var0.B());
   }

   class05544 y(String var1, class06915<?> var2);

   class05544 y(@Nullable String var1);

   void N(class03719 var1, class05946<class06521<?>> var2);

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static class03762 N(class01990 var0) {
      return switch (var0) {
         case field_40634 -> class03762.field_40248;
         case field_40638, field_40639 -> class03762.field_40250;
         case field_40636 -> class03762.field_40249;
         default -> class03762.field_40251;
      };
   }

   default void N(class03719 var1) {
      this.N(var1, class05946.N(class04227.yV, y(this.N())));
   }

   default void N(class03719 var1, String var2) {
      class01894 class01894x = y(this.N());
      class01894 class01894x = class01894.N(var2);
      if (class01894x.equals(class01894x)) {
         throw new IllegalStateException("Recipe " + var2 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.N(var1, class05946.N(class04227.yV, class01894x));
      }
   }

   class06581 N();
}
