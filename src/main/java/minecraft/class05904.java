package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.object.builder.client.SignTypeTextureHelper;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public record class05904(
   String name, class01960 setType, class07752 soundType, class07752 hangingSignSoundType, class04891 fenceGateClose, class04891 fenceGateOpen
) {
   private static final Map<String, class05904> v = new Object2ObjectArrayMap();
   public static final Codec<class05904> N = Codec.stringResolver(class05904::y, v::get);
   public static final class05904 y = N(new class05904("oak", class01960.M));
   public static final class05904 L = N(new class05904("spruce", class01960.B));
   public static final class05904 u = N(new class05904("birch", class01960.Z));
   public static final class05904 i = N(new class05904("acacia", class01960.z));
   public static final class05904 R = N(new class05904("cherry", class01960.U, class07752.ND, class07752.yN, class04909.Rm, class04909.RP));
   public static final class05904 M = N(new class05904("jungle", class01960.E));
   public static final class05904 B = N(new class05904("dark_oak", class01960.W));
   public static final class05904 Z = N(new class05904("pale_oak", class01960.m));
   public static final class05904 z = N(new class05904("crimson", class01960.P, class07752.Nx, class07752.Nf, class04909.vd, class04909.vw));
   public static final class05904 U = N(new class05904("warped", class01960.s, class07752.Nx, class07752.Nf, class04909.vd, class04909.vw));
   public static final class05904 E = N(new class05904("mangrove", class01960.T));
   public static final class05904 W = N(new class05904("bamboo", class01960.b, class07752.NS, class07752.NC, class04909.yq, class04909.yK));

   public class01960 L() {
      return this.setType;
   }

   public class04891 M() {
      return this.fenceGateOpen;
   }

   public class05904(String var1, class01960 var2) {
      this(var1, var2, class07752.y, class07752.NA, class04909.Ut, class04909.UG);
   }

   public class05904(
      String name, class01960 setType, class07752 soundType, class07752 hangingSignSoundType, class04891 fenceGateClose, class04891 fenceGateOpen
   ) {
      super();
      this.name = name;
      this.setType = setType;
      this.soundType = soundType;
      this.hangingSignSoundType = hangingSignSoundType;
      this.fenceGateClose = fenceGateClose;
      this.fenceGateOpen = fenceGateOpen;
   }

   public class07752 i() {
      return this.hangingSignSoundType;
   }

   public class07752 u() {
      return this.soundType;
   }

   public String y() {
      return this.name;
   }

   private static void N(class05904 var0, CallbackInfoReturnable var1) {
      if (SignTypeTextureHelper.shouldAddTextures) {
         class01894 class01894 = class01894.N(var0.y());
         class05911.w.put(var0, class05911.t.N(class01894));
         class05911.k.put(var0, class05911.G.N(class01894));
      }
   }

   public static class05904 N(class05904 var0) {
      v.put(var0.y(), var0);
      N(var0, null);
      return var0;
   }

   public static Stream<class05904> N() {
      return v.values().stream();
   }

   public class04891 R() {
      return this.fenceGateClose;
   }
}
