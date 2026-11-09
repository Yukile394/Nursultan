package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.UUID;

record class05382(UUID target, class05346 type, int value) {
   public static final Codec<class05382> u = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01487.N.fieldOf("Target").forGetter(class05382::y),
            class05346.field_41672.fieldOf("Type").forGetter(class05382::L),
            class06338.b.fieldOf("Value").forGetter(class05382::u)
         )
         .apply(var0, class05382::new)
   );

   public class05346 L() {
      return this.type;
   }

   class05382(UUID target, class05346 type, int value) {
      super();
      this.target = target;
      this.type = type;
      this.value = value;
   }

   public int u() {
      return this.value;
   }

   public UUID y() {
      return this.target;
   }

   public int N() {
      return this.value * this.type.field_18431;
   }
}
