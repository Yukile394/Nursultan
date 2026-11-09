package minecraft;

import java.util.Optional;

public class class00764 {
   private class00816 N = class00816.L;
   private class00816 y = class00816.L;
   private Optional<class00821> L = Optional.empty();
   private Optional<Boolean> u = Optional.empty();
   private Optional<class00759> i = Optional.empty();

   public class00764() {
      super();
   }

   public class00798 y() {
      return new class00798(this.N, this.y, this.L, this.u, this.i);
   }

   public class00764 y(class00816 var1) {
      this.y = var1;
      return this;
   }

   public class00764 N(class00821 var1) {
      this.L = Optional.of(var1);
      return this;
   }

   public class00764 N(class00789 var1) {
      this.i = Optional.of(var1.y());
      return this;
   }

   public class00764 N(class00759 var1) {
      this.i = Optional.of(var1);
      return this;
   }

   public class00764 N(Boolean var1) {
      this.u = Optional.of(var1);
      return this;
   }

   public static class00764 N() {
      return new class00764();
   }

   public class00764 N(class00816 var1) {
      this.N = var1;
      return this;
   }
}
