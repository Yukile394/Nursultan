package minecraft;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class00414(class08262 selector, Optional<class00392> separator) implements class04439 {
   public static final MapCodec<class00414> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class08262.N.fieldOf("selector").forGetter(class00414::y), class03748.N.optionalFieldOf("separator").forGetter(class00414::L))
         .apply(var0, class00414::new)
   );

   public Optional<class00392> L() {
      return this.separator;
   }

   public class00414(class08262 selector, Optional<class00392> separator) {
      this.selector = selector;
      this.separator = separator;
   }

   @Override
   public String toString() {
      return "pattern{" + this.selector + "}";
   }

   public class08262 y() {
      return this.selector;
   }

   @Override
   public MapCodec<class00414> N() {
      return N;
   }

   @Override
   public class05216 N(@Nullable class07701 var1, @Nullable class07049 var2, int var3) throws CommandSyntaxException {
      if (var1 == null) {
         return class00392.i();
      } else {
         Optional optional = class00390.N(var1, this.separator, var2, var3);
         return class00390.N(this.selector.y().y(var1), optional, class07049::method_5476);
      }
   }

   @Override
   public <T> Optional<T> method_27660(class05935<T> var1, class00405 var2) {
      return var1.accept(var2, this.selector.N());
   }

   @Override
   public <T> Optional<T> method_27659(class05977<T> var1) {
      return var1.accept(this.selector.N());
   }
}
