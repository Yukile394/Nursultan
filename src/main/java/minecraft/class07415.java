package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;

public record class07415(Optional<String> literal, Optional<String> translatable, Optional<List<String>> translatableParams) {
   public static final Codec<class07415> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.STRING.optionalFieldOf("literal").forGetter(class07415::y),
            Codec.STRING.optionalFieldOf("translatable").forGetter(class07415::L),
            Codec.STRING.listOf().lenientOptionalFieldOf("translatableParams").forGetter(class07415::u)
         )
         .apply(var0, class07415::new)
   );

   public Optional<String> L() {
      return this.translatable;
   }

   public class07415(Optional<String> literal, Optional<String> translatable, Optional<List<String>> translatableParams) {
      super();
      this.literal = literal;
      this.translatable = translatable;
      this.translatableParams = translatableParams;
   }

   public Optional<List<String>> u() {
      return this.translatableParams;
   }

   public Optional<String> y() {
      return this.literal;
   }

   public Optional<class00392> N() {
      if (this.translatable.isPresent()) {
         String s = this.translatable.get();
         if (this.translatableParams.isPresent()) {
            List<String> list = this.translatableParams.get();
            return Optional.of(class00392.N(s, list.toArray()));
         } else {
            return Optional.of(class00392.L(s));
         }
      } else {
         return this.literal.map(class00392::y);
      }
   }
}
