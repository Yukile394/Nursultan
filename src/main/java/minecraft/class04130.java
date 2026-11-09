package minecraft;

import com.mojang.datafixers.kinds.IdF;
import com.mojang.datafixers.kinds.IdF.Mu;
import java.util.Optional;

public record class04130<Value>(class05378<Value> memory) implements class04109<Mu, Value> {
   public class04130(class05378<Value> memory) {
      super();
      this.memory = memory;
   }

   @Override
   public class05367 y() {
      return class05367.field_18456;
   }

   @Override
   public class05378<Value> N() {
      return this.memory;
   }

   @Override
   public class04139<Mu, Value> N(class01289<?> var1, Optional<Value> var2) {
      return var2.isEmpty() ? null : new class04139<>(var1, this.memory, IdF.create(var2.get()));
   }
}
