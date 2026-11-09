package minecraft;

import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.ARBBufferStorage;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL31;

class class08854 extends class08882 {
   class08854() {
      super();
   }

   @Override
   void y(int var1, long var2, int var4) {
      int i = this.N(var4);
      GlStateManager._glBindBuffer(i, var1);
      ARBBufferStorage.glBufferStorage(i, var2, GlConst.bufferUsageToGlFlag(var4));
      GlStateManager._glBindBuffer(i, 0);
   }

   @Override
   void y(int var1, ByteBuffer var2, int var3) {
      int i = this.N(var3);
      GlStateManager._glBindBuffer(i, var1);
      ARBBufferStorage.glBufferStorage(i, var2, GlConst.bufferUsageToGlFlag(var3));
      GlStateManager._glBindBuffer(i, 0);
   }

   @Override
   public int y() {
      return GlStateManager.glGenFramebuffers();
   }

   @Override
   void N(int var1, int var2) {
      int i = this.N(var2);
      GlStateManager._glBindBuffer(i, var1);
      GlStateManager._glUnmapBuffer(i);
      GlStateManager._glBindBuffer(i, 0);
   }

   @Override
   void N(int var1, long var2, long var4, int var6) {
      int i = this.N(var6);
      GlStateManager._glBindBuffer(i, var1);
      GL30.glFlushMappedBufferRange(i, var2, var4);
      GlStateManager._glBindBuffer(i, 0);
   }

   @Override
   void N(int var1, int var2, long var3, long var5, long var7) {
      GlStateManager._glBindBuffer(36662, var1);
      GlStateManager._glBindBuffer(36663, var2);
      GL31.glCopyBufferSubData(36662, 36663, var3, var5, var7);
      GlStateManager._glBindBuffer(36662, 0);
      GlStateManager._glBindBuffer(36663, 0);
   }

   private int N(int var1) {
      if ((var1 & 32) != 0) {
         return 34962;
      } else if ((var1 & 64) != 0) {
         return 34963;
      } else {
         return (var1 & 128) != 0 ? 35345 : 36663;
      }
   }

   @Override
   public void N(int var1, int var2, int var3, int var4, int var5) {
      int i = var5 == 0 ? '販' : var5;
      int j = GlStateManager.getFrameBuffer(i);
      GlStateManager._glBindFramebuffer(i, var1);
      GlStateManager._glFramebufferTexture2D(i, 36064, 3553, var2, var4);
      GlStateManager._glFramebufferTexture2D(i, 36096, 3553, var3, var4);
      if (var5 == 0) {
         GlStateManager._glBindFramebuffer(i, j);
      }
   }

   @Override
   public void N(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
      int i = GlStateManager.getFrameBuffer(36008);
      int j = GlStateManager.getFrameBuffer(36009);
      GlStateManager._glBindFramebuffer(36008, var1);
      GlStateManager._glBindFramebuffer(36009, var2);
      GlStateManager._glBlitFrameBuffer(var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
      GlStateManager._glBindFramebuffer(36008, i);
      GlStateManager._glBindFramebuffer(36009, j);
   }

   @Override
   void N(int var1, ByteBuffer var2, int var3) {
      int i = this.N(var3);
      GlStateManager._glBindBuffer(i, var1);
      GlStateManager._glBufferData(i, var2, GlConst.bufferUsageToGlEnum(var3));
      GlStateManager._glBindBuffer(i, 0);
   }

   @Override
   void N(int var1, long var2, ByteBuffer var4, int var5) {
      int i = this.N(var5);
      GlStateManager._glBindBuffer(i, var1);
      GlStateManager._glBufferSubData(i, var2, var4);
      GlStateManager._glBindBuffer(i, 0);
   }

   @Override
   void N(int var1, long var2, int var4) {
      int i = this.N(var4);
      GlStateManager._glBindBuffer(i, var1);
      GlStateManager._glBufferData(i, var2, GlConst.bufferUsageToGlEnum(var4));
      GlStateManager._glBindBuffer(i, 0);
   }

   @Override
   int N() {
      return GlStateManager._glGenBuffers();
   }

   @Nullable
   @Override
   ByteBuffer N(int var1, long var2, long var4, int var6, int var7) {
      int i = this.N(var7);
      GlStateManager._glBindBuffer(i, var1);
      ByteBuffer bytebuffer = GlStateManager._glMapBufferRange(i, var2, var4, var6);
      GlStateManager._glBindBuffer(i, 0);
      return bytebuffer;
   }
}
