package minecraft;

import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.GpuDevice;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import org.jspecify.annotations.Nullable;

public class class08741 {
   private static final List<String> N = List.of(
      "i3-1000g1",
      "i3-1000g4",
      "i3-1000ng4",
      "i3-1005g1",
      "i3-l13g4",
      "i5-1030g4",
      "i5-1030g7",
      "i5-1030ng7",
      "i5-1034g1",
      "i5-1035g1",
      "i5-1035g4",
      "i5-1035g7",
      "i5-1038ng7",
      "i5-l16g7",
      "i7-1060g7",
      "i7-1060ng7",
      "i7-1065g7",
      "i7-1068g7",
      "i7-1068ng7"
   );
   private static final List<String> y = List.of("x6211e", "x6212re", "x6214re", "x6413e", "x6414re", "x6416re", "x6425e", "x6425re", "x6427fe");
   private static final List<String> L = List.of("j6412", "j6413", "n4500", "n4505", "n5095", "n5095a", "n5100", "n5105", "n6210", "n6211");
   private static final List<String> u = List.of("6805", "j6426", "n6415", "n6000", "n6005");
   @Nullable
   private static class08741 i;
   private final WeakReference<GpuDevice> R;
   private final boolean M;
   private final boolean B;
   private final boolean Z;

   public boolean L() {
      return this.Z;
   }

   private static boolean L(GpuDevice var0) {
      return class07536.m() == class07533.field_1133 && class07536.P() || var0.getRenderer().startsWith("D3D12");
   }

   private class08741(GpuDevice var1) {
      super();
      this.R = new WeakReference<>(var1);
      this.M = y(var1);
      this.B = L(var1);
      this.Z = u(var1);
   }

   private static boolean u(GpuDevice var0) {
      return var0.getRenderer().contains("AMD");
   }

   public boolean y() {
      return this.B;
   }

   private static boolean y(GpuDevice var0) {
      String s = GLX._getCpuInfo().toLowerCase(Locale.ROOT);
      String s1 = var0.getRenderer().toLowerCase(Locale.ROOT);
      if (!s.contains("intel") || !s1.contains("intel") || s1.contains("mesa")) {
         return false;
      } else if (s1.endsWith("gen11")) {
         return true;
      } else {
         return !s1.contains("uhd graphics") && !s1.contains("iris")
            ? false
            : s.contains("atom") && y.stream().anyMatch(s::contains)
               || s.contains("celeron") && L.stream().anyMatch(s::contains)
               || s.contains("pentium") && u.stream().anyMatch(s::contains)
               || N.stream().anyMatch(s::contains);
      }
   }

   public boolean N() {
      return this.M;
   }

   public static class08741 N(GpuDevice var0) {
      class08741 class08741 = i;
      if (class08741 == null || class08741.R.get() != var0) {
         i = class08741 = new class08741(var0);
      }

      return class08741;
   }
}
