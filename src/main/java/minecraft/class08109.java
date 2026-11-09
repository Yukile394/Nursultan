package minecraft;

import java.util.List;
import java.util.Objects;
import net.irisshaders.iris.mixinterface.ModelStorage;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.vertices.ImmediateState;

public final class class08109 implements ModelStorage {
   private class01423 pose;
   private class03662 displayContext;
   private int lightCoords;
   private int overlayCoords;
   private int outlineColor;
   private int[] tintLayers;
   private List<class02022> quads;
   private class07311 renderType;
   private class08915 foilType;
   private int z;
   private int U;
   private int E;
   private boolean W;

   public int L() {
      return this.lightCoords;
   }

   public List<class02022> M() {
      return this.quads;
   }

   public void iris$capture() {
      this.z = CapturedRenderingState.INSTANCE.getCurrentRenderedEntity();
      this.U = CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity();
      this.E = CapturedRenderingState.INSTANCE.getCurrentRenderedItem();
      this.W = ImmediateState.isRenderingBEs;
   }

   public class08109(class01423 var1, class03662 var2, int var3, int var4, int var5, int[] var6, List<class02022> var7, class07311 var8, class08915 var9) {
      super();
      this.pose = var1;
      this.displayContext = var2;
      this.lightCoords = var3;
      this.overlayCoords = var4;
      this.outlineColor = var5;
      this.tintLayers = var6;
      this.quads = var7;
      this.renderType = var8;
      this.foilType = var9;
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class08109
            && Objects.equals(this.pose, ((class08109)var1).pose)
            && Objects.equals(this.displayContext, ((class08109)var1).displayContext)
            && this.lightCoords == ((class08109)var1).lightCoords
            && this.overlayCoords == ((class08109)var1).overlayCoords
            && this.outlineColor == ((class08109)var1).outlineColor
            && Objects.equals(this.tintLayers, ((class08109)var1).tintLayers)
            && Objects.equals(this.quads, ((class08109)var1).quads)
            && Objects.equals(this.renderType, ((class08109)var1).renderType)
            && Objects.equals(this.foilType, ((class08109)var1).foilType);
   }

   @Override
   public final String toString() {
      return "class08109[pose="
         + Objects.toString(this.pose)
         + ", displayContext="
         + Objects.toString(this.displayContext)
         + ", lightCoords="
         + Integer.toString(this.lightCoords)
         + ", overlayCoords="
         + Integer.toString(this.overlayCoords)
         + ", outlineColor="
         + Integer.toString(this.outlineColor)
         + ", tintLayers="
         + Objects.toString(this.tintLayers)
         + ", quads="
         + Objects.toString(this.quads)
         + ", renderType="
         + Objects.toString(this.renderType)
         + ", foilType="
         + Objects.toString(this.foilType)
         + "]";
   }

   @Override
   public final int hashCode() {
      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            ((0 * 31 + Objects.hashCode(this.pose)) * 31 + Objects.hashCode(this.displayContext)) * 31
                                                               + Integer.hashCode(this.lightCoords)
                                                         )
                                                         * 31
                                                      + Integer.hashCode(this.overlayCoords)
                                                )
                                                * 31
                                             + Integer.hashCode(this.outlineColor)
                                       )
                                       * 31
                                    + Objects.hashCode(this.tintLayers)
                              )
                              * 31
                           + Objects.hashCode(this.quads)
                     )
                     * 31
                  + Objects.hashCode(this.renderType)
            )
            * 31
         + Objects.hashCode(this.foilType);
   }

   public class07311 B() {
      return this.renderType;
   }

   public class08915 Z() {
      return this.foilType;
   }

   public int i() {
      return this.outlineColor;
   }

   public int u() {
      return this.overlayCoords;
   }

   public class03662 y() {
      return this.displayContext;
   }

   public class01423 N() {
      return this.pose;
   }

   public int[] R() {
      return this.tintLayers;
   }

   public void iris$set() {
      CapturedRenderingState.INSTANCE.setCurrentEntity(this.z);
      CapturedRenderingState.INSTANCE.setCurrentBlockEntity(this.U);
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(this.E);
   }

   public boolean iris$wasBE() {
      return this.W;
   }
}
