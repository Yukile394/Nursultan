package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class03932(List<class01215> entries, boolean replace) {
   public static final Codec<class03932> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class01215.field_39265.listOf().fieldOf("values").forGetter(class03932::N), Codec.BOOL.optionalFieldOf("replace", false).forGetter(class03932::y)
         )
         .apply(var0, class03932::new)
   );

   public class03932(List<class01215> entries, boolean replace) {
      super();
      this.entries = entries;
      this.replace = replace;
   }

   public boolean y() {
      return this.replace;
   }

   public List<class01215> N() {
      return this.entries;
   }
}
