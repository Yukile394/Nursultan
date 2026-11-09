package minecraft;

import java.util.Set;

class class01805 implements class01455 {
   class01805(class03194 var1, Set var2, class05974 var3) {
      super();
      this.N = var2;
      this.y = var3;
   }

   @Override
   public void N(class07209 var1, class00500 var2) {
      this.N.add(var1.method_10062());
      this.y.method_8652(var1, var2, 19);
   }

   @Override
   public boolean N(class07209 var1) {
      return this.N.contains(var1);
   }
}
