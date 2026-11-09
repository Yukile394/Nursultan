package minecraft;

import java.util.Optional;

public class class00837 {
   private Optional<class03543<class06581>> N = Optional.empty();
   private class00836 y = class00836.L;
   private class00142 L = class00142.N;

   public class00837() {
      super();
   }

   public class00845 y() {
      return new class00845(this.N, this.y, this.L);
   }

   public class00837 N(class00142 var1) {
      this.L = var1;
      return this;
   }

   public class00837 N(class00836 var1) {
      this.y = var1;
      return this;
   }

   public class00837 N(class02055<class06581> var1, class03530<class06581> var2) {
      this.N = Optional.of(var1.y(var2));
      return this;
   }

   public class00837 N(class02055<class06581> var1, class07310... var2) {
      this.N = Optional.of(class03543.N(var0 -> var0.B().i(), var2));
      return this;
   }

   public static class00837 N() {
      return new class00837();
   }
}
