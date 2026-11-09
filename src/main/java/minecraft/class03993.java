package minecraft;

import com.google.common.collect.ImmutableMap;

public class class03993<E extends class04003> extends class05765<E> {
   protected void y(class04782 var1, E var2, long var3) {
      if (var2.method_35049() == null) {
         var2.method_5650(class07062.field_26999);
      }
   }

   public class03993(int var1) {
      super(ImmutableMap.of(class05378.s, class05367.field_18457, class05378.m, class05367.field_18457), var1);
   }

   protected void u(class04782 var1, E var2, long var3) {
      if (var2.method_24828()) {
         var2.method_18380(class01312.field_38100);
         var2.method_5783(class04909.Ii, 5.0F, 1.0F);
      } else {
         var2.method_5783(class04909.gr, 5.0F, 1.0F);
         this.y(var1, (E)var2, var3);
      }
   }

   protected boolean N(class04782 var1, E var2) {
      return var2.method_24828() || var2.method_5799() || var2.method_5771();
   }

   protected boolean N(class04782 var1, E var2, long var3) {
      return var2.method_35049() == null;
   }
}
