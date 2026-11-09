package minecraft;

import io.netty.buffer.ByteBuf;
import java.net.URI;
import java.util.function.IntFunction;

public enum class02222 {
   field_51981(0, "report_bug"),
   field_52205(1, "community_guidelines"),
   field_52206(2, "support"),
   field_52207(3, "status"),
   field_52208(4, "feedback"),
   field_52209(5, "community"),
   field_52210(6, "website"),
   field_52211(7, "forums"),
   field_52212(8, "news"),
   field_52213(9, "announcements");

   private static final IntFunction<class02222> field_51983 = class02121.N(var0 -> var0.field_51984, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class02222> field_51982 = class02389.N(field_51983, var0 -> var0.field_51984);
   private final int field_51984;
   private final String field_51985;

   private class02222(int var3, String var4) {
      this.field_51984 = var3;
      this.field_51985 = var4;
   }

   public class02213 N(URI var1) {
      return class02213.N(this, var1);
   }

   public class00392 N() {
      return class00392.L("known_server_link." + this.field_51985);
   }
}
