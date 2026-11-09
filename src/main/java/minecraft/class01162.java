package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.joml.Vector3f;

public class class01162 extends class02910 {
   public static final int N = 3790560;
   public static final class01162 y = new class01162(3790560, 16711680, 1.0F);
   public static final MapCodec<class01162> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class06338.E.fieldOf("from_color").forGetter(var0x -> var0x.B),
            class06338.E.fieldOf("to_color").forGetter(var0x -> var0x.Z),
            M.fieldOf("scale").forGetter(class02910::L)
         )
         .apply(var0, class01162::new)
   );
   public static final class02362<class04247, class01162> u = class02362.N(
      class02389.M, var0 -> var0.B, class02389.M, var0 -> var0.Z, class02389.E, class02910::L, class01162::new
   );
   private final int B;
   private final int Z;

   public class01162(int var1, int var2, float var3) {
      super(var3);
      this.B = var1;
      this.Z = var2;
   }

   public Vector3f y() {
      return class02566.U(this.Z);
   }

   public Vector3f N() {
      return class02566.U(this.B);
   }

   @Override
   public class07103<class01162> method_10295() {
      return class07107.s;
   }
}
