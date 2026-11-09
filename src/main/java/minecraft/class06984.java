package minecraft;

import Nursultan.class10875;

public interface class06984 extends class08152 {
   @Deprecated
   class06984 N = y(class08195.field_63196);
   class06984 y = y(class08195.field_63197);
   class06984 L = y(class08195.field_63198);
   class06984 u = y(class08195.field_63199);
   class06984 i = y(class08195.field_63200);

   private static class06984 y(class08195 var0) {
      return new class10875(var0);
   }

   class08195 N();

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   static class06984 N(class08195 var0) {
      return switch (var0) {
         case field_63196 -> N;
         case field_63197 -> y;
         case field_63198 -> L;
         case field_63199 -> u;
         case field_63200 -> i;
      };
   }

   @Override
   default class08152 N(class08152 var1) {
      if (var1 instanceof class06984 class06984) {
         return this.N().N(class06984.N()) ? class06984 : this;
      } else {
         return class08152.super.N(var1);
      }
   }

   @Override
   default boolean hasPermission(class08159 var1) {
      if (var1 instanceof class08179 class08179) {
         return this.N().N(class08179.y());
      } else {
         return var1.equals(class08162.i) ? this.N().N(class08195.field_63198) : false;
      }
   }
}
