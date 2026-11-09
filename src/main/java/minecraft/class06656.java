package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class06656 implements class05033 {
   field_1437("always", 0),
   field_1435("never", 1),
   field_1434("pushOtherTeams", 2),
   field_1440("pushOwnTeam", 3);

   public static final Codec<class06656> field_56486 = class05033.N(class06656::values);
   private static final IntFunction<class06656> field_56488 = class02121.N(var0 -> var0.field_1433, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class06656> field_56487 = class02389.N(field_56488, var0 -> var0.field_1433);
   public final String field_1436;
   public final int field_1433;

   private class06656(String var3, int var4) {
      this.field_1436 = var3;
      this.field_1433 = var4;
   }

   public class00392 N() {
      return class00392.L("team.collision." + this.field_1436);
   }

   @Override
   public String method_15434() {
      return this.field_1436;
   }
}
