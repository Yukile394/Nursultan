package minecraft;

public class class01232 extends class05362 {
   private boolean N;

   public class01232(int var1, int var2, class05361 var3) {
      super(var1, var2, 20, 20, class00392.L("narrator.button.difficulty_lock"), var3, field_40754);
   }

   public boolean y() {
      return this.N;
   }

   public void N(boolean var1) {
      this.N = var1;
   }

   @Override
   public void method_75752(class01054 var1, int var2, int var3, float var4) {
      class01223 class01223;
      if (!this.field_22763) {
         class01223 = this.N ? class01223.field_2139 : class01223.field_2140;
      } else if (this.method_25367()) {
         class01223 = this.N ? class01223.field_2138 : class01223.field_2133;
      } else {
         class01223 = this.N ? class01223.field_2137 : class01223.field_2132;
      }

      var1.N(class08394.Na, class01223.field_45362, this.method_46426(), this.method_46427(), this.field_22758, this.field_22759);
   }

   @Override
   protected class05216 method_25360() {
      return class05220.N(
         super.method_25360(), this.y() ? class00392.L("narrator.button.difficulty_lock.locked") : class00392.L("narrator.button.difficulty_lock.unlocked")
      );
   }
}
