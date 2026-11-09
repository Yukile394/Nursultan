package minecraft;

public class class07878 extends RuntimeException {
   private final class07080 N;

   public class07878(class07080 var1) {
      super();
      this.N = var1;
   }

   @Override
   public Throwable getCause() {
      return this.N.y();
   }

   @Override
   public String getMessage() {
      return this.N.N();
   }

   public class07080 N() {
      return this.N;
   }
}
