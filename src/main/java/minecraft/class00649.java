package minecraft;

import java.util.Optional;

public record class00649(class03556<class00629> chatType, class00392 name, Optional<class00392> targetName) {
   public static final class02362<class04247, class00649> N = class02362.N(
      class00629.L, class00649::N, class03748.u, class00649::y, class03748.i, class00649::L, class00649::new
   );

   public class00649 L(class00392 var1) {
      return new class00649(this.chatType, this.name, Optional.of(var1));
   }

   public Optional<class00392> L() {
      return this.targetName;
   }

   class00649(class03556<class00629> var1, class00392 var2) {
      this(var1, var2, Optional.empty());
   }

   public class00649(class03556<class00629> chatType, class00392 name, Optional<class00392> targetName) {
      this.chatType = chatType;
      this.name = name;
      this.targetName = targetName;
   }

   public class00392 y(class00392 var1) {
      return this.chatType.N().y().N(var1, this);
   }

   public class00392 y() {
      return this.name;
   }

   public class03556<class00629> N() {
      return this.chatType;
   }

   public class00392 N(class00392 var1) {
      return this.chatType.N().N().N(var1, this);
   }
}
