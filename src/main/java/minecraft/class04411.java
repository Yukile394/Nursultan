package minecraft;

import com.google.common.collect.ImmutableMap;

public class class04411 extends class05765<class04067> {
   private static final int N = 60;
   private static final int y = 100;
   private int L;

   protected void L(class04782 var1, class04067 var2, long var3) {
      var2.method_18380(class01312.field_18076);
   }

   public class04411() {
      super(ImmutableMap.of(class05378.m, class05367.field_18457), 100);
   }

   protected void u(class04782 var1, class04067 var2, long var3) {
      this.L++;
   }

   protected void y(class04782 var1, class04067 var2, long var3) {
      if (!var2.method_52535()) {
         var2.method_18380(class01312.field_37422);
         this.L = 0;
      }
   }

   protected boolean N(class04782 var1, class04067 var2) {
      return var2.method_18376() == class01312.field_18076;
   }

   protected boolean N(class04782 var1, class04067 var2, long var3) {
      return this.L < 60;
   }
}
