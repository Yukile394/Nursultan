package minecraft;

import com.mojang.blaze3d.platform.GLX;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.Pointer;

public class class06417 {
   @Nullable
   private static final MethodHandle N = (MethodHandle)GLX.make(() -> {
      try {
         Lookup lookup = MethodHandles.lookup();
         Class<?> oclass = Class.forName("org.lwjgl.system.MemoryManage$DebugAllocator");
         Method method = oclass.getDeclaredMethod("untrack", long.class);
         method.setAccessible(true);
         Field field = Class.forName("org.lwjgl.system.MemoryUtil$LazyInit").getDeclaredField("ALLOCATOR");
         field.setAccessible(true);
         Object object = field.get(null);
         return oclass.isInstance(object) ? lookup.unreflect(method) : null;
      } catch (NoSuchMethodException | NoSuchFieldException | IllegalAccessException | ClassNotFoundException classnotfoundexception) {
         throw new RuntimeException(classnotfoundexception);
      }
   });

   public class06417() {
      super();
   }

   public static void N(long var0) {
      if (N != null) {
         try {
            N.invoke((long)var0);
         } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
         }
      }
   }

   public static void N(Pointer var0) {
      N(var0.address());
   }
}
