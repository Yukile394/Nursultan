package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.joml.Vector3f;

public class class07138 extends class02910 {
   public static final int N = 16711680;
   public static final class07138 y = new class07138(16711680, 1.0F);
   public static final MapCodec<class07138> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06338.E.fieldOf("color").forGetter(var0x -> var0x.B), M.fieldOf("scale").forGetter(class02910::L)).apply(var0, class07138::new)
   );
   public static final class02362<class04247, class07138> u = class02362.N(class02389.M, var0 -> var0.B, class02389.E, class02910::L, class07138::new);
   private final int B;

   public class07138(int var1, float var2) {
      super(var2);
      this.B = var1;
   }

   public Vector3f N() {
      return class02566.U(this.B);
   }

   @Override
   public class07103<class07138> method_10295() {
      return class07107.P;
   }
}
