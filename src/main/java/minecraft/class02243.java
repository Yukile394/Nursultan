package minecraft;

import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Optional;

public record class02243(List<class02213> entries) {
   public static final class02243 N = new class02243(List.of());
   public static final class02362<ByteBuf, Either<class02222, class00392>> y = class02389.N(class02222.field_51982, class03748.R);
   public static final class02362<ByteBuf, List<class02231>> L = class02231.N.N_33(class02389.N());

   public List<class02213> L() {
      return this.entries;
   }

   public class02243(List<class02213> entries) {
      super();
      this.entries = entries;
   }

   public List<class02231> y() {
      return this.entries.stream().map(var0 -> new class02231(var0.y(), var0.L().toString())).toList();
   }

   public Optional<class02213> N(class02222 var1) {
      return this.entries.stream().filter(var1x -> (Boolean)var1x.y().map(var1xx -> var1xx == var1, var0x -> false)).findFirst();
   }

   public boolean N() {
      return this.entries.isEmpty();
   }
}
