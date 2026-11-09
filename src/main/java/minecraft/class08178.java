package minecraft;

import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.OptionalDouble;

public class class08178 {
   private final class08188[] N = new class08188[32];

   public class08178() {
      super();
   }

   static int y(AddressMode var0, AddressMode var1, FilterMode var2, FilterMode var3, boolean var4) {
      int i = 0;
      i |= var0.ordinal() & 1;
      i |= (var1.ordinal() & 1) << 1;
      i |= (var2.ordinal() & 1) << 2;
      i |= (var3.ordinal() & 1) << 3;
      if (var4) {
         i |= 16;
      }

      return i;
   }

   public class08188 y(FilterMode var1) {
      return this.N(AddressMode.REPEAT, AddressMode.REPEAT, var1, var1, false);
   }

   public class08188 y(FilterMode var1, boolean var2) {
      return this.N(AddressMode.REPEAT, AddressMode.REPEAT, var1, var1, var2);
   }

   public void y() {
      class08188[] aclass08188 = this.N;
      int i = aclass08188.length;

      for (int j = 0; j < i; j++) {
         aclass08188[j].close();
      }
   }

   public class08188 N(FilterMode var1, boolean var2) {
      return this.N(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, var1, var1, var2);
   }

   public void N() {
      GpuDevice gpudevice = RenderSystem.getDevice();
      if (AddressMode.values().length == 2 && FilterMode.values().length == 2) {
         for (AddressMode addressmode : AddressMode.values()) {
            for (AddressMode addressmode1 : AddressMode.values()) {
               for (FilterMode filtermode : FilterMode.values()) {
                  for (FilterMode filtermode1 : FilterMode.values()) {
                     for (boolean flag : new boolean[]{true, false}) {
                        this.N[y(addressmode, addressmode1, filtermode, filtermode1, flag)] = gpudevice.createSampler(
                           addressmode, addressmode1, filtermode, filtermode1, 1, flag ? OptionalDouble.empty() : OptionalDouble.of(0.0)
                        );
                     }
                  }
               }
            }
         }
      } else {
         throw new IllegalStateException("AddressMode and FilterMode enum sizes must be 2 - if you expanded them, please update SamplerCache");
      }
   }

   public class08188 N(AddressMode var1, AddressMode var2, FilterMode var3, FilterMode var4, boolean var5) {
      return this.N[y(var1, var2, var3, var4, var5)];
   }

   public class08188 N(FilterMode var1) {
      return this.N(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, var1, var1, false);
   }
}
