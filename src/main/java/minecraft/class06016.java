package minecraft;

import java.util.Optional;
import java.util.OptionalInt;

public class class06016 {
   private OptionalInt N = OptionalInt.empty();
   private Optional<Integer> y = Optional.empty();
   private Optional<Integer> L = Optional.empty();
   private Optional<Integer> u = Optional.empty();
   private class06009 i = class06009.field_26426;

   public class06016 L(int var1) {
      this.L = Optional.of(var1);
      return this;
   }

   public class06016() {
      super();
   }

   public class06016 u(int var1) {
      this.u = Optional.of(var1);
      return this;
   }

   public class06016 y(int var1) {
      this.y = Optional.of(var1);
      return this;
   }

   public class06016 N(class06009 var1) {
      this.i = var1;
      return this;
   }

   public class05987 N() {
      return new class05987(this.N.orElseThrow(() -> new IllegalStateException("Missing 'water' color.")), this.y, this.L, this.u, this.i);
   }

   public class06016 N(int var1) {
      this.N = OptionalInt.of(var1);
      return this;
   }
}
