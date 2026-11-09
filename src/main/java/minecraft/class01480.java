package minecraft;

class class01480 extends class01462 {
   public class01480(int var1, int var2, class03556<class07084> var3, class03556 var4) {
      super((int)var1, var2, var3, (boolean)var4, false, 3);
      this.L = var1;
   }

   @Override
   protected class05216 y(class03556<class07084> var1) {
      return class00392.L(((class07084)var1.N()).R()).i(" II");
   }

   @Override
   public void N(int var1) {
      if (this.L.G != null) {
         this.field_22764 = true;
         this.N(this.L.G);
         super.N(var1);
      } else {
         this.field_22764 = false;
      }
   }
}
