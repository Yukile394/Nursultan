package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public record class04744(class05042 respawnData, boolean forced) {
   public static final Codec<class04744> L = RecordCodecBuilder.create(
      var0 -> var0.group(class05042.y.forGetter(class04744::N), Codec.BOOL.optionalFieldOf("forced", false).forGetter(class04744::y))
         .apply(var0, class04744::new)
   );

   public class04744(class05042 respawnData, boolean forced) {
      super();
      this.respawnData = respawnData;
      this.forced = forced;
   }

   public boolean y() {
      return this.forced;
   }

   public boolean y(@Nullable class04744 var1) {
      return var1 != null && this.respawnData.L().equals(var1.respawnData.L());
   }

   static class05946<class07299> N(@Nullable class04744 var0) {
      return var0 != null ? var0.N().N() : class07299.field_25179;
   }

   public class05042 N() {
      return this.respawnData;
   }
}
