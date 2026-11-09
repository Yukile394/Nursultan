package minecraft;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class class08777 implements class08744 {
   public static final class08744 N = new class08765();
   public static final class08744 y = new class08749();
   private final List<class00394> L;
   private final class03476 u;
   @Nullable
   private final class02578 i;
   @Nullable
   private class08728 R;
   private final Map<class08743, class08871> M = new EnumMap<>(class08743.class);

   @Override
   public boolean L() {
      return this.M.containsKey(class08743.field_60926);
   }

   public class08777(class08728 var1, class02586 var2) {
      super();
      this.R = var1;
      this.u = var2.L;
      this.L = var2.N;
      this.i = var2.u;
   }

   @Override
   public void close() {
      this.M.values().forEach(class08871::close);
      this.M.clear();
   }

   @Nullable
   public class02578 u() {
      return this.i;
   }

   @Override
   public boolean y(class08728 var1) {
      return !var1.equals(this.R);
   }

   @Nullable
   @Override
   public class08871 y(class08743 var1) {
      return this.M.get(var1);
   }

   @Override
   public List<class00394> y() {
      return this.L;
   }

   public void N(class08728 var1) {
      this.R = var1;
   }

   public void N(class08743 var1, class02613 var2, long var3) {
      class08871 class08871 = this.y(var1);
      if (class08871 != null) {
         if (class08871.y() == null) {
            class08871.N_89(
               RenderSystem.getDevice()
                  .createBuffer(
                     () -> "Section index buffer - layer: "
                        + var1.L()
                        + "; cords: "
                        + class01296.y(var3)
                        + ", "
                        + class01296.L(var3)
                        + ", "
                        + class01296.u(var3),
                     72,
                     var2.N()
                  )
            );
         } else {
            CommandEncoder commandencoder = RenderSystem.getDevice().createCommandEncoder();
            if (!class08871.y().isClosed()) {
               commandencoder.writeToBuffer(class08871.y().slice(), var2.N());
            }
         }
      }
   }

   @Override
   public boolean N(class07211 var1, class07211 var2) {
      return this.u.N(var1, var2);
   }

   public void N(class08743 var1, class02609 var2, long var3) {
      CommandEncoder commandencoder = RenderSystem.getDevice().createCommandEncoder();
      class08871 class08871x = this.y(var1);
      if (class08871x != null) {
         if (class08871x.N().size() < var2.N().remaining()) {
            class08871x.N().close();
            class08871x.y(
               RenderSystem.getDevice()
                  .createBuffer(
                     () -> "Section vertex buffer - layer: "
                        + var1.L()
                        + "; cords: "
                        + class01296.y(var3)
                        + ", "
                        + class01296.L(var3)
                        + ", "
                        + class01296.u(var3),
                     40,
                     var2.N()
                  )
            );
         } else if (!class08871x.N().isClosed()) {
            commandencoder.writeToBuffer(class08871x.N().slice(), var2.N());
         }

         ByteBuffer bytebuffer = var2.y();
         if (bytebuffer != null) {
            if (class08871x.y() != null && class08871x.y().size() >= bytebuffer.remaining()) {
               if (!class08871x.y().isClosed()) {
                  commandencoder.writeToBuffer(class08871x.y().slice(), bytebuffer);
               }
            } else {
               if (class08871x.y() != null) {
                  class08871x.y().close();
               }

               class08871x.N_89(
                  RenderSystem.getDevice()
                     .createBuffer(
                        () -> "Section index buffer - layer: "
                           + var1.L()
                           + "; cords: "
                           + class01296.y(var3)
                           + ", "
                           + class01296.L(var3)
                           + ", "
                           + class01296.u(var3),
                        72,
                        bytebuffer
                     )
               );
            }
         } else if (class08871x.y() != null) {
            class08871x.y().close();
            class08871x.N_89(null);
         }

         class08871x.N_21(var2.L().L());
         class08871x.N(var2.L().i());
      } else {
         GpuBuffer gpubuffer1 = RenderSystem.getDevice()
            .createBuffer(
               () -> "Section vertex buffer - layer: " + var1.L() + "; cords: " + class01296.y(var3) + ", " + class01296.L(var3) + ", " + class01296.u(var3),
               40,
               var2.N()
            );
         ByteBuffer bytebuffer1 = var2.y();
         GpuBuffer gpubuffer = bytebuffer1 != null
            ? RenderSystem.getDevice()
               .createBuffer(
                  () -> "Section index buffer - layer: " + var1.L() + "; cords: " + class01296.y(var3) + ", " + class01296.L(var3) + ", " + class01296.u(var3),
                  72,
                  bytebuffer1
               )
            : null;
         class08871 class08871x = new class08871(gpubuffer1, gpubuffer, var2.L().L(), var2.L().i());
         this.M.put(var1, class08871x);
      }
   }

   @Override
   public boolean N() {
      return !this.M.isEmpty();
   }

   @Override
   public boolean N(class08743 var1) {
      return !this.M.containsKey(var1);
   }
}
