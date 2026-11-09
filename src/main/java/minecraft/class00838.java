package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;

public record class00838(class00819<Float> bounds) implements class00850<Float> {
   public static final class00838 L = new class00838(class00819.i());
   public static final Codec<class00838> u = class00819.N(Codec.FLOAT).xmap(class00838::new, class00838::N);
   public static final class02362<ByteBuf, class00838> i = class00819.N(class02389.E).N_10(class00838::new, class00838::N);

   public class00838(class00819<Float> bounds) {
      this.bounds = (class00819<Float>)bounds;
   }

   @Override
   public class00819<Float> N() {
      return this.bounds;
   }

   public static class00838 N(StringReader var0) throws CommandSyntaxException {
      class00819 class00819 = class00819.N(var0, Float::parseFloat, CommandSyntaxException.BUILT_IN_EXCEPTIONS::readerInvalidFloat);
      return new class00838(class00819);
   }
}
