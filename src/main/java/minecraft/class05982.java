package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.Supplier;

public abstract class class05982<E extends class00394> extends class07796 {
   protected final Supplier<class00404<? extends E>> B;

   protected class05982(class01362 var1, Supplier<class00404<? extends E>> var2) {
      super(var1);
      this.B = var2;
   }

   @Override
   protected abstract MapCodec<? extends class05982<E>> N();

   public abstract class06025<? extends class00379> N(class00500 var1, class07299 var2, class07209 var3, boolean var4);
}
