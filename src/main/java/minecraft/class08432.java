package minecraft;

public class class08432 extends class08405 {
   private final Throwable N;

   public class08432(Throwable var1) {
      super(var1.getMessage());
      this.N = var1;
   }

   @Override
   public class00392 N() {
      return class00392.N("test.error.unknown", this.N.getMessage());
   }
}
