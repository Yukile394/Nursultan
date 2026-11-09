package minecraft;

import java.util.Optional;

public class class01398 {
   private Optional<class03543<class04651>> N = Optional.empty();
   private Optional<class01400> y = Optional.empty();

   private class01398() {
      super();
   }

   public class01415 y() {
      return new class01415(this.N, this.y);
   }

   public class01398 N(class03543<class04651> var1) {
      this.N = Optional.of(var1);
      return this;
   }

   public class01398 N(class01400 var1) {
      this.y = Optional.of(var1);
      return this;
   }

   public static class01398 N() {
      return new class01398();
   }

   public class01398 N(class04651 var1) {
      this.N = Optional.of(class03543.N(var1.U()));
      return this;
   }
}
