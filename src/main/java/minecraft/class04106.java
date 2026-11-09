package minecraft;

import com.mojang.datafixers.kinds.OptionalBox;
import com.mojang.datafixers.kinds.OptionalBox.Mu;
import java.util.Optional;

public record class04106<Value>(class05378<Value> memory) implements class04109<Mu, Value> {
   public class04106(class05378<Value> memory) {
      this.memory = memory;
   }

   @Override
   public class05367 y() {
      return class05367.field_18458;
   }

   @Override
   public class05378<Value> N() {
      return this.memory;
   }

   @Override
   public class04139<Mu, Value> N(class01289<?> var1, Optional<Value> var2) {
      return new class04139<>(var1, this.memory, OptionalBox.create(var2));
   }
}
