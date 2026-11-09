package minecraft;

class class04281 implements class02362<class04247, class07346> {
   class04281(class04259 var1, class02362 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class07346 decode(class04247 var1) {
      if (!this.N.method_68733()) {
         throw new class00158("Not in creative mode");
      } else {
         return (class07346)this.y.decode(var1);
      }
   }

   public void encode(class04247 var1, class07346 var2) {
      if (!this.N.method_68733()) {
         throw new class00636("Not in creative mode");
      } else {
         this.y.encode(var1, var2);
      }
   }
}
