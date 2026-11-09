package minecraft;

import com.mojang.datafixers.kinds.Const;
import com.mojang.datafixers.kinds.Const.Mu;
import com.mojang.datafixers.util.Unit;
import java.util.Optional;

public record class04104<Value>(class05378<Value> memory) implements class04109<Mu<Unit>, Value> {
   public class04104(class05378<Value> memory) {
      super();
      this.memory = memory;
   }

   @Override
   public class05367 y() {
      return class05367.field_18457;
   }

   @Override
   public class05378<Value> N() {
      return this.memory;
   }

   @Override
   public class04139<Mu<Unit>, Value> N(class01289<?> var1, Optional<Value> var2) {
      return var2.isPresent() ? null : new class04139<>(var1, this.memory, Const.create(Unit.INSTANCE));
   }
}
