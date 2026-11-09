package minecraft;

import java.util.function.Function;

class class02401<R> implements class02362<class04247, R> {
   class02401(Function var1, class05946 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   private class00750<R> y(class04247 var1) {
      return (class00750<R>)this.N.apply(var1.J().L(this.y));
   }

   public void encode(class04247 var1, R var2) {
      int i = this.y(var1).L((R)var2);
      class01657.N(var1, i);
   }

   public R decode(class04247 var1) {
      int i = class01657.N(var1);
      return this.y(var1).y(i);
   }
}
