package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

interface class03871 extends class03877 {
   Logger N = LogUtils.getLogger();

   @Override
   default class03979<? extends class03877> L() {
      return this.u().field_37111;
   }

   class03877 i();

   class03892 u();

   static class03871 N(class03892 var0, class03877 var1, class03877 var2) {
      double d0 = var1.N();
      double d1 = var2.N();
      double d2 = var1.y();
      double d3 = var2.y();
      if (var0 == class03892.field_36546 || var0 == class03892.field_36547) {
         boolean flag = d0 >= d3;
         boolean flag1 = d1 >= d2;
         if (flag || flag1) {
            N.warn("Creating a {} function between two non-overlapping inputs: {} and {}", new Object[]{var0, var1, var2});
         }
      }
      double d5 = switch (var0) {
         case field_36544 -> d0 + d1;
         case field_36545 -> d0 > 0.0 && d1 > 0.0 ? d0 * d1 : (d2 < 0.0 && d3 < 0.0 ? d2 * d3 : Math.min(d0 * d3, d2 * d1));
         case field_36546 -> Math.min(d0, d1);
         case field_36547 -> Math.max(d0, d1);
      };

      double d4 = switch (var0) {
         case field_36544 -> d2 + d3;
         case field_36545 -> d0 > 0.0 && d1 > 0.0 ? d2 * d3 : (d2 < 0.0 && d3 < 0.0 ? d0 * d1 : Math.max(d0 * d1, d2 * d3));
         case field_36546 -> Math.min(d2, d3);
         case field_36547 -> Math.max(d2, d3);
      };
      if (var0 == class03892.field_36545 || var0 == class03892.field_36544) {
         if (var1 instanceof class03879 class03879) {
            return new class03901(var0 == class03892.field_36544 ? class03907.field_36569 : class03907.field_36568, var2, d5, d4, class03879.u());
         }

         if (var2 instanceof class03879 class03879x) {
            return new class03901(var0 == class03892.field_36544 ? class03907.field_36569 : class03907.field_36568, var1, d5, d4, class03879x.u());
         }
      }

      return new class03913(var0, var1, var2, d5, d4);
   }

   class03877 W();
}
