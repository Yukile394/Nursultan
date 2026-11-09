package minecraft;

import java.util.List;

class class02865 implements class04262 {
   class02865(class00648 var1, class00423 var2, List var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public class00423 y() {
      return this.y;
   }

   @Override
   public class00648 N() {
      return this.N;
   }

   @Override
   public void N(class04291 var1) {
      for (int i = 0; i < this.L.size(); i++) {
         class02898 class02898 = (class02898)this.L.get(i);
         var1.accept(class02898.N(), i);
      }
   }
}
