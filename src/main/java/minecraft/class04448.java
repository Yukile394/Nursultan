package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class04448(class04025 ifTrue, class01471 then) {
   public static final Codec<class04448> N = RecordCodecBuilder.create(
      var0 -> var0.group(class04025.y.fieldOf("if_true").forGetter(class04448::N), class01471.N.fieldOf("then").forGetter(class04448::y))
         .apply(var0, class04448::new)
   );

   public class04448(class04025 ifTrue, class01471 then) {
      this.ifTrue = ifTrue;
      this.then = then;
   }

   public class01471 y() {
      return this.then;
   }

   public class04025 N() {
      return this.ifTrue;
   }
}
