package minecraft;

abstract class class01435 extends class06308 implements class01450 {
   private boolean N;

   protected class01435(int var1, int var2) {
      super(var1, var2, 22, 22, class05220.N);
   }

   protected class01435(int var1, int var2, class00392 var3) {
      super(var1, var2, 22, 22, var3);
   }

   public boolean y() {
      return this.N;
   }

   public void N(boolean var1) {
      this.N = var1;
   }

   protected abstract void N(class01054 var1);

   @Override
   public void method_75752(class01054 var1, int var2, int var3, float var4) {
      class01894 class01894;
      if (!this.field_22763) {
         class01894 = class01454.N;
      } else if (this.N) {
         class01894 = class01454.y;
      } else if (this.method_25367()) {
         class01894 = class01454.L;
      } else {
         class01894 = class01454.u;
      }

      var1.N(class08394.Na, class01894, this.method_46426(), this.method_46427(), this.field_22758, this.field_22759);
      this.N(var1);
   }

   @Override
   public void method_47399(class03428 var1) {
      this.method_37021(var1);
   }
}
