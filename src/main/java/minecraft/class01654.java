package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;

public record class01654(class05946<? extends class00751<?>> registry, List<class02017> entries) implements class00381<class01656> {
   private static final class02362<ByteBuf, class05946<? extends class00751<?>>> u = class01894.y.N_10(class05946::N, class05946::N);
   public static final class02362<class00667, class01654> N = class02362.N(u, class01654::N, class02017.N.N_33(class02389.N()), class01654::y, class01654::new);

   public class01654(class05946<? extends class00751<?>> registry, List<class02017> entries) {
      this.registry = registry;
      this.entries = entries;
   }

   public List<class02017> y() {
      return this.entries;
   }

   public void method_65081(class01656 var1) {
      var1.N(this);
   }

   public class05946<? extends class00751<?>> N() {
      return this.registry;
   }

   @Override
   public class02897<class01654> method_65080() {
      return class02867.L;
   }
}
