package minecraft;

import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.OptionalDouble;
import org.lwjgl.opengl.GL33C;

public class class08193 extends class08188 {
   private final int N;
   private final AddressMode y;
   private final AddressMode L;
   private final FilterMode u;
   private final FilterMode i;
   private final int R;
   private final OptionalDouble M;
   private boolean B;

   @Override
   public AddressMode L() {
      return this.L;
   }

   @Override
   public OptionalDouble M() {
      return this.M;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class08193(AddressMode var1, AddressMode var2, FilterMode var3, FilterMode var4, int var5, OptionalDouble var6) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.M = var6;
      this.N = GL33C.glGenSamplers();
      GL33C.glSamplerParameteri(this.N, 10242, GlConst.toGl(var1));
      GL33C.glSamplerParameteri(this.N, 10243, GlConst.toGl(var2));
      if (var5 > 1) {
         GL33C.glSamplerParameterf(this.N, 34046, var5);
      }

      switch (var3) {
         case NEAREST:
            GL33C.glSamplerParameteri(this.N, 10241, 9986);
            break;
         case LINEAR:
            GL33C.glSamplerParameteri(this.N, 10241, 9987);
      }

      switch (var4) {
         case NEAREST:
            GL33C.glSamplerParameteri(this.N, 10240, 9728);
            break;
         case LINEAR:
            GL33C.glSamplerParameteri(this.N, 10240, 9729);
      }

      if (var6.isPresent()) {
         GL33C.glSamplerParameterf(this.N, 33083, (float)var6.getAsDouble());
      }
   }

   public boolean B() {
      return this.B;
   }

   @Override
   public FilterMode i() {
      return this.i;
   }

   @Override
   public void close() {
      if (!this.B) {
         this.B = true;
         GL33C.glDeleteSamplers(this.N);
      }
   }

   @Override
   public FilterMode u() {
      return this.u;
   }

   @Override
   public AddressMode y() {
      return this.y;
   }

   public int N() {
      return this.N;
   }

   @Override
   public int R() {
      return this.R;
   }
}
