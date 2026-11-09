package minecraft;

class class02399<T> implements class02362<class04247, class03556<T>> {
   private static final int L = 0;

   class02399(class05946 var1, class02362 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   private class00750<class03556<T>> y(class04247 var1) {
      return var1.J().<T>L(this.N).v();
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void encode(class04247 var1, class03556<T> var2) {
      switch (var2.R()) {
         case field_36446:
            int i = this.y(var1).L(var2);
            class01657.N(var1, i + 1);
            break;
         case field_36447:
            class01657.N(var1, 0);
            this.y.encode(var1, var2.N());
      }
   }

   public class03556<T> decode(class04247 var1) {
      int i = class01657.N(var1);
      return i == 0 ? class03556.N((T)this.y.decode(var1)) : this.y(var1).y(i - 1);
   }
}
