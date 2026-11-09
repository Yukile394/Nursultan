package minecraft;

import com.mojang.datafixers.util.Either;
import java.util.UUID;
import org.apache.commons.lang3.function.TriFunction;

enum class00025 {
   field_59778(class00027::new),
   field_59779(class00021::new),
   field_59780(class00019::new),
   field_59781(class00010::new);

   final TriFunction<Either<UUID, String>, class00028, class00667, class00037> field_59782;

   private class00025(TriFunction<Either<UUID, String>, class00028, class00667, class00037> var3) {
      this.field_59782 = var3;
   }
}
