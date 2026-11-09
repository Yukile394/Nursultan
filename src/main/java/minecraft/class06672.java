package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class06672 implements class05033 {
   field_1442("always", 0),
   field_1443("never", 1),
   field_1444("hideForOtherTeams", 2),
   field_1446("hideForOwnTeam", 3);

   public static final Codec<class06672> field_56489 = class05033.N(class06672::values);
   private static final IntFunction<class06672> field_56491 = class02121.N(var0 -> var0.field_1441, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class06672> field_56490 = class02389.N(field_56491, var0 -> var0.field_1441);
   public final String field_1445;
   public final int field_1441;

   private class06672(String var3, int var4) {
      this.field_1445 = var3;
      this.field_1441 = var4;
   }

   public class00392 N() {
      return class00392.L("team.visibility." + this.field_1445);
   }

   @Override
   public String method_15434() {
      return this.field_1445;
   }
}
