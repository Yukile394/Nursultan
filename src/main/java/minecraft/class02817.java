package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;

public record class02817(List<class02298> knownPacks) implements class00381<class01656> {
   public static final class02362<ByteBuf, class02817> N = class02362.N(class02298.N.N_33(class02389.N()), class02817::N, class02817::new);

   public class02817(List<class02298> knownPacks) {
      this.knownPacks = knownPacks;
   }

   public void method_65081(class01656 var1) {
      var1.N(this);
   }

   public List<class02298> N() {
      return this.knownPacks;
   }

   @Override
   public class02897<class02817> method_65080() {
      return class02867.i;
   }
}
