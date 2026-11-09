package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class07433(class03556<class07468> attribute, double baseValue, List<class07471> modifiers) {
   public static final Codec<class07433> L = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04206.v.b().fieldOf("id").forGetter(class07433::N),
            Codec.DOUBLE.fieldOf("base").orElse(0.0).forGetter(class07433::y),
            class07471.y.listOf().optionalFieldOf("modifiers", List.of()).forGetter(class07433::L)
         )
         .apply(var0, class07433::new)
   );
   public static final Codec<List<class07433>> u = L.listOf();

   public List<class07471> L() {
      return this.modifiers;
   }

   public class07433(class03556<class07468> attribute, double baseValue, List<class07471> modifiers) {
      this.attribute = attribute;
      this.baseValue = baseValue;
      this.modifiers = modifiers;
   }

   public double y() {
      return this.baseValue;
   }

   public class03556<class07468> N() {
      return this.attribute;
   }
}
