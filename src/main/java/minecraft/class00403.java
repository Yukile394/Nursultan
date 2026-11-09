package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public record class00403(String y, class06794 L) implements class04457 {
   public static final MapCodec<class00403> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.STRING.fieldOf("entity").forGetter(class00403::y)).apply(var0, class00403::new)
   );

   public class00403(String var1) {
      this(var1, N(var1));
   }

   public class00403(String y, @Nullable class06794 L) {
      super();
      this.y = y;
      this.L = L;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class00403 class00403 && this.y.equals(class00403.y);
   }

   @Override
   public String toString() {
      return "entity=" + this.y;
   }

   @Override
   public int hashCode() {
      return this.y.hashCode();
   }

   @Override
   public MapCodec<class00403> N() {
      return N;
   }

   @Nullable
   private static class06794 N(String var0) {
      try {
         return new class06790(new StringReader(var0), true).v();
      } catch (CommandSyntaxException commandsyntaxexception) {
         return null;
      }
   }

   @Override
   public Stream<class07001> N(class07701 var1) throws CommandSyntaxException {
      return this.L != null ? this.L.y(var1).stream().map(class00809::y) : Stream.empty();
   }
}
