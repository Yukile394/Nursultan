package minecraft;

public class class05906 {
   private static final int y = -1;
   private int L;

   public class05906(class05882 var1) {
      super();
      this.N = var1;
      this.L = -1;
   }

   void N(int var1) {
      if (this.L != -1) {
         throw new IllegalStateException("Condition already triggered at " + this.L);
      } else {
         this.L = var1;
      }
   }

   public void N() {
      int i = this.N.N.s();
      if (this.L != i) {
         if (this.L == -1) {
            throw new class05511(class00392.L("test.error.sequence.condition_not_triggered"), i);
         } else {
            throw new class05511(class00392.N("test.error.sequence.condition_already_triggered", this.L), i);
         }
      }
   }
}
