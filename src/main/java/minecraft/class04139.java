package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.Optional;

public final class class04139<F extends K1, Value> {
   private final class01289<?> N;
   private final class05378<Value> y;
   private final App<F, Value> L;

   public class04139(class01289<?> var1, class05378<Value> var2, App<F, Value> var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public void y() {
      this.N.y(this.y);
   }

   public void N(Optional<Value> var1) {
      this.N.N(this.y, var1);
   }

   public void N(Value var1, long var2) {
      this.N.N(this.y, (Value)var1, var2);
   }

   public App<F, Value> N() {
      return this.L;
   }

   public void N(Value var1) {
      this.N.N(this.y, Optional.of((Value)var1));
   }
}
