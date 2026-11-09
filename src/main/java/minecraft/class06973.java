package minecraft;

import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Map;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import org.jspecify.annotations.Nullable;

@Environment(EnvType.CLIENT)
public final class class06973 implements FabricRenderState {
   private class07209 pos;
   private boolean isTranslucent;
   private boolean highContrast;
   private class00494 shape;
   @Nullable
   private class00494 collisionShape;
   @Nullable
   private class00494 occlusionShape;
   @Nullable
   private class00494 interactionShape;
   @Nullable
   private Map B;

   public boolean L() {
      return this.highContrast;
   }

   @Nullable
   public class00494 M() {
      return this.interactionShape;
   }

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.B == null) {
         this.B = new Reference2ObjectOpenHashMap();
      }

      this.B.put(var1, var2);
   }

   public class06973(
      class07209 var1, boolean var2, boolean var3, class00494 var4, @Nullable class00494 var5, @Nullable class00494 var6, @Nullable class00494 var7
   ) {
      super();
      this.pos = var1;
      this.isTranslucent = var2;
      this.highContrast = var3;
      this.shape = var4;
      this.collisionShape = var5;
      this.occlusionShape = var6;
      this.interactionShape = var7;
   }

   public class06973(class07209 var1, boolean var2, boolean var3, class00494 var4) {
      this(var1, var2, var3, var4, null, null, null);
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class06973
            && Objects.equals(this.pos, ((class06973)var1).pos)
            && this.isTranslucent == ((class06973)var1).isTranslucent
            && this.highContrast == ((class06973)var1).highContrast
            && Objects.equals(this.shape, ((class06973)var1).shape)
            && Objects.equals(this.collisionShape, ((class06973)var1).collisionShape)
            && Objects.equals(this.occlusionShape, ((class06973)var1).occlusionShape)
            && Objects.equals(this.interactionShape, ((class06973)var1).interactionShape);
   }

   @Override
   public final String toString() {
      return "class06973[pos="
         + Objects.toString(this.pos)
         + ", isTranslucent="
         + Boolean.toString(this.isTranslucent)
         + ", highContrast="
         + Boolean.toString(this.highContrast)
         + ", shape="
         + Objects.toString(this.shape)
         + ", collisionShape="
         + Objects.toString(this.collisionShape)
         + ", occlusionShape="
         + Objects.toString(this.occlusionShape)
         + ", interactionShape="
         + Objects.toString(this.interactionShape)
         + "]";
   }

   @Override
   public final int hashCode() {
      return (
               (
                        (
                                 (
                                          ((0 * 31 + Objects.hashCode(this.pos)) * 31 + Boolean.hashCode(this.isTranslucent)) * 31
                                             + Boolean.hashCode(this.highContrast)
                                       )
                                       * 31
                                    + Objects.hashCode(this.shape)
                              )
                              * 31
                           + Objects.hashCode(this.collisionShape)
                     )
                     * 31
                  + Objects.hashCode(this.occlusionShape)
            )
            * 31
         + Objects.hashCode(this.interactionShape);
   }

   @Nullable
   public class00494 i() {
      return this.collisionShape;
   }

   public class00494 u() {
      return this.shape;
   }

   public boolean y() {
      return this.isTranslucent;
   }

   public class07209 N() {
      return this.pos;
   }

   @Nullable
   public Object getData(RenderStateDataKey var1) {
      return this.B == null ? null : this.B.get(var1);
   }

   public void clearExtraData() {
      if (this.B != null) {
         this.B.clear();
      }
   }

   public Object getDataOrDefault(RenderStateDataKey var1, Object var2) {
      return this.B == null ? var2 : this.B.getOrDefault(var1, var2);
   }

   @Nullable
   public class00494 R() {
      return this.occlusionShape;
   }
}
