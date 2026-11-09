package minecraft;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class class06828 {
   public final RenderPipeline N;
   final Map<String, class06845> y;
   final class06835 L;
   public final class06856 u;
   final class06823 i;
   final boolean R;
   final boolean M;
   final boolean B;
   final boolean Z;
   final int z;
   final class06833 U;

   class06828(
      RenderPipeline var1,
      Map<String, class06845> var2,
      boolean var3,
      boolean var4,
      class06833 var5,
      class06856 var6,
      class06835 var7,
      class06823 var8,
      boolean var9,
      boolean var10,
      int var11
   ) {
      super();
      this.N = var1;
      this.y = var2;
      this.u = var6;
      this.L = var7;
      this.R = var3;
      this.M = var4;
      this.i = var8;
      this.U = var5;
      this.B = var9;
      this.Z = var10;
      this.z = var11;
   }

   @Override
   public String toString() {
      return "RenderSetup[layeringTransform="
         + this.U
         + ", textureTransform="
         + this.L
         + ", textures="
         + this.y
         + ", outlineProperty="
         + this.i
         + ", useLightmap="
         + this.R
         + ", useOverlay="
         + this.M
         + "]";
   }

   public Map<String, class06830> N() {
      if (this.y.isEmpty() && !this.M && !this.R) {
         return Collections.emptyMap();
      } else {
         HashMap hashmap = new HashMap();
         if (this.M) {
            hashmap.put("Sampler1", new class06830(((class03386)class06202.Nq().i_5).b().N(), RenderSystem.getSamplerCache().N(FilterMode.LINEAR)));
         }

         if (this.R) {
            hashmap.put("Sampler2", new class06830(((class03386)class06202.Nq().i_5).T().N(), RenderSystem.getSamplerCache().N(FilterMode.LINEAR)));
         }

         class08627 class08627 = class06202.Nq().NO();

         for (Entry entry : this.y.entrySet()) {
            class08918 class08918 = class08627.y(((class06845)entry.getValue()).N());
            class08188 class08188 = ((class06845)entry.getValue()).y().get();
            hashmap.put((String)entry.getKey(), new class06830(class08918.method_71659(), class08188 != null ? class08188 : class08918.method_75484()));
         }

         return hashmap;
      }
   }

   public static class06812 N(RenderPipeline var0) {
      return new class06812(var0);
   }
}
