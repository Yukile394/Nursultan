package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class class01256 {
   private final List<Pattern> N;
   private final List<Pattern> y;
   private final List<Pattern> L;

   class01256(List<Pattern> var1, List<Pattern> var2, List<Pattern> var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   private static String N(List<Pattern> var0, String var1) {
      ArrayList arraylist = Lists.newArrayList();
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         Matcher matcher = ((Pattern)iterator.next()).matcher(var1);

         while (matcher.find()) {
            arraylist.add(matcher.group());
         }
      }

      return String.join(", ", arraylist);
   }

   ImmutableMap<String, String> N() {
      Builder builder = new Builder();
      GpuDevice gpudevice = RenderSystem.getDevice();
      if (gpudevice.getBackendName().equals("OpenGL")) {
         String s = N(this.N, gpudevice.getRenderer());
         if (!s.isEmpty()) {
            builder.put("renderer", s);
         }

         String s1 = N(this.y, gpudevice.getVersion());
         if (!s1.isEmpty()) {
            builder.put("version", s1);
         }

         String s2 = N(this.L, gpudevice.getVendor());
         if (!s2.isEmpty()) {
            builder.put("vendor", s2);
         }
      }

      return builder.build();
   }
}
