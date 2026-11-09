package minecraft;

import com.mojang.datafixers.util.Unit;
import org.jspecify.annotations.Nullable;

public class class04121<E> implements class04140<E, Unit> {
   public class04121(class04118 var1) {
      super();
      this.N = var1;
   }

   @Nullable
   public Unit N(class04782 var1, E var2, long var3) {
      return this.N.trigger(var1, var2, var3) ? Unit.INSTANCE : null;
   }

   @Override
   public String N() {
      return "T[" + this.N + "]";
   }
}
