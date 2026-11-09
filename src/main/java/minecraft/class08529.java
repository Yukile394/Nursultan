package minecraft;

import org.jspecify.annotations.Nullable;

public interface class08529 extends class08512 {
   boolean u = true;
   class00140 i = class00140.field_21859;

   static class00140 L(class08529 var0) {
      while (var0 != null) {
         class00140 class00140 = var0.N().comp_3740();
         if (class00140 != null) {
            return class00140;
         }

         var0 = var0.y();
      }

      return i;
   }

   default class08534 M() {
      return u(this);
   }

   default class08838 B() {
      return N(this);
   }

   static class03702 i(class08529 var0) {
      class03265 class03265xxxxxxxx = N(var0, class03662.field_4323);
      class03265 class03265x = N(var0, class03662.field_4320);
      class03265 class03265xx = N(var0, class03662.field_4321);
      class03265 class03265xxx = N(var0, class03662.field_4322);
      class03265 class03265xxxx = N(var0, class03662.field_4316);
      class03265 class03265xxxxx = N(var0, class03662.field_4317);
      class03265 class03265xxxxxx = N(var0, class03662.field_4318);
      class03265 class03265xxxxxxx = N(var0, class03662.field_4319);
      class03265 class03265xxxxxxxx = N(var0, class03662.field_61988);
      return new class03702(
         class03265xxxxxxxx, class03265x, class03265xx, class03265xxx, class03265xxxx, class03265xxxxx, class03265xxxxxx, class03265xxxxxxx, class03265xxxxxxxx
      );
   }

   default class00140 i() {
      return L(this);
   }

   static class08534 u(class08529 var0) {
      while (var0 != null) {
         class08534 class08534 = var0.N().comp_3739();
         if (class08534 != null) {
            return class08534;
         }

         var0 = var0.y();
      }

      return class08534.N;
   }

   default boolean u() {
      return y(this);
   }

   @Nullable
   class08529 y();

   static boolean y(class08529 var0) {
      while (var0 != null) {
         Boolean obool = var0.N().comp_3741();
         if (obool != null) {
            return obool;
         }

         var0 = var0.y();
      }

      return true;
   }

   default class08388 N(class08838 var1, class02028 var2) {
      return N(var1, var2, this);
   }

   static class03265 N(class08529 var0, class03662 var1) {
      while (var0 != null) {
         class03702 class03702 = var0.N().comp_3742();
         if (class03702 != null) {
            class03265 class03265 = class03702.N(var1);
            if (class03265 != class03265.N) {
               return class03265;
            }
         }

         var0 = var0.y();
      }

      return class03265.N;
   }

   class00167 N();

   static class08838 N(class08529 var0) {
      class08529 class08529 = var0;

      class08812 class08812;
      for (class08812 = new class08812(); class08529 != null; class08529 = class08529.y()) {
         class08812.N(class08529.N().comp_3743());
      }

      return class08812.N(var0);
   }

   default class08496 N(class08838 var1, class02028 var2, class04673 var3) {
      return this.M().bake(var1, var2, var3, this);
   }

   static class08388 N(class08838 var0, class02028 var1, class08512 var2) {
      return var1.y().N(var0, "particle", var2);
   }

   default class03702 R() {
      return i(this);
   }
}
