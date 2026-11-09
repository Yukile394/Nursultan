package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record class02819(Optional<class02298> knownPackInfo, Lifecycle lifecycle) {
   public static final class02819 N = new class02819(Optional.empty(), Lifecycle.stable());

   public class02819(Optional<class02298> knownPackInfo, Lifecycle lifecycle) {
      this.knownPackInfo = knownPackInfo;
      this.lifecycle = lifecycle;
   }

   public Lifecycle y() {
      return this.lifecycle;
   }

   public Optional<class02298> N() {
      return this.knownPackInfo;
   }
}
