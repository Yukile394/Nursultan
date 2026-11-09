package minecraft;

import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import me.flashyreese.mods.sodiumextra.client.config.FogTypeConfig;
import me.flashyreese.mods.sodiumextra.client.fog.FogEnvironmentExtended;
import org.jspecify.annotations.Nullable;

public abstract class class09005 implements FogEnvironmentExtended {
   public class09005() {
      super();
   }

   public boolean y() {
      return false;
   }

   public abstract boolean N(@Nullable class04798 var1, class07049 var2);

   public float N(class07438 var1, float var2, float var3) {
      return var2;
   }

   public boolean N() {
      return true;
   }

   public int N(class03448 var1, class05363 var2, int var3, float var4) {
      return -1;
   }

   public abstract void N(class03970 var1, class05363 var2, class03448 var3, float var4, class02233 var5);

   public void sodium_extra$applyFogSettings(class04798 var1, class03970 var2, class07049 var3, class07209 var4, class03448 var5, float var6) {
      FogTypeConfig fogtypeconfig = SodiumExtraClientMod.options().renderSettings.fogTypeConfig.computeIfAbsent(var1, var0 -> new FogTypeConfig());
      if (SodiumExtraClientMod.options().renderSettings.globalFog && fogtypeconfig.enable) {
         float f = fogtypeconfig.environmentStartMultiplier / 100.0F;
         float f1 = fogtypeconfig.environmentEndMultiplier / 100.0F;
         float f2 = fogtypeconfig.renderDistanceStartMultiplier / 100.0F;
         float f3 = fogtypeconfig.renderDistanceEndMultiplier / 100.0F;
         float f4 = fogtypeconfig.skyEndMultiplier / 100.0F;
         float f5 = fogtypeconfig.cloudEndMultiplier / 100.0F;
         var2.N *= f;
         var2.L *= f1;
         var2.y *= f2;
         var2.u *= f3;
         var2.i *= f4;
         var2.R *= f5;
      } else {
         var2.N = Float.MAX_VALUE;
         var2.L = Float.MAX_VALUE;
         var2.y = Float.MAX_VALUE;
         var2.u = Float.MAX_VALUE;
         var2.i = Float.MAX_VALUE;
         var2.R = Float.MAX_VALUE;
      }
   }
}
