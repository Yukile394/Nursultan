package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import net.fabricmc.fabric.impl.networking.FabricRegistryByteBuf;
import org.jspecify.annotations.Nullable;

public class class04247 extends class00667 implements FabricRegistryByteBuf {
   private final class01042 L;
   private Set u = null;

   public class04247(ByteBuf var1, class01042 var2) {
      super(var1);
      this.L = var2;
   }

   public class01042 J() {
      return this.L;
   }

   public static Function<ByteBuf, class04247> N(class01042 var0) {
      return var1 -> new class04247(var1, var0);
   }

   public void fabric_setSendableConfigurationChannels(Set var1) {
      this.u = Objects.requireNonNull(var1);
   }

   @Nullable
   public Set fabric_getSendableConfigurationChannels() {
      return this.u;
   }
}
