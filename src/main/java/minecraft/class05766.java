package minecraft;

import com.google.common.collect.ImmutableMap;

public class class05766 extends class05765<class08041> {
   private final float N;

   protected void L(class04782 var1, class08041 var2, long var3) {
      class01289<class08041> class01289 = var2.method_18868();
      class01289.y(class05378.m);
      class01289.y(class05378.P);
   }

   public class05766(float var1) {
      super(ImmutableMap.of(class05378.m, class05367.field_18458, class05378.P, class05367.field_18458), Integer.MAX_VALUE);
      this.N = var1;
   }

   protected void u(class04782 var1, class08041 var2, long var3) {
      this.N(var2);
   }

   protected void y(class04782 var1, class08041 var2, long var3) {
      this.N(var2);
   }

   protected boolean N(class04782 var1, class08041 var2) {
      class08036 class08036 = var2.N();
      return var2.method_5805() && class08036 != null && !var2.method_5799() && !var2.field_6037 && var2.method_5858(class08036) <= 16.0;
   }

   @Override
   protected boolean N(long var1) {
      return false;
   }

   private void N(class08041 var1) {
      class01289<class08041> class01289 = var1.method_18868();
      class01289.N(class05378.m, new class05352(new class05751(var1.N(), false), this.N, 2));
      class01289.N(class05378.P, new class05751(var1.N(), true));
   }

   protected boolean N(class04782 var1, class08041 var2, long var3) {
      return this.N(var1, var2);
   }
}
