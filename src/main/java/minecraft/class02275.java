package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.List;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;

public record class02275(List<class02298> knownPacks) implements class00381<class01667> {
   public static final class02362<ByteBuf, class02275> N = class02362.N(class02298.N.N_33(class02389.L(N(64))), class02275::N, class02275::new);

   public class02275(List<class02298> knownPacks) {
      super();
      this.knownPacks = knownPacks;
   }

   public List<class02298> N() {
      return this.knownPacks;
   }

   private static int N(int var0) {
      return ModResourcePackCreator.MAX_KNOWN_PACKS;
   }

   public void method_65081(class01667 var1) {
      var1.N(this);
   }

   @Override
   public class02897<class02275> method_65080() {
      return class02867.Z;
   }
}
