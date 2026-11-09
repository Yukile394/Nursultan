package minecraft;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public record class00397(String y, class00874 L) implements class04457 {
   public static final MapCodec<class00397> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.STRING.fieldOf("block").forGetter(class00397::y)).apply(var0, class00397::new)
   );

   public class00397(String var1) {
      this(var1, N(var1));
   }

   public class00397(String y, @Nullable class00874 L) {
      super();
      this.y = y;
      this.L = L;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class00397 class00397 && this.y.equals(class00397.y);
   }

   @Override
   public String toString() {
      return "block=" + this.y;
   }

   @Override
   public int hashCode() {
      return this.y.hashCode();
   }

   @Override
   public MapCodec<class00397> N() {
      return N;
   }

   @Nullable
   private static class00874 N(String var0) {
      try {
         return class00894.N().parse(new StringReader(var0));
      } catch (CommandSyntaxException commandsyntaxexception) {
         return null;
      }
   }

   @Override
   public Stream<class07001> N(class07701 var1) {
      if (this.L != null) {
         class04782 class04782 = var1.R();
         class07209 class07209 = this.L.L(var1);
         if (class04782.method_8477(class07209)) {
            class00394 class00394 = class04782.method_8321(class07209);
            if (class00394 != null) {
               return Stream.of(class00394.y_2(var1.t()));
            }
         }
      }

      return Stream.empty();
   }
}
