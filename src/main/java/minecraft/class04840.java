package minecraft;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class class04840 implements class01285 {
   private static final class01894 N = class01894.y("system");

   public class04840() {
      super();
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      GpuDevice gpudevice = RenderSystem.getDevice();
      var1.N(
         N,
         List.of(
            String.format(Locale.ROOT, "Java: %s", System.getProperty("java.version")),
            String.format(Locale.ROOT, "CPU: %s", GLX._getCpuInfo()),
            String.format(Locale.ROOT, "Display: %dx%d (%s)", class06202.Nq().Nt().U(), class06202.Nq().Nt().E(), gpudevice.getVendor()),
            gpudevice.getRenderer(),
            String.format(Locale.ROOT, "%s %s", gpudevice.getBackendName(), gpudevice.getVersion())
         )
      );
   }

   @Override
   public boolean method_72753(boolean var1) {
      return true;
   }
}
