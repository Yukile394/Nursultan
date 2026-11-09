package minecraft;

public class class05511 extends class08405 {
   protected final class00392 N;
   protected final int y;

   public class05511(class00392 var1, int var2) {
      super(var1.getString());
      this.N = var1;
      this.y = var2;
   }

   @Override
   public String getMessage() {
      return this.N().getString();
   }

   @Override
   public class00392 N() {
      return class00392.N("test.error.tick", this.N, this.y);
   }
}
