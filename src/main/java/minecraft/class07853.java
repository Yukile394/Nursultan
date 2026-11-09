package minecraft;

import com.mojang.authlib.GameProfile;
import io.netty.buffer.ByteBuf;

public record class07853(GameProfile gameProfile) implements class00381<class07844> {
   public static final class02362<ByteBuf, class07853> N = class02362.N(class02389.k, class07853::N, class07853::new);

   public class07853(GameProfile gameProfile) {
      this.gameProfile = gameProfile;
   }

   public void method_65081(class07844 var1) {
      var1.N(this);
   }

   public GameProfile N() {
      return this.gameProfile;
   }

   @Override
   public boolean R() {
      return true;
   }

   @Override
   public class02897<class07853> method_65080() {
      return class04271.y;
   }
}
