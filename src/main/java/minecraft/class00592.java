package minecraft;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class00592<Value> {
   private final class06750<Value> N;
   @Nullable
   private Value y;
   private class06756<Value> L = class06756.N();
   private boolean u = false;
   private boolean i = true;
   private boolean R = false;

   public class00592<Value> L() {
      this.R = true;
      return this;
   }

   public class00592(class06750<Value> var1) {
      super();
      this.N = var1;
   }

   public class00607<Value> u() {
      return new class00607<>(this.N, Objects.requireNonNull(this.y, "Missing default value"), this.L, this.u, this.i, this.R);
   }

   public class00592<Value> y() {
      this.i = false;
      return this;
   }

   public class00592<Value> N() {
      this.u = true;
      return this;
   }

   public class00592<Value> N(Value var1) {
      this.y = (Value)var1;
      return this;
   }

   public class00592<Value> N(class06756<Value> var1) {
      this.L = var1;
      return this;
   }
}
