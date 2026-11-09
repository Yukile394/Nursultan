package minecraft;

import com.google.common.collect.ImmutableMap;

public class class02141 extends class05765<class07079> {
   public static final int N = 100;
   private final class02135 y;
   private final class04891 L;

   protected void y(class04782 var1, class07079 var2, long var3) {
      if (var2.method_24828()) {
         var2.method_18799(var2.method_18798().u(0.1F, 1.0, 0.1F));
         var1.method_43129(null, var2, this.L, class04911.field_15254, 2.0F, 1.0F);
      }

      var2.method_35054(false);
      var2.method_18380(class01312.field_18076);
      var2.method_18868().y(class05378.C);
      var2.method_18868().N(class05378.f, this.y.N(var1.field_9229));
   }

   public class02141(class02135 var1, class04891 var2) {
      super(ImmutableMap.of(class05378.P, class05367.field_18458, class05378.C, class05367.field_18456), 100);
      this.y = var1;
      this.L = var2;
   }

   protected void u(class04782 var1, class07079 var2, long var3) {
      var2.method_35054(true);
      var2.method_18380(class01312.field_30095);
   }

   protected boolean N(class04782 var1, class07079 var2, long var3) {
      return !var2.method_24828();
   }
}
