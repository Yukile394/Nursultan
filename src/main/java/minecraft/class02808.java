package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public record class02808(class00392 component) implements class02831 {
   static final MapCodec<class02808> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03748.N.fieldOf("value").forGetter(class02808::u)).apply(var0, class02808::new)
   );
   static final class02362<class04247, class02808> u = class02362.N(class03748.y, class02808::u, class02808::new);

   @Override
   public class02836 L() {
      return class02836.field_59741;
   }

   public class02808(class00392 component) {
      super();
      this.component = component;
   }

   public class00392 u() {
      return this.component;
   }

   @Override
   public void N(Consumer<class00392> var1, @Nullable class08036 var2, class03556<class07468> var3, class07471 var4) {
      var1.accept(this.component);
   }
}
