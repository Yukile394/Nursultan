package minecraft;

import com.google.common.collect.ImmutableMap;

public class class05770 extends class05765<class07079> {
   protected void L(class04782 var1, class07079 var2, long var3) {
      var2.method_18868().L(class05378.P).ifPresent(var1x -> var2.p().N(var1x.N()));
   }

   public class05770(int var1, int var2) {
      super(ImmutableMap.of(class05378.P, class05367.field_18456), var1, var2);
   }

   protected void y(class04782 var1, class07079 var2, long var3) {
      var2.method_18868().y(class05378.P);
   }

   protected boolean N(class04782 var1, class07079 var2, long var3) {
      return var2.method_18868().L(class05378.P).filter(var1x -> var1x.N(var2)).isPresent();
   }
}
