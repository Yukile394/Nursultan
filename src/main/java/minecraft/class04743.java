package minecraft;

import java.lang.management.ManagementFactory;
import java.util.List;
import java.util.Locale;
import net.caffeinemc.mods.sodium.client.util.MathUtil;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04743 implements class01285 {
   private static final class01894 N = class01894.y("memory");
   private final class01582 y = new class01582();

   public class04743() {
      super();
   }

   private static long y() {
      return ManagementFactory.getMemoryMXBean().getNonHeapMemoryUsage().getUsed() + NativeBuffer.getTotalAllocated();
   }

   private void N(class05834 var1, class07299 var2, class00570 var3, class00570 var4, CallbackInfo var5) {
      var1.N(N, N());
   }

   private static String N() {
      return "Off-Heap: +" + MathUtil.toMib(y()) + "MB";
   }

   private static long N(long var0) {
      return var0 / 1024L / 1024L;
   }

   @Override
   public void method_72751(class05834 var1, @Nullable class07299 var2, @Nullable class00570 var3, @Nullable class00570 var4) {
      long i = Runtime.getRuntime().maxMemory();
      long j = Runtime.getRuntime().totalMemory();
      long k = Runtime.getRuntime().freeMemory();
      long l = j - k;
      var1.N(
         N,
         List.of(
            String.format(Locale.ROOT, "Mem: %2d%% %03d/%03dMB", l * 100L / i, N(l), N(i)),
            String.format(Locale.ROOT, "Allocation rate: %03dMB/s", N(this.y.N(l))),
            String.format(Locale.ROOT, "Allocated: %2d%% %03dMB", j * 100L / i, N(j))
         )
      );
      this.N(var1, var2, var3, var4, null);
   }

   @Override
   public boolean method_72753(boolean var1) {
      return true;
   }
}
