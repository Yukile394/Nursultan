package minecraft;

import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.ARBDirectStateAccess;

class class08888 extends class08882 {
   class08888() {
      super();
   }

   @Override
   void y(int var1, long var2, int var4) {
      ARBDirectStateAccess.glNamedBufferStorage(var1, var2, GlConst.bufferUsageToGlFlag(var4));
   }

   @Override
   void y(int var1, ByteBuffer var2, int var3) {
      ARBDirectStateAccess.glNamedBufferStorage(var1, var2, GlConst.bufferUsageToGlFlag(var3));
   }

   @Override
   public int y() {
      return ARBDirectStateAccess.glCreateFramebuffers();
   }

   @Override
   void N(int var1, int var2) {
      ARBDirectStateAccess.glUnmapNamedBuffer(var1);
   }

   @Override
   void N(int var1, int var2, long var3, long var5, long var7) {
      ARBDirectStateAccess.glCopyNamedBufferSubData(var1, var2, var3, var5, var7);
   }

   @Override
   void N(int var1, long var2, long var4, int var6) {
      ARBDirectStateAccess.glFlushMappedNamedBufferRange(var1, var2, var4);
   }

   @Override
   public void N(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      ARBDirectStateAccess.glBlitNamedFramebuffer(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }

   @Override
   public void N(int var1, int var2, int var3, int var4, int var5) {
      ARBDirectStateAccess.glNamedFramebufferTexture(var1, 36064, var2, var4);
      ARBDirectStateAccess.glNamedFramebufferTexture(var1, 36096, var3, var4);
      if (var5 != 0) {
         GlStateManager._glBindFramebuffer(var5, var1);
      }
   }

   @Override
   int N() {
      GlStateManager.incrementTrackedBuffers();
      return ARBDirectStateAccess.glCreateBuffers();
   }

   @Override
   void N(int var1, long var2, int var4) {
      ARBDirectStateAccess.glNamedBufferData(var1, var2, GlConst.bufferUsageToGlEnum(var4));
   }

   @Override
   void N(int var1, ByteBuffer var2, int var3) {
      ARBDirectStateAccess.glNamedBufferData(var1, var2, GlConst.bufferUsageToGlEnum(var3));
   }

   @Override
   void N(int var1, long var2, ByteBuffer var4, int var5) {
      ARBDirectStateAccess.glNamedBufferSubData(var1, var2, var4);
   }

   @Nullable
   @Override
   ByteBuffer N(int var1, long var2, long var4, int var6, int var7) {
      return ARBDirectStateAccess.glMapNamedBufferRange(var1, var2, var4, var6);
   }
}
