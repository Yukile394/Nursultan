package minecraft;

import java.util.Collection;

class class03763 extends class05724<class03758> {
   public class03763(class06202 var1, Collection<class01055> var2, Collection var3) {
      super(var2, var1.field_22789, var1.N.u(), var1.N.L(), 33);

      for (class01055 class01055 : var3) {
         String s = class03794.N(class03794.M, class01055.i());
         if (!s.isEmpty()) {
            class00392 class00392 = class00390.N(class01055.y(), class00405.N.N(true));
            class05216 class05216 = class00392.N("selectWorld.experimental.details.entry", s);
            this.method_25321(new class03758(var1, class00392, class05216, class05482.N(class03790.N(var1), class05216, this.method_25322())));
         }
      }
   }

   @Override
   public int method_25322() {
      return this.field_22758 * 3 / 4;
   }
}
