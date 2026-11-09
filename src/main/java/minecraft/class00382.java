package minecraft;

public class class00382 extends class00394 {
   private static final int N = 0;
   private int y = 0;

   public class00382(class07209 var1, class00500 var2) {
      super(class00404.field_11908, var1, var2);
   }

   public void N(int var1) {
      this.y = var1;
   }

   public int N() {
      return this.y;
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.y = var1.N("OutputSignal", 0);
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      var1.N("OutputSignal", this.y);
   }
}
