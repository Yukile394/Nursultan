package minecraft;

import com.mojang.serialization.Codec;

public class class00607<Value> {
   private final class06750<Value> y;
   private final Value L;
   private final class06756<Value> u;
   public boolean N;
   private final boolean i;
   private final boolean R;

   public Codec<Value> L() {
      return this.y.N().validate(this.u::N);
   }

   class00607(class06750<Value> var1, Value var2, class06756<Value> var3, boolean var4, boolean var5, boolean var6) {
      super();
      this.y = var1;
      this.L = (Value)var2;
      this.u = var3;
      this.N = var4;
      this.i = var5;
      this.R = var6;
   }

   @Override
   public String toString() {
      return class07536.N(class04206.Nc, this);
   }

   public boolean i() {
      return this.i;
   }

   public boolean u() {
      return this.N;
   }

   public Value y() {
      return this.L;
   }

   public Value N(Value var1) {
      return this.u.y((Value)var1);
   }

   public class06750<Value> N() {
      return this.y;
   }

   public static <Value> class00592<Value> N(class06750<Value> var0) {
      return new class00592<>(var0);
   }

   public boolean R() {
      return this.R;
   }
}
