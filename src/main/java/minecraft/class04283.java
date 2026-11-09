package minecraft;

import java.util.stream.Stream;

public class class04283 implements class00211, class00226 {
   static final class00211 N = Stream::empty;
   static final class00226 y = Stream::empty;
   private final class00211 L;
   private final class00226 u;
   private final class07701 i;

   class04283(class07701 var1, class00211 var2, class00226 var3) {
      super();
      this.i = var1;
      this.L = var2;
      this.u = var3;
   }

   public class07701 y() {
      return this.i;
   }

   public static class04249 N() {
      return new class04249();
   }

   @Override
   public Stream<class07209> findTestPos() {
      return this.u.findTestPos();
   }

   @Override
   public Stream<class03529<class00201>> findTests() {
      return this.L.findTests();
   }
}
