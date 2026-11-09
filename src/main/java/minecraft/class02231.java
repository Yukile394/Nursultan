package minecraft;

import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;

public record class02231(Either<class02222, class00392> type, String link) {
   public static final class02362<ByteBuf, class02231> N = class02362.N(class02243.y, class02231::N, class02389.s, class02231::y, class02231::new);

   public class02231(Either<class02222, class00392> type, String link) {
      this.type = type;
      this.link = link;
   }

   public String y() {
      return this.link;
   }

   public Either<class02222, class00392> N() {
      return this.type;
   }
}
