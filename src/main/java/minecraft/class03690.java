package minecraft;

import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class03690(class03556<class04382> preset) {
   private static final class00392 y = class00392.L("generator.custom");

   @Nullable
   public class03556<class04382> L() {
      return this.preset;
   }

   public class03690(@Nullable class03556<class04382> preset) {
      super();
      this.preset = preset;
   }

   public boolean y() {
      return Optional.ofNullable(this.preset).flatMap(class03556::i).filter(var0 -> var0.equals(class05964.u)).isPresent();
   }

   public class00392 N() {
      return Optional.ofNullable(this.preset).flatMap(class03556::i).map(var0 -> class00392.L(var0.N().B("generator"))).orElse(y);
   }
}
