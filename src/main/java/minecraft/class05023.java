package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class class05023 extends class04991<class05013> {
   protected class05023(class00538 var1) {
      super(class00772.field_9282, var1, new class05013(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int N(long var1) {
      long i = class01296.i(var1);
      class00536 class00536 = this.N(i, false);
      return class00536 == null
         ? 0
         : class00536.N(class01296.y(class07209.method_10061(var1)), class01296.y(class07209.method_10071(var1)), class01296.y(class07209.method_10083(var1)));
   }
}
