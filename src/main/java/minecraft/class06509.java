package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class06509 implements class05033 {
   field_8952(0, "none"),
   field_8950(1, "eat", true),
   field_8946(2, "drink", true),
   field_8949(3, "block"),
   field_8953(4, "bow"),
   field_63380(5, "trident"),
   field_8947(6, "crossbow"),
   field_27079(7, "spyglass"),
   field_39058(8, "toot_horn"),
   field_42717(9, "brush"),
   field_55494(10, "bundle"),
   field_8951(11, "spear", true);

   private static final IntFunction<class06509> field_53766 = class02121.N(class06509::N, values(), class02126.field_41664);
   public static final Codec<class06509> field_53764 = class05033.N(class06509::values);
   public static final class02362<ByteBuf, class06509> field_53765 = class02389.N(field_53766, class06509::N);
   private final int field_53767;
   private final String field_53768;
   private final boolean field_63381;

   private class06509(int var3, String var4) {
      this(var3, var4, false);
   }

   private class06509(int var3, String var4, boolean var5) {
      this.field_53767 = var3;
      this.field_53768 = var4;
      this.field_63381 = var5;
   }

   public boolean y() {
      return this.field_63381;
   }

   public int N() {
      return this.field_53767;
   }

   @Override
   public String method_15434() {
      return this.field_53768;
   }
}
