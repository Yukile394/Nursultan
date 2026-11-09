package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public enum class03829 implements class05033 {
   field_47790("IDLE", 0, "idle", false, 0, 0),
   field_47791("ROLLING", 1, "rolling", true, 10, 1),
   field_47792("SCARED", 2, "scared", true, 50, 2),
   field_49084("UNROLLING", 3, "unrolling", true, 30, 3);

   static final Codec<class03829> field_47794 = class05033.N(class03829::values);
   private static final IntFunction<class03829> field_48336 = class02121.N(class03829::L, values(), class02126.field_41664);
   public static final class02362<ByteBuf, class03829> field_48335 = class02389.N(field_48336, class03829::L);
   private final String field_47793;
   private final boolean field_49085;
   private final int field_49086;
   private final int field_48337;

   private int L() {
      return this.field_48337;
   }

   class03829(String var3, boolean var4, int var5, int var6) {
      this.field_47793 = var3;
      this.field_49085 = var4;
      this.field_49086 = var5;
      this.field_48337 = var6;
   }

   public int y() {
      return this.field_49086;
   }

   public abstract boolean N(long var1);

   public boolean N() {
      return this.field_49085;
   }

   @Override
   public String method_15434() {
      return this.field_47793;
   }
}
