package minecraft;

class class01462 extends class01435 {
   private final boolean L;
   protected final int N;
   private class03556<class07084> u;
   private class01894 i;

   public class01462(int var1, int var2, class03556<class07084> var3, boolean var4, int var5, int var6) {
      super(var2, var3);
      this.y = var1;
      this.L = var5;
      this.N = var6;
      this.N(var4);
   }

   protected class05216 y(class03556<class07084> var1) {
      return class00392.L(((class07084)var1.N()).R());
   }

   protected void N(class03556<class07084> var1) {
      this.u = var1;
      this.i = class01056.N(var1);
      this.method_47400(class04141.N(this.y(var1), null));
   }

   @Override
   public void N(int var1) {
      this.field_22763 = this.N < var1;
      this.N(this.u.equals(this.L ? this.y.G : this.y.l));
   }

   @Override
   protected void N(class01054 var1) {
      var1.N(class08394.Na, this.i, this.method_46426() + 2, this.method_46427() + 2, 18, 18);
   }

   @Override
   public void method_25306(class06611 var1) {
      if (!this.y()) {
         if (this.L) {
            this.y.G = this.u;
         } else {
            this.y.l = this.u;
         }

         this.y.N();
      }
   }

   @Override
   protected class05216 method_25360() {
      return this.y(this.u);
   }
}
